package com.vk.entity.device;

import com.serotonin.modbus4j.code.DataType;
import com.serotonin.modbus4j.code.RegisterRange;
import com.vk.lib.HysComparator;

/**
 * Created by User on 2018-02-26.
 */
public class DeviceModelEnergeticRoomTRM201 extends DeviceModel<Float, DeviceModelEnergeticRoomTRM201>{
    private final int deviceAddress = 16;
    private final int arraySize = 2;
    private final int deviceId1 = 0;
    private final int deviceId2 = 1;
    private final int deviceRegisterRange1 = RegisterRange.HOLDING_REGISTER;
    private final int deviceRegisterRange2 = RegisterRange.HOLDING_REGISTER;
    private final int deviceAddressRegisters1 = 4105;
    private final int deviceAddressRegisters2 = 4107;
    private final int deviceDataType1 = DataType.FOUR_BYTE_FLOAT;
    private final int deviceDataType2 = DataType.FOUR_BYTE_FLOAT;
    private Float[] deviceValuesRegisters;
    private static Float[] hisDeviceValuesRegisters = {0F,0F};
    private final Integer hysteresis = 1;

    public DeviceModelEnergeticRoomTRM201(){
        this.setDeviceAddress(deviceAddress);
        this.setDeviceId(deviceId1, deviceId2);
        this.setDeviceRegisterRange(deviceRegisterRange1, deviceRegisterRange2);
        this.setDeviceAddressRegisters(deviceAddressRegisters1, deviceAddressRegisters2);
        this.setDeviceDataType(deviceDataType1, deviceDataType2);
        this.setDeviceValuesRegisters(deviceValuesRegisters);
    }

    @Override
    public boolean hysteresis(){
        boolean inner = false;
        for (int i=0; i<arraySize; i++){
            inner |= HysComparator.compare(hisDeviceValuesRegisters[i],
                    deviceValuesRegisters[i],
                    hysteresis);
        }
        return inner;
    }
}
