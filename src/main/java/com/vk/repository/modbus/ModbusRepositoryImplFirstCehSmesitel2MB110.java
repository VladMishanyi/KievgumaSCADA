package com.vk.repository.modbus;

import com.vk.entity.device.DeviceModelFirstCehSmesitel2MB110;
import com.vk.entity.modbus.ModbusMasterSerialModel;
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
public class ModbusRepositoryImplFirstCehSmesitel2MB110
        extends RootModbusRepositoryImpl<Float, ModbusFloat, DeviceModelFirstCehSmesitel2MB110>
        implements ModbusRepositoryFirstCehSmesitel2MB110 {

    private final ModbusMasterSerialModel modbusMasterSerialThird;

    private final DeviceModelFirstCehSmesitel2MB110 deviceModelFirstCehSmesitel2MB110;

    private final ModbusFloat modbusFloat;

    @Autowired
    public ModbusRepositoryImplFirstCehSmesitel2MB110(final ModbusMasterSerialModel modbusMasterSerialThird,
                                                      final DeviceModelFirstCehSmesitel2MB110 deviceModelFirstCehSmesitel2MB110,
                                                      final ModbusFloat modbusFloat){
        super(modbusFloat);
        this.modbusMasterSerialThird = modbusMasterSerialThird;
        this.deviceModelFirstCehSmesitel2MB110 = deviceModelFirstCehSmesitel2MB110;
        this.modbusFloat = modbusFloat;
    }

    @Override
    public DeviceModelFirstCehSmesitel2MB110 getDeviceModel(final boolean enableBatch){
        final List<Float> list =  modbusFloat.readDataFromModBus(modbusMasterSerialThird,
                deviceModelFirstCehSmesitel2MB110.getDeviceAddress(),
                enableBatch,
                deviceModelFirstCehSmesitel2MB110.getModbusLocator0(),
                deviceModelFirstCehSmesitel2MB110.getModbusLocator1());
        deviceModelFirstCehSmesitel2MB110.setDeviceValuesRegister0(list.get(0));
        deviceModelFirstCehSmesitel2MB110.setDeviceValuesRegister1(list.get(1));
        return deviceModelFirstCehSmesitel2MB110;
    }
}
