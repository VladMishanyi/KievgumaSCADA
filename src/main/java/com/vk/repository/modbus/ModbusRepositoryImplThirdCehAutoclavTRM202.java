package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.vk.entity.device.DeviceModelFirstCehBuzulukTRM200;
import com.vk.entity.device.DeviceModelThirdCehAutoclavTRM202;
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
public class ModbusRepositoryImplThirdCehAutoclavTRM202
        extends RootModbusRepositoryImpl<Float, ModbusFloat, DeviceModelThirdCehAutoclavTRM202>
        implements ModbusRepositoryThirdCehAutoclavTRM202 {

    private final ModbusMasterSerialModel modbusMasterSerialFirst;

    private final DeviceModelThirdCehAutoclavTRM202 deviceModelThirdCehAutoclavTRM202;

    private final BatchRead batchRead;

    private final ModbusFloat modbusFloat;

    @Autowired
    public ModbusRepositoryImplThirdCehAutoclavTRM202(final ModbusMasterSerialModel modbusMasterSerialFirst,
                                                      final DeviceModelThirdCehAutoclavTRM202 deviceModelThirdCehAutoclavTRM202,
                                                      final BatchRead batchRead,
                                                      final ModbusFloat modbusFloat){
        super(modbusMasterSerialFirst, modbusFloat);
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

//    @Override
//    public boolean getModbusStatus() {
//        return modbusFloat.getModbusStatus();
//    }
//
//    @Override
//    public String getMasterName(){
//        return modbusMasterSerialFirst.getPort();
//    }
}
