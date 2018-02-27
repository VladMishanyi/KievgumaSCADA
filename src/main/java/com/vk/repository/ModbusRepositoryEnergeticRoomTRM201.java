package com.vk.repository;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;

/**
 * Created by User on 2018-02-27.
 */
public interface ModbusRepositoryEnergeticRoomTRM201 extends ModbusRepository<DeviceModelEnergeticRoomTRM201>{

    @Override
    public DeviceModelEnergeticRoomTRM201 getDeviceModel();
}
