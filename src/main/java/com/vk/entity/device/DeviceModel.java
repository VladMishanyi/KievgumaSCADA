package com.vk.entity.device;

/**
 * Created by User on 2018-02-23.
 */
public abstract class DeviceModel<E extends Number> {
    private int deviceAddress;
    private int[] deviceId;
    private int[] deviceRegisterRange;
    private int[] deviceAddressRegisters;
    private int[] deviceDataType;
    private E[] deviceValuesRegisters;
    private E[] hisDeviceValuesRegisters;
    private int hysteresis;

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
            this.deviceAddress = deviceAddress;
            this.deviceId = deviceId;
            this.deviceRegisterRange = deviceRegisterRange;
            this.deviceAddressRegisters = deviceAddressRegisters;
            this.deviceDataType = deviceDataType;
            this.deviceValuesRegisters = deviceValuesRegisters;
        }
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

    public E getDeviceValuesRegistersIndex(int i) {
        return deviceValuesRegisters[i];
    }

    public void setDeviceValuesRegisters(E[] deviceValuesRegisters) {
        this.deviceValuesRegisters = deviceValuesRegisters;
    }

    public void setDeviceValuesRegistersIndex(int i, E deviceValueRegisters) {
        this.deviceValuesRegisters[i] = deviceValueRegisters;
    }

    public E[] getHisDeviceValuesRegisters() {
        return hisDeviceValuesRegisters;
    }

    public E getHisDeviceValuesRegistersIndex(int i){
        return hisDeviceValuesRegisters[i];
    }

    public void setHisDeviceValuesRegisters(E[] hisDeviceValuesRegisters) {
        this.hisDeviceValuesRegisters = hisDeviceValuesRegisters;
    }

    public void setHisDeviceValuesRegistersIndex(int i, E hisDeviceValueRegisters) {
        this.hisDeviceValuesRegisters[i] = hisDeviceValueRegisters;
    }

    public int getHysteresis() {
        return hysteresis;
    }

    public void setHysteresis(int hysteresis) {
        this.hysteresis = hysteresis;
    }

    public abstract boolean hysteresis();

    public abstract void setDeviceValuesDafault();
}
