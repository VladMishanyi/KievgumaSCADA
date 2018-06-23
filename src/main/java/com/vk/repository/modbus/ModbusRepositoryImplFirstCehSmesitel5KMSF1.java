package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.ModbusMaster;
import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelFirstCehSmesitel5KMSF1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Created by KIP-PC99 on 21.06.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.configuration", "com.vk.entity"})
public class ModbusRepositoryImplFirstCehSmesitel5KMSF1 extends RootModbusRepositoryImpl<Integer, DeviceModelFirstCehSmesitel5KMSF1> implements ModbusRepositoryFirstCehSmesitel5KMSF1 {


    private ModbusMaster modbusMasterSerialThird;

    private DeviceModelFirstCehSmesitel5KMSF1 deviceModelFirstCehSmesitel5KMSF1;

    private BatchRead batchRead;

    @Autowired
    public ModbusRepositoryImplFirstCehSmesitel5KMSF1(ModbusMaster modbusMasterSerialThird,
                                                   DeviceModelFirstCehSmesitel5KMSF1 deviceModelFirstCehSmesitel5KMSF1,
                                                   BatchRead batchRead){
        super(modbusMasterSerialThird, deviceModelFirstCehSmesitel5KMSF1, batchRead);
        this.modbusMasterSerialThird = modbusMasterSerialThird;
        this.deviceModelFirstCehSmesitel5KMSF1 = deviceModelFirstCehSmesitel5KMSF1;
        this.batchRead = batchRead;
    }
}
