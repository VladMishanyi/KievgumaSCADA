package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.vk.entity.device.DeviceModelFirstCehAutoclavTRM202;
import com.vk.entity.modbus.ModbusMasterSerialModel;
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
public class ModbusRepositoryImplFirstCehAutoclavTRM202
        extends RootModbusRepositoryImpl<Float, ModbusFloat, DeviceModelFirstCehAutoclavTRM202>
        implements ModbusRepositoryFirstCehAutoclavTRM202 {

    private final ModbusMasterSerialModel modbusMasterSerialFirst;

    private final DeviceModelFirstCehAutoclavTRM202 deviceModelFirstCehAutoclavTRM202;

    private final BatchRead<Integer> batchRead;

    private final ModbusFloat modbusFloat;

    @Autowired
    public ModbusRepositoryImplFirstCehAutoclavTRM202(final ModbusMasterSerialModel modbusMasterSerialFirst,
                                                      final DeviceModelFirstCehAutoclavTRM202 deviceModelFirstCehAutoclavTRM202,
                                                      final BatchRead<Integer> batchRead,
                                                      final ModbusFloat modbusFloat){
        super(modbusFloat);
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
