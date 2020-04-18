package com.vk.entity.device;

import com.serotonin.modbus4j.ModbusLocator;
import com.serotonin.modbus4j.code.DataType;
import com.serotonin.modbus4j.code.RegisterRange;
import com.vk.lib.HysComparator;
import org.springframework.stereotype.Component;

/**
 * Created by User on 2018-02-26.
 */
@Component
public class DeviceModelEnergeticRoomTRM201 implements DeviceModel{
    private static final int deviceAddress = 16;

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

    private static final int deviceRegisterRange2 = RegisterRange.HOLDING_REGISTER;
    private static final int deviceRegisterOffset2 = 5;
    private static final int deviceRegisterDataType2 = DataType.TWO_BYTE_INT_SIGNED;
    private static final int hysteresis2 = 1;
    private static int deviceValuesRegister2 = 0;
    private static int hisDeviceValuesRegisters2 = 0;
    private static final ModbusLocator modbusLocator2 =
            new ModbusLocator(deviceAddress,
                    deviceRegisterRange2,
                    deviceRegisterOffset2,
                    deviceRegisterDataType2);

    private static final int deviceRegisterRange3 = RegisterRange.HOLDING_REGISTER;
    private static final int deviceRegisterOffset3 = 6;
    private static final int deviceRegisterDataType3 = DataType.TWO_BYTE_INT_SIGNED;
    private static final int hysteresis3 = 1;
    private static int deviceValuesRegister3 = 0;
    private static int hisDeviceValuesRegisters3 = 0;
    private static final ModbusLocator modbusLocator3 =
            new ModbusLocator(deviceAddress,
                    deviceRegisterRange3,
                    deviceRegisterOffset3,
                    deviceRegisterDataType3);

    public DeviceModelEnergeticRoomTRM201(){}

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
        DeviceModelEnergeticRoomTRM201.deviceValuesRegister0 = deviceValuesRegister0;
    }

    public static float getHisDeviceValuesRegisters0() {
        return hisDeviceValuesRegisters0;
    }

    public static void setHisDeviceValuesRegisters0(float hisDeviceValuesRegisters0) {
        DeviceModelEnergeticRoomTRM201.hisDeviceValuesRegisters0 = hisDeviceValuesRegisters0;
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
        DeviceModelEnergeticRoomTRM201.deviceValuesRegister1 = deviceValuesRegister1;
    }

    public static float getHisDeviceValuesRegisters1() {
        return hisDeviceValuesRegisters1;
    }

    public static void setHisDeviceValuesRegisters1(float hisDeviceValuesRegisters1) {
        DeviceModelEnergeticRoomTRM201.hisDeviceValuesRegisters1 = hisDeviceValuesRegisters1;
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

    public static int getHysteresis2() {
        return hysteresis2;
    }

    public static int getDeviceValuesRegister2() {
        return deviceValuesRegister2;
    }

    public static void setDeviceValuesRegister2(int deviceValuesRegister2) {
        DeviceModelEnergeticRoomTRM201.deviceValuesRegister2 = deviceValuesRegister2;
    }

    public static int getHisDeviceValuesRegisters2() {
        return hisDeviceValuesRegisters2;
    }

    public static void setHisDeviceValuesRegisters2(int hisDeviceValuesRegisters2) {
        DeviceModelEnergeticRoomTRM201.hisDeviceValuesRegisters2 = hisDeviceValuesRegisters2;
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

    public static int getHysteresis3() {
        return hysteresis3;
    }

    public static int getDeviceValuesRegister3() {
        return deviceValuesRegister3;
    }

    public static void setDeviceValuesRegister3(int deviceValuesRegister3) {
        DeviceModelEnergeticRoomTRM201.deviceValuesRegister3 = deviceValuesRegister3;
    }

    public static int getHisDeviceValuesRegisters3() {
        return hisDeviceValuesRegisters3;
    }

    public static void setHisDeviceValuesRegisters3(int hisDeviceValuesRegisters3) {
        DeviceModelEnergeticRoomTRM201.hisDeviceValuesRegisters3 = hisDeviceValuesRegisters3;
    }

    public static ModbusLocator getModbusLocator3() {
        return modbusLocator3;
    }

    @Override
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
        if (inner){
            hisDeviceValuesRegisters0 = deviceValuesRegister0;
            hisDeviceValuesRegisters1 = deviceValuesRegister1;
        }
        return inner;
    }
}
