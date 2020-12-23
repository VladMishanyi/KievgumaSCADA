package com.vk.repository.websocket;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM202;
import org.springframework.messaging.core.MessageSendingOperations;

public interface WebsocketRepositoryEnergeticRoomTRM202 {

    void messageSendDevice(DeviceModelEnergeticRoomTRM202 deviceModelEnergeticRoomTRM202);
}
