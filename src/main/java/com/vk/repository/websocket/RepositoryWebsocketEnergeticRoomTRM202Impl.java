package com.vk.repository.websocket;

import com.vk.entity.device.DeviceModelEnergeticRoomTRM202;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.core.MessageSendingOperations;
import org.springframework.stereotype.Repository;

@Repository
@ComponentScan(basePackages = {"com.vk"})
public class RepositoryWebsocketEnergeticRoomTRM202Impl extends RepositoryWebsocketRootImpl<DeviceModelEnergeticRoomTRM202> implements RepositoryWebsocketEnergeticRoomTRM202 {

    @Autowired
    public RepositoryWebsocketEnergeticRoomTRM202Impl(final MessageSendingOperations<String> messageSendingOperations){
        super(messageSendingOperations, "/topic/trm201");
    }

}
