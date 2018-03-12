package com.vk.repository;

import com.vk.entity.table.TableModelFirstCehSmesitel3KMSF1;

import java.util.Date;
import java.util.List;

/**
 * Created by User on 2018-03-07.
 */
public interface BaseRepositoryFirstCehSmesitel3KMSF1 {

    void addValue(TableModelFirstCehSmesitel3KMSF1 deviceModel);

    List<TableModelFirstCehSmesitel3KMSF1> rangeTimestamp(Date startTimestamp, Date endTimestamp);
}
