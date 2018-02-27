package com.vk.repository;

import com.vk.entity.TRM201_Energrtic;
import com.vk.entity.device.DeviceModel;
import com.vk.entity.table.TableModel;

import java.util.Date;
import java.util.List;

/**
 * Created by User on 2018-02-26.
 */
public interface BaseRepository<E extends TableModel> {
    void addValue(E deviceModel);
}
