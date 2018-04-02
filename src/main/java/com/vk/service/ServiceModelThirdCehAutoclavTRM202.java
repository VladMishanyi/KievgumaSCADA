package com.vk.service;

import com.vk.entity.device.DeviceModelSevenCehAutoclavSPK107;
import com.vk.entity.device.DeviceModelThirdCehAutoclavTRM202;
import com.vk.entity.table.TableModelSevenCehAutoclavSPK107;
import com.vk.entity.table.TableModelThirdCehAutoclavTRM202;

import java.util.Date;
import java.util.List;

public interface ServiceModelThirdCehAutoclavTRM202 /*extends ServiceModel*/{

    DeviceModelThirdCehAutoclavTRM202 getModbusDevice();

    void addTabeDevice(TableModelThirdCehAutoclavTRM202 tableModel);

    List<TableModelThirdCehAutoclavTRM202> rangeTimestamp(Date startTimestamp, Date endTimestamp);
}
