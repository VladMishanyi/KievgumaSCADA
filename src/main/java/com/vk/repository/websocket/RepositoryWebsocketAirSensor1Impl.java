package com.vk.repository.websocket;

import com.vk.entity.table.TableModelAirSensor1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.core.MessageSendingOperations;
import org.springframework.stereotype.Repository;

@Repository
@ComponentScan(basePackages = {"com.vk"})
public class RepositoryWebsocketAirSensor1Impl implements RepositoryWebsocketAirSensor1{

    private MessageSendingOperations<String> messageSendingOperationsRoot;

    private final String consumerRoot = "/topic/table-model-air-sensor1";

    @Autowired
    public RepositoryWebsocketAirSensor1Impl(final MessageSendingOperations<String> messageSendingOperationsRoot){
        this.messageSendingOperationsRoot = messageSendingOperationsRoot;
    }

    @Override
    public void messageSendDevice(TableModelAirSensor1 deviceModelDevice) {
        messageSendingOperationsRoot.convertAndSend(consumerRoot, deviceModelDevice);
    }
}
