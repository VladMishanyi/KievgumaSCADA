package com.vk.entity.converter;

import com.vk.entity.device.DeviceModel;
import com.vk.entity.table.TableModel;

/**
 * Created by KIP-PC99 on 23.06.2018.
 */
public interface DeviceToTable<T extends DeviceModel, K extends DeviceModel, E extends TableModel> {

    public E convert(T device);

    public E convert(T device1, K device2);
}
