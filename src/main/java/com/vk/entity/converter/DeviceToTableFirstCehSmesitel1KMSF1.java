package com.vk.entity.converter;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelFirstCehSmesitel1KMSF1;
import com.vk.entity.table.TableModelEnergeticRoomTRM201;
import com.vk.entity.table.TableModelFirstCehSmesitel1KMSF1;
import com.vk.lib.FloatCut;
import com.vk.lib.ObjectValidator;

import java.util.Date;

/**
 * Created by User on 2018-03-07.
 */
public class DeviceToTableFirstCehSmesitel1KMSF1 extends DeviceToTable<DeviceModelFirstCehSmesitel1KMSF1,TableModelFirstCehSmesitel1KMSF1>{

    @Override
    public TableModelFirstCehSmesitel1KMSF1 convert(DeviceModelFirstCehSmesitel1KMSF1 deviceModelFirstCehSmesitel1KMSF1){
        TableModelFirstCehSmesitel1KMSF1 tableModelFirstCehSmesitel1KMSF1 = null;
        if (ObjectValidator.isNotNull(deviceModelFirstCehSmesitel1KMSF1)){
            tableModelFirstCehSmesitel1KMSF1 = new TableModelFirstCehSmesitel1KMSF1();
            tableModelFirstCehSmesitel1KMSF1.setDate(new Date());
            tableModelFirstCehSmesitel1KMSF1.setChannel1(deviceModelFirstCehSmesitel1KMSF1.getDeviceValuesRegisters()[0]);
        }
        return tableModelFirstCehSmesitel1KMSF1;
    }
}
