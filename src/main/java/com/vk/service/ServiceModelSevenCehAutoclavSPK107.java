package com.vk.service;

import com.vk.entity.device.DeviceModelFirstCehSmesitel5KMSF1;
import com.vk.entity.device.DeviceModelSevenCehAutoclavSPK107;
import com.vk.entity.table.TableModelFirstCehSmesitel5KMSF1;
import com.vk.entity.table.TableModelSevenCehAutoclavSPK107;

import java.util.Date;
import java.util.List;

public interface ServiceModelSevenCehAutoclavSPK107 /*extends ServiceModel*/{

    DeviceModelSevenCehAutoclavSPK107 getModbusDevice();

    void addTabeDevice(TableModelSevenCehAutoclavSPK107 tableModel);

    List<TableModelSevenCehAutoclavSPK107> rangeTimestamp(Date startTimestamp, Date endTimestamp);
}
