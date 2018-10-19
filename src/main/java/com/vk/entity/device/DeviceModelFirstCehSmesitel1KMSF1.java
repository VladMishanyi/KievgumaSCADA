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
public class DeviceModelFirstCehSmesitel1KMSF1 implements DeviceModel{
    private static final int deviceAddress = 24;

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

    public DeviceModelFirstCehSmesitel1KMSF1(){}

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

    public short getHysteresis0() {
        return hysteresis0;
    }

    public short getDeviceValuesRegister0() {
        return deviceValuesRegister0;
    }

    public void setDeviceValuesRegister0(short deviceValuesRegister0) {
        DeviceModelFirstCehSmesitel1KMSF1.deviceValuesRegister0 = deviceValuesRegister0;
    }

    public short getHisDeviceValuesRegisters0() {
        return hisDeviceValuesRegisters0;
    }

    public void setHisDeviceValuesRegisters0(short hisDeviceValuesRegisters0) {
        DeviceModelFirstCehSmesitel1KMSF1.hisDeviceValuesRegisters0 = hisDeviceValuesRegisters0;
    }

    public ModbusLocator getModbusLocator0() {
        return modbusLocator0;
    }

    @Override
    public boolean hysteresis(){
        boolean inner = HysComparator.compare(getHisDeviceValuesRegisters0(),
                getDeviceValuesRegister0(),
                getHysteresis0());
        if (inner){
            hisDeviceValuesRegisters0 = deviceValuesRegister0;
        }
        return inner;
    }
}
