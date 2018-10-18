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
public class DeviceModelFirstCehSmesitel5KMSF1 extends DeviceModel{
    private static final int deviceAddress = 48;

    private static final int deviceRegisterRange0 = RegisterRange.HOLDING_REGISTER;
    private static final int deviceRegisterOffset0 = 28;
    private static final int deviceRegisterDataType0 = DataType.FOUR_BYTE_INT_SIGNED;
    private static final short hysteresis0 = 1;
    private static short deviceValuesRegister0 = 0;
    private static short hisDeviceValuesRegisters0 = 0;
    private static final ModbusLocator modbusLocator0 =
            new ModbusLocator(deviceAddress,
                    deviceRegisterRange0,
                    deviceRegisterOffset0,
                    deviceRegisterDataType0);

    public DeviceModelFirstCehSmesitel5KMSF1(){}

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

    public static short getHysteresis0() {
        return hysteresis0;
    }

    public static short getDeviceValuesRegister0() {
        return deviceValuesRegister0;
    }

    public static void setDeviceValuesRegister0(short deviceValuesRegister0) {
        DeviceModelFirstCehSmesitel5KMSF1.deviceValuesRegister0 = deviceValuesRegister0;
    }

    public static short getHisDeviceValuesRegisters0() {
        return hisDeviceValuesRegisters0;
    }

    public static void setHisDeviceValuesRegisters0(short hisDeviceValuesRegisters0) {
        DeviceModelFirstCehSmesitel5KMSF1.hisDeviceValuesRegisters0 = hisDeviceValuesRegisters0;
    }

    public static ModbusLocator getModbusLocator0() {
        return modbusLocator0;
    }

    public static boolean hysteresis(){
        boolean inner = HysComparator.compare(getHisDeviceValuesRegisters0(),
                getDeviceValuesRegister0(),
                getHysteresis0());
        if (inner){
            hisDeviceValuesRegisters0 = deviceValuesRegister0;
        }
        return inner;
    }
}
