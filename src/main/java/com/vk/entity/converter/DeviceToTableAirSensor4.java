package com.vk.entity.converter;

import com.vk.entity.json.JsonBodyAirSensor;
import com.vk.entity.table.TableModelAirSensor3;
import com.vk.entity.table.TableModelAirSensor4;

public interface DeviceToTableAirSensor4 {

    public TableModelAirSensor4 convert(JsonBodyAirSensor jsonBodyAirSensor);
}
