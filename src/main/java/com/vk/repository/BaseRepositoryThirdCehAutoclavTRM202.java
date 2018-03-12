package com.vk.repository;

import com.vk.entity.table.TableModelThirdCehAutoclavTRM202;

import java.util.Date;
import java.util.List;

/**
 * Created by User on 2018-03-07.
 */
public interface BaseRepositoryThirdCehAutoclavTRM202 {

    void addValue(TableModelThirdCehAutoclavTRM202 deviceModel);

    List<TableModelThirdCehAutoclavTRM202> rangeTimestamp(Date startTimestamp, Date endTimestamp);
}
