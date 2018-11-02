package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.vk.entity.device.DeviceModelFirstCehBuzulukTRM200;
import com.vk.entity.device.DeviceModelFirstCehSmesitel2KMSF1;
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
public class ModbusRepositoryImplFirstCehSmesitel2KMSF1
        extends RootModbusRepositoryImpl<Integer, ModbusInteger, DeviceModelFirstCehSmesitel2KMSF1>
        implements ModbusRepositoryFirstCehSmesitel2KMSF1 {

    private final ModbusMasterSerialModel modbusMasterSerialThird;

    private final DeviceModelFirstCehSmesitel2KMSF1 deviceModelFirstCehSmesitel2KMSF1;

    private final BatchRead batchRead;

    private final ModbusInteger modbusInteger;

    @Autowired
    public ModbusRepositoryImplFirstCehSmesitel2KMSF1(final ModbusMasterSerialModel modbusMasterSerialThird,
                                                      final DeviceModelFirstCehSmesitel2KMSF1 deviceModelFirstCehSmesitel2KMSF1,
                                                      final BatchRead batchRead,
                                                      final ModbusInteger modbusInteger){
        super(modbusMasterSerialThird, modbusInteger);
        this.modbusMasterSerialThird = modbusMasterSerialThird;
        this.deviceModelFirstCehSmesitel2KMSF1 = deviceModelFirstCehSmesitel2KMSF1;
        this.batchRead = batchRead;
        this.modbusInteger = modbusInteger;
    }

    @Override
    public DeviceModelFirstCehSmesitel2KMSF1 getDeviceModel(final boolean enableBatch){
        final List<Integer> list =  modbusInteger.readDataFromModBus(modbusMasterSerialThird,
                deviceModelFirstCehSmesitel2KMSF1.getDeviceAddress(),
                batchRead,
                enableBatch,
                deviceModelFirstCehSmesitel2KMSF1.getModbusLocator0());
        deviceModelFirstCehSmesitel2KMSF1.setDeviceValuesRegister0(list.get(0));
        return deviceModelFirstCehSmesitel2KMSF1;
    }

//    @Override
//    public boolean getModbusStatus() {
//        return modbusInteger.getModbusStatus();
//    }
//
//    @Override
//    public String getMasterName(){
//        return modbusMasterSerialThird.getPort();
//    }
}
