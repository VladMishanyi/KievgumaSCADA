package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.vk.entity.device.DeviceModelFirstCehBuzulukTRM200;
import com.vk.entity.device.DeviceModelFirstCehSmesitel4KMSF1;
import com.vk.entity.modbus.ModbusMasterSerialModel;
import com.vk.modbus.ModbusFloat;
import com.vk.modbus.ModbusInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by KIP-PC99 on 21.06.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.configuration", "com.vk.entity"})
public class ModbusRepositoryImplFirstCehSmesitel4KMSF1
        extends RootModbusRepositoryImpl<Integer, ModbusInteger, DeviceModelFirstCehSmesitel4KMSF1>
        implements ModbusRepositoryFirstCehSmesitel4KMSF1 {

    private final ModbusMasterSerialModel modbusMasterSerialThird;

    private final DeviceModelFirstCehSmesitel4KMSF1 deviceModelFirstCehSmesitel4KMSF1;

    private final BatchRead batchRead;

    private final ModbusInteger modbusInteger;

    @Autowired
    public ModbusRepositoryImplFirstCehSmesitel4KMSF1(final ModbusMasterSerialModel modbusMasterSerialThird,
                                                      final DeviceModelFirstCehSmesitel4KMSF1 deviceModelFirstCehSmesitel4KMSF1,
                                                      final BatchRead batchRead,
                                                      final ModbusInteger modbusInteger){
        super(modbusMasterSerialThird, modbusInteger);
        this.modbusMasterSerialThird = modbusMasterSerialThird;
        this.deviceModelFirstCehSmesitel4KMSF1 = deviceModelFirstCehSmesitel4KMSF1;
        this.batchRead = batchRead;
        this.modbusInteger = modbusInteger;
    }

    @Override
    public DeviceModelFirstCehSmesitel4KMSF1 getDeviceModel(final boolean enableBatch){
        final List<Integer> list =  modbusInteger.readDataFromModBus(modbusMasterSerialThird,
                deviceModelFirstCehSmesitel4KMSF1.getDeviceAddress(),
                batchRead,
                enableBatch,
                deviceModelFirstCehSmesitel4KMSF1.getModbusLocator0());
        deviceModelFirstCehSmesitel4KMSF1.setDeviceValuesRegister0(list.get(0));
        return deviceModelFirstCehSmesitel4KMSF1;
    }
}
