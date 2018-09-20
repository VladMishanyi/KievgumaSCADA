package com.vk.entity.device;

import com.serotonin.modbus4j.code.DataType;
import com.serotonin.modbus4j.code.RegisterRange;
import com.vk.lib.HysComparator;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

/**
 * Created by KIP-PC99 on 20.09.2018.
 */
@Component
@ApplicationScope
public class DeviceModelFirstCehKameraDozrevanyaTRM138 extends DeviceModel<Float> {
    private static final int deviceAddress = 80;//80-88 reserved for this device
    private static final int arraySize = 8;
    private static final int deviceId1 = 0;
    private static final int deviceId2 = 1;
    private static final int deviceId3 = 2;
    private static final int deviceId4 = 3;
    private static final int deviceId5 = 4;
    private static final int deviceId6 = 5;
    private static final int deviceId7 = 6;
    private static final int deviceId8 = 7;
    private static final int deviceRegisterRange1 = RegisterRange.INPUT_REGISTER;
    private static final int deviceRegisterRange2 = RegisterRange.INPUT_REGISTER;
    private static final int deviceRegisterRange3 = RegisterRange.INPUT_REGISTER;
    private static final int deviceRegisterRange4 = RegisterRange.INPUT_REGISTER;
    private static final int deviceRegisterRange5 = RegisterRange.INPUT_REGISTER;
    private static final int deviceRegisterRange6 = RegisterRange.INPUT_REGISTER;
    private static final int deviceRegisterRange7 = RegisterRange.INPUT_REGISTER;
    private static final int deviceRegisterRange8 = RegisterRange.INPUT_REGISTER;
    private static final int deviceAddressRegisters1 = 3;
    private static final int deviceAddressRegisters2 = 8;
    private static final int deviceAddressRegisters3 = 13;
    private static final int deviceAddressRegisters4 = 18;
    private static final int deviceAddressRegisters5 = 23;
    private static final int deviceAddressRegisters6 = 28;
    private static final int deviceAddressRegisters7 = 33;
    private static final int deviceAddressRegisters8 = 38;
    private static final int deviceDataType1 = DataType.FOUR_BYTE_FLOAT;
    private static final int deviceDataType2 = DataType.FOUR_BYTE_FLOAT;
    private static final int deviceDataType3 = DataType.FOUR_BYTE_FLOAT;
    private static final int deviceDataType4 = DataType.FOUR_BYTE_FLOAT;
    private static final int deviceDataType5 = DataType.FOUR_BYTE_FLOAT;
    private static final int deviceDataType6 = DataType.FOUR_BYTE_FLOAT;
    private static final int deviceDataType7 = DataType.FOUR_BYTE_FLOAT;
    private static final int deviceDataType8 = DataType.FOUR_BYTE_FLOAT;
    private static Float[] deviceValuesRegisters = {0F,0F,0F,0F,0F};
    private static Float[] hisDeviceValuesRegisters = {0F,0F,0F,0F,0F};
    private static final int hysteresis = 1;

    public DeviceModelFirstCehKameraDozrevanyaTRM138(){
        this.setDeviceAddress(deviceAddress);
        this.setArraySize(arraySize);
        this.setDeviceId(deviceId1,
                deviceId2,
                deviceId3,
                deviceId4,
                deviceId5);
        this.setDeviceRegisterRange(deviceRegisterRange1,
                deviceRegisterRange2,
                deviceRegisterRange3,
                deviceRegisterRange4,
                deviceRegisterRange5);
        this.setDeviceAddressRegisters(deviceAddressRegisters1,
                deviceAddressRegisters2,
                deviceAddressRegisters3,
                deviceAddressRegisters4,
                deviceAddressRegisters5);
        this.setDeviceDataType(deviceDataType1,
                deviceDataType2,
                deviceDataType3,
                deviceDataType4,
                deviceDataType5);
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

    @Override
    public void setDeviceValuesDafault() {
        for (int i=0; i<deviceValuesRegisters.length; i++){
            deviceValuesRegisters[i] = 0F;
        }
    }
}
