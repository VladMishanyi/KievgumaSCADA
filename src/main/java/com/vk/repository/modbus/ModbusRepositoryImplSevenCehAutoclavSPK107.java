package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.vk.entity.device.DeviceModelFirstCehBuzulukTRM200;
import com.vk.entity.device.DeviceModelSevenCehAutoclavSPK107;
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
public class ModbusRepositoryImplSevenCehAutoclavSPK107
        extends RootModbusRepositoryImpl<Float, ModbusFloat, DeviceModelSevenCehAutoclavSPK107>
        implements ModbusRepositorySevenCehAutoclavSPK107 {

    private final ModbusMasterSerialModel modbusMasterSerialSecond;

    private final DeviceModelSevenCehAutoclavSPK107 deviceModelSevenCehAutoclavSPK107;

    private final BatchRead batchRead;

    private final ModbusFloat modbusFloat;

    @Autowired
    public ModbusRepositoryImplSevenCehAutoclavSPK107(final ModbusMasterSerialModel modbusMasterSerialSecond,
                                                      final DeviceModelSevenCehAutoclavSPK107 deviceModelSevenCehAutoclavSPK107,
                                                      final BatchRead batchRead,
                                                      final ModbusFloat modbusFloat){
        super(modbusMasterSerialSecond, modbusFloat);
        this.modbusMasterSerialSecond = modbusMasterSerialSecond;
        this.deviceModelSevenCehAutoclavSPK107 = deviceModelSevenCehAutoclavSPK107;
        this.batchRead = batchRead;
        this.modbusFloat = modbusFloat;
    }

    @Override
    public DeviceModelSevenCehAutoclavSPK107 getDeviceModel(final boolean enableBatch){
        final List<Float> list =  modbusFloat.readDataFromModBus(modbusMasterSerialSecond,
                deviceModelSevenCehAutoclavSPK107.getDeviceAddress(),
                batchRead,
                enableBatch,
                deviceModelSevenCehAutoclavSPK107.getModbusLocator0(),
                deviceModelSevenCehAutoclavSPK107.getModbusLocator1(),
                deviceModelSevenCehAutoclavSPK107.getModbusLocator2());
        deviceModelSevenCehAutoclavSPK107.setDeviceValuesRegister0(list.get(0));
        deviceModelSevenCehAutoclavSPK107.setDeviceValuesRegister1(list.get(1));
        deviceModelSevenCehAutoclavSPK107.setDeviceValuesRegister2(list.get(2));
        return deviceModelSevenCehAutoclavSPK107;
    }
}
