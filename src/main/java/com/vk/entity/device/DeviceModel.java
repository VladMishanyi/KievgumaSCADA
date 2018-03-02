package com.vk.entity.device;

import com.serotonin.modbus4j.code.RegisterRange;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 2018-02-23.
 */
public abstract class DeviceModel<E extends Number, T extends DeviceModel> {
    private int deviceAddress;
    private int arraySize;
    private int[] deviceId;
    private int[] deviceRegisterRange;
    private int[] deviceAddressRegisters;
    private int[] deviceDataType;
    private E[] deviceValuesRegisters;

    public DeviceModel(){}

    public DeviceModel(int arraySize,
                       int deviceAddress,
                       int[] deviceId,
                       int[] deviceRegisterRange,
                       int[] deviceAddressRegisters,
                       int[] deviceDataType,
                       E[] deviceValuesRegisters){
        if ((arraySize == deviceId.length) &&
                (arraySize == deviceRegisterRange.length) &&
                (arraySize == deviceAddressRegisters.length) &&
                (arraySize == deviceDataType.length) &&
                (arraySize == deviceValuesRegisters.length)){
            this.arraySize = arraySize;
            this.deviceAddress = deviceAddress;
            this.deviceId = deviceId;
            this.deviceRegisterRange = deviceRegisterRange;
            this.deviceAddressRegisters = deviceAddressRegisters;
            this.deviceDataType = deviceDataType;
            this.deviceValuesRegisters = deviceValuesRegisters;
        }
    }

    public int getArraySize() {
        return arraySize;
    }

    public void setArraySize(int arraySize) {
        this.arraySize = arraySize;
    }

    public int getDeviceAddress() {
        return deviceAddress;
    }

    public void setDeviceAddress(int deviceAddress) {
        this.deviceAddress = deviceAddress;
    }

    public int[] getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int ... deviceId) {
        this.deviceId = deviceId;
    }

    public int[] getDeviceRegisterRange() {
        return deviceRegisterRange;
    }

    public void setDeviceRegisterRange(int ... deviceRegisterRange) {
        this.deviceRegisterRange = deviceRegisterRange;
    }

    public int[] getDeviceAddressRegisters() {
        return deviceAddressRegisters;
    }

    public void setDeviceAddressRegisters(int ... deviceAddressRegisters) {
        this.deviceAddressRegisters = deviceAddressRegisters;
    }

    public int[] getDeviceDataType() {
        return deviceDataType;
    }

    public void setDeviceDataType(int ... deviceDataType) {
        this.deviceDataType = deviceDataType;
    }

    public E[] getDeviceValuesRegisters() {
        return deviceValuesRegisters;
    }

    public void setDeviceValuesRegisters(E[] deviceValuesRegisters) {
        this.deviceValuesRegisters = deviceValuesRegisters;
    }

    public abstract boolean hysteresis();
}
