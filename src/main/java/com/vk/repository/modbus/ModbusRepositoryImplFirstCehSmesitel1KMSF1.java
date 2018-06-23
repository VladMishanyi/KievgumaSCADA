package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.ModbusMaster;
import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelFirstCehSmesitel1KMSF1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Created by KIP-PC99 on 21.06.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.configuration"})
public class ModbusRepositoryImplFirstCehSmesitel1KMSF1 extends RootModbusRepositoryImpl<Integer, DeviceModelFirstCehSmesitel1KMSF1> implements ModbusRepositoryFirstCehSmesitel1KMSF1 {


    private ModbusMaster modbusMasterSerialThird;

    private DeviceModelFirstCehSmesitel1KMSF1 deviceModelFirstCehSmesitel1KMSF1;

    private BatchRead batchRead;

    @Autowired
    public ModbusRepositoryImplFirstCehSmesitel1KMSF1(ModbusMaster modbusMasterSerialThird,
                                                   DeviceModelFirstCehSmesitel1KMSF1 deviceModelFirstCehSmesitel1KMSF1,
                                                   BatchRead batchRead){
        super(modbusMasterSerialThird, deviceModelFirstCehSmesitel1KMSF1, batchRead);
        this.modbusMasterSerialThird = modbusMasterSerialThird;
        this.deviceModelFirstCehSmesitel1KMSF1 = deviceModelFirstCehSmesitel1KMSF1;
        this.batchRead = batchRead;
    }
}
