package com.vk.repository;

import com.vk.entity.table.TableModelEnergeticRoomTRM201;

import java.util.Date;
import java.util.List;

/**
 * Created by User on 2018-02-27.
 */
public interface BaseRepositoryEnergeticRoomTRM201 {

    void addValue(TableModelEnergeticRoomTRM201 deviceModel);

    List<TableModelEnergeticRoomTRM201> rangeTimestamp(Date startTimestamp, Date endTimestamp);
}
