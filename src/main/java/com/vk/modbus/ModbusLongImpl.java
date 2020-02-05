package com.vk.modbus;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by KIP-PC99 on 14.09.2018.
 */
@Component
public class ModbusLongImpl extends RootModbusImpl<Long> implements ModbusLong{

    @Override
    synchronized void setValuesDefault(final List<Long> list, final int length) {
        for (int i=0; i<=length; i++){
            list.add((long) 0);
        }
    }

    @Override
    Long borderValue(short bMin, short bMax, Long val){
        if (val >= (long) bMax) return (long) bMax;
        if (val <= (long) bMin) return (long) bMin;
        return val;
    }
}
