package com.vk.repository;

import com.vk.entity.table.TableModelFirstCehKameraDozrevanyaMPR51;
import com.vk.entity.table.TableModelFirstCehSmesitel1KMSF1;

import java.util.Date;
import java.util.List;

/**
 * Created by User on 2018-03-07.
 */
public interface BaseRepositoryFirstCehSmesitel1KMSF1 {

    void addValue(TableModelFirstCehSmesitel1KMSF1 deviceModel);

    List<TableModelFirstCehSmesitel1KMSF1> rangeTimestamp(Date startTimestamp, Date endTimestamp);
}
