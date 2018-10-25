package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.ModbusMaster;
import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelThirdCehAutoclavTRM202;
import com.vk.modbus.ModbusFloat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by KIP-PC99 on 21.06.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.configuration", "com.vk.entity"})
public class ModbusRepositoryImplThirdCehAutoclavTRM202 implements ModbusRepositoryThirdCehAutoclavTRM202 {

    private final ModbusMaster modbusMasterSerialFirst;

    private final DeviceModelThirdCehAutoclavTRM202 deviceModelThirdCehAutoclavTRM202;

    private final BatchRead batchRead;

    private final ModbusFloat modbusFloat;

    @Autowired
    public ModbusRepositoryImplThirdCehAutoclavTRM202(final ModbusMaster modbusMasterSerialFirst,
                                                      final DeviceModelThirdCehAutoclavTRM202 deviceModelThirdCehAutoclavTRM202,
                                                      final BatchRead batchRead,
                                                      final ModbusFloat modbusFloat){
        this.modbusMasterSerialFirst = modbusMasterSerialFirst;
        this.deviceModelThirdCehAutoclavTRM202 = deviceModelThirdCehAutoclavTRM202;
        this.batchRead = batchRead;
        this.modbusFloat = modbusFloat;
    }

    @Override
    public DeviceModelThirdCehAutoclavTRM202 getDeviceModel(final boolean enableBatch){
        final List<Float> list =  modbusFloat.readDataFromModBus(modbusMasterSerialFirst,
                deviceModelThirdCehAutoclavTRM202.getDeviceAddress(),
                batchRead,
                enableBatch,
                deviceModelThirdCehAutoclavTRM202.getModbusLocator0(),
                deviceModelThirdCehAutoclavTRM202.getModbusLocator1());
        deviceModelThirdCehAutoclavTRM202.setDeviceValuesRegister0(list.get(0));
        deviceModelThirdCehAutoclavTRM202.setDeviceValuesRegister1(list.get(1));
        return deviceModelThirdCehAutoclavTRM202;
    }
}
