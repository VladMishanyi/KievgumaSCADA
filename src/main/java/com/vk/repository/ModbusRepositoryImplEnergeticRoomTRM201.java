package com.vk.repository;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.BatchResults;
import com.serotonin.modbus4j.ModbusMaster;
import com.serotonin.modbus4j.code.DataType;
import com.serotonin.modbus4j.code.RegisterRange;
import com.serotonin.modbus4j.exception.ModbusInitException;

import com.vk.entity.converter.DeviceToTableEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.table.TableModelEnergeticRoomTRM201;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by User on 2018-02-27.
 */
@Component
@ComponentScan(basePackages = {"com.vk.configuration"})
public class ModbusRepositoryImplEnergeticRoomTRM201 implements ModbusRepositoryEnergeticRoomTRM201 {

    @Autowired
    private ModbusMaster modbusMasterSerialFirst;

    private final Logger LOGGER = Logger.getLogger(ModbusRepositoryImplEnergeticRoomTRM201.class);

    @Override
    public DeviceModelEnergeticRoomTRM201 getDeviceModel(){
        DeviceModelEnergeticRoomTRM201 deviceModelEnergeticRoomTRM201 = new DeviceModelEnergeticRoomTRM201();
        try {
            modbusMasterSerialFirst.init();
//            System.out.println("ModBus Listen slave address №"+
//                    deviceModelEnergeticRoomTRM201.getDeviceAddress()+
//                    "--"+modbusMasterSerialFirst.testSlaveNode(deviceModelEnergeticRoomTRM201.getDeviceAddress()));
            LOGGER.info("ModBus Listen slave address №"+
                    deviceModelEnergeticRoomTRM201.getDeviceAddress()+
                    "--"+modbusMasterSerialFirst.testSlaveNode(deviceModelEnergeticRoomTRM201.getDeviceAddress()));
        }
        catch (ModbusInitException e){
//            System.out.println("ModBus Init problem, slave address №"+
//                    deviceModelEnergeticRoomTRM201.getDeviceAddress()+
//                    "--"+e.getMessage());
            LOGGER.error("ModBus Init problem, slave address №"+
                    deviceModelEnergeticRoomTRM201.getDeviceAddress()+
                    "--"+e.getMessage());
        }
        try {
//            System.out.println("1");
            BatchRead batchRead = new BatchRead();
//            System.out.println("2");
//            System.out.println("getArraySize() :"+deviceModelEnergeticRoomTRM201.getArraySize());
            for (int i=0; i<deviceModelEnergeticRoomTRM201.getArraySize(); i++){
//                System.out.println("getArraySize() :"+deviceModelEnergeticRoomTRM201.getArraySize());
//                System.out.println("[i] :"+i);
                batchRead.addLocator(deviceModelEnergeticRoomTRM201.getDeviceId()[i],
                        deviceModelEnergeticRoomTRM201.getDeviceAddress(),
                        deviceModelEnergeticRoomTRM201.getDeviceRegisterRange()[i],
                        deviceModelEnergeticRoomTRM201.getDeviceAddressRegisters()[i],
                        deviceModelEnergeticRoomTRM201.getDeviceDataType()[i]);
//                System.out.println("getDeviceId()[i] :"+deviceModelEnergeticRoomTRM201.getDeviceId()[i]);
//                System.out.println("getDeviceAddress() :"+deviceModelEnergeticRoomTRM201.getDeviceAddress());
//                System.out.println("getDeviceRegisterRange()[i] :"+deviceModelEnergeticRoomTRM201.getDeviceRegisterRange()[i]);
//                System.out.println("getDeviceAddressRegisters()[i] :"+deviceModelEnergeticRoomTRM201.getDeviceAddressRegisters()[i]);
//                System.out.println("getDeviceDataType()[i]) :"+deviceModelEnergeticRoomTRM201.getDeviceDataType()[i]);
            }
//            System.out.println("3");
            BatchResults batchResults = modbusMasterSerialFirst.send(batchRead);
//            System.out.println("4");
            Float[] arr = new Float[deviceModelEnergeticRoomTRM201.getArraySize()];
//            System.out.println("5");
            for (int i=0; i<deviceModelEnergeticRoomTRM201.getArraySize(); i++){

//                System.out.println("This is real value :"+arr[i]);
                deviceModelEnergeticRoomTRM201.setDeviceValuesRegistersIndex(i,
                        (Float) batchResults.getValue(deviceModelEnergeticRoomTRM201.getDeviceId()[i]) );
            }
//            System.out.println("6");
//            System.out.println("7");
        }catch (Exception e){
//            System.out.println("ModBus Transport problem, slave address №"+
//                    deviceModelEnergeticRoomTRM201.getDeviceAddress()+
//                    "--"+e.getMessage());
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
//            System.out.println("ModBus Close connection (Transport problem), slave address №"+
//                    deviceModelEnergeticRoomTRM201.getDeviceAddress());
            LOGGER.info("ModBus Close connection (Transport problem), slave address №"+
                    deviceModelEnergeticRoomTRM201.getDeviceAddress());
        }
        return deviceModelEnergeticRoomTRM201;
    }
}
