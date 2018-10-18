package com.vk.entity.device;

import com.serotonin.modbus4j.ModbusLocator;
import com.serotonin.modbus4j.code.DataType;
import com.serotonin.modbus4j.code.RegisterRange;
import com.vk.lib.HysComparator;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

/**
 * Created by User on 2018-03-06.
 */
@Component
@ApplicationScope
public class DeviceModelSevenCehAutoclavSPK107 extends DeviceModel{
    private static final int deviceAddress = 21;

    private static final int deviceRegisterRange0 = RegisterRange.INPUT_REGISTER;
    private static final int deviceRegisterOffset0 = 0;
    private static final int deviceRegisterDataType0 = DataType.FOUR_BYTE_FLOAT;
    private static final float hysteresis0 = 1.0F;
    private static float deviceValuesRegister0 = 0F;
    private static float hisDeviceValuesRegisters0 = 0F;
    private static final ModbusLocator modbusLocator0 =
            new ModbusLocator(deviceAddress,
                    deviceRegisterRange0,
                    deviceRegisterOffset0,
                    deviceRegisterDataType0);

    private static final int deviceRegisterRange1 = RegisterRange.INPUT_REGISTER;
    private static final int deviceRegisterOffset1 = 2;
    private static final int deviceRegisterDataType1 = DataType.FOUR_BYTE_FLOAT;
    private static final float hysteresis1 = 1.0F;
    private static float deviceValuesRegister1 = 0F;
    private static float hisDeviceValuesRegisters1 = 0F;
    private static final ModbusLocator modbusLocator1 =
            new ModbusLocator(deviceAddress,
                    deviceRegisterRange1,
                    deviceRegisterOffset1,
                    deviceRegisterDataType1);

    private static final int deviceRegisterRange2 = RegisterRange.INPUT_REGISTER;
    private static final int deviceRegisterOffset2 = 4;
    private static final int deviceRegisterDataType2 = DataType.FOUR_BYTE_FLOAT;
    private static final float hysteresis2 = 1.0F;
    private static float deviceValuesRegister2 = 0F;
    private static float hisDeviceValuesRegisters2 = 0F;
    private static final ModbusLocator modbusLocator2 =
            new ModbusLocator(deviceAddress,
                    deviceRegisterRange2,
                    deviceRegisterOffset2,
                    deviceRegisterDataType2);

    public DeviceModelSevenCehAutoclavSPK107(){}

    public static int getDeviceAddress() {
        return deviceAddress;
    }

    public static int getDeviceRegisterRange0() {
        return deviceRegisterRange0;
    }

    public static int getDeviceRegisterOffset0() {
        return deviceRegisterOffset0;
    }

    public static int getDeviceRegisterDataType0() {
        return deviceRegisterDataType0;
    }

    public static float getHysteresis0() {
        return hysteresis0;
    }

    public static float getDeviceValuesRegister0() {
        return deviceValuesRegister0;
    }

    public static void setDeviceValuesRegister0(float deviceValuesRegister0) {
        DeviceModelSevenCehAutoclavSPK107.deviceValuesRegister0 = deviceValuesRegister0;
    }

    public static float getHisDeviceValuesRegisters0() {
        return hisDeviceValuesRegisters0;
    }

    public static void setHisDeviceValuesRegisters0(float hisDeviceValuesRegisters0) {
        DeviceModelSevenCehAutoclavSPK107.hisDeviceValuesRegisters0 = hisDeviceValuesRegisters0;
    }

    public static ModbusLocator getModbusLocator0() {
        return modbusLocator0;
    }

    public static int getDeviceRegisterRange1() {
        return deviceRegisterRange1;
    }

    public static int getDeviceRegisterOffset1() {
        return deviceRegisterOffset1;
    }

    public static int getDeviceRegisterDataType1() {
        return deviceRegisterDataType1;
    }

    public static float getHysteresis1() {
        return hysteresis1;
    }

    public static float getDeviceValuesRegister1() {
        return deviceValuesRegister1;
    }

    public static void setDeviceValuesRegister1(float deviceValuesRegister1) {
        DeviceModelSevenCehAutoclavSPK107.deviceValuesRegister1 = deviceValuesRegister1;
    }

    public static float getHisDeviceValuesRegisters1() {
        return hisDeviceValuesRegisters1;
    }

    public static void setHisDeviceValuesRegisters1(float hisDeviceValuesRegisters1) {
        DeviceModelSevenCehAutoclavSPK107.hisDeviceValuesRegisters1 = hisDeviceValuesRegisters1;
    }

    public static ModbusLocator getModbusLocator1() {
        return modbusLocator1;
    }

    public static int getDeviceRegisterRange2() {
        return deviceRegisterRange2;
    }

    public static int getDeviceRegisterOffset2() {
        return deviceRegisterOffset2;
    }

    public static int getDeviceRegisterDataType2() {
        return deviceRegisterDataType2;
    }

    public static float getHysteresis2() {
        return hysteresis2;
    }

    public static float getDeviceValuesRegister2() {
        return deviceValuesRegister2;
    }

    public static void setDeviceValuesRegister2(float deviceValuesRegister2) {
        DeviceModelSevenCehAutoclavSPK107.deviceValuesRegister2 = deviceValuesRegister2;
    }

    public static float getHisDeviceValuesRegisters2() {
        return hisDeviceValuesRegisters2;
    }

    public static void setHisDeviceValuesRegisters2(float hisDeviceValuesRegisters2) {
        DeviceModelSevenCehAutoclavSPK107.hisDeviceValuesRegisters2 = hisDeviceValuesRegisters2;
    }

    public static ModbusLocator getModbusLocator2() {
        return modbusLocator2;
    }

    public static boolean hysteresis(){
        boolean inner = HysComparator.compare(getHisDeviceValuesRegisters0(),
                getDeviceValuesRegister0(),
                getHysteresis0());
        inner |= HysComparator.compare(getHisDeviceValuesRegisters1(),
                getDeviceValuesRegister1(),
                getHysteresis1());
        inner |= HysComparator.compare(getHisDeviceValuesRegisters2(),
                getDeviceValuesRegister2(),
                getHysteresis2());
        if (inner){
            hisDeviceValuesRegisters0 = deviceValuesRegister0;
            hisDeviceValuesRegisters1 = deviceValuesRegister1;
            hisDeviceValuesRegisters2 = deviceValuesRegister2;
        }
        return inner;
    }
}
