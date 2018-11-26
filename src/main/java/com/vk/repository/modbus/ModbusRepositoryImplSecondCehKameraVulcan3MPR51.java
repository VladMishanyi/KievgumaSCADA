package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.vk.entity.device.DeviceModelFirstCehKameraDozrevanyaMPR51;
import com.vk.entity.device.DeviceModelSecondCehKameraVulcan1MPR51;
import com.vk.entity.device.DeviceModelSecondCehKameraVulcan3MPR51;
import com.vk.entity.modbus.ModbusMasterSerialModel;
import com.vk.modbus.ModbusFloat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by KIP-PC99 on 21.11.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.configuration", "com.vk.entity"})
public class ModbusRepositoryImplSecondCehKameraVulcan3MPR51
        extends RootModbusRepositoryImpl<Float, ModbusFloat, DeviceModelSecondCehKameraVulcan3MPR51>
        implements ModbusRepositorySecondCehKameraVulcan3MPR51 {

    private final ModbusMasterSerialModel modbusMasterSerialFourth;

    private final DeviceModelSecondCehKameraVulcan3MPR51 deviceModelSecondCehKameraVulcan3MPR51;

    private final BatchRead batchRead;

    private final ModbusFloat modbusFloat;

    @Autowired
    public ModbusRepositoryImplSecondCehKameraVulcan3MPR51(final ModbusMasterSerialModel modbusMasterSerialFourth,
                                                           final DeviceModelSecondCehKameraVulcan3MPR51 deviceModelSecondCehKameraVulcan3MPR51,
                                                           final BatchRead batchRead,
                                                           final ModbusFloat modbusFloat) {
        super(modbusMasterSerialFourth, modbusFloat);
        this.modbusMasterSerialFourth = modbusMasterSerialFourth;
        this.deviceModelSecondCehKameraVulcan3MPR51 = deviceModelSecondCehKameraVulcan3MPR51;
        this.batchRead = batchRead;
        this.modbusFloat = modbusFloat;
    }

    @Override
    public DeviceModelSecondCehKameraVulcan3MPR51 getDeviceModel(final boolean enableBatch) {
        final List<Float> list = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                deviceModelSecondCehKameraVulcan3MPR51.getDeviceAddress(),
                batchRead,
                enableBatch,
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator0(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator1(),
                deviceModelSecondCehKameraVulcan3MPR51.getModbusLocator2());
        deviceModelSecondCehKameraVulcan3MPR51.setDeviceValuesRegister0(list.get(0));
        deviceModelSecondCehKameraVulcan3MPR51.setDeviceValuesRegister1(list.get(1));
        deviceModelSecondCehKameraVulcan3MPR51.setDeviceValuesRegister2(list.get(2));
        return deviceModelSecondCehKameraVulcan3MPR51;
    }
}