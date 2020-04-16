package com.vk.entity.converter;

import com.vk.entity.device.DeviceModel;
import com.vk.entity.table.TableModel;

import java.io.Serializable;

/**
 * Created by KIP-PC99 on 23.06.2018.
 */
public interface DeviceToTable<T extends DeviceModel, K extends DeviceModel, E extends TableModel> extends Serializable, Cloneable {

    public E convert(T device);

    public E convert(T device1, K device2);
}
