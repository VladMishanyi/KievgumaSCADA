package com.vk.entity.device;

import com.serotonin.modbus4j.code.DataType;
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
    private int deviceDataType1 = DataType.FOUR_BYTE_FLOAT;
    private int deviceDataType2 = DataType.FOUR_BYTE_FLOAT;
    private Float[] deviceValuesRegisters;

    public DeviceModelEnergeticRoomTRM201(){
        this.setDeviceAddress(deviceAddress);
        this.setDeviceId(deviceId1, deviceId2);
        this.setDeviceRegisterRange(deviceRegisterRange1, deviceRegisterRange2);
        this.setDeviceAddressRegisters(deviceAddressRegisters1, deviceAddressRegisters2);
        this.setDeviceDataType(deviceDataType1, deviceDataType2);
        this.setDeviceValuesRegisters(deviceValuesRegisters);
    }
}
