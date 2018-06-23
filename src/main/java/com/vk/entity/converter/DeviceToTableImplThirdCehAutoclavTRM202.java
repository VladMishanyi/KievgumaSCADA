package com.vk.entity.converter;

import com.vk.entity.device.DeviceModelFirstCehSmesitel1MB110;
import com.vk.entity.device.DeviceModelThirdCehAutoclavTRM202;
import com.vk.entity.table.TableModelThirdCehAutoclavTRM202;
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
public class DeviceToTableImplThirdCehAutoclavTRM202 extends DeviceToTableImpl<DeviceModelThirdCehAutoclavTRM202,
        DeviceModelFirstCehSmesitel1MB110,
        TableModelThirdCehAutoclavTRM202> {

    @Override
    public TableModelThirdCehAutoclavTRM202 convert(DeviceModelThirdCehAutoclavTRM202 deviceModelThirdCehAutoclavTRM202){
        TableModelThirdCehAutoclavTRM202 tableModelThirdCehAutoclavTRM202 = null;
        if (ObjectValidator.isNotNull(deviceModelThirdCehAutoclavTRM202)){
            tableModelThirdCehAutoclavTRM202 = new TableModelThirdCehAutoclavTRM202();
            tableModelThirdCehAutoclavTRM202.setDate(new Date());
            tableModelThirdCehAutoclavTRM202.setChannel1(FloatCut.floatTwoDigs(deviceModelThirdCehAutoclavTRM202.getDeviceValuesRegisters()[0]));
            tableModelThirdCehAutoclavTRM202.setChannel2(FloatCut.floatTwoDigs(deviceModelThirdCehAutoclavTRM202.getDeviceValuesRegisters()[1]));
        }
        return tableModelThirdCehAutoclavTRM202;
    }
}
