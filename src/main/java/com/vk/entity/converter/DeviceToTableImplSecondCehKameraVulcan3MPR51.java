package com.vk.entity.converter;

import com.vk.entity.device.DeviceModelSecondCehKameraVulcan3MPR51;
import com.vk.entity.table.TableModelSecondCehKameraVulcan3MPR51;
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
public class DeviceToTableImplSecondCehKameraVulcan3MPR51
        extends DeviceToTableImpl<DeviceModelSecondCehKameraVulcan3MPR51,
        DeviceModelSecondCehKameraVulcan3MPR51,
        TableModelSecondCehKameraVulcan3MPR51> implements DeviceToTableSecondCehKameraVulcan3MPR51 {

    @Override
    public TableModelSecondCehKameraVulcan3MPR51 convert(final DeviceModelSecondCehKameraVulcan3MPR51 deviceModelSecondCehKameraVulcan3MPR51){
        TableModelSecondCehKameraVulcan3MPR51 tableModelSecondCehKameraVulcan3MPR51 = null;
        if (ObjectValidator.isNotNull(deviceModelSecondCehKameraVulcan3MPR51)){
            tableModelSecondCehKameraVulcan3MPR51 = new TableModelSecondCehKameraVulcan3MPR51();
            tableModelSecondCehKameraVulcan3MPR51.setDate(new Date());
            tableModelSecondCehKameraVulcan3MPR51.setChannel1(FloatCut.floatTwoDigs(deviceModelSecondCehKameraVulcan3MPR51.getInputRegister45()));
            tableModelSecondCehKameraVulcan3MPR51.setChannel2(FloatCut.floatTwoDigs(deviceModelSecondCehKameraVulcan3MPR51.getInputRegister45()));
            tableModelSecondCehKameraVulcan3MPR51.setChannel3(FloatCut.floatTwoDigs(deviceModelSecondCehKameraVulcan3MPR51.getInputRegister45()));
        }
        return tableModelSecondCehKameraVulcan3MPR51;
    }
}
