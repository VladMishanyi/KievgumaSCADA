package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.ModbusMaster;
import com.vk.entity.device.DeviceModelFirstCehKameraDozrevanyaMPR51;
import com.vk.entity.device.DeviceModelFirstCehKameraDozrevanyaTRM138;
import com.vk.entity.device.DeviceModelThirdCehAutoclavTRM202;
import com.vk.modbus.ModbusFloat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by KIP-PC99 on 20.09.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.configuration", "com.vk.entity"})
public class ModbusRepositoryImplFirstCehKameraDozrevanyaTRM138 implements ModbusRepositoryFirstCehKameraDozrevanyaTRM138  {

    private final ModbusMaster modbusMasterSerialFirst;

    private final DeviceModelFirstCehKameraDozrevanyaTRM138 deviceModelFirstCehKameraDozrevanyaTRM138;

    private final BatchRead batchRead;

    private final ModbusFloat modbusFloat;

    @Autowired
    public ModbusRepositoryImplFirstCehKameraDozrevanyaTRM138(final ModbusMaster modbusMasterSerialFirst,
                                                              final DeviceModelFirstCehKameraDozrevanyaTRM138 deviceModelFirstCehKameraDozrevanyaTRM138,
                                                              final BatchRead batchRead,
                                                              final ModbusFloat modbusFloat){
        this.modbusMasterSerialFirst = modbusMasterSerialFirst;
        this.deviceModelFirstCehKameraDozrevanyaTRM138 = deviceModelFirstCehKameraDozrevanyaTRM138;
        this.batchRead = batchRead;
        this.modbusFloat = modbusFloat;
    }

    @Override
    public DeviceModelFirstCehKameraDozrevanyaTRM138 getDeviceModel(final boolean enableBatch){
        final List<Float> list =  modbusFloat.readDataFromModBus(modbusMasterSerialFirst,
                deviceModelFirstCehKameraDozrevanyaTRM138.getDeviceAddress(),
                batchRead,
                enableBatch,
                deviceModelFirstCehKameraDozrevanyaTRM138.getModbusLocator0(),
                deviceModelFirstCehKameraDozrevanyaTRM138.getModbusLocator1(),
                deviceModelFirstCehKameraDozrevanyaTRM138.getModbusLocator2(),
                deviceModelFirstCehKameraDozrevanyaTRM138.getModbusLocator3(),
                deviceModelFirstCehKameraDozrevanyaTRM138.getModbusLocator4());
        deviceModelFirstCehKameraDozrevanyaTRM138.setDeviceValuesRegister0(list.get(0));
        deviceModelFirstCehKameraDozrevanyaTRM138.setDeviceValuesRegister1(list.get(1));
        deviceModelFirstCehKameraDozrevanyaTRM138.setDeviceValuesRegister2(list.get(2));
        deviceModelFirstCehKameraDozrevanyaTRM138.setDeviceValuesRegister3(list.get(3));
        deviceModelFirstCehKameraDozrevanyaTRM138.setDeviceValuesRegister4(list.get(4));
        return deviceModelFirstCehKameraDozrevanyaTRM138;
    }
}
