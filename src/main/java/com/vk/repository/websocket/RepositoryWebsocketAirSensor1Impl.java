package com.vk.repository.websocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.core.MessageSendingOperations;
import org.springframework.stereotype.Repository;

@Repository
@ComponentScan(basePackages = {"com.vk"})
public class RepositoryWebsocketAirSensor1Impl {

    @Autowired
    public RepositoryWebsocketAirSensor1Impl(final MessageSendingOperations<String> messageSendingOperations){
        messageSendingOperationsRoot.convertAndSend(consumerRoot, deviceModelDevice);
        super(messageSendingOperations, "/topic/trm201");
    }
}
