package com.vk.service;

import com.vk.entity.device.DeviceModelFirstCehSmesitel2KMSF1;
import com.vk.entity.device.DeviceModelFirstCehSmesitel3KMSF1;
import com.vk.entity.table.TableModelFirstCehSmesitel2KMSF1;
import com.vk.entity.table.TableModelFirstCehSmesitel3KMSF1;

import java.util.Date;
import java.util.List;

public interface ServiceModelFirstCehSmesitel3KMSF1 {

    DeviceModelFirstCehSmesitel3KMSF1 getModbusDevice();

    void addTabeDevice(TableModelFirstCehSmesitel3KMSF1 tableModel);

    List<TableModelFirstCehSmesitel3KMSF1> rangeTimestamp(Date startTimestamp, Date endTimestamp);
}
