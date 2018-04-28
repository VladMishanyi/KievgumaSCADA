package com.vk.service;

import com.vk.entity.device.DeviceModelFirstCehSmesitel1MB110;
import com.vk.entity.device.DeviceModelFirstCehSmesitel4KMSF1;
import com.vk.entity.device.DeviceModelFirstCehSmesitel5KMSF1;
import com.vk.entity.device.DeviceModelFirstCehSmesitel5MB110;
import com.vk.entity.table.TableModelFirstCehSmesitel4KMSF1;
import com.vk.entity.table.TableModelFirstCehSmesitel5KMSF1;

import java.util.Date;
import java.util.List;

public interface ServiceModelFirstCehSmesitel5KMSF1 /*extends ServiceModel*/{

    DeviceModelFirstCehSmesitel5KMSF1 getModbusDevice();

    DeviceModelFirstCehSmesitel5MB110 getModbusDevice2();

    void addTabeDevice(TableModelFirstCehSmesitel5KMSF1 tableModel);

    List<TableModelFirstCehSmesitel5KMSF1> rangeTimestamp(Date startTimestamp, Date endTimestamp);
}
