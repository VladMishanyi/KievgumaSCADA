package com.vk.repository;

import com.vk.entity.table.TableModelFirstCehBuzulukTRM200;

import java.util.Date;
import java.util.List;

/**
 * Created by User on 2018-03-07.
 */
public interface BaseRepositoryFirstCehBuzulukTRM200 /*extends BaseRepository*/ {

    void addValue(TableModelFirstCehBuzulukTRM200 deviceModel);

    List<TableModelFirstCehBuzulukTRM200> rangeTimestamp(Date startTimestamp, Date endTimestamp);
}
