package com.vk.repository;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.BatchResults;
import com.serotonin.modbus4j.ModbusMaster;
import com.serotonin.modbus4j.exception.ModbusInitException;
import com.vk.entity.device.DeviceModelSevenCehAutoclavSPK107;
import com.vk.entity.device.DeviceModelThirdCehAutoclavTRM202;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = {"com.vk.configuration"})
public class ModbusRepositoryImplSevenCehAutoclavSPK107 implements ModbusRepositorySevenCehAutoclavSPK107{

    @Autowired
    private ModbusMaster modbusMasterSerialSecond;

    private final Logger LOGGER = Logger.getLogger(ModbusRepositoryImplSevenCehAutoclavSPK107.class);

    @Override
    public DeviceModelSevenCehAutoclavSPK107 getDeviceModel(){
        DeviceModelSevenCehAutoclavSPK107 deviceModelSevenCehAutoclavSPK107 = new DeviceModelSevenCehAutoclavSPK107();
        try {
            modbusMasterSerialSecond.init();
            LOGGER.info("ModBus Listen slave address №"+
                    deviceModelSevenCehAutoclavSPK107.getDeviceAddress()+
                    "--"+modbusMasterSerialSecond.testSlaveNode(deviceModelSevenCehAutoclavSPK107.getDeviceAddress()));
        }
        catch (ModbusInitException e){
            LOGGER.error("ModBus Init problem, slave address №"+
                    deviceModelSevenCehAutoclavSPK107.getDeviceAddress()+
                    "--"+e.getMessage());
        }
        try {
            BatchRead batchRead = new BatchRead();
            for (int i=0; i<deviceModelSevenCehAutoclavSPK107.getArraySize(); i++){
                batchRead.addLocator(deviceModelSevenCehAutoclavSPK107.getDeviceId()[i],
                        deviceModelSevenCehAutoclavSPK107.getDeviceAddress(),
                        deviceModelSevenCehAutoclavSPK107.getDeviceRegisterRange()[i],
                        deviceModelSevenCehAutoclavSPK107.getDeviceAddressRegisters()[i],
                        deviceModelSevenCehAutoclavSPK107.getDeviceDataType()[i]);
            }
            BatchResults batchResults = modbusMasterSerialSecond.send(batchRead);
            Float[] arr = new Float[deviceModelSevenCehAutoclavSPK107.getArraySize()];
            for (int i=0; i<deviceModelSevenCehAutoclavSPK107.getArraySize(); i++){
                deviceModelSevenCehAutoclavSPK107.setDeviceValuesRegistersIndex(i,
                        (Float) batchResults.getValue(deviceModelSevenCehAutoclavSPK107.getDeviceId()[i]) );
            }
        }catch (Exception e){
            LOGGER.error("ModBus Transport problem, slave address №"+
                    deviceModelSevenCehAutoclavSPK107.getDeviceAddress()+
                    "--"+e.getMessage());
            Float[] arr = new Float[deviceModelSevenCehAutoclavSPK107.getArraySize()];
            for (int i=0; i<deviceModelSevenCehAutoclavSPK107.getArraySize(); i++){
                arr[i] = 0F;
            }
            deviceModelSevenCehAutoclavSPK107.setDeviceValuesRegisters(arr);
        }
        finally {
            modbusMasterSerialSecond.destroy();
            LOGGER.info("ModBus Close connection (Transport problem), slave address №"+
                    deviceModelSevenCehAutoclavSPK107.getDeviceAddress());
        }
        return deviceModelSevenCehAutoclavSPK107;
    }
}
