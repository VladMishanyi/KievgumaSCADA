package com.vk.repository.modbus;

import com.serotonin.modbus4j.BatchRead;
import com.vk.entity.device.DeviceModelFirstCehKameraDozrevanyaMPR51;
import com.vk.entity.device.DeviceModelSecondCehKameraVulcan1MPR51;
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
public class ModbusRepositoryImplSecondCehKameraVulcan1MPR51
        extends RootModbusRepositoryImpl<Float, ModbusFloat, DeviceModelSecondCehKameraVulcan1MPR51>
        implements ModbusRepositorySecondCehKameraVulcan1MPR51 {

    private final ModbusMasterSerialModel modbusMasterSerialFourth;

    private final DeviceModelSecondCehKameraVulcan1MPR51 deviceModelSecondCehKameraVulcan1MPR51;

    private final BatchRead<Integer> batchRead;

    private final ModbusFloat modbusFloat;

    @Autowired
    public ModbusRepositoryImplSecondCehKameraVulcan1MPR51(final ModbusMasterSerialModel modbusMasterSerialFourth,
                                                           final DeviceModelSecondCehKameraVulcan1MPR51 deviceModelSecondCehKameraVulcan1MPR51,
                                                           final BatchRead<Integer> batchRead,
                                                           final ModbusFloat modbusFloat) {
        super(modbusMasterSerialFourth, modbusFloat);
        this.modbusMasterSerialFourth = modbusMasterSerialFourth;
        this.deviceModelSecondCehKameraVulcan1MPR51 = deviceModelSecondCehKameraVulcan1MPR51;
        this.batchRead = batchRead;
        this.modbusFloat = modbusFloat;
    }

    @Override
    public DeviceModelSecondCehKameraVulcan1MPR51 getDeviceModel(final boolean enableBatch) {
        final List<Float> list = modbusFloat.readDataFromModBus(modbusMasterSerialFourth,
                deviceModelSecondCehKameraVulcan1MPR51.getDeviceAddress(),
                batchRead,
                enableBatch,
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator0(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator1(),
                deviceModelSecondCehKameraVulcan1MPR51.getModbusLocator2());
        deviceModelSecondCehKameraVulcan1MPR51.setDeviceValuesRegister0(list.get(0));
        deviceModelSecondCehKameraVulcan1MPR51.setDeviceValuesRegister1(list.get(1));
        deviceModelSecondCehKameraVulcan1MPR51.setDeviceValuesRegister2(list.get(2));
        return deviceModelSecondCehKameraVulcan1MPR51;
    }
}