package com.vk.repository;

import com.vk.entity.table.TableModelEnergeticRoomTRM201;
import com.vk.entity.table.TableModelFirstCehAutoclavTRM202;

import java.util.Date;
import java.util.List;

/**
 * Created by User on 2018-03-07.
 */
public interface BaseRepositoryFirstCehAutoclavTRM202 {

    void addValue(TableModelFirstCehAutoclavTRM202 deviceModel);

    List<TableModelFirstCehAutoclavTRM202> rangeTimestamp(Date startTimestamp, Date endTimestamp);
}
