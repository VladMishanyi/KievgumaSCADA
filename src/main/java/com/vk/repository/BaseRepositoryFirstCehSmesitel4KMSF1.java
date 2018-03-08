package com.vk.repository;

import com.vk.entity.table.TableModelFirstCehSmesitel1KMSF1;
import com.vk.entity.table.TableModelFirstCehSmesitel4KMSF1;

import java.util.Date;
import java.util.List;

/**
 * Created by User on 2018-03-07.
 */
public interface BaseRepositoryFirstCehSmesitel4KMSF1 {

    void addValue(TableModelFirstCehSmesitel4KMSF1 deviceModel);

    List<TableModelFirstCehSmesitel4KMSF1> rangeTimestamp(Date startTimestamp, Date endTimestamp);
}