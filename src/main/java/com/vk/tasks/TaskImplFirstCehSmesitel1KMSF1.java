package com.vk.tasks;

import com.vk.entity.converter.DeviceToTableFirstCehSmesitel1KMSF1;
import com.vk.entity.converter.DeviceToTableThirdCehAutoclavTRM202;
import com.vk.entity.device.DeviceModelFirstCehSmesitel1KMSF1;
import com.vk.entity.device.DeviceModelFirstCehSmesitel1MB110;
import com.vk.entity.device.DeviceModelThirdCehAutoclavTRM202;
import com.vk.entity.table.TableModelFirstCehSmesitel1KMSF1;
import com.vk.entity.table.TableModelThirdCehAutoclavTRM202;
import com.vk.service.data.FirstCehSmesitel1KMSF1ServiceData;
import com.vk.service.data.FirstCehSmesitel1MB110ServiceData;
import com.vk.service.data.ThirdCehAutoclavTRM202ServiceData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.core.MessageSendingOperations;
import org.springframework.stereotype.Component;

/**
 * Created by KIP-PC99 on 06.08.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.service.data", "com.vk.entity.converter"})
public class TaskImplFirstCehSmesitel1KMSF1
        extends TaskImplRoot<Integer,
        Float,
        FirstCehSmesitel1KMSF1ServiceData,
        FirstCehSmesitel1MB110ServiceData,
        DeviceModelFirstCehSmesitel1KMSF1,
        DeviceModelFirstCehSmesitel1MB110,
        TableModelFirstCehSmesitel1KMSF1,
        DeviceToTableFirstCehSmesitel1KMSF1> implements TaskFirstCehSmesitel1KMSF1{

    private final MessageSendingOperations<String> messageSendingOperations;

    private final DeviceToTableFirstCehSmesitel1KMSF1 deviceToTableFirstCehSmesitel1KMSF1;

    private final FirstCehSmesitel1KMSF1ServiceData firstCehSmesitel1KMSF1ServiceData;

    private final FirstCehSmesitel1MB110ServiceData firstCehSmesitel1MB110ServiceData;

    private final String messageFirstCehSmesitel1KMSF1 = "/topic/firstCehSmesitel1KMSF1";

    @Autowired
    public TaskImplFirstCehSmesitel1KMSF1(final MessageSendingOperations<String> messageSendingOperations,
                                          final DeviceToTableFirstCehSmesitel1KMSF1 deviceToTableFirstCehSmesitel1KMSF1,
                                          final FirstCehSmesitel1KMSF1ServiceData firstCehSmesitel1KMSF1ServiceData,
                                          final FirstCehSmesitel1MB110ServiceData firstCehSmesitel1MB110ServiceData){
        super(messageSendingOperations, deviceToTableFirstCehSmesitel1KMSF1, firstCehSmesitel1KMSF1ServiceData, firstCehSmesitel1MB110ServiceData);
        super.setMessage(messageFirstCehSmesitel1KMSF1);
        this.messageSendingOperations = messageSendingOperations;
        this.deviceToTableFirstCehSmesitel1KMSF1 = deviceToTableFirstCehSmesitel1KMSF1;
        this.firstCehSmesitel1KMSF1ServiceData = firstCehSmesitel1KMSF1ServiceData;
        this.firstCehSmesitel1MB110ServiceData = firstCehSmesitel1MB110ServiceData;
    }
}
