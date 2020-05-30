package com.vk.repository.modbus;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.modbus.ModbusMasterSerialModel;
import com.vk.modbus.ModbusFloat;
import com.vk.modbus.ModbusInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by User on 2018-02-27.
 */
@Component
@ComponentScan(basePackages = {"com.vk.configuration", "com.vk.entity"})
public class ModbusRepositoryImplEnergeticRoomTRM201
        extends RootModbusRepositoryImpl<Float, ModbusFloat, DeviceModelEnergeticRoomTRM201>
        implements ModbusRepositoryEnergeticRoomTRM201 {

    private final ModbusMasterSerialModel modbusMasterSerialFirst;

    private final DeviceModelEnergeticRoomTRM201 deviceModelEnergeticRoomTRM201;

    private final ModbusFloat modbusFloat;

    private final ModbusInteger modbusInteger;

    @Autowired
    public ModbusRepositoryImplEnergeticRoomTRM201(final ModbusMasterSerialModel modbusMasterSerialFirst,
                                                   final DeviceModelEnergeticRoomTRM201 deviceModelEnergeticRoomTRM201,
                                                   final ModbusFloat modbusFloat,
                                                   final ModbusInteger modbusInteger){
        super(modbusFloat);
        this.modbusMasterSerialFirst = modbusMasterSerialFirst;
        this.deviceModelEnergeticRoomTRM201 = deviceModelEnergeticRoomTRM201;
        this.modbusFloat = modbusFloat;
        this.modbusInteger = modbusInteger;
    }

    @Override
    public DeviceModelEnergeticRoomTRM201 getDeviceModel(final boolean enableBatch){
        final List<Float> list =  modbusFloat.readDataFromModBus(modbusMasterSerialFirst,
                deviceModelEnergeticRoomTRM201.getDeviceAddress(),
                enableBatch,
                deviceModelEnergeticRoomTRM201.getModbusLocator0(),
                deviceModelEnergeticRoomTRM201.getModbusLocator1());
        deviceModelEnergeticRoomTRM201.setDeviceValuesRegister0(list.get(0));
        deviceModelEnergeticRoomTRM201.setDeviceValuesRegister1(list.get(1));
        return deviceModelEnergeticRoomTRM201;
    }

    @Override
    public void writeValueFirstChanel(int value){
        modbusInteger.writeDataToModBus(modbusMasterSerialFirst,
                deviceModelEnergeticRoomTRM201.getDeviceAddress(),
                value,
                deviceModelEnergeticRoomTRM201.getModbusLocator2());
        deviceModelEnergeticRoomTRM201.setDeviceValuesRegister2(value);
    }

    @Override
    public void writeValueFirstChane2(int value){
        modbusInteger.writeDataToModBus(modbusMasterSerialFirst,
                deviceModelEnergeticRoomTRM201.getDeviceAddress(),
                value,
                deviceModelEnergeticRoomTRM201.getModbusLocator3());
        deviceModelEnergeticRoomTRM201.setDeviceValuesRegister3(value);
    }
}
