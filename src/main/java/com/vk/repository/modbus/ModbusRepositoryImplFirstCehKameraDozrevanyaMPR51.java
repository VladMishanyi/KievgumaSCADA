package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.ModbusMaster;
import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelFirstCehKameraDozrevanyaMPR51;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Created by KIP-PC99 on 21.06.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.configuration", "com.vk.entity"})
public class ModbusRepositoryImplFirstCehKameraDozrevanyaMPR51 extends RootModbusRepositoryImpl<Float, DeviceModelFirstCehKameraDozrevanyaMPR51> implements ModbusRepositoryFirstCehKameraDozrevanyaMPR51 {

    private ModbusMaster modbusMasterSerialFirst;

    private DeviceModelFirstCehKameraDozrevanyaMPR51 deviceModelFirstCehKameraDozrevanyaMPR51;

    private BatchRead batchRead;

    @Autowired
    public ModbusRepositoryImplFirstCehKameraDozrevanyaMPR51(ModbusMaster modbusMasterSerialFirst,
                                                   DeviceModelFirstCehKameraDozrevanyaMPR51 deviceModelFirstCehKameraDozrevanyaMPR51,
                                                   BatchRead batchRead){
        super(modbusMasterSerialFirst, deviceModelFirstCehKameraDozrevanyaMPR51, batchRead);
        this.modbusMasterSerialFirst = modbusMasterSerialFirst;
        this.deviceModelFirstCehKameraDozrevanyaMPR51 = deviceModelFirstCehKameraDozrevanyaMPR51;
        this.batchRead = batchRead;
    }
}
