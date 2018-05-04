package com.vk.entity.converter;

import com.vk.entity.device.DeviceModelFirstCehSmesitel1MB110;
import com.vk.entity.device.DeviceModelFirstCehSmesitel4KMSF1;
import com.vk.entity.device.DeviceModelFirstCehSmesitel4MB110;
import com.vk.entity.table.TableModelFirstCehSmesitel4KMSF1;
import com.vk.lib.FloatCut;
import com.vk.lib.ObjectValidator;

import java.util.Date;

/**
 * Created by User on 2018-03-07.
 */
public class DeviceToTableFirstCehSmesitel4KMSF1 extends DeviceToTable<DeviceModelFirstCehSmesitel4KMSF1,
        DeviceModelFirstCehSmesitel4MB110,
        TableModelFirstCehSmesitel4KMSF1>{

    @Override
    public TableModelFirstCehSmesitel4KMSF1 convert(DeviceModelFirstCehSmesitel4KMSF1 deviceModelFirstCehSmesitel4KMSF1,
                                                    DeviceModelFirstCehSmesitel4MB110 deviceModelFirstCehSmesitel4MB110){
        TableModelFirstCehSmesitel4KMSF1 tableModelFirstCehSmesitel4KMSF1 = null;
        if (ObjectValidator.isNotNull(deviceModelFirstCehSmesitel4KMSF1)){
            tableModelFirstCehSmesitel4KMSF1 = new TableModelFirstCehSmesitel4KMSF1();
            tableModelFirstCehSmesitel4KMSF1.setDate(new Date());
            tableModelFirstCehSmesitel4KMSF1.setChannel1(deviceModelFirstCehSmesitel4KMSF1.getDeviceValuesRegisters()[0]);
            tableModelFirstCehSmesitel4KMSF1.setChannel2(FloatCut.floatTwoDigs(deviceModelFirstCehSmesitel4MB110.getDeviceValuesRegisters()[0]));
            tableModelFirstCehSmesitel4KMSF1.setChannel3(FloatCut.floatTwoDigs(deviceModelFirstCehSmesitel4MB110.getDeviceValuesRegisters()[1]));
        }
        return tableModelFirstCehSmesitel4KMSF1;
    }
}
