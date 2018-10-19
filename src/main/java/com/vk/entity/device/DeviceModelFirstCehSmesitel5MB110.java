package com.vk.entity.device;

import com.serotonin.modbus4j.ModbusLocator;
import com.serotonin.modbus4j.code.DataType;
import com.serotonin.modbus4j.code.RegisterRange;
import com.vk.lib.HysComparator;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

/**
 * Created by User on 2018-04-28.
 */
@Component
@ApplicationScope
public class DeviceModelFirstCehSmesitel5MB110 implements DeviceModel{
    private static final int deviceAddress = 45;

    private static final int deviceRegisterRange0 = RegisterRange.HOLDING_REGISTER;
    private static final int deviceRegisterOffset0 = 4;
    private static final int deviceRegisterDataType0 = DataType.FOUR_BYTE_FLOAT;
    private static final float hysteresis0 = 1.0F;
    private static float deviceValuesRegister0 = 0F;
    private static float hisDeviceValuesRegisters0 = 0F;
    private static final ModbusLocator modbusLocator0 =
            new ModbusLocator(deviceAddress,
                    deviceRegisterRange0,
                    deviceRegisterOffset0,
                    deviceRegisterDataType0);

    private static final int deviceRegisterRange1 = RegisterRange.HOLDING_REGISTER;
    private static final int deviceRegisterOffset1 = 10;
    private static final int deviceRegisterDataType1 = DataType.FOUR_BYTE_FLOAT;
    private static final float hysteresis1 = 1.0F;
    private static float deviceValuesRegister1 = 0F;
    private static float hisDeviceValuesRegisters1 = 0F;
    private static final ModbusLocator modbusLocator1 =
            new ModbusLocator(deviceAddress,
                    deviceRegisterRange1,
                    deviceRegisterOffset1,
                    deviceRegisterDataType1);

    public DeviceModelFirstCehSmesitel5MB110(){}

    @Override
    public int getDeviceAddress() {
        return deviceAddress;
    }

    public int getDeviceRegisterRange0() {
        return deviceRegisterRange0;
    }

    public int getDeviceRegisterOffset0() {
        return deviceRegisterOffset0;
    }

    public int getDeviceRegisterDataType0() {
        return deviceRegisterDataType0;
    }

    public float getHysteresis0() {
        return hysteresis0;
    }

    public float getDeviceValuesRegister0() {
        return deviceValuesRegister0;
    }

    public void setDeviceValuesRegister0(float deviceValuesRegister0) {
        DeviceModelFirstCehSmesitel5MB110.deviceValuesRegister0 = deviceValuesRegister0;
    }

    public float getHisDeviceValuesRegisters0() {
        return hisDeviceValuesRegisters0;
    }

    public void setHisDeviceValuesRegisters0(float hisDeviceValuesRegisters0) {
        DeviceModelFirstCehSmesitel5MB110.hisDeviceValuesRegisters0 = hisDeviceValuesRegisters0;
    }

    public ModbusLocator getModbusLocator0() {
        return modbusLocator0;
    }

    public int getDeviceRegisterRange1() {
        return deviceRegisterRange1;
    }

    public int getDeviceRegisterOffset1() {
        return deviceRegisterOffset1;
    }

    public int getDeviceRegisterDataType1() {
        return deviceRegisterDataType1;
    }

    public float getHysteresis1() {
        return hysteresis1;
    }

    public float getDeviceValuesRegister1() {
        return deviceValuesRegister1;
    }

    public void setDeviceValuesRegister1(float deviceValuesRegister1) {
        DeviceModelFirstCehSmesitel5MB110.deviceValuesRegister1 = deviceValuesRegister1;
    }

    public float getHisDeviceValuesRegisters1() {
        return hisDeviceValuesRegisters1;
    }

    public void setHisDeviceValuesRegisters1(float hisDeviceValuesRegisters1) {
        DeviceModelFirstCehSmesitel5MB110.hisDeviceValuesRegisters1 = hisDeviceValuesRegisters1;
    }

    public ModbusLocator getModbusLocator1() {
        return modbusLocator1;
    }

    @Override
    public boolean hysteresis(){
        boolean inner = HysComparator.compare(getHisDeviceValuesRegisters0(),
                getDeviceValuesRegister0(),
                getHysteresis0());
        inner |= HysComparator.compare(getHisDeviceValuesRegisters1(),
                getDeviceValuesRegister1(),
                getHysteresis1());
        if (inner){
            hisDeviceValuesRegisters0 = deviceValuesRegister0;
            hisDeviceValuesRegisters1 = deviceValuesRegister1;
        }
        return inner;
    }
}
