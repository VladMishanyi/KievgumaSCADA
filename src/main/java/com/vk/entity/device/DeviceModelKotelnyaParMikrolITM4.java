package com.vk.entity.device;

import com.serotonin.modbus4j.code.DataType;
import com.serotonin.modbus4j.code.RegisterRange;
import com.vk.lib.HysComparator;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

/**
 * Created by KIP-PC99 on 08.08.2018.
 */
@Component
@ApplicationScope
public class DeviceModelKotelnyaParMikrolITM4 extends DeviceModel<Float> {
    private static final int deviceAddress = 20;
    private static final int arraySize = 4;
    private static final int deviceId1 = 0;
    private static final int deviceId2 = 1;
    private static final int deviceId3 = 2;
    private static final int deviceId4 = 3;
    private static final int deviceRegisterRange1 = RegisterRange.HOLDING_REGISTER;
    private static final int deviceRegisterRange2 = RegisterRange.HOLDING_REGISTER;
    private static final int deviceRegisterRange3 = RegisterRange.HOLDING_REGISTER;
    private static final int deviceRegisterRange4 = RegisterRange.HOLDING_REGISTER;
    private static final int deviceAddressRegisters1 = 1200;
    private static final int deviceAddressRegisters2 = 1202;
    private static final int deviceAddressRegisters3 = 1204;
    private static final int deviceAddressRegisters4 = 1206;
    private static final int deviceDataType1 = DataType.FOUR_BYTE_FLOAT_SWAPPED;
    private static final int deviceDataType2 = DataType.FOUR_BYTE_FLOAT_SWAPPED;
    private static final int deviceDataType3 = DataType.FOUR_BYTE_FLOAT_SWAPPED;
    private static final int deviceDataType4 = DataType.FOUR_BYTE_FLOAT_SWAPPED;
    private static Float[] deviceValuesRegisters = {0F,0F,0F,0F};
    private static Float[] hisDeviceValuesRegisters = {0F,0F,0F,0F};
    private static final int hysteresis = 1;

    public DeviceModelKotelnyaParMikrolITM4(){
        this.setDeviceAddress(deviceAddress);
        this.setArraySize(arraySize);
        this.setDeviceId(deviceId1, deviceId2, deviceId3, deviceId4);
        this.setDeviceRegisterRange(deviceRegisterRange1, deviceRegisterRange2, deviceRegisterRange3, deviceRegisterRange4);
        this.setDeviceAddressRegisters(deviceAddressRegisters1, deviceAddressRegisters2, deviceAddressRegisters3, deviceAddressRegisters4);
        this.setDeviceDataType(deviceDataType1, deviceDataType2, deviceDataType3, deviceDataType4);
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
