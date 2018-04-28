package com.vk.repository;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.BatchResults;
import com.serotonin.modbus4j.ModbusMaster;
import com.serotonin.modbus4j.exception.ModbusInitException;
import com.vk.entity.device.DeviceModelFirstCehSmesitel1MB110;
import com.vk.entity.device.DeviceModelFirstCehSmesitel2MB110;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Created by User on 2018-04-28.
 */
@Component
@ComponentScan(basePackages = {"com.vk.configuration"})
public class ModbusRepositoryImplFirstCehSmesitel2MB110 implements ModbusRepositoryFirstCehSmesitel2MB110{

    @Autowired
    private ModbusMaster modbusMasterSerialThird;

    private final Logger LOGGER = Logger.getLogger(ModbusRepositoryImplFirstCehSmesitel2MB110.class);

    @Override
    public DeviceModelFirstCehSmesitel2MB110 getDeviceModel(){
        DeviceModelFirstCehSmesitel2MB110 deviceModelFirstCehSmesitel2MB110 = new DeviceModelFirstCehSmesitel2MB110();
        try {
            modbusMasterSerialThird.init();
            LOGGER.info("ModBus Listen slave address №"+
                    deviceModelFirstCehSmesitel2MB110.getDeviceAddress()+
                    "--"+modbusMasterSerialThird.testSlaveNode(deviceModelFirstCehSmesitel2MB110.getDeviceAddress()));
        }
        catch (ModbusInitException e){
            LOGGER.error("ModBus Init problem, slave address №"+
                    deviceModelFirstCehSmesitel2MB110.getDeviceAddress()+
                    "--"+e.getMessage());
        }
        try {
            BatchRead batchRead = new BatchRead();
            for (int i=0; i<deviceModelFirstCehSmesitel2MB110.getArraySize(); i++){
                batchRead.addLocator(deviceModelFirstCehSmesitel2MB110.getDeviceId()[i],
                        deviceModelFirstCehSmesitel2MB110.getDeviceAddress(),
                        deviceModelFirstCehSmesitel2MB110.getDeviceRegisterRange()[i],
                        deviceModelFirstCehSmesitel2MB110.getDeviceAddressRegisters()[i],
                        deviceModelFirstCehSmesitel2MB110.getDeviceDataType()[i]);
            }
            BatchResults batchResults = modbusMasterSerialThird.send(batchRead);
            Float[] arr = new Float[deviceModelFirstCehSmesitel2MB110.getArraySize()];
            for (int i=0; i<deviceModelFirstCehSmesitel2MB110.getArraySize(); i++){
                deviceModelFirstCehSmesitel2MB110.setDeviceValuesRegistersIndex(i,
                        (Float) batchResults.getValue(deviceModelFirstCehSmesitel2MB110.getDeviceId()[i]) );
            }
        }catch (Exception e){
            LOGGER.error("ModBus Transport problem, slave address №"+
                    deviceModelFirstCehSmesitel2MB110.getDeviceAddress()+
                    "--"+e.getMessage());
            Float[] arr = new Float[deviceModelFirstCehSmesitel2MB110.getArraySize()];
            for (int i=0; i<deviceModelFirstCehSmesitel2MB110.getArraySize(); i++){
                arr[i] = 0F;
            }
            deviceModelFirstCehSmesitel2MB110.setDeviceValuesRegisters(arr);
        }
        finally {
            modbusMasterSerialThird.destroy();
            LOGGER.info("ModBus Close connection (Transport problem), slave address №"+
                    deviceModelFirstCehSmesitel2MB110.getDeviceAddress());
        }
        return deviceModelFirstCehSmesitel2MB110;
    }
}
