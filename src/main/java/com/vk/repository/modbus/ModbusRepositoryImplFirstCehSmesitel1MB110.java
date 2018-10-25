package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.ModbusMaster;
import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelFirstCehSmesitel1MB110;
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
public class ModbusRepositoryImplFirstCehSmesitel1MB110 implements ModbusRepositoryFirstCehSmesitel1MB110 {

    private final ModbusMaster modbusMasterSerialThird;

    private final DeviceModelFirstCehSmesitel1MB110 deviceModelFirstCehSmesitel1MB110;

    private final BatchRead batchRead;

    private final ModbusFloat modbusFloat;

    @Autowired
    public ModbusRepositoryImplFirstCehSmesitel1MB110(final ModbusMaster modbusMasterSerialThird,
                                                      final DeviceModelFirstCehSmesitel1MB110 deviceModelFirstCehSmesitel1MB110,
                                                      final BatchRead batchRead,
                                                      final ModbusFloat modbusFloat){
        this.modbusMasterSerialThird = modbusMasterSerialThird;
        this.deviceModelFirstCehSmesitel1MB110 = deviceModelFirstCehSmesitel1MB110;
        this.batchRead = batchRead;
        this.modbusFloat = modbusFloat;
    }

    @Override
    public DeviceModelFirstCehSmesitel1MB110 getDeviceModel(final boolean enableBatch){
        final List<Float> list =  modbusFloat.readDataFromModBus(modbusMasterSerialThird,
                deviceModelFirstCehSmesitel1MB110.getDeviceAddress(),
                batchRead,
                enableBatch,
                deviceModelFirstCehSmesitel1MB110.getModbusLocator0(),
                deviceModelFirstCehSmesitel1MB110.getModbusLocator1());
        deviceModelFirstCehSmesitel1MB110.setDeviceValuesRegister0(list.get(0));
        deviceModelFirstCehSmesitel1MB110.setDeviceValuesRegister1(list.get(1));
        return deviceModelFirstCehSmesitel1MB110;
    }
}
