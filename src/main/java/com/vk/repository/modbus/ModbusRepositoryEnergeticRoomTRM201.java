package com.vk.repository.modbus;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM202;

/**
 * Created by User on 2018-02-27.
 */
public interface ModbusRepositoryEnergeticRoomTRM201 extends RootModbusRepository<DeviceModelEnergeticRoomTRM202>{

    void writeValueFirstChanel(int value);

    void writeValueFirstChane2(int value);
}
