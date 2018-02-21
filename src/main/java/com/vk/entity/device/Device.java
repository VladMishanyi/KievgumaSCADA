package com.vk.entity.device;

import com.vk.entity.register.Register;

/**
 * Created by User on 2018-02-20.
 */
public interface Device<E extends Number, T extends Number> {

    public E getDeviceAddress();

    public void setDeviceAddress(E deviceAddress);

    public void addDeviceAddressRegisters(int index, E deviceAddressRegister);

    public void removeDeviceAddressRegisters(int index);

    public void clearDeviceAddressRegisters();

    public E getDeviceAddressRegisters(int index);

    public void addDeviceValuesRegisters(int index, T deviceValueRegisters);

    public void removeDeviceValuesRegisters(int index);

    public void clearDeviceValuesRegisters();

    public T getDeviceValuesRegisters(int index);
}
