package com.vk.entity.device;

import com.serotonin.modbus4j.ModbusLocator;
import com.serotonin.modbus4j.code.DataType;
import com.serotonin.modbus4j.code.RegisterRange;
import com.vk.lib.HysComparator;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

/**
 * Created by User on 2018-02-26.
 */
@Component
@ApplicationScope
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

    public void setDeviceValuesRegister0(final float deviceValuesRegister0) {
        DeviceModelEnergeticRoomTRM201.deviceValuesRegister0 = deviceValuesRegister0;
    }

    public float getHisDeviceValuesRegisters0() {
        return hisDeviceValuesRegisters0;
    }

    public void setHisDeviceValuesRegisters0(final float hisDeviceValuesRegisters0) {
        DeviceModelEnergeticRoomTRM201.hisDeviceValuesRegisters0 = hisDeviceValuesRegisters0;
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

    public void setDeviceValuesRegister1(final float deviceValuesRegister1) {
        DeviceModelEnergeticRoomTRM201.deviceValuesRegister1 = deviceValuesRegister1;
    }

    public float getHisDeviceValuesRegisters1() {
        return hisDeviceValuesRegisters1;
    }

    public void setHisDeviceValuesRegisters1(final float hisDeviceValuesRegisters1) {
        DeviceModelEnergeticRoomTRM201.hisDeviceValuesRegisters1 = hisDeviceValuesRegisters1;
    }

    public ModbusLocator getModbusLocator1() {
        return modbusLocator1;
    }

    public int getDeviceRegisterRange2() {
        return deviceRegisterRange2;
    }

    public int getDeviceRegisterOffset2() {
        return deviceRegisterOffset2;
    }

    public int getDeviceRegisterDataType2() {
        return deviceRegisterDataType2;
    }

    public int getHysteresis2() {
        return hysteresis2;
    }

    public int getDeviceValuesRegister2() {
        return deviceValuesRegister2;
    }

    public void setDeviceValuesRegister2(int deviceValuesRegister2) {
        DeviceModelEnergeticRoomTRM201.deviceValuesRegister2 = deviceValuesRegister2;
    }

    public int getHisDeviceValuesRegisters2() {
        return hisDeviceValuesRegisters2;
    }

    public void setHisDeviceValuesRegisters2(int hisDeviceValuesRegisters2) {
        DeviceModelEnergeticRoomTRM201.hisDeviceValuesRegisters2 = hisDeviceValuesRegisters2;
    }

    public ModbusLocator getModbusLocator2() {
        return modbusLocator2;
    }

    public int getDeviceRegisterRange3() {
        return deviceRegisterRange3;
    }

    public int getDeviceRegisterOffset3() {
        return deviceRegisterOffset3;
    }

    public int getDeviceRegisterDataType3() {
        return deviceRegisterDataType3;
    }

    public int getHysteresis3() {
        return hysteresis3;
    }

    public int getDeviceValuesRegister3() {
        return deviceValuesRegister3;
    }

    public void setDeviceValuesRegister3(int deviceValuesRegister3) {
        DeviceModelEnergeticRoomTRM201.deviceValuesRegister3 = deviceValuesRegister3;
    }

    public int getHisDeviceValuesRegisters3() {
        return hisDeviceValuesRegisters3;
    }

    public void setHisDeviceValuesRegisters3(int hisDeviceValuesRegisters3) {
        DeviceModelEnergeticRoomTRM201.hisDeviceValuesRegisters3 = hisDeviceValuesRegisters3;
    }

    public ModbusLocator getModbusLocator3() {
        return modbusLocator3;
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
