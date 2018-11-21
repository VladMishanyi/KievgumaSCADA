package com.vk.entity.converter;

import com.vk.entity.device.DeviceModelFirstCehKameraDozrevanyaMPR51;
import com.vk.entity.device.DeviceModelFirstCehKameraDozrevanyaTRM138;
import com.vk.entity.device.DeviceModelSecondCehKameraVulcan1MPR51;
import com.vk.entity.table.TableModelFirstCehKameraDozrevanyaMPR51;
import com.vk.entity.table.TableModelSecondCehKameraVulcan1MPR51;
import com.vk.lib.FloatCut;
import com.vk.lib.ObjectValidator;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by KIP-PC99 on 21.11.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.configuration", "com.vk.entity"})
public class DeviceToTableImplSecondCehKameraVulcan1MPR51
        extends DeviceToTableImpl<DeviceModelSecondCehKameraVulcan1MPR51,
        DeviceModelSecondCehKameraVulcan1MPR51,
        TableModelSecondCehKameraVulcan1MPR51> implements DeviceToTableSecondCehKameraVulcan1MPR51 {

    @Override
    public TableModelSecondCehKameraVulcan1MPR51 convert(final DeviceModelSecondCehKameraVulcan1MPR51 deviceModelSecondCehKameraVulcan1MPR51){
        TableModelSecondCehKameraVulcan1MPR51 tableModelSecondCehKameraVulcan1MPR51 = null;
        if (ObjectValidator.isNotNull(deviceModelSecondCehKameraVulcan1MPR51)){
            tableModelSecondCehKameraVulcan1MPR51 = new TableModelSecondCehKameraVulcan1MPR51();
            tableModelSecondCehKameraVulcan1MPR51.setDate(new Date());
            tableModelSecondCehKameraVulcan1MPR51.setChannel1(FloatCut.floatTwoDigs(deviceModelSecondCehKameraVulcan1MPR51.getDeviceValuesRegister0()));
            tableModelSecondCehKameraVulcan1MPR51.setChannel2(FloatCut.floatTwoDigs(deviceModelSecondCehKameraVulcan1MPR51.getDeviceValuesRegister1()));
            tableModelSecondCehKameraVulcan1MPR51.setChannel3(FloatCut.floatTwoDigs(deviceModelSecondCehKameraVulcan1MPR51.getDeviceValuesRegister2()));
        }
        return tableModelSecondCehKameraVulcan1MPR51;
    }
}
