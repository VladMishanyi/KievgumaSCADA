package com.vk.tasks;

import com.vk.entity.converter.DeviceToTableFirstCehSmesitel3KMSF1;
import com.vk.entity.converter.DeviceToTableFirstCehSmesitel4KMSF1;
import com.vk.entity.device.DeviceModelFirstCehSmesitel3KMSF1;
import com.vk.entity.device.DeviceModelFirstCehSmesitel3MB110;
import com.vk.entity.device.DeviceModelFirstCehSmesitel4KMSF1;
import com.vk.entity.device.DeviceModelFirstCehSmesitel4MB110;
import com.vk.entity.table.TableModelFirstCehSmesitel3KMSF1;
import com.vk.entity.table.TableModelFirstCehSmesitel4KMSF1;
import com.vk.service.data.FirstCehSmesitel3KMSF1ServiceData;
import com.vk.service.data.FirstCehSmesitel3MB110ServiceData;
import com.vk.service.data.FirstCehSmesitel4KMSF1ServiceData;
import com.vk.service.data.FirstCehSmesitel4MB110ServiceData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.core.MessageSendingOperations;
import org.springframework.stereotype.Component;

/**
 * Created by KIP-PC99 on 06.08.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.service.data", "com.vk.entity.converter"})
public class TaskImplFirstCehSmesitel4KMSF1
        extends TaskImplRoot<Integer,
        Float,
        FirstCehSmesitel4KMSF1ServiceData,
        FirstCehSmesitel4MB110ServiceData,
        DeviceModelFirstCehSmesitel4KMSF1,
        DeviceModelFirstCehSmesitel4MB110,
        TableModelFirstCehSmesitel4KMSF1,
        DeviceToTableFirstCehSmesitel4KMSF1> implements TaskFirstCehSmesitel4KMSF1{

    private final MessageSendingOperations<String> messageSendingOperations;

    private final DeviceToTableFirstCehSmesitel4KMSF1 deviceToTableFirstCehSmesitel4KMSF1;

    private final FirstCehSmesitel4KMSF1ServiceData firstCehSmesitel4KMSF1ServiceData;

    private final FirstCehSmesitel4MB110ServiceData firstCehSmesitel4MB110ServiceData;

    private final String messageFirstCehSmesitel4KMSF1 = "/topic/firstCehSmesitel4KMSF1";

    @Autowired
    public TaskImplFirstCehSmesitel4KMSF1(final MessageSendingOperations<String> messageSendingOperations,
                                          final DeviceToTableFirstCehSmesitel4KMSF1 deviceToTableFirstCehSmesitel4KMSF1,
                                          final FirstCehSmesitel4KMSF1ServiceData firstCehSmesitel4KMSF1ServiceData,
                                          final FirstCehSmesitel4MB110ServiceData firstCehSmesitel4MB110ServiceData){
        super(messageSendingOperations, deviceToTableFirstCehSmesitel4KMSF1, firstCehSmesitel4KMSF1ServiceData, firstCehSmesitel4MB110ServiceData);
        super.setMessage(messageFirstCehSmesitel4KMSF1);
        this.messageSendingOperations = messageSendingOperations;
        this.deviceToTableFirstCehSmesitel4KMSF1 = deviceToTableFirstCehSmesitel4KMSF1;
        this.firstCehSmesitel4KMSF1ServiceData = firstCehSmesitel4KMSF1ServiceData;
        this.firstCehSmesitel4MB110ServiceData = firstCehSmesitel4MB110ServiceData;
    }
}
