package com.vk.tasks;

import com.vk.entity.converter.DeviceToTableFirstCehSmesitel2KMSF1;
import com.vk.entity.converter.DeviceToTableFirstCehSmesitel3KMSF1;
import com.vk.entity.device.DeviceModelFirstCehSmesitel2KMSF1;
import com.vk.entity.device.DeviceModelFirstCehSmesitel2MB110;
import com.vk.entity.device.DeviceModelFirstCehSmesitel3KMSF1;
import com.vk.entity.device.DeviceModelFirstCehSmesitel3MB110;
import com.vk.entity.table.TableModelFirstCehSmesitel2KMSF1;
import com.vk.entity.table.TableModelFirstCehSmesitel3KMSF1;
import com.vk.service.data.FirstCehSmesitel2KMSF1ServiceData;
import com.vk.service.data.FirstCehSmesitel2MB110ServiceData;
import com.vk.service.data.FirstCehSmesitel3KMSF1ServiceData;
import com.vk.service.data.FirstCehSmesitel3MB110ServiceData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.core.MessageSendingOperations;
import org.springframework.stereotype.Component;

/**
 * Created by KIP-PC99 on 06.08.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.service.data", "com.vk.entity.converter"})
public class TaskImplFirstCehSmesitel3KMSF1
        extends TaskImplRoot<Integer,
        Float,
        FirstCehSmesitel3KMSF1ServiceData,
        FirstCehSmesitel3MB110ServiceData,
        DeviceModelFirstCehSmesitel3KMSF1,
        DeviceModelFirstCehSmesitel3MB110,
        TableModelFirstCehSmesitel3KMSF1,
        DeviceToTableFirstCehSmesitel3KMSF1> implements TaskFirstCehSmesitel3KMSF1{

    private MessageSendingOperations<String> messageSendingOperations;

    private DeviceToTableFirstCehSmesitel3KMSF1 deviceToTableFirstCehSmesitel3KMSF1;

    private FirstCehSmesitel3KMSF1ServiceData firstCehSmesitel3KMSF1ServiceData;

    private FirstCehSmesitel3MB110ServiceData firstCehSmesitel3MB110ServiceData;

    private final String messageFirstCehSmesitel3KMSF1 = "/topic/firstCehSmesitel3KMSF1";

    @Autowired
    public TaskImplFirstCehSmesitel3KMSF1(MessageSendingOperations<String> messageSendingOperations,
                                          DeviceToTableFirstCehSmesitel3KMSF1 deviceToTableFirstCehSmesitel3KMSF1,
                                          FirstCehSmesitel3KMSF1ServiceData firstCehSmesitel3KMSF1ServiceData,
                                          FirstCehSmesitel3MB110ServiceData firstCehSmesitel3MB110ServiceData){
        super(messageSendingOperations, deviceToTableFirstCehSmesitel3KMSF1, firstCehSmesitel3KMSF1ServiceData, firstCehSmesitel3MB110ServiceData);
        super.setMessage(messageFirstCehSmesitel3KMSF1);
        this.messageSendingOperations = messageSendingOperations;
        this.deviceToTableFirstCehSmesitel3KMSF1 = deviceToTableFirstCehSmesitel3KMSF1;
        this.firstCehSmesitel3KMSF1ServiceData = firstCehSmesitel3KMSF1ServiceData;
        this.firstCehSmesitel3MB110ServiceData = firstCehSmesitel3MB110ServiceData;
    }
}
