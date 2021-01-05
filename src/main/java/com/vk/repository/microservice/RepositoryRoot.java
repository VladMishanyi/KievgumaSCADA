package com.vk.repository.microservice;

import com.vk.entity.device.DeviceModel;
import com.vk.entity.device.DeviceModelEnergeticRoomTRM202;
import com.vk.entity.json.JsonBodyListForTableModelTRM202;
import com.vk.entity.json.JsonBodyListRoot;
import com.vk.entity.table.TableModel;
import com.vk.entity.table.TableModelEnergeticRoomTRM202;

import java.time.LocalDateTime;

public interface RepositoryRoot<T extends TableModel, J extends JsonBodyListRoot<T>, D extends DeviceModel> {


    J jsonReadTableModelBetweenDate(LocalDateTime start, LocalDateTime end);

    T jsonReadTableModelLast();

    D jsonReadDeviceModelAllRegisters();
}
