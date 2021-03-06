package com.vk.entity.converter;

import com.vk.entity.device.DeviceModelFirstCehSmesitel5KMSF1;
import com.vk.entity.device.DeviceModelFirstCehSmesitel5MB110;
import com.vk.entity.table.TableModelFirstCehSmesitel5KMSF1;
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
public class DeviceToTableImplFirstCehSmesitel5KMSF1
        extends DeviceToTableImpl<DeviceModelFirstCehSmesitel5KMSF1,
        DeviceModelFirstCehSmesitel5MB110,
        TableModelFirstCehSmesitel5KMSF1> implements DeviceToTableFirstCehSmesitel5KMSF1 {

    @Override
    public TableModelFirstCehSmesitel5KMSF1 convert(final DeviceModelFirstCehSmesitel5KMSF1 deviceModelFirstCehSmesitel5KMSF1,
                                                    final DeviceModelFirstCehSmesitel5MB110 deviceModelFirstCehSmesitel5MB110){
        TableModelFirstCehSmesitel5KMSF1 tableModelFirstCehSmesitel5KMSF1 = null;
        if (ObjectValidator.isNotNull(deviceModelFirstCehSmesitel5KMSF1)){
            tableModelFirstCehSmesitel5KMSF1 = new TableModelFirstCehSmesitel5KMSF1();
            tableModelFirstCehSmesitel5KMSF1.setDate(LocalDateTime.now());
            tableModelFirstCehSmesitel5KMSF1.setChannel1(deviceModelFirstCehSmesitel5KMSF1.getDeviceValuesRegister0());
            tableModelFirstCehSmesitel5KMSF1.setChannel2(FloatCut.floatTwoDigs(deviceModelFirstCehSmesitel5MB110.getDeviceValuesRegister0()));
            tableModelFirstCehSmesitel5KMSF1.setChannel3(FloatCut.floatTwoDigs(deviceModelFirstCehSmesitel5MB110.getDeviceValuesRegister1()));
        }
        return tableModelFirstCehSmesitel5KMSF1;
    }
}
