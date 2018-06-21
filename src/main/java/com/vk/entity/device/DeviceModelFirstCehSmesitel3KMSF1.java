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
public class DeviceModelFirstCehSmesitel3KMSF1 extends DeviceModel<Integer> {
    private static final int deviceAddress = 72;
    private static final int arraySize = 1;
    private static final int deviceId1 = 0;
    private static final int deviceRegisterRange1 = RegisterRange.HOLDING_REGISTER;
    private static final int deviceAddressRegisters1 = 28;
    private static final int deviceDataType1 = DataType.FOUR_BYTE_INT_SIGNED;
    private static Integer[] deviceValuesRegisters = {0};
    private static Integer[] hisDeviceValuesRegisters = {0};
    private static final int hysteresis = 1;

    public DeviceModelFirstCehSmesitel3KMSF1(){
        this.setDeviceAddress(deviceAddress);
        this.setArraySize(arraySize);
        this.setDeviceId(deviceId1);
        this.setDeviceRegisterRange(deviceRegisterRange1);
        this.setDeviceAddressRegisters(deviceAddressRegisters1);
        this.setDeviceDataType(deviceDataType1);
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
            deviceValuesRegisters[i] = 0;
        }
    }
}
