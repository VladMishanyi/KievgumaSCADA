package com.vk.tasks;

import com.vk.entity.converter.DeviceToTableFirstCehAutoclavTRM202;
import com.vk.entity.converter.DeviceToTableFirstCehBuzulukTRM200;
import com.vk.entity.device.DeviceModelFirstCehAutoclavTRM202;
import com.vk.entity.device.DeviceModelFirstCehBuzulukTRM200;
import com.vk.entity.table.TableModelFirstCehAutoclavTRM202;
import com.vk.entity.table.TableModelFirstCehBuzulukTRM200;
import com.vk.service.data.FirstCehAutoclavTRM202ServiceData;
import com.vk.service.data.FirstCehBuzulukTRM200ServiceData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.core.MessageSendingOperations;
import org.springframework.stereotype.Component;

/**
 * Created by KIP-PC99 on 06.08.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.service.data", "com.vk.entity.converter"})
public class TaskImplFirstCehBuzulukTRM200
        extends TaskImplRoot<Float,
        Float,
        FirstCehBuzulukTRM200ServiceData,
        FirstCehBuzulukTRM200ServiceData,
        DeviceModelFirstCehBuzulukTRM200,
        DeviceModelFirstCehBuzulukTRM200,
        TableModelFirstCehBuzulukTRM200,
        DeviceToTableFirstCehBuzulukTRM200> implements TaskFirstCehBuzulukTRM200{

    private final MessageSendingOperations<String> messageSendingOperations;

    private final DeviceToTableFirstCehBuzulukTRM200 deviceToTableFirstCehBuzulukTRM200;

    private final FirstCehBuzulukTRM200ServiceData firstCehBuzulukTRM200ServiceData;

    private final String messageFirstCehBuzulukTRM200 = "/topic/firstCehBuzuluk";

    @Autowired
    public TaskImplFirstCehBuzulukTRM200(final MessageSendingOperations<String> messageSendingOperations,
                                         final DeviceToTableFirstCehBuzulukTRM200 deviceToTableFirstCehBuzulukTRM200,
                                         final FirstCehBuzulukTRM200ServiceData firstCehBuzulukTRM200ServiceData){
        super(messageSendingOperations, deviceToTableFirstCehBuzulukTRM200, firstCehBuzulukTRM200ServiceData);
        super.setMessage(messageFirstCehBuzulukTRM200);
        this.messageSendingOperations = messageSendingOperations;
        this.firstCehBuzulukTRM200ServiceData = firstCehBuzulukTRM200ServiceData;
        this.deviceToTableFirstCehBuzulukTRM200 = deviceToTableFirstCehBuzulukTRM200;
    }
}
