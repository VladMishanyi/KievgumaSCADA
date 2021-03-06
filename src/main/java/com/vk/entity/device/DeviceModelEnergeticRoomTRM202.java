package com.vk.entity.device;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.serotonin.modbus4j.ModbusLocator;
import com.serotonin.modbus4j.code.DataType;
import com.serotonin.modbus4j.code.RegisterRange;
import com.vk.lib.HysComparator;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * Created by User on 2018-02-26.
 */
@Component
public class DeviceModelEnergeticRoomTRM202 implements DeviceModel{

    @JsonIgnore
    private transient final int deviceAddress = 16;
    @JsonIgnore
    private transient final float hysteresisFloat = 1.0F;
    @JsonIgnore
    private transient final int hysteresisInt = 1;


    private float holdingRegister0 = 0F;
    @JsonIgnore
    private transient float oldHoldingRegister0 = 0F;
    @JsonIgnore
    private transient final ModbusLocator modbusLocator0h = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 4105, DataType.FOUR_BYTE_FLOAT);


    private float holdingRegister1 = 0F;
    @JsonIgnore
    private transient float oldHoldingRegister1 = 0F;
    @JsonIgnore
    private transient final ModbusLocator modbusLocator1h = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 4107, DataType.FOUR_BYTE_FLOAT);


    @JsonIgnore
    private transient float holdingRegister2 = 0F;
    @JsonIgnore
    private transient float oldHoldingRegister2 = 0F;
    @JsonIgnore
    private transient final ModbusLocator modbusLocator2h = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 4113, DataType.FOUR_BYTE_FLOAT);


    @JsonIgnore
    private transient float holdingRegister3 = 0F;
    @JsonIgnore
    private transient float oldHoldingRegister3 = 0F;
    @JsonIgnore
    private transient final ModbusLocator modbusLocator3h = new ModbusLocator(deviceAddress, RegisterRange.HOLDING_REGISTER, 4115, DataType.FOUR_BYTE_FLOAT);

    public DeviceModelEnergeticRoomTRM202(){}

    public int getDeviceAddress() {
        return deviceAddress;
    }

    public float getHysteresisFloat() {
        return hysteresisFloat;
    }

    public int getHysteresisInt() {
        return hysteresisInt;
    }

    public float getHoldingRegister0() {
        return holdingRegister0;
    }

    public void setHoldingRegister0(float holdingRegister0) {
        this.holdingRegister0 = holdingRegister0;
    }

    public float getOldHoldingRegister0() {
        return oldHoldingRegister0;
    }

    public void setOldHoldingRegister0(float oldHoldingRegister0) {
        this.oldHoldingRegister0 = oldHoldingRegister0;
    }

    public ModbusLocator getModbusLocator0h() {
        return modbusLocator0h;
    }

    public float getHoldingRegister1() {
        return holdingRegister1;
    }

    public void setHoldingRegister1(float holdingRegister1) {
        this.holdingRegister1 = holdingRegister1;
    }

    public float getOldHoldingRegister1() {
        return oldHoldingRegister1;
    }

    public void setOldHoldingRegister1(float oldHoldingRegister1) {
        this.oldHoldingRegister1 = oldHoldingRegister1;
    }

    public ModbusLocator getModbusLocator1h() {
        return modbusLocator1h;
    }

    public float getHoldingRegister2() {
        return holdingRegister2;
    }

    public void setHoldingRegister2(float holdingRegister2) {
        this.holdingRegister2 = holdingRegister2;
    }

    public float getOldHoldingRegister2() {
        return oldHoldingRegister2;
    }

    public void setOldHoldingRegister2(float oldHoldingRegister2) {
        this.oldHoldingRegister2 = oldHoldingRegister2;
    }

    public ModbusLocator getModbusLocator2h() {
        return modbusLocator2h;
    }

    public float getHoldingRegister3() {
        return holdingRegister3;
    }

    public void setHoldingRegister3(float holdingRegister3) {
        this.holdingRegister3 = holdingRegister3;
    }

    public float getOldHoldingRegister3() {
        return oldHoldingRegister3;
    }

    public void setOldHoldingRegister3(float oldHoldingRegister3) {
        this.oldHoldingRegister3 = oldHoldingRegister3;
    }

    public ModbusLocator getModbusLocator3h() {
        return modbusLocator3h;
    }

    @Override
    public boolean hysteresis(){
        boolean inner = HysComparator.compare(oldHoldingRegister0,
                holdingRegister0,
                hysteresisFloat);
        inner |= HysComparator.compare(oldHoldingRegister1,
                holdingRegister1,
                hysteresisFloat);
        if (inner){
            oldHoldingRegister0 = holdingRegister0;
            oldHoldingRegister1 = holdingRegister1;
        }
        return inner;
    }

    @Override
    public String toString() {
        return "DeviceModelEnergeticRoomTRM202{" +
                "deviceAddress=" + deviceAddress +
                ", hysteresisFloat=" + hysteresisFloat +
                ", hysteresisInt=" + hysteresisInt +
                ", holdingRegister0=" + holdingRegister0 +
                ", oldHoldingRegister0=" + oldHoldingRegister0 +
                ", modbusLocator0h=" + modbusLocator0h +
                ", holdingRegister1=" + holdingRegister1 +
                ", oldHoldingRegister1=" + oldHoldingRegister1 +
                ", modbusLocator1h=" + modbusLocator1h +
                ", holdingRegister2=" + holdingRegister2 +
                ", oldHoldingRegister2=" + oldHoldingRegister2 +
                ", modbusLocator2h=" + modbusLocator2h +
                ", holdingRegister3=" + holdingRegister3 +
                ", oldHoldingRegister3=" + oldHoldingRegister3 +
                ", modbusLocator3h=" + modbusLocator3h +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeviceModelEnergeticRoomTRM202 that = (DeviceModelEnergeticRoomTRM202) o;
        return deviceAddress == that.deviceAddress && Float.compare(that.hysteresisFloat, hysteresisFloat) == 0 && hysteresisInt == that.hysteresisInt && Float.compare(that.holdingRegister0, holdingRegister0) == 0 && Float.compare(that.oldHoldingRegister0, oldHoldingRegister0) == 0 && Float.compare(that.holdingRegister1, holdingRegister1) == 0 && Float.compare(that.oldHoldingRegister1, oldHoldingRegister1) == 0 && Float.compare(that.holdingRegister2, holdingRegister2) == 0 && Float.compare(that.oldHoldingRegister2, oldHoldingRegister2) == 0 && Float.compare(that.holdingRegister3, holdingRegister3) == 0 && Float.compare(that.oldHoldingRegister3, oldHoldingRegister3) == 0 && Objects.equals(modbusLocator0h, that.modbusLocator0h) && Objects.equals(modbusLocator1h, that.modbusLocator1h) && Objects.equals(modbusLocator2h, that.modbusLocator2h) && Objects.equals(modbusLocator3h, that.modbusLocator3h);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceAddress, hysteresisFloat, hysteresisInt, holdingRegister0, oldHoldingRegister0, modbusLocator0h, holdingRegister1, oldHoldingRegister1, modbusLocator1h, holdingRegister2, oldHoldingRegister2, modbusLocator2h, holdingRegister3, oldHoldingRegister3, modbusLocator3h);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
