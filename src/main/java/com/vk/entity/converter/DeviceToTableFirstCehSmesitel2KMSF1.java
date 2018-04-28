package com.vk.entity.converter;

import com.vk.entity.device.DeviceModelFirstCehSmesitel1MB110;
import com.vk.entity.device.DeviceModelFirstCehSmesitel2KMSF1;
import com.vk.entity.device.DeviceModelFirstCehSmesitel2MB110;
import com.vk.entity.table.TableModelFirstCehSmesitel2KMSF1;
import com.vk.lib.ObjectValidator;

import java.util.Date;

/**
 * Created by User on 2018-03-07.
 */
public class DeviceToTableFirstCehSmesitel2KMSF1 extends DeviceToTable<DeviceModelFirstCehSmesitel2KMSF1,
        DeviceModelFirstCehSmesitel2MB110,
        TableModelFirstCehSmesitel2KMSF1>{

    @Override
    public TableModelFirstCehSmesitel2KMSF1 convert(DeviceModelFirstCehSmesitel2KMSF1 deviceModelFirstCehSmesitel2KMSF1,
                                                    DeviceModelFirstCehSmesitel2MB110 deviceModelFirstCehSmesitel2MB110){
        TableModelFirstCehSmesitel2KMSF1 tableModelFirstCehSmesitel2KMSF1 = null;
        if (ObjectValidator.isNotNull(deviceModelFirstCehSmesitel2KMSF1)){
            tableModelFirstCehSmesitel2KMSF1 = new TableModelFirstCehSmesitel2KMSF1();
            tableModelFirstCehSmesitel2KMSF1.setDate(new Date());
            tableModelFirstCehSmesitel2KMSF1.setChannel1(deviceModelFirstCehSmesitel2KMSF1.getDeviceValuesRegisters()[0]);
            tableModelFirstCehSmesitel2KMSF1.setChannel2(deviceModelFirstCehSmesitel2MB110.getDeviceValuesRegisters()[0]);
            tableModelFirstCehSmesitel2KMSF1.setChannel3(deviceModelFirstCehSmesitel2MB110.getDeviceValuesRegisters()[1]);
        }
        return tableModelFirstCehSmesitel2KMSF1;
    }
}
