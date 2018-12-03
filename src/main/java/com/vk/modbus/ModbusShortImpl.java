package com.vk.modbus;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by KIP-PC99 on 14.09.2018.
 */
@Component
public class ModbusShortImpl extends RootModbusImpl<Short> implements ModbusShort{

    @Override
    synchronized void setValuesDefault(final List<Short> list, final int length) {
        for (int i=0; i<=length; i++){
            list.add((short) 0);
        }
    }
}
