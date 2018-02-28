package com.vk.repository;

import com.vk.entity.TRM201_Energrtic;
import com.vk.entity.device.DeviceModel;
import com.vk.entity.table.TableModel;

/**
 * Created by User on 2018-02-27.
 */
public interface ModbusRepository<T extends DeviceModel, E extends TableModel> {
    public E getDeviceModel();
}
