package com.vk.entity.converter;

import com.vk.entity.device.DeviceModelFirstCehSmesitel3KMSF1;
import com.vk.entity.table.TableModelFirstCehSmesitel3KMSF1;
import com.vk.lib.ObjectValidator;

import java.util.Date;

/**
 * Created by User on 2018-03-07.
 */
public class DeviceToTableFirstCehSmesitel3KMSF1 extends DeviceToTable<DeviceModelFirstCehSmesitel3KMSF1,TableModelFirstCehSmesitel3KMSF1>{

    @Override
    public TableModelFirstCehSmesitel3KMSF1 convert(DeviceModelFirstCehSmesitel3KMSF1 deviceModelFirstCehSmesitel3KMSF1){
        TableModelFirstCehSmesitel3KMSF1 tableModelFirstCehSmesitel3KMSF1 = null;
        if (ObjectValidator.isNotNull(deviceModelFirstCehSmesitel3KMSF1)){
            tableModelFirstCehSmesitel3KMSF1 = new TableModelFirstCehSmesitel3KMSF1();
            tableModelFirstCehSmesitel3KMSF1.setDate(new Date());
            tableModelFirstCehSmesitel3KMSF1.setChannel1(deviceModelFirstCehSmesitel3KMSF1.getDeviceValuesRegisters()[0]);
        }
        return tableModelFirstCehSmesitel3KMSF1;
    }
}
