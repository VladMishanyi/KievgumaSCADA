package com.vk.repository.websocket;

import com.vk.entity.device.DeviceModelSecondCehBalonTRM138;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.core.MessageSendingOperations;
import org.springframework.stereotype.Repository;

@Repository
@ComponentScan(basePackages = {"com.vk"})
public class RepositoryWebsocketSecondCehBalonTRM138Impl extends RepositoryWebsocketRootImpl<DeviceModelSecondCehBalonTRM138> implements RepositoryWebsocketSecondCehBalonTRM138 {

    @Autowired
    public RepositoryWebsocketSecondCehBalonTRM138Impl(final MessageSendingOperations<String> messageSendingOperations){
        super(messageSendingOperations, "/topic/device-model-second-ceh-balon-trm138");
    }

}
