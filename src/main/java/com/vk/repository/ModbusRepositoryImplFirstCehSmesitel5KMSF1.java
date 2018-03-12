package com.vk.repository;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.BatchResults;
import com.serotonin.modbus4j.ModbusMaster;
import com.serotonin.modbus4j.exception.ModbusInitException;
import com.vk.entity.device.DeviceModelFirstCehSmesitel5KMSF1;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = {"com.vk.configuration"})
public class ModbusRepositoryImplFirstCehSmesitel5KMSF1 implements ModbusRepositoryFirstCehSmesitel5KMSF1{

    @Autowired
    private ModbusMaster modbusMasterSerialThird;

    private final Logger LOGGER = Logger.getLogger(ModbusRepositoryImplFirstCehSmesitel5KMSF1.class);

    @Override
    public DeviceModelFirstCehSmesitel5KMSF1 getDeviceModel(){
        DeviceModelFirstCehSmesitel5KMSF1 deviceModelFirstCehSmesitel5KMSF1 = new DeviceModelFirstCehSmesitel5KMSF1();
        try {
            modbusMasterSerialThird.init();
            LOGGER.info("ModBus Listen slave address №"+
                    deviceModelFirstCehSmesitel5KMSF1.getDeviceAddress()+
                    "--"+modbusMasterSerialThird.testSlaveNode(deviceModelFirstCehSmesitel5KMSF1.getDeviceAddress()));
        }
        catch (ModbusInitException e){
            LOGGER.error("ModBus Init problem, slave address №"+
                    deviceModelFirstCehSmesitel5KMSF1.getDeviceAddress()+
                    "--"+e.getMessage());
        }
        try {
            BatchRead batchRead = new BatchRead();
            for (int i=0; i<deviceModelFirstCehSmesitel5KMSF1.getArraySize(); i++){
                batchRead.addLocator(deviceModelFirstCehSmesitel5KMSF1.getDeviceId()[i],
                        deviceModelFirstCehSmesitel5KMSF1.getDeviceAddress(),
                        deviceModelFirstCehSmesitel5KMSF1.getDeviceRegisterRange()[i],
                        deviceModelFirstCehSmesitel5KMSF1.getDeviceAddressRegisters()[i],
                        deviceModelFirstCehSmesitel5KMSF1.getDeviceDataType()[i]);
            }
            BatchResults batchResults = modbusMasterSerialThird.send(batchRead);
            Integer[] arr = new Integer[deviceModelFirstCehSmesitel5KMSF1.getArraySize()];
            for (int i=0; i<deviceModelFirstCehSmesitel5KMSF1.getArraySize(); i++){
                deviceModelFirstCehSmesitel5KMSF1.setDeviceValuesRegistersIndex(i,
                        (Integer) batchResults.getValue(deviceModelFirstCehSmesitel5KMSF1.getDeviceId()[i]) );
            }
        }catch (Exception e){
            LOGGER.error("ModBus Transport problem, slave address №"+
                    deviceModelFirstCehSmesitel5KMSF1.getDeviceAddress()+
                    "--"+e.getMessage());
            Integer[] arr = new Integer[deviceModelFirstCehSmesitel5KMSF1.getArraySize()];
            for (int i=0; i<deviceModelFirstCehSmesitel5KMSF1.getArraySize(); i++){
                arr[i] = 0;
            }
            deviceModelFirstCehSmesitel5KMSF1.setDeviceValuesRegisters(arr);
        }
        finally {
            modbusMasterSerialThird.destroy();
            LOGGER.info("ModBus Close connection (Transport problem), slave address №"+
                    deviceModelFirstCehSmesitel5KMSF1.getDeviceAddress());
        }
        return deviceModelFirstCehSmesitel5KMSF1;
    }
}
