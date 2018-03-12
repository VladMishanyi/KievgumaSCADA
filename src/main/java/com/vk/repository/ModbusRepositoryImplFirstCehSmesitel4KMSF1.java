package com.vk.repository;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.BatchResults;
import com.serotonin.modbus4j.ModbusMaster;
import com.serotonin.modbus4j.exception.ModbusInitException;
import com.vk.entity.device.DeviceModelFirstCehSmesitel4KMSF1;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = {"com.vk.configuration"})
public class ModbusRepositoryImplFirstCehSmesitel4KMSF1 implements ModbusRepositoryFirstCehSmesitel4KMSF1{

    @Autowired
    private ModbusMaster modbusMasterSerialThird;

    private final Logger LOGGER = Logger.getLogger(ModbusRepositoryImplFirstCehSmesitel4KMSF1.class);

    @Override
    public DeviceModelFirstCehSmesitel4KMSF1 getDeviceModel(){
        DeviceModelFirstCehSmesitel4KMSF1 deviceModelFirstCehSmesitel4KMSF1 = new DeviceModelFirstCehSmesitel4KMSF1();
        try {
            modbusMasterSerialThird.init();
            LOGGER.info("ModBus Listen slave address №"+
                    deviceModelFirstCehSmesitel4KMSF1.getDeviceAddress()+
                    "--"+modbusMasterSerialThird.testSlaveNode(deviceModelFirstCehSmesitel4KMSF1.getDeviceAddress()));
        }
        catch (ModbusInitException e){
            LOGGER.error("ModBus Init problem, slave address №"+
                    deviceModelFirstCehSmesitel4KMSF1.getDeviceAddress()+
                    "--"+e.getMessage());
        }
        try {
            BatchRead batchRead = new BatchRead();
            for (int i=0; i<deviceModelFirstCehSmesitel4KMSF1.getArraySize(); i++){
                batchRead.addLocator(deviceModelFirstCehSmesitel4KMSF1.getDeviceId()[i],
                        deviceModelFirstCehSmesitel4KMSF1.getDeviceAddress(),
                        deviceModelFirstCehSmesitel4KMSF1.getDeviceRegisterRange()[i],
                        deviceModelFirstCehSmesitel4KMSF1.getDeviceAddressRegisters()[i],
                        deviceModelFirstCehSmesitel4KMSF1.getDeviceDataType()[i]);
            }
            BatchResults batchResults = modbusMasterSerialThird.send(batchRead);
            Integer[] arr = new Integer[deviceModelFirstCehSmesitel4KMSF1.getArraySize()];
            for (int i=0; i<deviceModelFirstCehSmesitel4KMSF1.getArraySize(); i++){
                deviceModelFirstCehSmesitel4KMSF1.setDeviceValuesRegistersIndex(i,
                        (Integer) batchResults.getValue(deviceModelFirstCehSmesitel4KMSF1.getDeviceId()[i]) );
            }
        }catch (Exception e){
            LOGGER.error("ModBus Transport problem, slave address №"+
                    deviceModelFirstCehSmesitel4KMSF1.getDeviceAddress()+
                    "--"+e.getMessage());
            Integer[] arr = new Integer[deviceModelFirstCehSmesitel4KMSF1.getArraySize()];
            for (int i=0; i<deviceModelFirstCehSmesitel4KMSF1.getArraySize(); i++){
                arr[i] = 0;
            }
            deviceModelFirstCehSmesitel4KMSF1.setDeviceValuesRegisters(arr);
        }
        finally {
            modbusMasterSerialThird.destroy();
            LOGGER.info("ModBus Close connection (Transport problem), slave address №"+
                    deviceModelFirstCehSmesitel4KMSF1.getDeviceAddress());
        }
        return deviceModelFirstCehSmesitel4KMSF1;
    }
}
