package com.vk.entity.device;

import com.serotonin.modbus4j.ModbusLocator;
import com.serotonin.modbus4j.code.DataType;
import com.serotonin.modbus4j.code.RegisterRange;
import com.vk.lib.HysComparator;
import org.springframework.stereotype.Component;

/**
 * Created by KIP-PC99 on 08.08.2018.
 */
@Component
public class DeviceModelKotelnyaParMikrolITM4 implements DeviceModel{
    private static final int deviceAddress = 20;

    private static final int deviceRegisterRange0 = RegisterRange.HOLDING_REGISTER;
    private static final int deviceRegisterOffset0 = 1200;
    private static final int deviceRegisterDataType0 = DataType.FOUR_BYTE_FLOAT_SWAPPED;
    private static final float hysteresis0 = 1.0F;
    private static float deviceValuesRegister0 = 0F;
    private static float hisDeviceValuesRegisters0 = 0F;
    private static final ModbusLocator modbusLocator0 =
            new ModbusLocator(deviceAddress,
                    deviceRegisterRange0,
                    deviceRegisterOffset0,
                    deviceRegisterDataType0);

    private static final int deviceRegisterRange1 = RegisterRange.HOLDING_REGISTER;
    private static final int deviceRegisterOffset1 = 1202;
    private static final int deviceRegisterDataType1 = DataType.FOUR_BYTE_FLOAT_SWAPPED;
    private static final float hysteresis1 = 1.0F;
    private static float deviceValuesRegister1 = 0F;
    private static float hisDeviceValuesRegisters1 = 0F;
    private static final ModbusLocator modbusLocator1 =
            new ModbusLocator(deviceAddress,
                    deviceRegisterRange1,
                    deviceRegisterOffset1,
                    deviceRegisterDataType1);

    private static final int deviceRegisterRange2 = RegisterRange.HOLDING_REGISTER;
    private static final int deviceRegisterOffset2 = 1204;
    private static final int deviceRegisterDataType2 = DataType.FOUR_BYTE_FLOAT_SWAPPED;
    private static final float hysteresis2 = 1.0F;
    private static float deviceValuesRegister2 = 0F;
    private static float hisDeviceValuesRegisters2 = 0F;
    private static final ModbusLocator modbusLocator2 =
            new ModbusLocator(deviceAddress,
                    deviceRegisterRange2,
                    deviceRegisterOffset2,
                    deviceRegisterDataType2);

    private static final int deviceRegisterRange3 = RegisterRange.HOLDING_REGISTER;
    private static final int deviceRegisterOffset3 = 1206;
    private static final int deviceRegisterDataType3 = DataType.FOUR_BYTE_FLOAT_SWAPPED;
    private static final float hysteresis3 = 1.0F;
    private static float deviceValuesRegister3 = 0F;
    private static float hisDeviceValuesRegisters3 = 0F;
    private static final ModbusLocator modbusLocator3 =
            new ModbusLocator(deviceAddress,
                    deviceRegisterRange3,
                    deviceRegisterOffset3,
                    deviceRegisterDataType3);

    public DeviceModelKotelnyaParMikrolITM4(){}

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
        DeviceModelKotelnyaParMikrolITM4.deviceValuesRegister0 = deviceValuesRegister0;
    }

    public static float getHisDeviceValuesRegisters0() {
        return hisDeviceValuesRegisters0;
    }

    public static void setHisDeviceValuesRegisters0(float hisDeviceValuesRegisters0) {
        DeviceModelKotelnyaParMikrolITM4.hisDeviceValuesRegisters0 = hisDeviceValuesRegisters0;
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
        DeviceModelKotelnyaParMikrolITM4.deviceValuesRegister1 = deviceValuesRegister1;
    }

    public static float getHisDeviceValuesRegisters1() {
        return hisDeviceValuesRegisters1;
    }

    public static void setHisDeviceValuesRegisters1(float hisDeviceValuesRegisters1) {
        DeviceModelKotelnyaParMikrolITM4.hisDeviceValuesRegisters1 = hisDeviceValuesRegisters1;
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
        DeviceModelKotelnyaParMikrolITM4.deviceValuesRegister2 = deviceValuesRegister2;
    }

    public static float getHisDeviceValuesRegisters2() {
        return hisDeviceValuesRegisters2;
    }

    public static void setHisDeviceValuesRegisters2(float hisDeviceValuesRegisters2) {
        DeviceModelKotelnyaParMikrolITM4.hisDeviceValuesRegisters2 = hisDeviceValuesRegisters2;
    }

    public static ModbusLocator getModbusLocator2() {
        return modbusLocator2;
    }

    public static int getDeviceRegisterRange3() {
        return deviceRegisterRange3;
    }

    public static int getDeviceRegisterOffset3() {
        return deviceRegisterOffset3;
    }

    public static int getDeviceRegisterDataType3() {
        return deviceRegisterDataType3;
    }

    public static float getHysteresis3() {
        return hysteresis3;
    }

    public static float getDeviceValuesRegister3() {
        return deviceValuesRegister3;
    }

    public static void setDeviceValuesRegister3(float deviceValuesRegister3) {
        DeviceModelKotelnyaParMikrolITM4.deviceValuesRegister3 = deviceValuesRegister3;
    }

    public static float getHisDeviceValuesRegisters3() {
        return hisDeviceValuesRegisters3;
    }

    public static void setHisDeviceValuesRegisters3(float hisDeviceValuesRegisters3) {
        DeviceModelKotelnyaParMikrolITM4.hisDeviceValuesRegisters3 = hisDeviceValuesRegisters3;
    }

    public static ModbusLocator getModbusLocator3() {
        return modbusLocator3;
    }

    public int getDeviceAddress() {
        return deviceAddress;
    }

    @Override
    public boolean hysteresis(){
        boolean inner = HysComparator.compare(hisDeviceValuesRegisters0,
                deviceValuesRegister0,
                hysteresis0);
        inner |= HysComparator.compare(hisDeviceValuesRegisters1,
                deviceValuesRegister1,
                hysteresis1);
        inner |= HysComparator.compare(hisDeviceValuesRegisters2,
                deviceValuesRegister2,
                hysteresis2);
        inner |= HysComparator.compare(hisDeviceValuesRegisters3,
                deviceValuesRegister3,
                hysteresis3);
        if (inner){
            hisDeviceValuesRegisters0 = deviceValuesRegister0;
            hisDeviceValuesRegisters1 = deviceValuesRegister1;
            hisDeviceValuesRegisters2 = deviceValuesRegister2;
            hisDeviceValuesRegisters3 = deviceValuesRegister3;
        }
        return inner;
    }
}
