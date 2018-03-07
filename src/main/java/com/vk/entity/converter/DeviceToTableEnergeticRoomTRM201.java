package com.vk.entity.converter;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.table.TableModelEnergeticRoomTRM201;

import java.util.Date;

import com.vk.lib.FloatCut;
import com.vk.lib.ObjectValidator;

/**
 * Created by User on 2018-02-28.
 */
public class DeviceToTableEnergeticRoomTRM201 extends DeviceToTable<DeviceModelEnergeticRoomTRM201,TableModelEnergeticRoomTRM201>{

    @Override
    public TableModelEnergeticRoomTRM201 convert(DeviceModelEnergeticRoomTRM201 deviceModelEnergeticRoomTRM201){
        TableModelEnergeticRoomTRM201 tableModelEnergeticRoomTRM201 = null;
        if (ObjectValidator.isNotNull(deviceModelEnergeticRoomTRM201)){
            tableModelEnergeticRoomTRM201 = new TableModelEnergeticRoomTRM201();
            tableModelEnergeticRoomTRM201.setDate(new Date());
            tableModelEnergeticRoomTRM201.setValue1(0);
            tableModelEnergeticRoomTRM201.setValue2(0);
            tableModelEnergeticRoomTRM201.setValue3(FloatCut.floatTwoDigs(deviceModelEnergeticRoomTRM201.getDeviceValuesRegisters()[0]));
            tableModelEnergeticRoomTRM201.setValue4(FloatCut.floatTwoDigs(deviceModelEnergeticRoomTRM201.getDeviceValuesRegisters()[1]));
        }
        return tableModelEnergeticRoomTRM201;
    }
}
