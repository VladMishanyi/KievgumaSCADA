package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.ModbusMaster;
import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelFirstCehSmesitel3MB110;
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
public class ModbusRepositoryImplFirstCehSmesitel3MB110 implements ModbusRepositoryFirstCehSmesitel3MB110 {

    private final ModbusMaster modbusMasterSerialThird;

    private final DeviceModelFirstCehSmesitel3MB110 deviceModelFirstCehSmesitel3MB110;

    private final BatchRead batchRead;

    private final ModbusFloat modbusFloat;

    @Autowired
    public ModbusRepositoryImplFirstCehSmesitel3MB110(final ModbusMaster modbusMasterSerialThird,
                                                      final DeviceModelFirstCehSmesitel3MB110 deviceModelFirstCehSmesitel3MB110,
                                                      final BatchRead batchRead,
                                                      final ModbusFloat modbusFloat){
        this.modbusMasterSerialThird = modbusMasterSerialThird;
        this.deviceModelFirstCehSmesitel3MB110 = deviceModelFirstCehSmesitel3MB110;
        this.batchRead = batchRead;
        this.modbusFloat = modbusFloat;
    }

    @Override
    public DeviceModelFirstCehSmesitel3MB110 getDeviceModel(final boolean enableBatch){
        final List<Float> list =  modbusFloat.readDataFromModBus(modbusMasterSerialThird,
                deviceModelFirstCehSmesitel3MB110.getDeviceAddress(),
                batchRead,
                enableBatch,
                deviceModelFirstCehSmesitel3MB110.getModbusLocator0(),
                deviceModelFirstCehSmesitel3MB110.getModbusLocator1());
        deviceModelFirstCehSmesitel3MB110.setDeviceValuesRegister0(list.get(0));
        deviceModelFirstCehSmesitel3MB110.setDeviceValuesRegister1(list.get(1));
        return deviceModelFirstCehSmesitel3MB110;
    }
}
