package com.vk.repository;

import com.vk.entity.table.TableModelFirstCehBuzulukTRM200;
import com.vk.entity.table.TableModelFirstCehKameraDozrevanyaMPR51;

import java.util.Date;
import java.util.List;

/**
 * Created by User on 2018-03-07.
 */
public interface BaseRepositoryFirstCehKameraDozrevanyaMPR51 {

    void addValue(TableModelFirstCehKameraDozrevanyaMPR51 deviceModel);

    List<TableModelFirstCehKameraDozrevanyaMPR51> rangeTimestamp(Date startTimestamp, Date endTimestamp);
}
