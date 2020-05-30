package com.vk.repository.modbus;

import com.vk.entity.device.DeviceModelFirstCehKameraDozrevanyaTRM138;
import com.vk.entity.modbus.ModbusMasterSerialModel;
import com.vk.modbus.ModbusFloat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by KIP-PC99 on 20.09.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.configuration", "com.vk.entity"})
public class ModbusRepositoryImplFirstCehKameraDozrevanyaTRM138
        extends RootModbusRepositoryImpl<Float, ModbusFloat, DeviceModelFirstCehKameraDozrevanyaTRM138>
        implements ModbusRepositoryFirstCehKameraDozrevanyaTRM138  {

    private final ModbusMasterSerialModel modbusMasterSerialFirst;

    private final DeviceModelFirstCehKameraDozrevanyaTRM138 deviceModelFirstCehKameraDozrevanyaTRM138;

    private final ModbusFloat modbusFloat;

    @Autowired
    public ModbusRepositoryImplFirstCehKameraDozrevanyaTRM138(final ModbusMasterSerialModel modbusMasterSerialFirst,
                                                              final DeviceModelFirstCehKameraDozrevanyaTRM138 deviceModelFirstCehKameraDozrevanyaTRM138,
                                                              final ModbusFloat modbusFloat){
        super(modbusFloat);
        this.modbusMasterSerialFirst = modbusMasterSerialFirst;
        this.deviceModelFirstCehKameraDozrevanyaTRM138 = deviceModelFirstCehKameraDozrevanyaTRM138;
        this.modbusFloat = modbusFloat;
    }

    @Override
    public DeviceModelFirstCehKameraDozrevanyaTRM138 getDeviceModel(final boolean enableBatch){
        final List<Float> list =  modbusFloat.readDataFromModBus(modbusMasterSerialFirst,
                deviceModelFirstCehKameraDozrevanyaTRM138.getDeviceAddress(),
                enableBatch,
                deviceModelFirstCehKameraDozrevanyaTRM138.getModbusLocator0(),
                deviceModelFirstCehKameraDozrevanyaTRM138.getModbusLocator1(),
                deviceModelFirstCehKameraDozrevanyaTRM138.getModbusLocator2(),
                deviceModelFirstCehKameraDozrevanyaTRM138.getModbusLocator3(),
                deviceModelFirstCehKameraDozrevanyaTRM138.getModbusLocator4());
        deviceModelFirstCehKameraDozrevanyaTRM138.setDeviceValuesRegister0(list.get(0));
        deviceModelFirstCehKameraDozrevanyaTRM138.setDeviceValuesRegister1(list.get(1));
        deviceModelFirstCehKameraDozrevanyaTRM138.setDeviceValuesRegister2(list.get(2));
        deviceModelFirstCehKameraDozrevanyaTRM138.setDeviceValuesRegister3(list.get(3));
        deviceModelFirstCehKameraDozrevanyaTRM138.setDeviceValuesRegister4(list.get(4));
        return deviceModelFirstCehKameraDozrevanyaTRM138;
    }
}
