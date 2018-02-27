package com.vk.repository;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.table.TableModelEnergeticRoomTRM201;

/**
 * Created by User on 2018-02-27.
 */
public interface BaseRepositoryEnergeticRoomTRM201 extends BaseRepository<TableModelEnergeticRoomTRM201> {
    void addValue(TableModelEnergeticRoomTRM201 deviceModel);
}
