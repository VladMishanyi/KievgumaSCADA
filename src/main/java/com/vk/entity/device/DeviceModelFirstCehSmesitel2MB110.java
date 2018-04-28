package com.vk.entity.device;

import com.serotonin.modbus4j.code.DataType;
import com.serotonin.modbus4j.code.RegisterRange;
import com.vk.lib.HysComparator;

/**
 * Created by User on 2018-04-28.
 */
public class DeviceModelFirstCehSmesitel2MB110 extends DeviceModel<Float>{
    private static final int deviceAddress = 42;
    private static final int arraySize = 2;
    private static final int deviceId1 = 0;
    private static final int deviceId2 = 1;
    private static final int deviceRegisterRange1 = RegisterRange.HOLDING_REGISTER;
    private static final int deviceRegisterRange2 = RegisterRange.HOLDING_REGISTER;
    private static final int deviceAddressRegisters1 = 4;
    private static final int deviceAddressRegisters2 = 10;
    private static final int deviceDataType1 = DataType.FOUR_BYTE_FLOAT;
    private static final int deviceDataType2 = DataType.FOUR_BYTE_FLOAT;
    private static Float[] deviceValuesRegisters = {0F,0F};
    private static Float[] hisDeviceValuesRegisters = {0F,0F};
    private static final int hysteresis = 1;

    public DeviceModelFirstCehSmesitel2MB110(){
        this.setDeviceAddress(deviceAddress);
        this.setArraySize(arraySize);
        this.setDeviceId(deviceId1, deviceId2);
        this.setDeviceRegisterRange(deviceRegisterRange1, deviceRegisterRange2);
        this.setDeviceAddressRegisters(deviceAddressRegisters1, deviceAddressRegisters2);
        this.setDeviceDataType(deviceDataType1, deviceDataType2);
        this.setDeviceValuesRegisters(deviceValuesRegisters);
        this.setHisDeviceValuesRegisters(hisDeviceValuesRegisters);
        this.setHysteresis(hysteresis);
    }

    @Override
    public boolean hysteresis(){
        boolean inner = false;
        for (int i=0; i<getArraySize(); i++){
            inner |= HysComparator.compare(getHisDeviceValuesRegistersIndex(i),
                    getDeviceValuesRegistersIndex(i),
                    getHysteresis());
        }
        if (inner){
            for (int i=0; i<getArraySize(); i++){
                setHisDeviceValuesRegistersIndex(i, getDeviceValuesRegistersIndex(i));
            }
        }
        return inner;
    }
}
