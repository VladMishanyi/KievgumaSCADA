package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.vk.entity.device.DeviceModelFirstCehBuzulukTRM200;
import com.vk.entity.device.DeviceModelFirstCehSmesitel5MB110;
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
public class ModbusRepositoryImplFirstCehSmesitel5MB110
        extends RootModbusRepositoryImpl<Float, ModbusFloat, DeviceModelFirstCehSmesitel5MB110>
        implements ModbusRepositoryFirstCehSmesitel5MB110 {

    private final ModbusMasterSerialModel modbusMasterSerialThird;

    private final DeviceModelFirstCehSmesitel5MB110 deviceModelFirstCehSmesitel5MB110;

    private final BatchRead batchRead;

    private final ModbusFloat modbusFloat;

    @Autowired
    public ModbusRepositoryImplFirstCehSmesitel5MB110(final ModbusMasterSerialModel modbusMasterSerialThird,
                                                      final DeviceModelFirstCehSmesitel5MB110 deviceModelFirstCehSmesitel5MB110,
                                                      final BatchRead batchRead,
                                                      final ModbusFloat modbusFloat){
        super(modbusMasterSerialThird, modbusFloat);
        this.modbusMasterSerialThird = modbusMasterSerialThird;
        this.deviceModelFirstCehSmesitel5MB110 = deviceModelFirstCehSmesitel5MB110;
        this.batchRead = batchRead;
        this.modbusFloat = modbusFloat;
    }

    @Override
    public DeviceModelFirstCehSmesitel5MB110 getDeviceModel(final boolean enableBatch){
        final List<Float> list =  modbusFloat.readDataFromModBus(modbusMasterSerialThird,
                deviceModelFirstCehSmesitel5MB110.getDeviceAddress(),
                batchRead,
                enableBatch,
                deviceModelFirstCehSmesitel5MB110.getModbusLocator0(),
                deviceModelFirstCehSmesitel5MB110.getModbusLocator1());
        deviceModelFirstCehSmesitel5MB110.setDeviceValuesRegister0(list.get(0));
        deviceModelFirstCehSmesitel5MB110.setDeviceValuesRegister1(list.get(1));
        return deviceModelFirstCehSmesitel5MB110;
    }

//    @Override
//    public boolean getModbusStatus() {
//        return modbusFloat.getModbusStatus();
//    }
//
//    @Override
//    public String getMasterName(){
//        return modbusMasterSerialThird.getPort();
//    }
}
