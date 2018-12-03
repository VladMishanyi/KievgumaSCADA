package com.vk.modbus;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by KIP-PC99 on 14.09.2018.
 */
@Component
public class ModbusIntegerImpl extends RootModbusImpl<Integer> implements ModbusInteger {

    @Override
    synchronized void setValuesDefault(final List<Integer> list, final int length) {
        for (int i=0; i<=length; i++){
            list.add(0);
        }
    }
}
