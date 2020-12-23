package com.vk.repository.websocket;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM202;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.core.MessageSendingOperations;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@ComponentScan(basePackages = {"com.vk"})
public class WebsocketRepositoryEnergeticRoomTRM202Impl implements WebsocketRepositoryEnergeticRoomTRM202{

    private final MessageSendingOperations<String> messageSendingOperations;

    @Autowired
    public WebsocketRepositoryEnergeticRoomTRM202Impl(final MessageSendingOperations<String> messageSendingOperations){
        this.messageSendingOperations = messageSendingOperations;

    }

    @Override
    public void messageSendDevice(DeviceModelEnergeticRoomTRM202 deviceModelEnergeticRoomTRM202) {
        messageSendingOperations.convertAndSend("/topic/trm201", deviceModelEnergeticRoomTRM202);
    }
}
