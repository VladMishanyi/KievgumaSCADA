package com.vk.repository;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.BatchResults;
import com.serotonin.modbus4j.ModbusMaster;
import com.serotonin.modbus4j.exception.ModbusInitException;
import com.vk.entity.device.DeviceModelFirstCehAutoclavTRM202;
import com.vk.entity.device.DeviceModelLaboratoryAutoclavMV110;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Created by User on 2018-04-02.
 */
@Component
@ComponentScan(basePackages = {"com.vk.configuration"})
public class ModbusRepositoryImplLaboratoryAutoclavMV110 implements ModbusRepositoryLaboratoryAutoclavMV110 {


    @Autowired
    private ModbusMaster modbusMasterSerialSecond;

    private final Logger LOGGER = Logger.getLogger(ModbusRepositoryImplLaboratoryAutoclavMV110.class);

    @Override
    public DeviceModelLaboratoryAutoclavMV110 getDeviceModel(){
        DeviceModelLaboratoryAutoclavMV110 deviceModelLaboratoryAutoclavMV110 = new DeviceModelLaboratoryAutoclavMV110();
        try {
            modbusMasterSerialSecond.init();
            LOGGER.info("ModBus Listen slave address №"+
                    deviceModelLaboratoryAutoclavMV110.getDeviceAddress()+
                    "--"+modbusMasterSerialSecond.testSlaveNode(deviceModelLaboratoryAutoclavMV110.getDeviceAddress()));
        }
        catch (ModbusInitException e){
            LOGGER.error("ModBus Init problem, slave address №"+
                    deviceModelLaboratoryAutoclavMV110.getDeviceAddress()+
                    "--"+e.getMessage());
        }
        try {
            BatchRead batchRead = new BatchRead();
            for (int i=0; i<deviceModelLaboratoryAutoclavMV110.getArraySize(); i++){
                batchRead.addLocator(deviceModelLaboratoryAutoclavMV110.getDeviceId()[i],
                        deviceModelLaboratoryAutoclavMV110.getDeviceAddress(),
                        deviceModelLaboratoryAutoclavMV110.getDeviceRegisterRange()[i],
                        deviceModelLaboratoryAutoclavMV110.getDeviceAddressRegisters()[i],
                        deviceModelLaboratoryAutoclavMV110.getDeviceDataType()[i]);
            }
            BatchResults batchResults = modbusMasterSerialSecond.send(batchRead);
            Float[] arr = new Float[deviceModelLaboratoryAutoclavMV110.getArraySize()];
            for (int i=0; i<deviceModelLaboratoryAutoclavMV110.getArraySize(); i++){
                deviceModelLaboratoryAutoclavMV110.setDeviceValuesRegistersIndex(i,
                        (Float) batchResults.getValue(deviceModelLaboratoryAutoclavMV110.getDeviceId()[i]) );
            }
        }catch (Exception e){
            LOGGER.error("ModBus Transport problem, slave address №"+
                    deviceModelLaboratoryAutoclavMV110.getDeviceAddress()+
                    "--"+e.getMessage());
            Float[] arr = new Float[deviceModelLaboratoryAutoclavMV110.getArraySize()];
            for (int i=0; i<deviceModelLaboratoryAutoclavMV110.getArraySize(); i++){
                arr[i] = 0F;
            }
            deviceModelLaboratoryAutoclavMV110.setDeviceValuesRegisters(arr);
        }
        finally {
            modbusMasterSerialSecond.destroy();
            LOGGER.info("ModBus Close connection (Transport problem), slave address №"+
                    deviceModelLaboratoryAutoclavMV110.getDeviceAddress());
        }
        return deviceModelLaboratoryAutoclavMV110;
    }
}
