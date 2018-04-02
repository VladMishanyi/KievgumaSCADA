package com.vk.service;

import com.vk.entity.device.DeviceModelFirstCehAutoclavTRM202;
import com.vk.entity.device.DeviceModelFirstCehBuzulukTRM200;
import com.vk.entity.table.TableModelFirstCehAutoclavTRM202;
import com.vk.entity.table.TableModelFirstCehBuzulukTRM200;

import java.util.Date;
import java.util.List;

public interface ServiceModelFirstCehBuzulukTRM200 /*extends ServiceModel*/{

    DeviceModelFirstCehBuzulukTRM200 getModbusDevice();

    void addTabeDevice(TableModelFirstCehBuzulukTRM200 tableModel);

    List<TableModelFirstCehBuzulukTRM200> rangeTimestamp(Date startTimestamp, Date endTimestamp);
}
