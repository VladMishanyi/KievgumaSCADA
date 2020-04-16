package com.vk.entity.device;

import com.serotonin.modbus4j.ModbusLocator;
import com.serotonin.modbus4j.code.DataType;
import com.serotonin.modbus4j.code.RegisterRange;
import com.vk.lib.HysComparator;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

/**
 * Created by KIP-PC99 on 20.11.2018.
 */
@Component
public class DeviceModelSecondCehKameraVulcan2MPR51 implements DeviceModel{
    private final int deviceAddress = 18;
    private final float hysteresisFloat = 1.0F;

    private float deviceValuesRegister0 = 0F;
    private float hisDeviceValuesRegisters0 = 0F;
    private final ModbusLocator modbusLocator0 = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 0, DataType.FOUR_BYTE_FLOAT);

    private float deviceValuesRegister1 = 0F;
    private float hisDeviceValuesRegisters1 = 0F;
    private final ModbusLocator modbusLocator1 = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 2, DataType.FOUR_BYTE_FLOAT);

    private final float hysteresis2 = 1.0F;
    private float deviceValuesRegister2 = 0F;
    private float hisDeviceValuesRegisters2 = 0F;
    private final ModbusLocator modbusLocator2 = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 4, DataType.FOUR_BYTE_FLOAT);

    public DeviceModelSecondCehKameraVulcan2MPR51(){}

    public float getHysteresisFloat() {
        return hysteresisFloat;
    }

    public float getDeviceValuesRegister0() {
        return deviceValuesRegister0;
    }

    public void setDeviceValuesRegister0(float deviceValuesRegister0) {
        this.deviceValuesRegister0 = deviceValuesRegister0;
    }

    public float getHisDeviceValuesRegisters0() {
        return hisDeviceValuesRegisters0;
    }

    public void setHisDeviceValuesRegisters0(float hisDeviceValuesRegisters0) {
        this.hisDeviceValuesRegisters0 = hisDeviceValuesRegisters0;
    }

    public ModbusLocator getModbusLocator0() {
        return modbusLocator0;
    }

    public float getDeviceValuesRegister1() {
        return deviceValuesRegister1;
    }

    public void setDeviceValuesRegister1(float deviceValuesRegister1) {
        this.deviceValuesRegister1 = deviceValuesRegister1;
    }

    public float getHisDeviceValuesRegisters1() {
        return hisDeviceValuesRegisters1;
    }

    public void setHisDeviceValuesRegisters1(float hisDeviceValuesRegisters1) {
        this.hisDeviceValuesRegisters1 = hisDeviceValuesRegisters1;
    }

    public ModbusLocator getModbusLocator1() {
        return modbusLocator1;
    }

    public float getHysteresis2() {
        return hysteresis2;
    }

    public float getDeviceValuesRegister2() {
        return deviceValuesRegister2;
    }

    public void setDeviceValuesRegister2(float deviceValuesRegister2) {
        this.deviceValuesRegister2 = deviceValuesRegister2;
    }

    public float getHisDeviceValuesRegisters2() {
        return hisDeviceValuesRegisters2;
    }

    public void setHisDeviceValuesRegisters2(float hisDeviceValuesRegisters2) {
        this.hisDeviceValuesRegisters2 = hisDeviceValuesRegisters2;
    }

    public ModbusLocator getModbusLocator2() {
        return modbusLocator2;
    }

    @Override
    public int getDeviceAddress() {
        return deviceAddress;
    }

    @Override
    public boolean hysteresis(){
        boolean inner = HysComparator.compare(hisDeviceValuesRegisters0,
                deviceValuesRegister0,
                hysteresisFloat);
        inner |= HysComparator.compare(hisDeviceValuesRegisters1,
                deviceValuesRegister1,
                hysteresisFloat);
        inner |= HysComparator.compare(hisDeviceValuesRegisters2,
                deviceValuesRegister2,
                hysteresisFloat);
        if (inner){
            hisDeviceValuesRegisters0 = deviceValuesRegister0;
            hisDeviceValuesRegisters1 = deviceValuesRegister1;
            hisDeviceValuesRegisters2 = deviceValuesRegister2;
        }
        return inner;
    }
}
