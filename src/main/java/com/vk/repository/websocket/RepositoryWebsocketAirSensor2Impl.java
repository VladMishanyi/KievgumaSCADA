package com.vk.repository.websocket;

import com.vk.entity.table.TableModelAirSensor1;
import com.vk.entity.table.TableModelAirSensor2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.core.MessageSendingOperations;
import org.springframework.stereotype.Repository;

@Repository
@ComponentScan(basePackages = {"com.vk"})
public class RepositoryWebsocketAirSensor2Impl implements RepositoryWebsocketAirSensor2{

    private MessageSendingOperations<String> messageSendingOperationsRoot;

    private final String consumerRoot = "/topic/table-model-air-sensor2";

    @Autowired
    public RepositoryWebsocketAirSensor2Impl(final MessageSendingOperations<String> messageSendingOperationsRoot){
        this.messageSendingOperationsRoot = messageSendingOperationsRoot;
    }

    @Override
    public void messageSendDevice(TableModelAirSensor2 deviceModelDevice) {
        messageSendingOperationsRoot.convertAndSend(consumerRoot, deviceModelDevice);
    }
}
