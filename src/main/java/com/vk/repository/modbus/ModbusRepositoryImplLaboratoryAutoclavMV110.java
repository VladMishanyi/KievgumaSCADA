package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.ModbusMaster;
import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelLaboratoryAutoclavMV110;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Created by KIP-PC99 on 21.06.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.configuration"})
public class ModbusRepositoryImplLaboratoryAutoclavMV110 extends RootModbusRepositoryImpl<Float, DeviceModelLaboratoryAutoclavMV110> implements ModbusRepositoryLaboratoryAutoclavMV110 {


    private ModbusMaster modbusMasterSerialSecond;

    private DeviceModelLaboratoryAutoclavMV110 deviceModelLaboratoryAutoclavMV110;

    private BatchRead batchRead;

    @Autowired
    public ModbusRepositoryImplLaboratoryAutoclavMV110(ModbusMaster modbusMasterSerialSecond,
                                                   DeviceModelLaboratoryAutoclavMV110 deviceModelLaboratoryAutoclavMV110,
                                                   BatchRead batchRead){
        super(modbusMasterSerialSecond, deviceModelLaboratoryAutoclavMV110, batchRead);
        this.modbusMasterSerialSecond = modbusMasterSerialSecond;
        this.deviceModelLaboratoryAutoclavMV110 = deviceModelLaboratoryAutoclavMV110;
        this.batchRead = batchRead;
    }
}
