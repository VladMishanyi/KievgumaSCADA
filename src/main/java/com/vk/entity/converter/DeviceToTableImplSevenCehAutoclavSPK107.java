package com.vk.entity.converter;

import com.vk.entity.device.DeviceModelFirstCehSmesitel1MB110;
import com.vk.entity.device.DeviceModelSevenCehAutoclavSPK107;
import com.vk.entity.table.TableModelSevenCehAutoclavSPK107;
import com.vk.lib.FloatCut;
import com.vk.lib.ObjectValidator;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by User on 2018-03-07.
 */
@Component
@ComponentScan(basePackages = {"com.vk.configuration", "com.vk.entity"})
public class DeviceToTableImplSevenCehAutoclavSPK107
        extends DeviceToTableImpl<DeviceModelSevenCehAutoclavSPK107,
        DeviceModelSevenCehAutoclavSPK107,
        TableModelSevenCehAutoclavSPK107> implements DeviceToTableSevenCehAutoclavSPK107 {

    @Override
    public TableModelSevenCehAutoclavSPK107 convert(DeviceModelSevenCehAutoclavSPK107 deviceModelSevenCehAutoclavSPK107){
        TableModelSevenCehAutoclavSPK107 tableModelSevenCehAutoclavSPK107 = null;
        if (ObjectValidator.isNotNull(deviceModelSevenCehAutoclavSPK107)){
            tableModelSevenCehAutoclavSPK107 = new TableModelSevenCehAutoclavSPK107();
            tableModelSevenCehAutoclavSPK107.setDate(new Date());
            tableModelSevenCehAutoclavSPK107.setChannel1(FloatCut.floatTwoDigs(DeviceModelSevenCehAutoclavSPK107.getDeviceValuesRegister0()));
            tableModelSevenCehAutoclavSPK107.setChannel2(FloatCut.floatTwoDigs(DeviceModelSevenCehAutoclavSPK107.getDeviceValuesRegister1()));
            tableModelSevenCehAutoclavSPK107.setChannel3(FloatCut.floatTwoDigs(DeviceModelSevenCehAutoclavSPK107.getDeviceValuesRegister2()));
        }
        return tableModelSevenCehAutoclavSPK107;
    }
}
