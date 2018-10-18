package com.vk.entity.converter;

import com.vk.entity.device.DeviceModelFirstCehSmesitel3KMSF1;
import com.vk.entity.device.DeviceModelFirstCehSmesitel3MB110;
import com.vk.entity.table.TableModelFirstCehSmesitel3KMSF1;
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
public class DeviceToTableImplFirstCehSmesitel3KMSF1
        extends DeviceToTableImpl<DeviceModelFirstCehSmesitel3KMSF1,
        DeviceModelFirstCehSmesitel3MB110,
        TableModelFirstCehSmesitel3KMSF1> implements DeviceToTableFirstCehSmesitel3KMSF1 {

    @Override
    public TableModelFirstCehSmesitel3KMSF1 convert(DeviceModelFirstCehSmesitel3KMSF1 deviceModelFirstCehSmesitel3KMSF1,
                                                    DeviceModelFirstCehSmesitel3MB110 deviceModelFirstCehSmesitel3MB110){
        TableModelFirstCehSmesitel3KMSF1 tableModelFirstCehSmesitel3KMSF1 = null;
        if (ObjectValidator.isNotNull(deviceModelFirstCehSmesitel3KMSF1)){
            tableModelFirstCehSmesitel3KMSF1 = new TableModelFirstCehSmesitel3KMSF1();
            tableModelFirstCehSmesitel3KMSF1.setDate(new Date());
            tableModelFirstCehSmesitel3KMSF1.setChannel1(DeviceModelFirstCehSmesitel3KMSF1.getDeviceValuesRegister0());
            tableModelFirstCehSmesitel3KMSF1.setChannel2(FloatCut.floatTwoDigs(DeviceModelFirstCehSmesitel3MB110.getDeviceValuesRegister0()));
            tableModelFirstCehSmesitel3KMSF1.setChannel3(FloatCut.floatTwoDigs(DeviceModelFirstCehSmesitel3MB110.getDeviceValuesRegister1()));
        }
        return tableModelFirstCehSmesitel3KMSF1;
    }
}
