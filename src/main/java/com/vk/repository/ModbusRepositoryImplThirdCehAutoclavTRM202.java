package com.vk.repository;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.BatchResults;
import com.serotonin.modbus4j.ModbusMaster;
import com.serotonin.modbus4j.exception.ModbusInitException;
import com.vk.entity.device.DeviceModelFirstCehAutoclavTRM202;
import com.vk.entity.device.DeviceModelThirdCehAutoclavTRM202;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = {"com.vk.configuration"})
public class ModbusRepositoryImplThirdCehAutoclavTRM202 implements ModbusRepositoryThirdCehAutoclavTRM202{

    @Autowired
    private ModbusMaster modbusMasterSerialFirst;

    private final Logger LOGGER = Logger.getLogger(ModbusRepositoryImplThirdCehAutoclavTRM202.class);

    @Override
    public DeviceModelThirdCehAutoclavTRM202 getDeviceModel(){
        DeviceModelThirdCehAutoclavTRM202 deviceModelThirdCehAutoclavTRM202 = new DeviceModelThirdCehAutoclavTRM202();
        try {
            modbusMasterSerialFirst.init();
            LOGGER.info("ModBus Listen slave address №"+
                    deviceModelThirdCehAutoclavTRM202.getDeviceAddress()+
                    "--"+modbusMasterSerialFirst.testSlaveNode(deviceModelThirdCehAutoclavTRM202.getDeviceAddress()));
        }
        catch (ModbusInitException e){
            LOGGER.error("ModBus Init problem, slave address №"+
                    deviceModelThirdCehAutoclavTRM202.getDeviceAddress()+
                    "--"+e.getMessage());
        }
        try {
            BatchRead batchRead = new BatchRead();
            for (int i=0; i<deviceModelThirdCehAutoclavTRM202.getArraySize(); i++){
                batchRead.addLocator(deviceModelThirdCehAutoclavTRM202.getDeviceId()[i],
                        deviceModelThirdCehAutoclavTRM202.getDeviceAddress(),
                        deviceModelThirdCehAutoclavTRM202.getDeviceRegisterRange()[i],
                        deviceModelThirdCehAutoclavTRM202.getDeviceAddressRegisters()[i],
                        deviceModelThirdCehAutoclavTRM202.getDeviceDataType()[i]);
            }
            BatchResults batchResults = modbusMasterSerialFirst.send(batchRead);
            Float[] arr = new Float[deviceModelThirdCehAutoclavTRM202.getArraySize()];
            for (int i=0; i<deviceModelThirdCehAutoclavTRM202.getArraySize(); i++){
                deviceModelThirdCehAutoclavTRM202.setDeviceValuesRegistersIndex(i,
                        (Float) batchResults.getValue(deviceModelThirdCehAutoclavTRM202.getDeviceId()[i]) );
            }
        }catch (Exception e){
            LOGGER.error("ModBus Transport problem, slave address №"+
                    deviceModelThirdCehAutoclavTRM202.getDeviceAddress()+
                    "--"+e.getMessage());
            Float[] arr = new Float[deviceModelThirdCehAutoclavTRM202.getArraySize()];
            for (int i=0; i<deviceModelThirdCehAutoclavTRM202.getArraySize(); i++){
                arr[i] = 0F;
            }
            deviceModelThirdCehAutoclavTRM202.setDeviceValuesRegisters(arr);
        }
        finally {
            modbusMasterSerialFirst.destroy();
            LOGGER.info("ModBus Close connection (Transport problem), slave address №"+
                    deviceModelThirdCehAutoclavTRM202.getDeviceAddress());
        }
        return deviceModelThirdCehAutoclavTRM202;
    }
}
