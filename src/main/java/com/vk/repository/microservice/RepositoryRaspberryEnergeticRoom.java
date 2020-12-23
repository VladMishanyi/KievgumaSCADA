package com.vk.repository.microservice;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM202;
import com.vk.entity.json.JsonBodyListForTableModelTRM202;
import com.vk.entity.table.TableModelEnergeticRoomTRM202;

import java.time.LocalDateTime;

public interface RepositoryRaspberryEnergeticRoom {

    JsonBodyListForTableModelTRM202 jsonReadTableModelTRM202BetweenDate(LocalDateTime start, LocalDateTime end);

    TableModelEnergeticRoomTRM202 jsonReadTableModelTRM202Last();

    DeviceModelEnergeticRoomTRM202 jsonReadDeviceModelTRM202allRegisters();
}
