package com.vk.entity.converter;

import com.vk.entity.device.DeviceModelFirstCehSmesitel1KMSF1;
import com.vk.entity.device.DeviceModelFirstCehSmesitel1MB110;
import com.vk.entity.table.TableModelFirstCehSmesitel1KMSF1;
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
public class DeviceToTableImplFirstCehSmesitel1KMSF1
        extends DeviceToTableImpl<DeviceModelFirstCehSmesitel1KMSF1,
        DeviceModelFirstCehSmesitel1MB110,
        TableModelFirstCehSmesitel1KMSF1> implements DeviceToTableFirstCehSmesitel1KMSF1 {

    @Override
    public TableModelFirstCehSmesitel1KMSF1 convert(final DeviceModelFirstCehSmesitel1KMSF1 deviceModelFirstCehSmesitel1KMSF1,
                                                    final DeviceModelFirstCehSmesitel1MB110 deviceModelFirstCehSmesitel1MB110){
        TableModelFirstCehSmesitel1KMSF1 tableModelFirstCehSmesitel1KMSF1 = null;
        if (ObjectValidator.isNotNull(deviceModelFirstCehSmesitel1KMSF1)){
            tableModelFirstCehSmesitel1KMSF1 = new TableModelFirstCehSmesitel1KMSF1();
            tableModelFirstCehSmesitel1KMSF1.setDate(LocalDateTime.now());
            tableModelFirstCehSmesitel1KMSF1.setChannel1(deviceModelFirstCehSmesitel1KMSF1.getDeviceValuesRegister0());
            tableModelFirstCehSmesitel1KMSF1.setChannel2(FloatCut.floatTwoDigs(deviceModelFirstCehSmesitel1MB110.getDeviceValuesRegister0()));
            tableModelFirstCehSmesitel1KMSF1.setChannel3(FloatCut.floatTwoDigs(deviceModelFirstCehSmesitel1MB110.getDeviceValuesRegister1()));
        }
        return tableModelFirstCehSmesitel1KMSF1;
    }
}
