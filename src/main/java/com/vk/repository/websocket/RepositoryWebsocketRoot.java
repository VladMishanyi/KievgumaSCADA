package com.vk.repository.websocket;

import com.vk.entity.device.DeviceModel;
import com.vk.entity.device.DeviceModelEnergeticRoomTRM202;

public interface RepositoryWebsocketRoot<D extends DeviceModel> {

    void messageSendDevice(D deviceModelDevice);
}
