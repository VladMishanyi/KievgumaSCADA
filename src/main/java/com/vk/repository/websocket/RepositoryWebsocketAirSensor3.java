package com.vk.repository.websocket;

import com.vk.entity.table.TableModelAirSensor2;
import com.vk.entity.table.TableModelAirSensor3;

public interface RepositoryWebsocketAirSensor3 {

    void messageSendDevice(TableModelAirSensor3 deviceModelDevice);
}
