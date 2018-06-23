package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.ModbusMaster;
import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelFirstCehSmesitel4KMSF1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Created by KIP-PC99 on 21.06.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.configuration", "com.vk.entity"})
public class ModbusRepositoryImplFirstCehSmesitel4KMSF1 extends RootModbusRepositoryImpl<Integer, DeviceModelFirstCehSmesitel4KMSF1> implements ModbusRepositoryFirstCehSmesitel4KMSF1 {


    private ModbusMaster modbusMasterSerialThird;

    private DeviceModelFirstCehSmesitel4KMSF1 deviceModelFirstCehSmesitel4KMSF1;

    private BatchRead batchRead;

    @Autowired
    public ModbusRepositoryImplFirstCehSmesitel4KMSF1(ModbusMaster modbusMasterSerialThird,
                                                   DeviceModelFirstCehSmesitel4KMSF1 deviceModelFirstCehSmesitel4KMSF1,
                                                   BatchRead batchRead){
        super(modbusMasterSerialThird, deviceModelFirstCehSmesitel4KMSF1, batchRead);
        this.modbusMasterSerialThird = modbusMasterSerialThird;
        this.deviceModelFirstCehSmesitel4KMSF1 = deviceModelFirstCehSmesitel4KMSF1;
        this.batchRead = batchRead;
    }
}
