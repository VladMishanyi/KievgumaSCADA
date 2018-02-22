package com.vk.entity.device;

import com.serotonin.modbus4j.code.RegisterRange;
import com.vk.entity.register.Register;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 2018-02-20.
 */
public class DeviceFirstCehAutoclavTRM202 implements Device<Integer, Float> {

    private static Integer deviceAddress;
    private static int deviceId;
    private static RegisterRange deviceRegisterRange;
    private static List<Integer> deviceAddressRegisters = new ArrayList<>();
    private static List<Float> deviceValuesRegisters = new ArrayList<>();
    public DeviceFirstCehAutoclavTRM202(){
        setDeviceAddress(16);
        addDeviceAddressRegisters(0,4105);
        addDeviceAddressRegisters(1,4107);
    }

    @Override
    public Integer getDeviceAddress() {
        return this.deviceAddress;
    }

    @Override
    public void setDeviceAddress(Integer deviceAddress){
        this.deviceAddress = deviceAddress;
    }

    @Override
    public void addDeviceAddressRegisters(int index, Integer deviceAddressRegister) {
        deviceAddressRegisters.add(index, deviceAddressRegister);
    }

    @Override
    public void removeDeviceAddressRegisters(int index){
        deviceAddressRegisters.remove(index);
    }

    @Override
    public void clearDeviceAddressRegisters(){
        deviceAddressRegisters.clear();
    }

    @Override
    public Integer getDeviceAddressRegisters(int index){
        return deviceAddressRegisters.get(index);
    }

    @Override
    public void addDeviceValuesRegisters(int index, Float deviceValueRegisters) {
        deviceValuesRegisters.add(deviceValueRegisters);
    }

    @Override
    public void removeDeviceValuesRegisters(int index){
        deviceValuesRegisters.remove(index);
    }

    @Override
    public void clearDeviceValuesRegisters(){
        deviceValuesRegisters.clear();
    }

    @Override
    public Float getDeviceValuesRegisters(int index){
        return deviceValuesRegisters.get(index);
    }
}
