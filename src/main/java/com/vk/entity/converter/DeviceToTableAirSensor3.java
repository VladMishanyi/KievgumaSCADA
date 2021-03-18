package com.vk.entity.converter;

import com.vk.entity.json.JsonBodyAirSensor;
import com.vk.entity.table.TableModelAirSensor2;
import com.vk.entity.table.TableModelAirSensor3;

public interface DeviceToTableAirSensor3 {

    public TableModelAirSensor3 convert(JsonBodyAirSensor jsonBodyAirSensor);
}
