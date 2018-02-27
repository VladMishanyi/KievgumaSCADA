package com.vk.entity.device;

import com.serotonin.modbus4j.code.RegisterRange;

/**
 * Created by User on 2018-02-26.
 */
public class DeviceModelEnergeticRoomTRM201 extends DeviceModel<Float>{
    private int deviceAddress = 16;
    private int arraySize = 2;
    private int deviceId1 = 0;
    private int deviceId2 = 1;
    private int deviceRegisterRange1 = RegisterRange.HOLDING_REGISTER;
    private int deviceRegisterRange2 = RegisterRange.HOLDING_REGISTER;
    private int deviceAddressRegisters1 = 4105;
    private int deviceAddressRegisters2 = 4107;
    private Float[] deviceValuesRegisters = new Float[2];

    public DeviceModelEnergeticRoomTRM201(){
        this.setDeviceId(deviceId1, deviceId2);
        this.setDeviceRegisterRange(deviceRegisterRange1, deviceRegisterRange2);
        this.setDeviceAddressRegisters(deviceAddressRegisters1, deviceAddressRegisters2);
        this.setDeviceValuesRegisters(deviceValuesRegisters);
    }
}
