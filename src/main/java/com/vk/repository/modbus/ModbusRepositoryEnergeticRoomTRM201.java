package com.vk.repository.modbus;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;

/**
 * Created by User on 2018-02-27.
 */
public interface ModbusRepositoryEnergeticRoomTRM201 extends RootModbusRepository<DeviceModelEnergeticRoomTRM201>{

    void writeValueFirstChanel(int value);

    void writeValueFirstChane2(int value);
}
