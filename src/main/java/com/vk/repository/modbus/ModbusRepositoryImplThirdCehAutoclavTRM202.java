package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.ModbusMaster;
import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelThirdCehAutoclavTRM202;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Created by KIP-PC99 on 21.06.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.configuration"})
public class ModbusRepositoryImplThirdCehAutoclavTRM202 extends RootModbusRepositoryImpl<Float, DeviceModelThirdCehAutoclavTRM202> implements ModbusRepositoryThirdCehAutoclavTRM202 {


    private ModbusMaster modbusMasterSerialFirst;

    private DeviceModelThirdCehAutoclavTRM202 deviceModelThirdCehAutoclavTRM202;

    private BatchRead batchRead;

    @Autowired
    public ModbusRepositoryImplThirdCehAutoclavTRM202(ModbusMaster modbusMasterSerialFirst,
                                                   DeviceModelThirdCehAutoclavTRM202 deviceModelThirdCehAutoclavTRM202,
                                                   BatchRead batchRead){
        super(modbusMasterSerialFirst, deviceModelThirdCehAutoclavTRM202, batchRead);
        this.modbusMasterSerialFirst = modbusMasterSerialFirst;
        this.deviceModelThirdCehAutoclavTRM202 = deviceModelThirdCehAutoclavTRM202;
        this.batchRead = batchRead;
    }
}
