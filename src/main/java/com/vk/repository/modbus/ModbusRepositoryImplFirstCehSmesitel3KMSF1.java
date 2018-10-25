package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.ModbusMaster;
import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelFirstCehSmesitel3KMSF1;
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
public class ModbusRepositoryImplFirstCehSmesitel3KMSF1 implements ModbusRepositoryFirstCehSmesitel3KMSF1 {

    private final ModbusMaster modbusMasterSerialThird;

    private final DeviceModelFirstCehSmesitel3KMSF1 deviceModelFirstCehSmesitel3KMSF1;

    private final BatchRead batchRead;

    private final ModbusInteger modbusInteger;

    @Autowired
    public ModbusRepositoryImplFirstCehSmesitel3KMSF1(final ModbusMaster modbusMasterSerialThird,
                                                      final DeviceModelFirstCehSmesitel3KMSF1 deviceModelFirstCehSmesitel3KMSF1,
                                                      final BatchRead batchRead,
                                                      final ModbusInteger modbusInteger){
        this.modbusMasterSerialThird = modbusMasterSerialThird;
        this.deviceModelFirstCehSmesitel3KMSF1 = deviceModelFirstCehSmesitel3KMSF1;
        this.batchRead = batchRead;
        this.modbusInteger = modbusInteger;
    }

    @Override
    public DeviceModelFirstCehSmesitel3KMSF1 getDeviceModel(final boolean enableBatch){
        final List<Integer> list =  modbusInteger.readDataFromModBus(modbusMasterSerialThird,
                deviceModelFirstCehSmesitel3KMSF1.getDeviceAddress(),
                batchRead,
                enableBatch,
                deviceModelFirstCehSmesitel3KMSF1.getModbusLocator0());
        deviceModelFirstCehSmesitel3KMSF1.setDeviceValuesRegister0(list.get(0));
        return deviceModelFirstCehSmesitel3KMSF1;
    }
}
