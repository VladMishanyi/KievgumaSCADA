package com.vk.repository;

import com.vk.entity.table.TableModelFirstCehSmesitel1KMSF1;
import com.vk.entity.table.TableModelFirstCehSmesitel5KMSF1;

import java.util.Date;
import java.util.List;

/**
 * Created by User on 2018-03-07.
 */
public interface BaseRepositoryFirstCehSmesitel5KMSF1 {

    void addValue(TableModelFirstCehSmesitel5KMSF1 deviceModel);

    List<TableModelFirstCehSmesitel5KMSF1> rangeTimestamp(Date startTimestamp, Date endTimestamp);
}
