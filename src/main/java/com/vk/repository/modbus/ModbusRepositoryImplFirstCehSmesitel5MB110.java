package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.ModbusMaster;
import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelFirstCehSmesitel5MB110;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Created by KIP-PC99 on 21.06.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.configuration"})
public class ModbusRepositoryImplFirstCehSmesitel5MB110 extends RootModbusRepositoryImpl<Float, DeviceModelFirstCehSmesitel5MB110> implements ModbusRepositoryFirstCehSmesitel5MB110 {


    private ModbusMaster modbusMasterSerialThird;

    private DeviceModelFirstCehSmesitel5MB110 deviceModelFirstCehSmesitel5MB110;

    private BatchRead batchRead;

    @Autowired
    public ModbusRepositoryImplFirstCehSmesitel5MB110(ModbusMaster modbusMasterSerialThird,
                                                   DeviceModelFirstCehSmesitel5MB110 deviceModelFirstCehSmesitel5MB110,
                                                   BatchRead batchRead){
        super(modbusMasterSerialThird, deviceModelFirstCehSmesitel5MB110, batchRead);
        this.modbusMasterSerialThird = modbusMasterSerialThird;
        this.deviceModelFirstCehSmesitel5MB110 = deviceModelFirstCehSmesitel5MB110;
        this.batchRead = batchRead;
    }
}
