package com.vk.entity.device;

import com.vk.entity.register.Register;

/**
 * Created by User on 2018-02-20.
 */
public class DeviceFirstCehAutoclavTRM202 implements Device<Float, Register<Float>> {

    private static int deviceAddress = 16;

    private Register<Float>[] values;

    @Override
    public Register<Float>[] getRegisters() {
        return new Register[0];
    }

    @Override
    public void setRegisters(Register<Float>[] registers) {

    }
}
