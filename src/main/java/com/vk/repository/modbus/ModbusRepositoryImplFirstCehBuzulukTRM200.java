package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.ModbusMaster;
import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelFirstCehBuzulukTRM200;
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
public class ModbusRepositoryImplFirstCehBuzulukTRM200 implements ModbusRepositoryFirstCehBuzulukTRM200 {

    private ModbusMaster modbusMasterSerialFirst;

    private DeviceModelFirstCehBuzulukTRM200 deviceModelFirstCehBuzulukTRM200;

    private BatchRead batchRead;

    private ModbusFloat modbusFloat;

    @Autowired
    public ModbusRepositoryImplFirstCehBuzulukTRM200(ModbusMaster modbusMasterSerialFirst,
                                                     DeviceModelFirstCehBuzulukTRM200 deviceModelFirstCehBuzulukTRM200,
                                                     BatchRead batchRead,
                                                     ModbusFloat modbusFloat){
        this.modbusMasterSerialFirst = modbusMasterSerialFirst;
        this.deviceModelFirstCehBuzulukTRM200 = deviceModelFirstCehBuzulukTRM200;
        this.batchRead = batchRead;
        this.modbusFloat = modbusFloat;
    }

    @Override
    public DeviceModelFirstCehBuzulukTRM200 getDeviceModel(final boolean enableBatch){
        final List<Float> list =  modbusFloat.readDataFromModBus(modbusMasterSerialFirst,
                deviceModelFirstCehBuzulukTRM200.getDeviceAddress(),
                batchRead,
                enableBatch,
                deviceModelFirstCehBuzulukTRM200.getModbusLocator0(),
                deviceModelFirstCehBuzulukTRM200.getModbusLocator1());
        deviceModelFirstCehBuzulukTRM200.setDeviceValuesRegister0(list.get(0));
        deviceModelFirstCehBuzulukTRM200.setDeviceValuesRegister1(list.get(1));
        return deviceModelFirstCehBuzulukTRM200;
    }
}
