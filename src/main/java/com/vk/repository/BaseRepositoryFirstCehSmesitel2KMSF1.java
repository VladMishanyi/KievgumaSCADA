package com.vk.repository;

import com.vk.entity.table.TableModelFirstCehSmesitel1KMSF1;
import com.vk.entity.table.TableModelFirstCehSmesitel2KMSF1;

import java.util.Date;
import java.util.List;

/**
 * Created by User on 2018-03-07.
 */
public interface BaseRepositoryFirstCehSmesitel2KMSF1 {

    void addValue(TableModelFirstCehSmesitel2KMSF1 deviceModel);

    List<TableModelFirstCehSmesitel2KMSF1> rangeTimestamp(Date startTimestamp, Date endTimestamp);
}
