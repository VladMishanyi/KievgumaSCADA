package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.ModbusMaster;
import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelFirstCehSmesitel4MB110;
import com.vk.entity.device.DeviceModelThirdCehAutoclavTRM202;
import com.vk.modbus.ModbusFloat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by KIP-PC99 on 21.06.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.configuration", "com.vk.entity"})
public class ModbusRepositoryImplFirstCehSmesitel4MB110 implements ModbusRepositoryFirstCehSmesitel4MB110 {

    private ModbusMaster modbusMasterSerialThird;

    private DeviceModelFirstCehSmesitel4MB110 deviceModelFirstCehSmesitel4MB110;

    private BatchRead batchRead;

    private ModbusFloat modbusFloat;

    @Autowired
    public ModbusRepositoryImplFirstCehSmesitel4MB110(ModbusMaster modbusMasterSerialThird,
                                                      DeviceModelFirstCehSmesitel4MB110 deviceModelFirstCehSmesitel4MB110,
                                                      BatchRead batchRead,
                                                      ModbusFloat modbusFloat){
        this.modbusMasterSerialThird = modbusMasterSerialThird;
        this.deviceModelFirstCehSmesitel4MB110 = deviceModelFirstCehSmesitel4MB110;
        this.batchRead = batchRead;
        this.modbusFloat = modbusFloat;
    }

    @Override
    public DeviceModelFirstCehSmesitel4MB110 getDeviceModel(final boolean enableBatch){
        final List<Float> list =  modbusFloat.readDataFromModBus(modbusMasterSerialThird,
                deviceModelFirstCehSmesitel4MB110.getDeviceAddress(),
                batchRead,
                enableBatch,
                deviceModelFirstCehSmesitel4MB110.getModbusLocator0(),
                deviceModelFirstCehSmesitel4MB110.getModbusLocator1());
        deviceModelFirstCehSmesitel4MB110.setDeviceValuesRegister0(list.get(0));
        deviceModelFirstCehSmesitel4MB110.setDeviceValuesRegister1(list.get(1));
        return deviceModelFirstCehSmesitel4MB110;
    }
}
