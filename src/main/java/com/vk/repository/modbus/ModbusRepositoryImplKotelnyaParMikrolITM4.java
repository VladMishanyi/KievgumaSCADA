package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.ModbusMaster;
import com.vk.entity.device.DeviceModelFirstCehKameraDozrevanyaMPR51;
import com.vk.entity.device.DeviceModelKotelnyaParMikrolITM4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Created by KIP-PC99 on 08.08.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.configuration", "com.vk.entity"})
public class ModbusRepositoryImplKotelnyaParMikrolITM4 extends RootModbusRepositoryImpl<Float, DeviceModelKotelnyaParMikrolITM4> implements ModbusRepositoryKotelnyaParMikrolITM4 {


    private ModbusMaster modbusMasterSerialFirst;

    private DeviceModelKotelnyaParMikrolITM4 deviceModelKotelnyaParMikrolITM4;

    private BatchRead batchRead;

    @Autowired
    public ModbusRepositoryImplKotelnyaParMikrolITM4(ModbusMaster modbusMasterSerialFirst,
                                                             DeviceModelKotelnyaParMikrolITM4 deviceModelKotelnyaParMikrolITM4,
                                                             BatchRead batchRead){
        super(modbusMasterSerialFirst, deviceModelKotelnyaParMikrolITM4, batchRead);
        this.modbusMasterSerialFirst = modbusMasterSerialFirst;
        this.deviceModelKotelnyaParMikrolITM4 = deviceModelKotelnyaParMikrolITM4;
        this.batchRead = batchRead;
    }
}
