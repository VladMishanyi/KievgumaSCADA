package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.BatchResults;
import com.serotonin.modbus4j.ModbusMaster;
import com.serotonin.modbus4j.base.ReadFunctionGroup;
import com.serotonin.modbus4j.exception.ModbusInitException;
import com.vk.configuration.ModbusSerialFirstConfig;
import com.vk.entity.device.DeviceModel;
import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * Created by KIP-PC99 on 15.06.2018.
 */

public class RootModbusRepositoryImpl<E extends Number, T extends DeviceModel<E>> implements RootModbusRepository<E, T> {

    private Logger LOGGER = Logger.getLogger(RootModbusRepositoryImpl.class);

    private ModbusMaster modbusMasterSerial;

    private T deviceModel;

    private BatchRead batchRead;

    public RootModbusRepositoryImpl(){}

    public RootModbusRepositoryImpl(ModbusMaster modbusMasterSerialFirst,
                                    T deviceModel,
                                    BatchRead batchRead){
        this.modbusMasterSerial = modbusMasterSerialFirst;
        this.deviceModel = deviceModel;
        this.batchRead = batchRead;
    }

    @Override
    public T getDeviceModel(){

        try {
            modbusMasterSerial.init();
            boolean test = modbusMasterSerial.testSlaveNode(deviceModel.getDeviceAddress());
            LOGGER.info("ModBus Listen slave address №"+deviceModel.getDeviceAddress()+"--"+test);
            System.out.println("ModBus Listen slave address №"+deviceModel.getDeviceAddress()+"--"+test);
        }
        catch (ModbusInitException e){
            String message = e.getMessage();
            LOGGER.error("ModBus Init problem, slave address №"+deviceModel.getDeviceAddress()+"--"+message);
            System.out.println("ModBus Init problem, slave address №"+deviceModel.getDeviceAddress()+ "--"+message);
        }
        finally {
            try {
                for (int i=0; i < deviceModel.getDeviceValuesRegisters().length; i++){
                    batchRead.addLocator(deviceModel.getDeviceId()[i],
                            deviceModel.getDeviceAddress(),
                            deviceModel.getDeviceRegisterRange()[i],
                            deviceModel.getDeviceAddressRegisters()[i],
                            deviceModel.getDeviceDataType()[i]);
                }

                BatchResults batchResults = modbusMasterSerial.send(batchRead);
                for (int i=0; i < deviceModel.getDeviceValuesRegisters().length; i++){
                    deviceModel.setDeviceValuesRegistersIndex(i,
                            (E) batchResults.getValue(deviceModel.getDeviceId()[i]) );
                }
            }catch (Exception e){
                String message = e.getMessage();
                LOGGER.error("ModBus Transport problem, slave address №"+deviceModel.getDeviceAddress()+"--"+message);
                System.out.println("ModBus Transport problem, slave address №"+deviceModel.getDeviceAddress()+"--"+message);
                deviceModel.setDeviceValuesDafault();
            }
            finally {
                LOGGER.info("ModBus Close connection, slave address №"+deviceModel.getDeviceAddress());
                System.out.println("ModBus Close connection, slave address №"+deviceModel.getDeviceAddress());
                modbusMasterSerial.destroy();
            }

            //-----------------------------------------------------------------------------
            String form = "---";
            for (int i=0; i < deviceModel.getDeviceValuesRegisters().length; i++){
                form = form + deviceModel.getDeviceValuesRegisters()[i] + "---";
            }
            System.out.println("Device №" + deviceModel.getDeviceAddress() + "  "+ form);
            //-----------------------------------------------------------------------------

        }
        return deviceModel;
    }
}
