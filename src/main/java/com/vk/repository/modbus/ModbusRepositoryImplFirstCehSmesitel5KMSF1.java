package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.vk.entity.device.DeviceModelFirstCehBuzulukTRM200;
import com.vk.entity.device.DeviceModelFirstCehSmesitel5KMSF1;
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
public class ModbusRepositoryImplFirstCehSmesitel5KMSF1
        extends RootModbusRepositoryImpl<Integer, ModbusInteger, DeviceModelFirstCehSmesitel5KMSF1>
        implements ModbusRepositoryFirstCehSmesitel5KMSF1 {

    private final ModbusMasterSerialModel modbusMasterSerialThird;

    private final DeviceModelFirstCehSmesitel5KMSF1 deviceModelFirstCehSmesitel5KMSF1;

    private final BatchRead batchRead;

    private final ModbusInteger modbusInteger;

    @Autowired
    public ModbusRepositoryImplFirstCehSmesitel5KMSF1(final ModbusMasterSerialModel modbusMasterSerialThird,
                                                      final DeviceModelFirstCehSmesitel5KMSF1 deviceModelFirstCehSmesitel5KMSF1,
                                                      final BatchRead batchRead,
                                                      final ModbusInteger modbusInteger){
        super(modbusMasterSerialThird, modbusInteger);
        this.modbusMasterSerialThird = modbusMasterSerialThird;
        this.deviceModelFirstCehSmesitel5KMSF1 = deviceModelFirstCehSmesitel5KMSF1;
        this.batchRead = batchRead;
        this.modbusInteger = modbusInteger;
    }

    @Override
    public DeviceModelFirstCehSmesitel5KMSF1 getDeviceModel(final boolean enableBatch){
        final List<Integer> list =  modbusInteger.readDataFromModBus(modbusMasterSerialThird,
                deviceModelFirstCehSmesitel5KMSF1.getDeviceAddress(),
                batchRead,
                enableBatch,
                deviceModelFirstCehSmesitel5KMSF1.getModbusLocator0());
        deviceModelFirstCehSmesitel5KMSF1.setDeviceValuesRegister0(list.get(0));
        return deviceModelFirstCehSmesitel5KMSF1;
    }
}
