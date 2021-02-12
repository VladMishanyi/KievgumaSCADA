package com.vk.entity.device;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.serotonin.modbus4j.ModbusLocator;
import com.serotonin.modbus4j.code.DataType;
import com.serotonin.modbus4j.code.RegisterRange;
import com.vk.lib.HysComparator;
import org.springframework.stereotype.Component;

/**
 * Created by KIP-PC99 on 20.09.2018.
 */
@Component
public class DeviceModelSiliconCameraVulkanTRM251 implements DeviceModel{

    @JsonIgnore
    private transient final int deviceAddress = 16;//16-24 reserved for this device
    @JsonIgnore
    private transient final float hysteresisFloat = 1.0F;
    @JsonIgnore
    private transient final int hysteresisInt = 1;

    private float inputRegister0 = 0F;
    @JsonIgnore
    private transient float oldInputRegister0 = 0F;
    @JsonIgnore
    private transient final ModbusLocator modbusLocator0i = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 4, DataType.FOUR_BYTE_FLOAT);

    private float inputRegister1 = 0F;
    @JsonIgnore
    private transient float oldInputRegister1 = 0F;
    @JsonIgnore
    private transient final ModbusLocator modbusLocator1i = new ModbusLocator(deviceAddress, RegisterRange.INPUT_REGISTER, 10, DataType.FOUR_BYTE_FLOAT);


    public DeviceModelSiliconCameraVulkanTRM251(){}

    public int getDeviceAddress() {
        return deviceAddress;
    }

    public float getHysteresisFloat() {
        return hysteresisFloat;
    }

    public int getHysteresisInt() {
        return hysteresisInt;
    }

    public float getInputRegister0() {
        return inputRegister0;
    }

    public void setInputRegister0(float inputRegister0) {
        this.inputRegister0 = inputRegister0;
    }

    public float getOldInputRegister0() {
        return oldInputRegister0;
    }

    public void setOldInputRegister0(float oldInputRegister0) {
        this.oldInputRegister0 = oldInputRegister0;
    }

    public ModbusLocator getModbusLocator0i() {
        return modbusLocator0i;
    }

    public float getInputRegister1() {
        return inputRegister1;
    }

    public void setInputRegister1(float inputRegister1) {
        this.inputRegister1 = inputRegister1;
    }

    public float getOldInputRegister1() {
        return oldInputRegister1;
    }

    public void setOldInputRegister1(float oldInputRegister1) {
        this.oldInputRegister1 = oldInputRegister1;
    }

    public ModbusLocator getModbusLocator1i() {
        return modbusLocator1i;
    }

    public boolean hysteresis(){
        boolean inner = HysComparator.compare(oldInputRegister0,
                inputRegister0,
                hysteresisFloat);
        inner |= HysComparator.compare(oldInputRegister1,
                inputRegister1,
                hysteresisFloat);
        if (inner){
            oldInputRegister0 = inputRegister0;
            oldInputRegister1 = inputRegister1;
        }
        return inner;
    }
}
