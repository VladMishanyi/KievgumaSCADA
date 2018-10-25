package com.vk.entity.converter;

import com.vk.entity.device.DeviceModel;
import com.vk.entity.table.TableModel;

/**
 * Created by User on 2018-02-28.
 */
public class DeviceToTableImpl<T extends DeviceModel, K extends DeviceModel, E extends TableModel> {

    public E convert(final T device){
        return null;
    }

    public E convert(final T device1, final K device2){
        return null;
    }

}

