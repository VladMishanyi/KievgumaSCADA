package com.vk.entity.converter;

import com.vk.entity.device.DeviceModelFirstCehKameraDozrevanyaMPR51;
import com.vk.entity.table.TableModelFirstCehKameraDozrevanyaMPR51;
import com.vk.lib.FloatCut;
import com.vk.lib.ObjectValidator;

import java.util.Date;

/**
 * Created by User on 2018-03-07.
 */
public class DeviceToTableFirstCehKameraDozrevanyaMPR51 extends DeviceToTable<DeviceModelFirstCehKameraDozrevanyaMPR51,TableModelFirstCehKameraDozrevanyaMPR51>{

    @Override
    public TableModelFirstCehKameraDozrevanyaMPR51 convert(DeviceModelFirstCehKameraDozrevanyaMPR51 deviceModelFirstCehKameraDozrevanyaMPR51){
        TableModelFirstCehKameraDozrevanyaMPR51 tableModelFirstCehKameraDozrevanyaMPR51 = null;
        if (ObjectValidator.isNotNull(deviceModelFirstCehKameraDozrevanyaMPR51)){
            tableModelFirstCehKameraDozrevanyaMPR51 = new TableModelFirstCehKameraDozrevanyaMPR51();
            tableModelFirstCehKameraDozrevanyaMPR51.setDate(new Date());
            tableModelFirstCehKameraDozrevanyaMPR51.setChannel1(FloatCut.floatTwoDigs(deviceModelFirstCehKameraDozrevanyaMPR51.getDeviceValuesRegisters()[0]));
            tableModelFirstCehKameraDozrevanyaMPR51.setChannel2(FloatCut.floatTwoDigs(deviceModelFirstCehKameraDozrevanyaMPR51.getDeviceValuesRegisters()[1]));
            tableModelFirstCehKameraDozrevanyaMPR51.setChannel3(FloatCut.floatTwoDigs(deviceModelFirstCehKameraDozrevanyaMPR51.getDeviceValuesRegisters()[2]));
        }
        return tableModelFirstCehKameraDozrevanyaMPR51;
    }
}
