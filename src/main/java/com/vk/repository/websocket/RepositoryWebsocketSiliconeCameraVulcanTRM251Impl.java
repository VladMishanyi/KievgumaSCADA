package com.vk.repository.websocket;

import com.vk.entity.device.DeviceModelSecondCehBalonTRM138;
import com.vk.entity.device.DeviceModelSiliconCameraVulkanTRM251;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.core.MessageSendingOperations;
import org.springframework.stereotype.Repository;

@Repository
@ComponentScan(basePackages = {"com.vk"})
public class RepositoryWebsocketSiliconeCameraVulcanTRM251Impl extends RepositoryWebsocketRootImpl<DeviceModelSiliconCameraVulkanTRM251> implements RepositoryWebsocketSiliconCameraVulcanTRM251 {

    @Autowired
    public RepositoryWebsocketSiliconeCameraVulcanTRM251Impl(final MessageSendingOperations<String> messageSendingOperations){
        super(messageSendingOperations, "/topic/device-model-silicon-camera-vulcan-trm251");
    }

}
