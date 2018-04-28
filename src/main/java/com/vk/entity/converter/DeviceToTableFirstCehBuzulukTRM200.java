package com.vk.entity.converter;

import com.vk.entity.device.DeviceModelFirstCehBuzulukTRM200;
import com.vk.entity.device.DeviceModelFirstCehSmesitel1MB110;
import com.vk.entity.table.TableModelFirstCehBuzulukTRM200;
import com.vk.lib.FloatCut;
import com.vk.lib.ObjectValidator;

import java.util.Date;

/**
 * Created by User on 2018-03-07.
 */
public class DeviceToTableFirstCehBuzulukTRM200 extends DeviceToTable<DeviceModelFirstCehBuzulukTRM200,
        DeviceModelFirstCehSmesitel1MB110,
        TableModelFirstCehBuzulukTRM200>{

    @Override
    public TableModelFirstCehBuzulukTRM200 convert(DeviceModelFirstCehBuzulukTRM200 deviceModelFirstCehBuzulukTRM200){
        TableModelFirstCehBuzulukTRM200 tableModelFirstCehBuzulukTRM200 = null;
        if (ObjectValidator.isNotNull(deviceModelFirstCehBuzulukTRM200)){
            tableModelFirstCehBuzulukTRM200 = new TableModelFirstCehBuzulukTRM200();
            tableModelFirstCehBuzulukTRM200.setDate(new Date());
            tableModelFirstCehBuzulukTRM200.setChannel1(FloatCut.floatTwoDigs(deviceModelFirstCehBuzulukTRM200.getDeviceValuesRegisters()[0]));
            tableModelFirstCehBuzulukTRM200.setChannel2(FloatCut.floatTwoDigs(deviceModelFirstCehBuzulukTRM200.getDeviceValuesRegisters()[1]));
        }
        return tableModelFirstCehBuzulukTRM200;
    }
}
