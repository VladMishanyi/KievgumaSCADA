package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.ModbusMaster;
import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelFirstCehSmesitel2MB110;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Created by KIP-PC99 on 21.06.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.configuration"})
public class ModbusRepositoryImplFirstCehSmesitel2MB110 extends RootModbusRepositoryImpl<Float, DeviceModelFirstCehSmesitel2MB110> implements ModbusRepositoryFirstCehSmesitel2MB110 {


    private ModbusMaster modbusMasterSerialThird;

    private DeviceModelFirstCehSmesitel2MB110 deviceModelFirstCehSmesitel2MB110;

    private BatchRead batchRead;

    @Autowired
    public ModbusRepositoryImplFirstCehSmesitel2MB110(ModbusMaster modbusMasterSerialThird,
                                                   DeviceModelFirstCehSmesitel2MB110 deviceModelFirstCehSmesitel2MB110,
                                                   BatchRead batchRead){
        super(modbusMasterSerialThird, deviceModelFirstCehSmesitel2MB110, batchRead);
        this.modbusMasterSerialThird = modbusMasterSerialThird;
        this.deviceModelFirstCehSmesitel2MB110 = deviceModelFirstCehSmesitel2MB110;
        this.batchRead = batchRead;
    }
}
