package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.ModbusMaster;
import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelFirstCehSmesitel3MB110;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Created by KIP-PC99 on 21.06.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.configuration"})
public class ModbusRepositoryImplFirstCehSmesitel3MB110 extends RootModbusRepositoryImpl<Float, DeviceModelFirstCehSmesitel3MB110> implements ModbusRepositoryFirstCehSmesitel3MB110 {


    private ModbusMaster modbusMasterSerialThird;

    private DeviceModelFirstCehSmesitel3MB110 deviceModelFirstCehSmesitel3MB110;

    private BatchRead batchRead;

    @Autowired
    public ModbusRepositoryImplFirstCehSmesitel3MB110(ModbusMaster modbusMasterSerialThird,
                                                   DeviceModelFirstCehSmesitel3MB110 deviceModelFirstCehSmesitel3MB110,
                                                   BatchRead batchRead){
        super(modbusMasterSerialThird, deviceModelFirstCehSmesitel3MB110, batchRead);
        this.modbusMasterSerialThird = modbusMasterSerialThird;
        this.deviceModelFirstCehSmesitel3MB110 = deviceModelFirstCehSmesitel3MB110;
        this.batchRead = batchRead;
    }
}
