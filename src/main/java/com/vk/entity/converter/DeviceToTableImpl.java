package com.vk.entity.converter;

import com.vk.entity.device.DeviceModel;
import com.vk.entity.table.TableModel;

/**
 * Created by User on 2018-02-28.
 */
public class DeviceToTableImpl<T extends DeviceModel, K extends DeviceModel, E extends TableModel> implements DeviceToTable<T, K, E>{

    public E convert(T device){
        return null;
    }

    public E convert(T device1, K device2){
        return null;
    }
}
