package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.ModbusMaster;
import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelFirstCehSmesitel1KMSF1;
import com.vk.entity.device.DeviceModelThirdCehAutoclavTRM202;
import com.vk.modbus.ModbusInteger;
import com.vk.modbus.ModbusShort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by KIP-PC99 on 21.06.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.configuration", "com.vk.entity"})
public class ModbusRepositoryImplFirstCehSmesitel1KMSF1 implements ModbusRepositoryFirstCehSmesitel1KMSF1 {

    private final ModbusMaster modbusMasterSerialThird;

    private final DeviceModelFirstCehSmesitel1KMSF1 deviceModelFirstCehSmesitel1KMSF1;

    private final BatchRead batchRead;

    private final ModbusInteger modbusInteger;

    @Autowired
    public ModbusRepositoryImplFirstCehSmesitel1KMSF1(final ModbusMaster modbusMasterSerialThird,
                                                      final DeviceModelFirstCehSmesitel1KMSF1 deviceModelFirstCehSmesitel1KMSF1,
                                                      final BatchRead batchRead,
                                                      final ModbusInteger modbusInteger){
        this.modbusMasterSerialThird = modbusMasterSerialThird;
        this.deviceModelFirstCehSmesitel1KMSF1 = deviceModelFirstCehSmesitel1KMSF1;
        this.batchRead = batchRead;
        this.modbusInteger = modbusInteger;
    }

    @Override
    public DeviceModelFirstCehSmesitel1KMSF1 getDeviceModel(final boolean enableBatch){
        final List<Integer> list =  modbusInteger.readDataFromModBus(modbusMasterSerialThird,
                deviceModelFirstCehSmesitel1KMSF1.getDeviceAddress(),
                batchRead,
                enableBatch,
                deviceModelFirstCehSmesitel1KMSF1.getModbusLocator0());
        deviceModelFirstCehSmesitel1KMSF1.setDeviceValuesRegister0(list.get(0));
        return deviceModelFirstCehSmesitel1KMSF1;
    }
}
