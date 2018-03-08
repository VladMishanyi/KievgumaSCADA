package com.vk.entity.converter;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelFirstCehSmesitel5KMSF1;
import com.vk.entity.table.TableModelEnergeticRoomTRM201;
import com.vk.entity.table.TableModelFirstCehSmesitel5KMSF1;
import com.vk.lib.FloatCut;
import com.vk.lib.ObjectValidator;

import java.util.Date;

/**
 * Created by User on 2018-03-07.
 */
public class DeviceToTableFirstCehSmesitel5KMSF1 extends DeviceToTable<DeviceModelFirstCehSmesitel5KMSF1,TableModelFirstCehSmesitel5KMSF1>{

    @Override
    public TableModelFirstCehSmesitel5KMSF1 convert(DeviceModelFirstCehSmesitel5KMSF1 deviceModelFirstCehSmesitel5KMSF1){
        TableModelFirstCehSmesitel5KMSF1 tableModelFirstCehSmesitel5KMSF1 = null;
        if (ObjectValidator.isNotNull(deviceModelFirstCehSmesitel5KMSF1)){
            tableModelFirstCehSmesitel5KMSF1 = new TableModelFirstCehSmesitel5KMSF1();
            tableModelFirstCehSmesitel5KMSF1.setDate(new Date());
            tableModelFirstCehSmesitel5KMSF1.setChannel1(deviceModelFirstCehSmesitel5KMSF1.getDeviceValuesRegisters()[0]);
        }
        return tableModelFirstCehSmesitel5KMSF1;
    }
}