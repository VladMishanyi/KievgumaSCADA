package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.ModbusMaster;
import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelFirstCehAutoclavTRM202;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Created by KIP-PC99 on 21.06.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.configuration", "com.vk.entity"})
public class ModbusRepositoryImplFirstCehAutoclavTRM202 extends RootModbusRepositoryImpl<Float, DeviceModelFirstCehAutoclavTRM202> implements ModbusRepositoryFirstCehAutoclavTRM202 {


    private ModbusMaster modbusMasterSerialFirst;

    private DeviceModelFirstCehAutoclavTRM202 deviceModelFirstCehAutoclavTRM202;

    private BatchRead batchRead;

    @Autowired
    public ModbusRepositoryImplFirstCehAutoclavTRM202(ModbusMaster modbusMasterSerialFirst,
                                                   DeviceModelFirstCehAutoclavTRM202 deviceModelFirstCehAutoclavTRM202,
                                                   BatchRead batchRead){
        super(modbusMasterSerialFirst, deviceModelFirstCehAutoclavTRM202, batchRead);
        this.modbusMasterSerialFirst = modbusMasterSerialFirst;
        this.deviceModelFirstCehAutoclavTRM202 = deviceModelFirstCehAutoclavTRM202;
        this.batchRead = batchRead;
    }
}
