package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.ModbusMaster;
import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelFirstCehSmesitel2KMSF1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Created by KIP-PC99 on 21.06.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.configuration"})
public class ModbusRepositoryImplFirstCehSmesitel2KMSF1 extends RootModbusRepositoryImpl<Integer, DeviceModelFirstCehSmesitel2KMSF1> implements ModbusRepositoryFirstCehSmesitel2KMSF1 {


    private ModbusMaster modbusMasterSerialThird;

    private DeviceModelFirstCehSmesitel2KMSF1 deviceModelFirstCehSmesitel2KMSF1;

    private BatchRead batchRead;

    @Autowired
    public ModbusRepositoryImplFirstCehSmesitel2KMSF1(ModbusMaster modbusMasterSerialThird,
                                                   DeviceModelFirstCehSmesitel2KMSF1 deviceModelFirstCehSmesitel2KMSF1,
                                                   BatchRead batchRead){
        super(modbusMasterSerialThird, deviceModelFirstCehSmesitel2KMSF1, batchRead);
        this.modbusMasterSerialThird = modbusMasterSerialThird;
        this.deviceModelFirstCehSmesitel2KMSF1 = deviceModelFirstCehSmesitel2KMSF1;
        this.batchRead = batchRead;
    }
}
