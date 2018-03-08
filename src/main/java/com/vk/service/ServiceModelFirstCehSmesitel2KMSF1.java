package com.vk.service;

import com.vk.entity.device.DeviceModelFirstCehSmesitel1KMSF1;
import com.vk.entity.device.DeviceModelFirstCehSmesitel2KMSF1;
import com.vk.entity.table.TableModelFirstCehSmesitel1KMSF1;
import com.vk.entity.table.TableModelFirstCehSmesitel2KMSF1;

import java.util.Date;
import java.util.List;

public interface ServiceModelFirstCehSmesitel2KMSF1 {

    DeviceModelFirstCehSmesitel2KMSF1 getModbusDevice();

    void addTabeDevice(TableModelFirstCehSmesitel2KMSF1 tableModel);

    List<TableModelFirstCehSmesitel2KMSF1> rangeTimestamp(Date startTimestamp, Date endTimestamp);
}
