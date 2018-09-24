package com.vk.entity.device;

import com.serotonin.modbus4j.code.DataType;
import com.serotonin.modbus4j.code.RegisterRange;
import com.vk.lib.HysComparator;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

/**
 * Created by User on 2018-03-06.
 */
@Component
@ApplicationScope
public class DeviceModelSevenCehAutoclavSPK107 extends DeviceModel<Float> {
    private static final int deviceAddress = 21;
    private static final int deviceId1 = 0;
    private static final int deviceId2 = 1;
    private static final int deviceId3 = 2;
    private static final int deviceRegisterRange1 = RegisterRange.INPUT_REGISTER;
    private static final int deviceRegisterRange2 = RegisterRange.INPUT_REGISTER;
    private static final int deviceRegisterRange3 = RegisterRange.INPUT_REGISTER;
    private static final int deviceAddressRegisters1 = 0;
    private static final int deviceAddressRegisters2 = 2;
    private static final int deviceAddressRegisters3 = 4;
    private static final int deviceDataType1 = DataType.FOUR_BYTE_FLOAT;
    private static final int deviceDataType2 = DataType.FOUR_BYTE_FLOAT;
    private static final int deviceDataType3 = DataType.FOUR_BYTE_FLOAT;
    private static Float[] deviceValuesRegisters = {0F,0F,0F};
    private static Float[] hisDeviceValuesRegisters = {0F,0F,0F};
    private static final int hysteresis = 1;

    public DeviceModelSevenCehAutoclavSPK107(){
        this.setDeviceAddress(deviceAddress);
        this.setDeviceId(deviceId1, deviceId2, deviceId3);
        this.setDeviceRegisterRange(deviceRegisterRange1, deviceRegisterRange2, deviceRegisterRange3);
        this.setDeviceAddressRegisters(deviceAddressRegisters1, deviceAddressRegisters2, deviceAddressRegisters3);
        this.setDeviceDataType(deviceDataType1, deviceDataType2, deviceDataType3);
        this.setDeviceValuesRegisters(deviceValuesRegisters);
        this.setHisDeviceValuesRegisters(hisDeviceValuesRegisters);
        this.setHysteresis(hysteresis);
    }

    @Override
    public boolean hysteresis(){
        boolean inner = false;
        for (int i=0; i<deviceValuesRegisters.length; i++){
            inner |= HysComparator.compare(getHisDeviceValuesRegistersIndex(i),
                    getDeviceValuesRegistersIndex(i),
                    getHysteresis());
        }
        if (inner){
            for (int i=0; i<deviceValuesRegisters.length; i++){
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
