package com.vk.entity.converter;

import com.vk.entity.json.JsonBodyAirSensor;
import com.vk.entity.table.TableModelAirSensor1;

public interface DeviceToTableAirSensor{

    public TableModelAirSensor1 convert(JsonBodyAirSensor jsonBodyAirSensor);
}
