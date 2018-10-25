package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.ModbusMaster;
import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelLaboratoryAutoclavMV110;
import com.vk.entity.device.DeviceModelThirdCehAutoclavTRM202;
import com.vk.modbus.ModbusFloat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by KIP-PC99 on 21.06.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.configuration", "com.vk.entity"})
public class ModbusRepositoryImplLaboratoryAutoclavMV110 implements ModbusRepositoryLaboratoryAutoclavMV110 {

    private final ModbusMaster modbusMasterSerialSecond;

    private final DeviceModelLaboratoryAutoclavMV110 deviceModelLaboratoryAutoclavMV110;

    private final BatchRead batchRead;

    private final ModbusFloat modbusFloat;

    @Autowired
    public ModbusRepositoryImplLaboratoryAutoclavMV110(final ModbusMaster modbusMasterSerialSecond,
                                                       final DeviceModelLaboratoryAutoclavMV110 deviceModelLaboratoryAutoclavMV110,
                                                       final BatchRead batchRead,
                                                       final ModbusFloat modbusFloat){
        this.modbusMasterSerialSecond = modbusMasterSerialSecond;
        this.deviceModelLaboratoryAutoclavMV110 = deviceModelLaboratoryAutoclavMV110;
        this.batchRead = batchRead;
        this.modbusFloat = modbusFloat;
    }

    @Override
    public DeviceModelLaboratoryAutoclavMV110 getDeviceModel(final boolean enableBatch){
        final List<Float> list =  modbusFloat.readDataFromModBus(modbusMasterSerialSecond,
                deviceModelLaboratoryAutoclavMV110.getDeviceAddress(),
                batchRead,
                enableBatch,
                deviceModelLaboratoryAutoclavMV110.getModbusLocator0(),
                deviceModelLaboratoryAutoclavMV110.getModbusLocator1());
        deviceModelLaboratoryAutoclavMV110.setDeviceValuesRegister0(list.get(0));
        deviceModelLaboratoryAutoclavMV110.setDeviceValuesRegister1(list.get(1));
        return deviceModelLaboratoryAutoclavMV110;
    }
}
