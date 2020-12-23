package com.vk.service.data;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM202;
import com.vk.entity.json.JsonBodyListForTableModelTRM202;
import com.vk.entity.table.TableModelEnergeticRoomTRM202;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by KIP-PC99 on 11.06.2018.
 */
public interface EnergeticRoomTRM201ServiceData {

    JsonBodyListForTableModelTRM202 jsonReadTableModelTRM202BetweenDate(LocalDateTime start, LocalDateTime end);
    TableModelEnergeticRoomTRM202 jsonReadTableModelTRM202Last();
    DeviceModelEnergeticRoomTRM202 jsonReadDeviceModelTRM202allRegisters();

    List<TableModelEnergeticRoomTRM202> databaseFindByDateBetween (LocalDateTime start, LocalDateTime end);
    TableModelEnergeticRoomTRM202 databaseFindLastValueByDate ();
    void databaseAddTableDevice(TableModelEnergeticRoomTRM202 tableModel);
    void databaseAddAllTableDevice(List<TableModelEnergeticRoomTRM202> tableModelTRM202List);

    void messageSendDevice(DeviceModelEnergeticRoomTRM202 deviceModelEnergeticRoomTRM202);

}
