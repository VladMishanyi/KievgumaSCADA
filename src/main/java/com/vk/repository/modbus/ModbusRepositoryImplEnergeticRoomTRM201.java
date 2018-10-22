package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.ModbusMaster;
import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
//import com.vk.repository.old_modbus.ModbusRepositoryEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelThirdCehAutoclavTRM202;
import com.vk.modbus.ModbusFloat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by User on 2018-02-27.
 */
@Component
@ComponentScan(basePackages = {"com.vk.configuration", "com.vk.entity"})
public class ModbusRepositoryImplEnergeticRoomTRM201 implements ModbusRepositoryEnergeticRoomTRM201 {

    private ModbusMaster modbusMasterSerialFirst;

    private DeviceModelEnergeticRoomTRM201 deviceModelEnergeticRoomTRM201;

    private BatchRead batchRead;

    private ModbusFloat modbusFloat;

    @Autowired
    public ModbusRepositoryImplEnergeticRoomTRM201(ModbusMaster modbusMasterSerialFirst,
                                                   DeviceModelEnergeticRoomTRM201 deviceModelEnergeticRoomTRM201,
                                                   BatchRead batchRead,
                                                   ModbusFloat modbusFloat){
        this.modbusMasterSerialFirst = modbusMasterSerialFirst;
        this.deviceModelEnergeticRoomTRM201 = deviceModelEnergeticRoomTRM201;
        this.batchRead = batchRead;
        this.modbusFloat = modbusFloat;
    }

    @Override
    public DeviceModelEnergeticRoomTRM201 getDeviceModel(final boolean enableBatch){
        final List<Float> list =  modbusFloat.readDataFromModBus(modbusMasterSerialFirst,
                deviceModelEnergeticRoomTRM201.getDeviceAddress(),
                batchRead,
                enableBatch,
                deviceModelEnergeticRoomTRM201.getModbusLocator0(),
                deviceModelEnergeticRoomTRM201.getModbusLocator1());
        deviceModelEnergeticRoomTRM201.setDeviceValuesRegister0(list.get(0));
        deviceModelEnergeticRoomTRM201.setDeviceValuesRegister1(list.get(1));
        return deviceModelEnergeticRoomTRM201;
    }
}
