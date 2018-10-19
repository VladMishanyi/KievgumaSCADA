package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.ModbusMaster;
import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelFirstCehSmesitel4KMSF1;
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
public class ModbusRepositoryImplFirstCehSmesitel4KMSF1 implements ModbusRepositoryFirstCehSmesitel4KMSF1 {

    private ModbusMaster modbusMasterSerialThird;

    private DeviceModelFirstCehSmesitel4KMSF1 deviceModelFirstCehSmesitel4KMSF1;

    private BatchRead batchRead;

    private ModbusShort modbusShort;

    @Autowired
    public ModbusRepositoryImplFirstCehSmesitel4KMSF1(ModbusMaster modbusMasterSerialThird,
                                                      DeviceModelFirstCehSmesitel4KMSF1 deviceModelFirstCehSmesitel4KMSF1,
                                                      BatchRead batchRead,
                                                      ModbusShort modbusShort){
        this.modbusMasterSerialThird = modbusMasterSerialThird;
        this.deviceModelFirstCehSmesitel4KMSF1 = deviceModelFirstCehSmesitel4KMSF1;
        this.batchRead = batchRead;
        this.modbusShort = modbusShort;
    }

    @Override
    public DeviceModelFirstCehSmesitel4KMSF1 getDeviceModel(final boolean enableBatch){
        final List<Short> list =  modbusShort.readDataFromModBus(modbusMasterSerialThird,
                deviceModelFirstCehSmesitel4KMSF1.getDeviceAddress(),
                batchRead,
                enableBatch,
                deviceModelFirstCehSmesitel4KMSF1.getModbusLocator0());
        deviceModelFirstCehSmesitel4KMSF1.setDeviceValuesRegister0(list.get(0));
        return deviceModelFirstCehSmesitel4KMSF1;
    }
}
