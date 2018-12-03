package com.vk.modbus;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by KIP-PC99 on 14.09.2018.
 */
@Component
public class ModbusFloatImpl extends RootModbusImpl<Float> implements ModbusFloat {

    @Override
    synchronized void setValuesDefault(final List<Float> list, final int length) {
        for (int i=0; i<=length; i++){
            list.add(0F);
        }
    }
}
