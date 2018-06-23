package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.ModbusMaster;
import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelSevenCehAutoclavSPK107;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Created by KIP-PC99 on 21.06.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.configuration"})
public class ModbusRepositoryImplSevenCehAutoclavSPK107 extends RootModbusRepositoryImpl<Float, DeviceModelSevenCehAutoclavSPK107> implements ModbusRepositorySevenCehAutoclavSPK107 {


    private ModbusMaster modbusMasterSerialSecond;

    private DeviceModelSevenCehAutoclavSPK107 deviceModelSevenCehAutoclavSPK107;

    private BatchRead batchRead;

    @Autowired
    public ModbusRepositoryImplSevenCehAutoclavSPK107(ModbusMaster modbusMasterSerialSecond,
                                                   DeviceModelSevenCehAutoclavSPK107 deviceModelSevenCehAutoclavSPK107,
                                                   BatchRead batchRead){
        super(modbusMasterSerialSecond, deviceModelSevenCehAutoclavSPK107, batchRead);
        this.modbusMasterSerialSecond = modbusMasterSerialSecond;
        this.deviceModelSevenCehAutoclavSPK107 = deviceModelSevenCehAutoclavSPK107;
        this.batchRead = batchRead;
    }
}
