package com.vk.service;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.table.TableModel;
import com.vk.entity.table.TableModelEnergeticRoomTRM201;

import java.util.Date;
import java.util.List;

/**
 * Created by User on 2018-02-28.
 */
public interface ServiceModelEnergeticRoomTRM201{

    DeviceModelEnergeticRoomTRM201 getModbusDevice();

    void addTabeDevice(TableModelEnergeticRoomTRM201 tableModel);

    List<TableModelEnergeticRoomTRM201> rangeTimestamp(Date startTimestamp, Date endTimestamp);
}
