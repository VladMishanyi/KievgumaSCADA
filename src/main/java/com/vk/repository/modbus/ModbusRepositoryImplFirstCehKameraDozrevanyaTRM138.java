package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.ModbusMaster;
import com.vk.entity.device.DeviceModelFirstCehKameraDozrevanyaMPR51;
import com.vk.entity.device.DeviceModelFirstCehKameraDozrevanyaTRM138;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Created by KIP-PC99 on 20.09.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.configuration", "com.vk.entity"})
public class ModbusRepositoryImplFirstCehKameraDozrevanyaTRM138 extends RootModbusRepositoryImpl<Float, DeviceModelFirstCehKameraDozrevanyaTRM138> implements ModbusRepositoryFirstCehKameraDozrevanyaTRM138  {

    private ModbusMaster modbusMasterSerialFirst;

    private DeviceModelFirstCehKameraDozrevanyaTRM138 deviceModelFirstCehKameraDozrevanyaTRM138;

    private BatchRead batchRead;

    @Autowired
    public ModbusRepositoryImplFirstCehKameraDozrevanyaTRM138(ModbusMaster modbusMasterSerialFirst,
                                                             DeviceModelFirstCehKameraDozrevanyaTRM138 deviceModelFirstCehKameraDozrevanyaTRM138,
                                                             BatchRead batchRead){
        super(modbusMasterSerialFirst, deviceModelFirstCehKameraDozrevanyaTRM138, batchRead);
        this.modbusMasterSerialFirst = modbusMasterSerialFirst;
        this.deviceModelFirstCehKameraDozrevanyaTRM138 = deviceModelFirstCehKameraDozrevanyaTRM138;
        this.batchRead = batchRead;
    }
}
