package com.vk.service;

import com.vk.entity.device.DeviceModelFirstCehKameraDozrevanyaMPR51;
import com.vk.entity.device.DeviceModelFirstCehSmesitel1KMSF1;
import com.vk.entity.table.TableModelFirstCehKameraDozrevanyaMPR51;
import com.vk.entity.table.TableModelFirstCehSmesitel1KMSF1;

import java.util.Date;
import java.util.List;

public interface ServiceModelFirstCehSmesitel1KMSF1 {

    DeviceModelFirstCehSmesitel1KMSF1 getModbusDevice();

    void addTabeDevice(TableModelFirstCehSmesitel1KMSF1 tableModel);

    List<TableModelFirstCehSmesitel1KMSF1> rangeTimestamp(Date startTimestamp, Date endTimestamp);
}
