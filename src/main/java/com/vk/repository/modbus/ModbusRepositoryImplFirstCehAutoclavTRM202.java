package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.ModbusMaster;
import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelFirstCehAutoclavTRM202;
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
public class ModbusRepositoryImplFirstCehAutoclavTRM202 implements ModbusRepositoryFirstCehAutoclavTRM202 {

    private ModbusMaster modbusMasterSerialFirst;

    private DeviceModelFirstCehAutoclavTRM202 deviceModelFirstCehAutoclavTRM202;

    private BatchRead batchRead;

    private ModbusFloat modbusFloat;

    @Autowired
    public ModbusRepositoryImplFirstCehAutoclavTRM202(ModbusMaster modbusMasterSerialFirst,
                                                      DeviceModelFirstCehAutoclavTRM202 deviceModelFirstCehAutoclavTRM202,
                                                      BatchRead batchRead,
                                                      ModbusFloat modbusFloat){
        this.modbusMasterSerialFirst = modbusMasterSerialFirst;
        this.deviceModelFirstCehAutoclavTRM202 = deviceModelFirstCehAutoclavTRM202;
        this.batchRead = batchRead;
        this.modbusFloat = modbusFloat;
    }

    @Override
    public DeviceModelFirstCehAutoclavTRM202 getDeviceModel(final boolean enableBatch){
        final List<Float> list =  modbusFloat.readDataFromModBus(modbusMasterSerialFirst,
                deviceModelFirstCehAutoclavTRM202.getDeviceAddress(),
                batchRead,
                enableBatch,
                deviceModelFirstCehAutoclavTRM202.getModbusLocator0(),
                deviceModelFirstCehAutoclavTRM202.getModbusLocator1());
        deviceModelFirstCehAutoclavTRM202.setDeviceValuesRegister0(list.get(0));
        deviceModelFirstCehAutoclavTRM202.setDeviceValuesRegister1(list.get(1));
        return deviceModelFirstCehAutoclavTRM202;
    }
}
