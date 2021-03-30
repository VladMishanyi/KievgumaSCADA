package com.vk.repository.websocket;

import com.vk.entity.table.TableModelAirSensor4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.core.MessageSendingOperations;
import org.springframework.stereotype.Repository;

@Repository
@ComponentScan(basePackages = {"com.vk"})
public class RepositoryWebsocketAirSensor4Impl implements RepositoryWebsocketAirSensor4{

    private MessageSendingOperations<String> messageSendingOperationsRoot;

    private final String consumerRoot = "/topic/table-model-air-sensor4";

    @Autowired
    public RepositoryWebsocketAirSensor4Impl(final MessageSendingOperations<String> messageSendingOperationsRoot){
        this.messageSendingOperationsRoot = messageSendingOperationsRoot;
    }

    @Override
    public void messageSendDevice(TableModelAirSensor4 deviceModelDevice) {
        messageSendingOperationsRoot.convertAndSend(consumerRoot, deviceModelDevice);
    }
}
