package com.vk.repository.websocket;

import com.vk.entity.table.TableModelAirSensor2;
import com.vk.entity.table.TableModelAirSensor3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.core.MessageSendingOperations;
import org.springframework.stereotype.Repository;

@Repository
@ComponentScan(basePackages = {"com.vk"})
public class RepositoryWebsocketAirSensor3Impl implements RepositoryWebsocketAirSensor3{

    private MessageSendingOperations<String> messageSendingOperationsRoot;

    private final String consumerRoot = "/topic/table-model-air-sensor3";

    @Autowired
    public RepositoryWebsocketAirSensor3Impl(final MessageSendingOperations<String> messageSendingOperationsRoot){
        this.messageSendingOperationsRoot = messageSendingOperationsRoot;
    }

    @Override
    public void messageSendDevice(TableModelAirSensor3 deviceModelDevice) {
        messageSendingOperationsRoot.convertAndSend(consumerRoot, deviceModelDevice);
    }
}
