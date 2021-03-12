package com.vk.repository.websocket;

import com.vk.entity.table.TableModelAirSensor1;
import com.vk.entity.table.TableModelAirSensor2;

public interface RepositoryWebsocketAirSensor2 {

    void messageSendDevice(TableModelAirSensor2 deviceModelDevice);
}
