package com.vk.entity.converter;

import com.vk.entity.device.DeviceModelSevenCehAutoclavSPK107;
import com.vk.entity.table.TableModelSevenCehAutoclavSPK107;
import com.vk.lib.FloatCut;
import com.vk.lib.ObjectValidator;

import java.util.Date;

/**
 * Created by User on 2018-03-07.
 */
public class DeviceToTableSevenCehAutoclavSPK107 extends DeviceToTable<DeviceModelSevenCehAutoclavSPK107,TableModelSevenCehAutoclavSPK107>{

    @Override
    public TableModelSevenCehAutoclavSPK107 convert(DeviceModelSevenCehAutoclavSPK107 deviceModelSevenCehAutoclavSPK107){
        TableModelSevenCehAutoclavSPK107 tableModelSevenCehAutoclavSPK107 = null;
        if (ObjectValidator.isNotNull(deviceModelSevenCehAutoclavSPK107)){
            tableModelSevenCehAutoclavSPK107 = new TableModelSevenCehAutoclavSPK107();
            tableModelSevenCehAutoclavSPK107.setDate(new Date());
            tableModelSevenCehAutoclavSPK107.setChannel1(FloatCut.floatTwoDigs(deviceModelSevenCehAutoclavSPK107.getDeviceValuesRegisters()[0]));
            tableModelSevenCehAutoclavSPK107.setChannel2(FloatCut.floatTwoDigs(deviceModelSevenCehAutoclavSPK107.getDeviceValuesRegisters()[1]));
            tableModelSevenCehAutoclavSPK107.setChannel3(FloatCut.floatTwoDigs(deviceModelSevenCehAutoclavSPK107.getDeviceValuesRegisters()[2]));
        }
        return tableModelSevenCehAutoclavSPK107;
    }
}
