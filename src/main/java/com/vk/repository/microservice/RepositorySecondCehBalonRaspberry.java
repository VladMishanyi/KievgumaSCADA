package com.vk.repository.microservice;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM202;
import com.vk.entity.device.DeviceModelSecondCehBalonTRM138;
import com.vk.entity.json.JsonBodyListForTableModelSecondCehBalonTRM138;
import com.vk.entity.json.JsonBodyListForTableModelTRM202;
import com.vk.entity.table.TableModelEnergeticRoomTRM202;
import com.vk.entity.table.TableModelSecondCehBalonTRM138;

import java.time.LocalDateTime;

public interface RepositorySecondCehBalonRaspberry extends RepositoryRoot<TableModelSecondCehBalonTRM138, JsonBodyListForTableModelSecondCehBalonTRM138, DeviceModelSecondCehBalonTRM138> {

//    JsonBodyListForTableModelSecondCehBalonTRM138 jsonReadTableModelBetweenDate(LocalDateTime start, LocalDateTime end);
//
//    TableModelSecondCehBalonTRM138 jsonReadTableModelLast();
//
//    DeviceModelSecondCehBalonTRM138 jsonReadDeviceModelAllRegisters();
}
