package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.ModbusMaster;
import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelFirstCehSmesitel2KMSF1;
import com.vk.entity.device.DeviceModelThirdCehAutoclavTRM202;
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
public class ModbusRepositoryImplFirstCehSmesitel2KMSF1 implements ModbusRepositoryFirstCehSmesitel2KMSF1 {

    private ModbusMaster modbusMasterSerialThird;

    private DeviceModelFirstCehSmesitel2KMSF1 deviceModelFirstCehSmesitel2KMSF1;

    private BatchRead batchRead;

    ModbusShort modbusShort;

    @Autowired
    public ModbusRepositoryImplFirstCehSmesitel2KMSF1(ModbusMaster modbusMasterSerialThird,
                                                      DeviceModelFirstCehSmesitel2KMSF1 deviceModelFirstCehSmesitel2KMSF1,
                                                      BatchRead batchRead,
                                                      ModbusShort modbusShort){
        this.modbusMasterSerialThird = modbusMasterSerialThird;
        this.deviceModelFirstCehSmesitel2KMSF1 = deviceModelFirstCehSmesitel2KMSF1;
        this.batchRead = batchRead;
        this.modbusShort = modbusShort;
    }

    @Override
    public DeviceModelFirstCehSmesitel2KMSF1 getDeviceModel(final boolean enableBatch){
        final List<Short> list =  modbusShort.readDataFromModBus(modbusMasterSerialThird,
                deviceModelFirstCehSmesitel2KMSF1.getDeviceAddress(),
                batchRead,
                enableBatch,
                deviceModelFirstCehSmesitel2KMSF1.getModbusLocator0());
        deviceModelFirstCehSmesitel2KMSF1.setDeviceValuesRegister0(list.get(0));
        return deviceModelFirstCehSmesitel2KMSF1;
    }
}
