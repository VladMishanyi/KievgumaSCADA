package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.ModbusMaster;
import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
//import com.vk.repository.old_modbus.ModbusRepositoryEnergeticRoomTRM201;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by User on 2018-02-27.
 */
@Component
@ComponentScan(basePackages = {"com.vk.configuration", "com.vk.entity"})
public class ModbusRepositoryImplEnergeticRoomTRM201 extends RootModbusRepositoryImpl<Float, DeviceModelEnergeticRoomTRM201> implements ModbusRepositoryEnergeticRoomTRM201 {


    private ModbusMaster modbusMasterSerialFirst;

    private DeviceModelEnergeticRoomTRM201 deviceModelEnergeticRoomTRM201;

    private BatchRead batchRead;

    @Autowired
    public ModbusRepositoryImplEnergeticRoomTRM201(ModbusMaster modbusMasterSerialFirst,
                                                   DeviceModelEnergeticRoomTRM201 deviceModelEnergeticRoomTRM201,
                                                   BatchRead batchRead){
        super(modbusMasterSerialFirst, deviceModelEnergeticRoomTRM201, batchRead);
        this.modbusMasterSerialFirst = modbusMasterSerialFirst;
        this.deviceModelEnergeticRoomTRM201 = deviceModelEnergeticRoomTRM201;
        this.batchRead = batchRead;
    }
}
