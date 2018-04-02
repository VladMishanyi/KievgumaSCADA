package com.vk.service;

import com.vk.entity.device.DeviceModelFirstCehAutoclavTRM202;
import com.vk.entity.device.DeviceModelLaboratoryAutoclavMV110;
import com.vk.entity.table.TableModelFirstCehAutoclavTRM202;
import com.vk.entity.table.TableModelLaboratoryAutoclavMV110;

import java.util.Date;
import java.util.List;

/**
 * Created by User on 2018-04-02.
 */
public interface ServiceModelLaboratoryAutoclavMV110 {

    DeviceModelLaboratoryAutoclavMV110 getModbusDevice();

    void addTabeDevice(TableModelLaboratoryAutoclavMV110 tableModel);

    List<TableModelLaboratoryAutoclavMV110> rangeTimestamp(Date startTimestamp, Date endTimestamp);
}
