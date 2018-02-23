package com.vk.entity.device;

import com.serotonin.modbus4j.code.RegisterRange;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 2018-02-23.
 */
public class DeviceModel<T extends Number, E extends Number> {
    private int arraySize;
    private int deviceAddress;
    private int[] deviceId;
    private RegisterRange[] deviceRegisterRange;
    private T[] deviceAddressRegisters;
    private E[] deviceValuesRegisters;

    public DeviceModel(){}

    public DeviceModel(int arraySize, int deviceAddress,
                       int[] deviceId, RegisterRange[] deviceRegisterRange,
                       T[] deviceAddressRegisters, E[] deviceValuesRegisters){
        this.arraySize = arraySize;
        this.deviceAddress = deviceAddress;
        this.deviceId = deviceId;
        this.deviceRegisterRange = deviceRegisterRange;
        this.deviceAddressRegisters = deviceAddressRegisters;
        this.deviceValuesRegisters = deviceValuesRegisters;
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

    public void setDeviceId(int[] deviceId) {
        this.deviceId = deviceId;
    }

    public RegisterRange[] getDeviceRegisterRange() {
        return deviceRegisterRange;
    }

    public void setDeviceRegisterRange(RegisterRange[] deviceRegisterRange) {
        this.deviceRegisterRange = deviceRegisterRange;
    }

    public T[] getDeviceAddressRegisters() {
        return deviceAddressRegisters;
    }

    public void setDeviceAddressRegisters(T[] deviceAddressRegisters) {
        this.deviceAddressRegisters = deviceAddressRegisters;
    }

    public E[] getDeviceValuesRegisters() {
        return deviceValuesRegisters;
    }

    public void setDeviceValuesRegisters(E[] deviceValuesRegisters) {
        this.deviceValuesRegisters = deviceValuesRegisters;
    }
}
