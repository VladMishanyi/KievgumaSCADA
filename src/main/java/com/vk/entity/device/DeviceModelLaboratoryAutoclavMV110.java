package com.vk.entity.device;

import com.serotonin.modbus4j.ModbusLocator;
import com.serotonin.modbus4j.code.DataType;
import com.serotonin.modbus4j.code.RegisterRange;
import com.vk.lib.HysComparator;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

/**
 * Created by User on 2018-04-02.
 */
@Component
@ApplicationScope
public class DeviceModelLaboratoryAutoclavMV110 extends DeviceModel{
    private static final int deviceAddress = 23;


    private static final int deviceRegisterRange0 = RegisterRange.HOLDING_REGISTER;
    private static final int deviceRegisterOffset0 = 4105;
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
    private static final int deviceRegisterOffset1 = 4107;
    private static final int deviceRegisterDataType1 = DataType.FOUR_BYTE_FLOAT;
    private static final float hysteresis1 = 1.0F;
    private static float deviceValuesRegister1 = 0F;
    private static float hisDeviceValuesRegisters1 = 0F;
    private static final ModbusLocator modbusLocator1 =
            new ModbusLocator(deviceAddress,
                    deviceRegisterRange1,
                    deviceRegisterOffset1,
                    deviceRegisterDataType1);

    public DeviceModelLaboratoryAutoclavMV110(){}

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
        DeviceModelLaboratoryAutoclavMV110.deviceValuesRegister0 = deviceValuesRegister0;
    }

    public static float getHisDeviceValuesRegisters0() {
        return hisDeviceValuesRegisters0;
    }

    public static void setHisDeviceValuesRegisters0(float hisDeviceValuesRegisters0) {
        DeviceModelLaboratoryAutoclavMV110.hisDeviceValuesRegisters0 = hisDeviceValuesRegisters0;
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
        DeviceModelLaboratoryAutoclavMV110.deviceValuesRegister1 = deviceValuesRegister1;
    }

    public static float getHisDeviceValuesRegisters1() {
        return hisDeviceValuesRegisters1;
    }

    public static void setHisDeviceValuesRegisters1(float hisDeviceValuesRegisters1) {
        DeviceModelLaboratoryAutoclavMV110.hisDeviceValuesRegisters1 = hisDeviceValuesRegisters1;
    }

    public static ModbusLocator getModbusLocator1() {
        return modbusLocator1;
    }

    public static boolean hysteresis(){
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
