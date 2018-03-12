package com.vk.repository;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.BatchResults;
import com.serotonin.modbus4j.ModbusMaster;
import com.serotonin.modbus4j.exception.ModbusInitException;
import com.vk.entity.device.DeviceModelFirstCehSmesitel3KMSF1;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = {"com.vk.configuration"})
public class ModbusRepositoryImplFirstCehSmesitel3KMSF1 implements ModbusRepositoryFirstCehSmesitel3KMSF1{

    @Autowired
    private ModbusMaster modbusMasterSerialThird;

    private final Logger LOGGER = Logger.getLogger(ModbusRepositoryImplFirstCehSmesitel3KMSF1.class);

    @Override
    public DeviceModelFirstCehSmesitel3KMSF1 getDeviceModel(){
        DeviceModelFirstCehSmesitel3KMSF1 deviceModelFirstCehSmesitel3KMSF1 = new DeviceModelFirstCehSmesitel3KMSF1();
        try {
            modbusMasterSerialThird.init();
            LOGGER.info("ModBus Listen slave address №"+
                    deviceModelFirstCehSmesitel3KMSF1.getDeviceAddress()+
                    "--"+modbusMasterSerialThird.testSlaveNode(deviceModelFirstCehSmesitel3KMSF1.getDeviceAddress()));
        }
        catch (ModbusInitException e){
            LOGGER.error("ModBus Init problem, slave address №"+
                    deviceModelFirstCehSmesitel3KMSF1.getDeviceAddress()+
                    "--"+e.getMessage());
        }
        try {
            BatchRead batchRead = new BatchRead();
            for (int i=0; i<deviceModelFirstCehSmesitel3KMSF1.getArraySize(); i++){
                batchRead.addLocator(deviceModelFirstCehSmesitel3KMSF1.getDeviceId()[i],
                        deviceModelFirstCehSmesitel3KMSF1.getDeviceAddress(),
                        deviceModelFirstCehSmesitel3KMSF1.getDeviceRegisterRange()[i],
                        deviceModelFirstCehSmesitel3KMSF1.getDeviceAddressRegisters()[i],
                        deviceModelFirstCehSmesitel3KMSF1.getDeviceDataType()[i]);
            }
            BatchResults batchResults = modbusMasterSerialThird.send(batchRead);
            Integer[] arr = new Integer[deviceModelFirstCehSmesitel3KMSF1.getArraySize()];
            for (int i=0; i<deviceModelFirstCehSmesitel3KMSF1.getArraySize(); i++){
                deviceModelFirstCehSmesitel3KMSF1.setDeviceValuesRegistersIndex(i,
                        (Integer) batchResults.getValue(deviceModelFirstCehSmesitel3KMSF1.getDeviceId()[i]) );
            }
        }catch (Exception e){
            LOGGER.error("ModBus Transport problem, slave address №"+
                    deviceModelFirstCehSmesitel3KMSF1.getDeviceAddress()+
                    "--"+e.getMessage());
            Integer[] arr = new Integer[deviceModelFirstCehSmesitel3KMSF1.getArraySize()];
            for (int i=0; i<deviceModelFirstCehSmesitel3KMSF1.getArraySize(); i++){
                arr[i] = 0;
            }
            deviceModelFirstCehSmesitel3KMSF1.setDeviceValuesRegisters(arr);
        }
        finally {
            modbusMasterSerialThird.destroy();
            LOGGER.info("ModBus Close connection (Transport problem), slave address №"+
                    deviceModelFirstCehSmesitel3KMSF1.getDeviceAddress());
        }
        return deviceModelFirstCehSmesitel3KMSF1;
    }
}
