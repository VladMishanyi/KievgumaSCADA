package com.vk.repository;

import com.vk.entity.table.TableModelSevenCehAutoclavSPK107;

import java.util.Date;
import java.util.List;

/**
 * Created by User on 2018-03-07.
 */
public interface BaseRepositorySevenCehAutoclavSPK107 {

    void addValue(TableModelSevenCehAutoclavSPK107 deviceModel);

    List<TableModelSevenCehAutoclavSPK107> rangeTimestamp(Date startTimestamp, Date endTimestamp);
}
