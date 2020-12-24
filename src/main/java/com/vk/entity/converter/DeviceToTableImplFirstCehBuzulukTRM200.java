package com.vk.entity.converter;

import com.vk.entity.device.DeviceModelFirstCehBuzulukTRM200;
import com.vk.entity.table.TableModelFirstCehBuzulukTRM200;
import com.vk.lib.FloatCut;
import com.vk.lib.ObjectValidator;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by User on 2018-03-07.
 */
@Component
@ComponentScan(basePackages = {"com.vk.configuration", "com.vk.entity"})
public class DeviceToTableImplFirstCehBuzulukTRM200
        extends DeviceToTableImpl<DeviceModelFirstCehBuzulukTRM200,
        DeviceModelFirstCehBuzulukTRM200,
        TableModelFirstCehBuzulukTRM200> implements DeviceToTableFirstCehBuzulukTRM200 {

    @Override
    public TableModelFirstCehBuzulukTRM200 convert(final DeviceModelFirstCehBuzulukTRM200 deviceModelFirstCehBuzulukTRM200){
        TableModelFirstCehBuzulukTRM200 tableModelFirstCehBuzulukTRM200 = null;
        if (ObjectValidator.isNotNull(deviceModelFirstCehBuzulukTRM200)){
            tableModelFirstCehBuzulukTRM200 = new TableModelFirstCehBuzulukTRM200();
            tableModelFirstCehBuzulukTRM200.setDate(LocalDateTime.now());
            tableModelFirstCehBuzulukTRM200.setChannel1(FloatCut.floatTwoDigs(deviceModelFirstCehBuzulukTRM200.getDeviceValuesRegister0()));
            tableModelFirstCehBuzulukTRM200.setChannel2(FloatCut.floatTwoDigs(deviceModelFirstCehBuzulukTRM200.getDeviceValuesRegister1()));
        }
        return tableModelFirstCehBuzulukTRM200;
    }
}
