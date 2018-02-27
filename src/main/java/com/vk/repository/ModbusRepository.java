package com.vk.repository;

import com.vk.entity.TRM201_Energrtic;
import com.vk.entity.device.DeviceModel;

/**
 * Created by User on 2018-02-27.
 */
public interface ModbusRepository<T extends DeviceModel> {
    public T getDeviceModel();
}
