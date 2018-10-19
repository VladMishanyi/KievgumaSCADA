package com.vk.entity.converter;

import com.vk.entity.device.DeviceModelFirstCehKameraDozrevanyaMPR51;
import com.vk.entity.device.DeviceModelFirstCehKameraDozrevanyaTRM138;
import com.vk.entity.device.DeviceModelFirstCehSmesitel1MB110;
import com.vk.entity.table.TableModelFirstCehKameraDozrevanyaMPR51;
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
public class DeviceToTableImplFirstCehKameraDozrevanyaMPR51
        extends DeviceToTableImpl<DeviceModelFirstCehKameraDozrevanyaMPR51,
        DeviceModelFirstCehKameraDozrevanyaTRM138,
        TableModelFirstCehKameraDozrevanyaMPR51> implements DeviceToTableFirstCehKameraDozrevanyaMPR51 {

    @Override
    public TableModelFirstCehKameraDozrevanyaMPR51 convert(DeviceModelFirstCehKameraDozrevanyaMPR51 deviceModelFirstCehKameraDozrevanyaMPR51,
                                                           DeviceModelFirstCehKameraDozrevanyaTRM138 deviceModelFirstCehKameraDozrevanyaTRM138){
        TableModelFirstCehKameraDozrevanyaMPR51 tableModelFirstCehKameraDozrevanyaMPR51 = null;
        if (ObjectValidator.isNotNull(deviceModelFirstCehKameraDozrevanyaMPR51) && ObjectValidator.isNotNull(deviceModelFirstCehKameraDozrevanyaTRM138)){
            tableModelFirstCehKameraDozrevanyaMPR51 = new TableModelFirstCehKameraDozrevanyaMPR51();
            tableModelFirstCehKameraDozrevanyaMPR51.setDate(new Date());
            tableModelFirstCehKameraDozrevanyaMPR51.setChannel1(FloatCut.floatTwoDigs(deviceModelFirstCehKameraDozrevanyaMPR51.getDeviceValuesRegister0()));
            tableModelFirstCehKameraDozrevanyaMPR51.setChannel2(FloatCut.floatTwoDigs(deviceModelFirstCehKameraDozrevanyaMPR51.getDeviceValuesRegister1()));
            tableModelFirstCehKameraDozrevanyaMPR51.setChannel3(FloatCut.floatTwoDigs(deviceModelFirstCehKameraDozrevanyaMPR51.getDeviceValuesRegister2()));
            tableModelFirstCehKameraDozrevanyaMPR51.setChannel4(FloatCut.floatTwoDigs(deviceModelFirstCehKameraDozrevanyaTRM138.getDeviceValuesRegister0()));
            tableModelFirstCehKameraDozrevanyaMPR51.setChannel5(FloatCut.floatTwoDigs(deviceModelFirstCehKameraDozrevanyaTRM138.getDeviceValuesRegister1()));
            tableModelFirstCehKameraDozrevanyaMPR51.setChannel6(FloatCut.floatTwoDigs(deviceModelFirstCehKameraDozrevanyaTRM138.getDeviceValuesRegister2()));
            tableModelFirstCehKameraDozrevanyaMPR51.setChannel7(FloatCut.floatTwoDigs(deviceModelFirstCehKameraDozrevanyaTRM138.getDeviceValuesRegister3()));
            tableModelFirstCehKameraDozrevanyaMPR51.setChannel8(FloatCut.floatTwoDigs(deviceModelFirstCehKameraDozrevanyaTRM138.getDeviceValuesRegister4()));
        }
        return tableModelFirstCehKameraDozrevanyaMPR51;
    }
}
