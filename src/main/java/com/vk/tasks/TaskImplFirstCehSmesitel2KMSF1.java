package com.vk.tasks;

import com.vk.entity.converter.DeviceToTableFirstCehSmesitel1KMSF1;
import com.vk.entity.converter.DeviceToTableFirstCehSmesitel2KMSF1;
import com.vk.entity.device.DeviceModelFirstCehSmesitel1KMSF1;
import com.vk.entity.device.DeviceModelFirstCehSmesitel1MB110;
import com.vk.entity.device.DeviceModelFirstCehSmesitel2KMSF1;
import com.vk.entity.device.DeviceModelFirstCehSmesitel2MB110;
import com.vk.entity.table.TableModelFirstCehSmesitel1KMSF1;
import com.vk.entity.table.TableModelFirstCehSmesitel2KMSF1;
import com.vk.service.data.FirstCehSmesitel1KMSF1ServiceData;
import com.vk.service.data.FirstCehSmesitel1MB110ServiceData;
import com.vk.service.data.FirstCehSmesitel2KMSF1ServiceData;
import com.vk.service.data.FirstCehSmesitel2MB110ServiceData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.core.MessageSendingOperations;
import org.springframework.stereotype.Component;

/**
 * Created by KIP-PC99 on 06.08.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.service.data", "com.vk.entity.converter"})
public class TaskImplFirstCehSmesitel2KMSF1
        extends TaskImplRoot<Integer,
        Float,
        FirstCehSmesitel2KMSF1ServiceData,
        FirstCehSmesitel2MB110ServiceData,
        DeviceModelFirstCehSmesitel2KMSF1,
        DeviceModelFirstCehSmesitel2MB110,
        TableModelFirstCehSmesitel2KMSF1,
        DeviceToTableFirstCehSmesitel2KMSF1> implements TaskFirstCehSmesitel2KMSF1{

    private MessageSendingOperations<String> messageSendingOperations;

    private DeviceToTableFirstCehSmesitel2KMSF1 deviceToTableFirstCehSmesitel2KMSF1;

    private FirstCehSmesitel2KMSF1ServiceData firstCehSmesitel2KMSF1ServiceData;

    private FirstCehSmesitel2MB110ServiceData firstCehSmesitel2MB110ServiceData;

    private final String messageFirstCehSmesitel2KMSF1 = "/topic/firstCehSmesitel2KMSF1";

    @Autowired
    public TaskImplFirstCehSmesitel2KMSF1(MessageSendingOperations<String> messageSendingOperations,
                                          DeviceToTableFirstCehSmesitel2KMSF1 deviceToTableFirstCehSmesitel2KMSF1,
                                          FirstCehSmesitel2KMSF1ServiceData firstCehSmesitel2KMSF1ServiceData,
                                          FirstCehSmesitel2MB110ServiceData firstCehSmesitel2MB110ServiceData){
        super(messageSendingOperations, deviceToTableFirstCehSmesitel2KMSF1, firstCehSmesitel2KMSF1ServiceData, firstCehSmesitel2MB110ServiceData);
        super.setMessage(messageFirstCehSmesitel2KMSF1);
        this.messageSendingOperations = messageSendingOperations;
        this.deviceToTableFirstCehSmesitel2KMSF1 = deviceToTableFirstCehSmesitel2KMSF1;
        this.firstCehSmesitel2KMSF1ServiceData = firstCehSmesitel2KMSF1ServiceData;
        this.firstCehSmesitel2MB110ServiceData = firstCehSmesitel2MB110ServiceData;
    }
}