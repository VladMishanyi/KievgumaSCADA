package com.vk.entity.converter;

import com.vk.entity.device.DeviceModelFirstCehAutoclavTRM202;
import com.vk.entity.device.DeviceModelFirstCehSmesitel1MB110;
import com.vk.entity.table.TableModelFirstCehAutoclavTRM202;
import com.vk.lib.FloatCut;
import com.vk.lib.ObjectValidator;

import java.util.Date;

/**
 * Created by User on 2018-03-07.
 */
public class DeviceToTableFirstCehAutoclavTRM202 extends DeviceToTable<DeviceModelFirstCehAutoclavTRM202,
        DeviceModelFirstCehSmesitel1MB110,
        TableModelFirstCehAutoclavTRM202>{

    @Override
    public TableModelFirstCehAutoclavTRM202 convert(DeviceModelFirstCehAutoclavTRM202 deviceModelFirstCehAutoclavTRM202){
        TableModelFirstCehAutoclavTRM202 tableModelFirstCehAutoclavTRM202 = null;
        if (ObjectValidator.isNotNull(deviceModelFirstCehAutoclavTRM202)){
            tableModelFirstCehAutoclavTRM202 = new TableModelFirstCehAutoclavTRM202();
            tableModelFirstCehAutoclavTRM202.setDate(new Date());
            tableModelFirstCehAutoclavTRM202.setChannel1(FloatCut.floatTwoDigs(deviceModelFirstCehAutoclavTRM202.getDeviceValuesRegisters()[0]));
            tableModelFirstCehAutoclavTRM202.setChannel2(FloatCut.floatTwoDigs(deviceModelFirstCehAutoclavTRM202.getDeviceValuesRegisters()[1]));
        }
        return tableModelFirstCehAutoclavTRM202;
    }
}
