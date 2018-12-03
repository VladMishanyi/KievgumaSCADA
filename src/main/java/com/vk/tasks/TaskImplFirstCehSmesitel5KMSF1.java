package com.vk.tasks;

import com.vk.entity.converter.DeviceToTableFirstCehSmesitel3KMSF1;
import com.vk.entity.converter.DeviceToTableFirstCehSmesitel5KMSF1;
import com.vk.entity.device.DeviceModelFirstCehSmesitel3KMSF1;
import com.vk.entity.device.DeviceModelFirstCehSmesitel3MB110;
import com.vk.entity.device.DeviceModelFirstCehSmesitel5KMSF1;
import com.vk.entity.device.DeviceModelFirstCehSmesitel5MB110;
import com.vk.entity.table.TableModelFirstCehSmesitel3KMSF1;
import com.vk.entity.table.TableModelFirstCehSmesitel5KMSF1;
import com.vk.service.data.FirstCehSmesitel3KMSF1ServiceData;
import com.vk.service.data.FirstCehSmesitel3MB110ServiceData;
import com.vk.service.data.FirstCehSmesitel5KMSF1ServiceData;
import com.vk.service.data.FirstCehSmesitel5MB110ServiceData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.messaging.core.MessageSendingOperations;
import org.springframework.stereotype.Component;

/**
 * Created by KIP-PC99 on 06.08.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.service.data", "com.vk.entity.converter"})
public class TaskImplFirstCehSmesitel5KMSF1
        extends TaskImplRoot<Integer,
        Float,
        FirstCehSmesitel5KMSF1ServiceData,
        FirstCehSmesitel5MB110ServiceData,
        DeviceModelFirstCehSmesitel5KMSF1,
        DeviceModelFirstCehSmesitel5MB110,
        TableModelFirstCehSmesitel5KMSF1,
        DeviceToTableFirstCehSmesitel5KMSF1> implements TaskFirstCehSmesitel5KMSF1{

    private final MessageSendingOperations<String> messageSendingOperations;

    private final DeviceToTableFirstCehSmesitel5KMSF1 deviceToTableFirstCehSmesitel5KMSF1;

    private final FirstCehSmesitel5KMSF1ServiceData firstCehSmesitel5KMSF1ServiceData;

    private final FirstCehSmesitel5MB110ServiceData firstCehSmesitel5MB110ServiceData;

    private final String messageFirstCehSmesitel5KMSF1 = "/topic/firstCehSmesitel5KMSF1";

    @Autowired
    public TaskImplFirstCehSmesitel5KMSF1(final MessageSendingOperations<String> messageSendingOperations,
                                          final DeviceToTableFirstCehSmesitel5KMSF1 deviceToTableFirstCehSmesitel5KMSF1,
                                          final FirstCehSmesitel5KMSF1ServiceData firstCehSmesitel5KMSF1ServiceData,
                                          final FirstCehSmesitel5MB110ServiceData firstCehSmesitel5MB110ServiceData){
        super(messageSendingOperations, deviceToTableFirstCehSmesitel5KMSF1, firstCehSmesitel5KMSF1ServiceData, firstCehSmesitel5MB110ServiceData);
        super.setMessage(messageFirstCehSmesitel5KMSF1);
        this.messageSendingOperations = messageSendingOperations;
        this.deviceToTableFirstCehSmesitel5KMSF1 = deviceToTableFirstCehSmesitel5KMSF1;
        this.firstCehSmesitel5KMSF1ServiceData = firstCehSmesitel5KMSF1ServiceData;
        this.firstCehSmesitel5MB110ServiceData = firstCehSmesitel5MB110ServiceData;
    }
}
