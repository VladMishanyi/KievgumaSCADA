package com.vk.entity.converter;

import com.vk.entity.device.DeviceModelFirstCehAutoclavTRM202;
import com.vk.entity.table.TableModelFirstCehAutoclavTRM202;
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
public class DeviceToTableImplFirstCehAutoclavTRM202
        extends DeviceToTableImpl<DeviceModelFirstCehAutoclavTRM202,
        DeviceModelFirstCehAutoclavTRM202,
        TableModelFirstCehAutoclavTRM202> implements DeviceToTableFirstCehAutoclavTRM202 {

    @Override
    public TableModelFirstCehAutoclavTRM202 convert(final DeviceModelFirstCehAutoclavTRM202 deviceModelFirstCehAutoclavTRM202){
        TableModelFirstCehAutoclavTRM202 tableModelFirstCehAutoclavTRM202 = null;
        if (ObjectValidator.isNotNull(deviceModelFirstCehAutoclavTRM202)){
            tableModelFirstCehAutoclavTRM202 = new TableModelFirstCehAutoclavTRM202();
            tableModelFirstCehAutoclavTRM202.setDate(new Date());
            tableModelFirstCehAutoclavTRM202.setChannel1(FloatCut.floatTwoDigs(deviceModelFirstCehAutoclavTRM202.getDeviceValuesRegister0()));
            tableModelFirstCehAutoclavTRM202.setChannel2(FloatCut.floatTwoDigs(deviceModelFirstCehAutoclavTRM202.getDeviceValuesRegister1()));
        }
        return tableModelFirstCehAutoclavTRM202;
    }
}
