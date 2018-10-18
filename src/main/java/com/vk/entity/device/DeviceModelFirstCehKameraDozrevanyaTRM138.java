package com.vk.entity.device;

import com.serotonin.modbus4j.ModbusLocator;
import com.serotonin.modbus4j.code.DataType;
import com.serotonin.modbus4j.code.RegisterRange;
import com.vk.lib.HysComparator;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

/**
 * Created by KIP-PC99 on 20.09.2018.
 */
@Component
@ApplicationScope
public class DeviceModelFirstCehKameraDozrevanyaTRM138 extends DeviceModel {
    private static final int deviceAddress = 80;//80-88 reserved for this device

    private static final int deviceRegisterRange0 = RegisterRange.INPUT_REGISTER;
    private static final int deviceRegisterOffset0 = 3;
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
    private static final int deviceRegisterOffset1 = 8;
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
    private static final int deviceRegisterOffset2 = 13;
    private static final int deviceRegisterDataType2 = DataType.FOUR_BYTE_FLOAT;
    private static final float hysteresis2 = 1.0F;
    private static float deviceValuesRegister2 = 0F;
    private static float hisDeviceValuesRegisters2 = 0F;
    private static final ModbusLocator modbusLocator2 =
            new ModbusLocator(deviceAddress,
                    deviceRegisterRange2,
                    deviceRegisterOffset2,
                    deviceRegisterDataType2);

    private static final int deviceRegisterRange3 = RegisterRange.INPUT_REGISTER;
    private static final int deviceRegisterOffset3 = 18;
    private static final int deviceRegisterDataType3 = DataType.FOUR_BYTE_FLOAT;
    private static final float hysteresis3 = 1.0F;
    private static float deviceValuesRegister3 = 0F;
    private static float hisDeviceValuesRegisters3 = 0F;
    private static final ModbusLocator modbusLocator3 =
            new ModbusLocator(deviceAddress,
                    deviceRegisterRange3,
                    deviceRegisterOffset3,
                    deviceRegisterDataType3);

    private static final int deviceRegisterRange4 = RegisterRange.INPUT_REGISTER;
    private static final int deviceRegisterOffset4 = 23;
    private static final int deviceRegisterDataType4 = DataType.FOUR_BYTE_FLOAT;
    private static final float hysteresis4 = 1.0F;
    private static float deviceValuesRegister4 = 0F;
    private static float hisDeviceValuesRegisters4 = 0F;
    private static final ModbusLocator modbusLocator4 =
            new ModbusLocator(deviceAddress,
                    deviceRegisterRange4,
                    deviceRegisterOffset4,
                    deviceRegisterDataType4);

    private static final int deviceRegisterRange5 = RegisterRange.INPUT_REGISTER;
    private static final int deviceRegisterOffset5 = 28;
    private static final int deviceRegisterDataType5 = DataType.FOUR_BYTE_FLOAT;
    private static final float hysteresis5 = 1.0F;
    private static float deviceValuesRegister5 = 0F;
    private static float hisDeviceValuesRegisters5 = 0F;
    private static final ModbusLocator modbusLocator5 =
            new ModbusLocator(deviceAddress,
                    deviceRegisterRange5,
                    deviceRegisterOffset5,
                    deviceRegisterDataType5);

    private static final int deviceRegisterRange6 = RegisterRange.INPUT_REGISTER;
    private static final int deviceRegisterOffset6 = 33;
    private static final int deviceRegisterDataType6 = DataType.FOUR_BYTE_FLOAT;
    private static final float hysteresis6 = 1.0F;
    private static float deviceValuesRegister6 = 0F;
    private static float hisDeviceValuesRegisters6 = 0F;
    private static final ModbusLocator modbusLocator6 =
            new ModbusLocator(deviceAddress,
                    deviceRegisterRange6,
                    deviceRegisterOffset6,
                    deviceRegisterDataType6);

    private static final int deviceRegisterRange7 = RegisterRange.INPUT_REGISTER;
    private static final int deviceRegisterOffset7 = 38;
    private static final int deviceRegisterDataType7 = DataType.FOUR_BYTE_FLOAT;
    private static final float hysteresis7 = 1.0F;
    private static float deviceValuesRegister7 = 0F;
    private static float hisDeviceValuesRegisters7 = 0F;
    private static final ModbusLocator modbusLocator7 =
            new ModbusLocator(deviceAddress,
                    deviceRegisterRange7,
                    deviceRegisterOffset7,
                    deviceRegisterDataType7);

    public DeviceModelFirstCehKameraDozrevanyaTRM138(){}

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
        DeviceModelFirstCehKameraDozrevanyaTRM138.deviceValuesRegister0 = deviceValuesRegister0;
    }

    public static float getHisDeviceValuesRegisters0() {
        return hisDeviceValuesRegisters0;
    }

    public static void setHisDeviceValuesRegisters0(float hisDeviceValuesRegisters0) {
        DeviceModelFirstCehKameraDozrevanyaTRM138.hisDeviceValuesRegisters0 = hisDeviceValuesRegisters0;
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
        DeviceModelFirstCehKameraDozrevanyaTRM138.deviceValuesRegister1 = deviceValuesRegister1;
    }

    public static float getHisDeviceValuesRegisters1() {
        return hisDeviceValuesRegisters1;
    }

    public static void setHisDeviceValuesRegisters1(float hisDeviceValuesRegisters1) {
        DeviceModelFirstCehKameraDozrevanyaTRM138.hisDeviceValuesRegisters1 = hisDeviceValuesRegisters1;
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
        DeviceModelFirstCehKameraDozrevanyaTRM138.deviceValuesRegister2 = deviceValuesRegister2;
    }

    public static float getHisDeviceValuesRegisters2() {
        return hisDeviceValuesRegisters2;
    }

    public static void setHisDeviceValuesRegisters2(float hisDeviceValuesRegisters2) {
        DeviceModelFirstCehKameraDozrevanyaTRM138.hisDeviceValuesRegisters2 = hisDeviceValuesRegisters2;
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
        DeviceModelFirstCehKameraDozrevanyaTRM138.deviceValuesRegister3 = deviceValuesRegister3;
    }

    public static float getHisDeviceValuesRegisters3() {
        return hisDeviceValuesRegisters3;
    }

    public static void setHisDeviceValuesRegisters3(float hisDeviceValuesRegisters3) {
        DeviceModelFirstCehKameraDozrevanyaTRM138.hisDeviceValuesRegisters3 = hisDeviceValuesRegisters3;
    }

    public static ModbusLocator getModbusLocator3() {
        return modbusLocator3;
    }

    public static int getDeviceRegisterRange4() {
        return deviceRegisterRange4;
    }

    public static int getDeviceRegisterOffset4() {
        return deviceRegisterOffset4;
    }

    public static int getDeviceRegisterDataType4() {
        return deviceRegisterDataType4;
    }

    public static float getHysteresis4() {
        return hysteresis4;
    }

    public static float getDeviceValuesRegister4() {
        return deviceValuesRegister4;
    }

    public static void setDeviceValuesRegister4(float deviceValuesRegister4) {
        DeviceModelFirstCehKameraDozrevanyaTRM138.deviceValuesRegister4 = deviceValuesRegister4;
    }

    public static float getHisDeviceValuesRegisters4() {
        return hisDeviceValuesRegisters4;
    }

    public static void setHisDeviceValuesRegisters4(float hisDeviceValuesRegisters4) {
        DeviceModelFirstCehKameraDozrevanyaTRM138.hisDeviceValuesRegisters4 = hisDeviceValuesRegisters4;
    }

    public static ModbusLocator getModbusLocator4() {
        return modbusLocator4;
    }

    public static int getDeviceRegisterRange5() {
        return deviceRegisterRange5;
    }

    public static int getDeviceRegisterOffset5() {
        return deviceRegisterOffset5;
    }

    public static int getDeviceRegisterDataType5() {
        return deviceRegisterDataType5;
    }

    public static float getHysteresis5() {
        return hysteresis5;
    }

    public static float getDeviceValuesRegister5() {
        return deviceValuesRegister5;
    }

    public static void setDeviceValuesRegister5(float deviceValuesRegister5) {
        DeviceModelFirstCehKameraDozrevanyaTRM138.deviceValuesRegister5 = deviceValuesRegister5;
    }

    public static float getHisDeviceValuesRegisters5() {
        return hisDeviceValuesRegisters5;
    }

    public static void setHisDeviceValuesRegisters5(float hisDeviceValuesRegisters5) {
        DeviceModelFirstCehKameraDozrevanyaTRM138.hisDeviceValuesRegisters5 = hisDeviceValuesRegisters5;
    }

    public static ModbusLocator getModbusLocator5() {
        return modbusLocator5;
    }

    public static int getDeviceRegisterRange6() {
        return deviceRegisterRange6;
    }

    public static int getDeviceRegisterOffset6() {
        return deviceRegisterOffset6;
    }

    public static int getDeviceRegisterDataType6() {
        return deviceRegisterDataType6;
    }

    public static float getHysteresis6() {
        return hysteresis6;
    }

    public static float getDeviceValuesRegister6() {
        return deviceValuesRegister6;
    }

    public static void setDeviceValuesRegister6(float deviceValuesRegister6) {
        DeviceModelFirstCehKameraDozrevanyaTRM138.deviceValuesRegister6 = deviceValuesRegister6;
    }

    public static float getHisDeviceValuesRegisters6() {
        return hisDeviceValuesRegisters6;
    }

    public static void setHisDeviceValuesRegisters6(float hisDeviceValuesRegisters6) {
        DeviceModelFirstCehKameraDozrevanyaTRM138.hisDeviceValuesRegisters6 = hisDeviceValuesRegisters6;
    }

    public static ModbusLocator getModbusLocator6() {
        return modbusLocator6;
    }

    public static int getDeviceRegisterRange7() {
        return deviceRegisterRange7;
    }

    public static int getDeviceRegisterOffset7() {
        return deviceRegisterOffset7;
    }

    public static int getDeviceRegisterDataType7() {
        return deviceRegisterDataType7;
    }

    public static float getHysteresis7() {
        return hysteresis7;
    }

    public static float getDeviceValuesRegister7() {
        return deviceValuesRegister7;
    }

    public static void setDeviceValuesRegister7(float deviceValuesRegister7) {
        DeviceModelFirstCehKameraDozrevanyaTRM138.deviceValuesRegister7 = deviceValuesRegister7;
    }

    public static float getHisDeviceValuesRegisters7() {
        return hisDeviceValuesRegisters7;
    }

    public static void setHisDeviceValuesRegisters7(float hisDeviceValuesRegisters7) {
        DeviceModelFirstCehKameraDozrevanyaTRM138.hisDeviceValuesRegisters7 = hisDeviceValuesRegisters7;
    }

    public static ModbusLocator getModbusLocator7() {
        return modbusLocator7;
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
        inner |= HysComparator.compare(getHisDeviceValuesRegisters3(),
                getDeviceValuesRegister3(),
                getHysteresis3());
        inner |= HysComparator.compare(getHisDeviceValuesRegisters4(),
                getDeviceValuesRegister4(),
                getHysteresis4());
        if (inner){
            hisDeviceValuesRegisters0 = deviceValuesRegister0;
            hisDeviceValuesRegisters1 = deviceValuesRegister1;
            hisDeviceValuesRegisters2 = deviceValuesRegister2;
            hisDeviceValuesRegisters3 = deviceValuesRegister3;
            hisDeviceValuesRegisters4 = deviceValuesRegister4;
        }
        return inner;
    }
}
