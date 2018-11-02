package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.vk.entity.device.DeviceModelFirstCehBuzulukTRM200;
import com.vk.entity.device.DeviceModelFirstCehSmesitel4MB110;
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
public class ModbusRepositoryImplFirstCehSmesitel4MB110
        extends RootModbusRepositoryImpl<Float, ModbusFloat, DeviceModelFirstCehSmesitel4MB110>
        implements ModbusRepositoryFirstCehSmesitel4MB110 {

    private final ModbusMasterSerialModel modbusMasterSerialThird;

    private final DeviceModelFirstCehSmesitel4MB110 deviceModelFirstCehSmesitel4MB110;

    private final BatchRead batchRead;

    private final ModbusFloat modbusFloat;

    @Autowired
    public ModbusRepositoryImplFirstCehSmesitel4MB110(final ModbusMasterSerialModel modbusMasterSerialThird,
                                                      final DeviceModelFirstCehSmesitel4MB110 deviceModelFirstCehSmesitel4MB110,
                                                      final BatchRead batchRead,
                                                      final ModbusFloat modbusFloat){
        super(modbusMasterSerialThird, modbusFloat);
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
