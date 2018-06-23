package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.ModbusMaster;
import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelFirstCehBuzulukTRM200;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Created by KIP-PC99 on 21.06.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.configuration"})
public class ModbusRepositoryImplFirstCehBuzulukTRM200 extends RootModbusRepositoryImpl<Float, DeviceModelFirstCehBuzulukTRM200> implements ModbusRepositoryFirstCehBuzulukTRM200 {


    private ModbusMaster modbusMasterSerialFirst;

    private DeviceModelFirstCehBuzulukTRM200 deviceModelFirstCehBuzulukTRM200;

    private BatchRead batchRead;

    @Autowired
    public ModbusRepositoryImplFirstCehBuzulukTRM200(ModbusMaster modbusMasterSerialFirst,
                                                   DeviceModelFirstCehBuzulukTRM200 deviceModelFirstCehBuzulukTRM200,
                                                   BatchRead batchRead){
        super(modbusMasterSerialFirst, deviceModelFirstCehBuzulukTRM200, batchRead);
        this.modbusMasterSerialFirst = modbusMasterSerialFirst;
        this.deviceModelFirstCehBuzulukTRM200 = deviceModelFirstCehBuzulukTRM200;
        this.batchRead = batchRead;
    }
}
