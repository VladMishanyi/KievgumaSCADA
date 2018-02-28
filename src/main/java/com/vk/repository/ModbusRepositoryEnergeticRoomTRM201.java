package com.vk.repository;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.table.TableModelEnergeticRoomTRM201;

/**
 * Created by User on 2018-02-27.
 */
public interface ModbusRepositoryEnergeticRoomTRM201 extends ModbusRepository<DeviceModelEnergeticRoomTRM201,TableModelEnergeticRoomTRM201>{

    @Override
    public TableModelEnergeticRoomTRM201 getDeviceModel();
}
