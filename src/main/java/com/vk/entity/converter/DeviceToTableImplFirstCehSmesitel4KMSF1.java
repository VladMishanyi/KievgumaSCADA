package com.vk.entity.converter;

import com.vk.entity.device.DeviceModelFirstCehSmesitel4KMSF1;
import com.vk.entity.device.DeviceModelFirstCehSmesitel4MB110;
import com.vk.entity.table.TableModelFirstCehSmesitel4KMSF1;
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
public class DeviceToTableImplFirstCehSmesitel4KMSF1
        extends DeviceToTableImpl<DeviceModelFirstCehSmesitel4KMSF1,
        DeviceModelFirstCehSmesitel4MB110,
        TableModelFirstCehSmesitel4KMSF1> implements DeviceToTableFirstCehSmesitel4KMSF1 {

    @Override
    public TableModelFirstCehSmesitel4KMSF1 convert(DeviceModelFirstCehSmesitel4KMSF1 deviceModelFirstCehSmesitel4KMSF1,
                                                    DeviceModelFirstCehSmesitel4MB110 deviceModelFirstCehSmesitel4MB110){
        TableModelFirstCehSmesitel4KMSF1 tableModelFirstCehSmesitel4KMSF1 = null;
        if (ObjectValidator.isNotNull(deviceModelFirstCehSmesitel4KMSF1)){
            tableModelFirstCehSmesitel4KMSF1 = new TableModelFirstCehSmesitel4KMSF1();
            tableModelFirstCehSmesitel4KMSF1.setDate(new Date());
            tableModelFirstCehSmesitel4KMSF1.setChannel1(DeviceModelFirstCehSmesitel4KMSF1.getDeviceValuesRegister0());
            tableModelFirstCehSmesitel4KMSF1.setChannel2(FloatCut.floatTwoDigs(DeviceModelFirstCehSmesitel4MB110.getDeviceValuesRegister0()));
            tableModelFirstCehSmesitel4KMSF1.setChannel3(FloatCut.floatTwoDigs(DeviceModelFirstCehSmesitel4MB110.getDeviceValuesRegister1()));
        }
        return tableModelFirstCehSmesitel4KMSF1;
    }
}
