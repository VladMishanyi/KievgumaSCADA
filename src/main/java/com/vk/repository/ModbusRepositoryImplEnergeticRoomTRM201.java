package com.vk.repository;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.BatchResults;
import com.serotonin.modbus4j.ModbusMaster;
import com.serotonin.modbus4j.code.DataType;
import com.serotonin.modbus4j.code.RegisterRange;
import com.serotonin.modbus4j.exception.ModbusInitException;
import com.vk.entity.TRM201_Energrtic;
import com.vk.entity.converter.DeviceToTableEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.table.TableModelEnergeticRoomTRM201;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by User on 2018-02-27.
 */
@Component
public class ModbusRepositoryImplEnergeticRoomTRM201 extends ModbusRepositoryImpl<DeviceModelEnergeticRoomTRM201, TableModelEnergeticRoomTRM201> {

    @Autowired
    private ModbusMaster modbusMasterSerialFirst;

    private final Logger LOGGER = Logger.getLogger(ModbusRepositoryImplEnergeticRoomTRM201.class);

    @Override
    public TableModelEnergeticRoomTRM201 getDeviceModel(){
        DeviceModelEnergeticRoomTRM201 deviceModelEnergeticRoomTRM201 = new DeviceModelEnergeticRoomTRM201();
        try {
            modbusMasterSerialFirst.init();
            LOGGER.info("ModBus Listen slave address №"+
                    deviceModelEnergeticRoomTRM201.getDeviceAddress()+
                    "--"+modbusMasterSerialFirst.testSlaveNode(deviceModelEnergeticRoomTRM201.getDeviceAddress()));
        }
        catch (ModbusInitException e){
            LOGGER.error("ModBus Init problem, slave address №"+
                    deviceModelEnergeticRoomTRM201.getDeviceAddress()+
                    "--"+e.getMessage());
        }
        try {
            BatchRead batchRead = new BatchRead();
            for (int i=0; i<deviceModelEnergeticRoomTRM201.getArraySize(); i++){
                batchRead.addLocator(deviceModelEnergeticRoomTRM201.getDeviceId()[i],
                        deviceModelEnergeticRoomTRM201.getDeviceAddress(),
                        deviceModelEnergeticRoomTRM201.getDeviceRegisterRange()[i],
                        deviceModelEnergeticRoomTRM201.getDeviceAddressRegisters()[i],
                        deviceModelEnergeticRoomTRM201.getDeviceDataType()[i]);
            }
            BatchResults batchResults = modbusMasterSerialFirst.send(batchRead);
            Float[] arr = new Float[deviceModelEnergeticRoomTRM201.getArraySize()];
            for (int i=0; i<deviceModelEnergeticRoomTRM201.getArraySize(); i++){
                arr[i] = (float) batchResults.getValue(deviceModelEnergeticRoomTRM201.getDeviceId()[i]);
            }
            deviceModelEnergeticRoomTRM201.setDeviceValuesRegisters(arr);
        }catch (Exception e){
            LOGGER.error("ModBus Transport problem, slave address №"+
                    deviceModelEnergeticRoomTRM201.getDeviceAddress()+
                    "--"+e.getMessage());
            Float[] arr = new Float[deviceModelEnergeticRoomTRM201.getArraySize()];
            for (int i=0; i<deviceModelEnergeticRoomTRM201.getArraySize(); i++){
                arr[i] = 0F;
            }
            deviceModelEnergeticRoomTRM201.setDeviceValuesRegisters(arr);
        }
        finally {
            modbusMasterSerialFirst.destroy();
            LOGGER.info("ModBus Close connection (Transport problem), slave address №"+
                    deviceModelEnergeticRoomTRM201.getDeviceAddress());
        }
        DeviceToTableEnergeticRoomTRM201 body = new DeviceToTableEnergeticRoomTRM201();
        return body.convert(deviceModelEnergeticRoomTRM201);
    }
}
