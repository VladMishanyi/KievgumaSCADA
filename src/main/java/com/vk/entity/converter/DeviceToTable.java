package com.vk.entity.converter;

import com.vk.entity.device.DeviceModel;
import com.vk.entity.table.TableModel;

/**
 * Created by User on 2018-02-28.
 */
public abstract class DeviceToTable<T extends DeviceModel, E extends TableModel> {

    public abstract E convert(T device);
}
