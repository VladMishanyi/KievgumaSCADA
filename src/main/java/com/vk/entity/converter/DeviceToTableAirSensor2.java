package com.vk.entity.converter;

import com.vk.entity.json.JsonBodyAirSensor;
import com.vk.entity.table.TableModelAirSensor1;
import com.vk.entity.table.TableModelAirSensor2;

public interface DeviceToTableAirSensor2 {

    public TableModelAirSensor2 convert(JsonBodyAirSensor jsonBodyAirSensor);
}
