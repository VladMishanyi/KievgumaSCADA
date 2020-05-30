package com.vk.repository.modbus;

import com.vk.entity.device.DeviceModelFirstCehBuzulukTRM200;
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
public class ModbusRepositoryImplFirstCehBuzulukTRM200
        extends RootModbusRepositoryImpl<Float, ModbusFloat, DeviceModelFirstCehBuzulukTRM200>
        implements ModbusRepositoryFirstCehBuzulukTRM200 {

    private final ModbusMasterSerialModel modbusMasterSerialFirst;

    private final DeviceModelFirstCehBuzulukTRM200 deviceModelFirstCehBuzulukTRM200;

    private final ModbusFloat modbusFloat;

    @Autowired
    public ModbusRepositoryImplFirstCehBuzulukTRM200(final ModbusMasterSerialModel modbusMasterSerialFirst,
                                                     final DeviceModelFirstCehBuzulukTRM200 deviceModelFirstCehBuzulukTRM200,
                                                     final ModbusFloat modbusFloat){
        super(modbusFloat);
        this.modbusMasterSerialFirst = modbusMasterSerialFirst;
        this.deviceModelFirstCehBuzulukTRM200 = deviceModelFirstCehBuzulukTRM200;
        this.modbusFloat = modbusFloat;
    }

    @Override
    public DeviceModelFirstCehBuzulukTRM200 getDeviceModel(final boolean enableBatch){
        final List<Float> list =  modbusFloat.readDataFromModBus(modbusMasterSerialFirst,
                deviceModelFirstCehBuzulukTRM200.getDeviceAddress(),
                enableBatch,
                deviceModelFirstCehBuzulukTRM200.getModbusLocator0(),
                deviceModelFirstCehBuzulukTRM200.getModbusLocator1());
        deviceModelFirstCehBuzulukTRM200.setDeviceValuesRegister0(list.get(0));
        deviceModelFirstCehBuzulukTRM200.setDeviceValuesRegister1(list.get(1));
        return deviceModelFirstCehBuzulukTRM200;
    }
}
