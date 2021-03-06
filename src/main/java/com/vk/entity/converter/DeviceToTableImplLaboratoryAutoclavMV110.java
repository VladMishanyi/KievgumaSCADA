package com.vk.entity.converter;

import com.vk.entity.device.DeviceModelLaboratoryAutoclavMV110;
import com.vk.entity.table.TableModelLaboratoryAutoclavMV110;
import com.vk.lib.FloatCut;
import com.vk.lib.ObjectValidator;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by User on 2018-04-02.
 */
@Component
@ComponentScan(basePackages = {"com.vk.configuration", "com.vk.entity"})
public class DeviceToTableImplLaboratoryAutoclavMV110
        extends DeviceToTableImpl<DeviceModelLaboratoryAutoclavMV110,
        DeviceModelLaboratoryAutoclavMV110,
        TableModelLaboratoryAutoclavMV110> implements DeviceToTableLaboratoryAutoclavMV110 {

    @Override
    public TableModelLaboratoryAutoclavMV110 convert(final DeviceModelLaboratoryAutoclavMV110 deviceModelLaboratoryAutoclavMV110){
        TableModelLaboratoryAutoclavMV110 tableModelLaboratoryAutoclavMV110 = null;
        if (ObjectValidator.isNotNull(deviceModelLaboratoryAutoclavMV110)){
            tableModelLaboratoryAutoclavMV110 = new TableModelLaboratoryAutoclavMV110();
            tableModelLaboratoryAutoclavMV110.setDate(LocalDateTime.now());
            tableModelLaboratoryAutoclavMV110.setChannel1(FloatCut.floatTwoDigs(deviceModelLaboratoryAutoclavMV110.getDeviceValuesRegister0()));
            tableModelLaboratoryAutoclavMV110.setChannel2(FloatCut.floatTwoDigs(deviceModelLaboratoryAutoclavMV110.getDeviceValuesRegister1()));
        }
        return tableModelLaboratoryAutoclavMV110;
    }
}
