package com.vk.entity.converter;

import com.vk.entity.device.DeviceModelFirstCehSmesitel2KMSF1;
import com.vk.entity.device.DeviceModelFirstCehSmesitel2MB110;
import com.vk.entity.table.TableModelFirstCehSmesitel2KMSF1;
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
public class DeviceToTableImplFirstCehSmesitel2KMSF1
        extends DeviceToTableImpl<DeviceModelFirstCehSmesitel2KMSF1,
        DeviceModelFirstCehSmesitel2MB110,
        TableModelFirstCehSmesitel2KMSF1> implements DeviceToTableFirstCehSmesitel2KMSF1 {

    @Override
    public TableModelFirstCehSmesitel2KMSF1 convert(DeviceModelFirstCehSmesitel2KMSF1 deviceModelFirstCehSmesitel2KMSF1,
                                                    DeviceModelFirstCehSmesitel2MB110 deviceModelFirstCehSmesitel2MB110){
        TableModelFirstCehSmesitel2KMSF1 tableModelFirstCehSmesitel2KMSF1 = null;
        if (ObjectValidator.isNotNull(deviceModelFirstCehSmesitel2KMSF1)){
            tableModelFirstCehSmesitel2KMSF1 = new TableModelFirstCehSmesitel2KMSF1();
            tableModelFirstCehSmesitel2KMSF1.setDate(new Date());
            tableModelFirstCehSmesitel2KMSF1.setChannel1(deviceModelFirstCehSmesitel2KMSF1.getDeviceValuesRegisters()[0]);
            tableModelFirstCehSmesitel2KMSF1.setChannel2(FloatCut.floatTwoDigs(deviceModelFirstCehSmesitel2MB110.getDeviceValuesRegisters()[0]));
            tableModelFirstCehSmesitel2KMSF1.setChannel3(FloatCut.floatTwoDigs(deviceModelFirstCehSmesitel2MB110.getDeviceValuesRegisters()[1]));
        }
        return tableModelFirstCehSmesitel2KMSF1;
    }
}
