package com.vk.entity.converter;

import com.vk.entity.device.DeviceModelSecondCehKameraVulcan2MPR51;
import com.vk.entity.table.TableModelSecondCehKameraVulcan2MPR51;
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
public class DeviceToTableImplSecondCehKameraVulcan2MPR51
        extends DeviceToTableImpl<DeviceModelSecondCehKameraVulcan2MPR51,
        DeviceModelSecondCehKameraVulcan2MPR51,
        TableModelSecondCehKameraVulcan2MPR51> implements DeviceToTableSecondCehKameraVulcan2MPR51 {

    @Override
    public TableModelSecondCehKameraVulcan2MPR51 convert(final DeviceModelSecondCehKameraVulcan2MPR51 deviceModelSecondCehKameraVulcan2MPR51){
        TableModelSecondCehKameraVulcan2MPR51 tableModelSecondCehKameraVulcan2MPR51 = null;
        if (ObjectValidator.isNotNull(deviceModelSecondCehKameraVulcan2MPR51)){
            tableModelSecondCehKameraVulcan2MPR51 = new TableModelSecondCehKameraVulcan2MPR51();
            tableModelSecondCehKameraVulcan2MPR51.setDate(new Date());
            tableModelSecondCehKameraVulcan2MPR51.setChannel1(FloatCut.floatTwoDigs(deviceModelSecondCehKameraVulcan2MPR51.getInputRegister45()));
            tableModelSecondCehKameraVulcan2MPR51.setChannel2(FloatCut.floatTwoDigs(deviceModelSecondCehKameraVulcan2MPR51.getInputRegister45()));
            tableModelSecondCehKameraVulcan2MPR51.setChannel3(FloatCut.floatTwoDigs(deviceModelSecondCehKameraVulcan2MPR51.getInputRegister45()));
        }
        return tableModelSecondCehKameraVulcan2MPR51;
    }
}
