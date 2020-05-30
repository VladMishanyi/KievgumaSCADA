package com.vk.tasks;

import com.vk.entity.converter.DeviceToTableFirstCehAutoclavTRM202;
import com.vk.entity.device.DeviceModelFirstCehAutoclavTRM202;
import com.vk.entity.table.TableModelFirstCehAutoclavTRM202;
import com.vk.service.data.FirstCehAutoclavTRM202ServiceData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.core.MessageSendingOperations;
import org.springframework.stereotype.Component;

/**
 * Created by KIP-PC99 on 06.08.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.service.data", "com.vk.entity.converter"})
public class TaskImplFirstCehAutoclavTRM202
        extends TaskImplRoot<Float,
        Float,
        FirstCehAutoclavTRM202ServiceData,
        FirstCehAutoclavTRM202ServiceData,
        DeviceModelFirstCehAutoclavTRM202,
        DeviceModelFirstCehAutoclavTRM202,
        TableModelFirstCehAutoclavTRM202,
        DeviceToTableFirstCehAutoclavTRM202> implements TaskFirstCehAutoclavTRM202{

    private final MessageSendingOperations<String> messageSendingOperations;

    private final DeviceToTableFirstCehAutoclavTRM202 deviceToTableFirstCehAutoclavTRM202;

    private final FirstCehAutoclavTRM202ServiceData firstCehAutoclavTRM202ServiceData;

    private final String messageFirstCehAutoclavTRM202 = "/topic/firstCehAvtoclav";

    @Autowired
    public TaskImplFirstCehAutoclavTRM202(final MessageSendingOperations<String> messageSendingOperations,
                                          final DeviceToTableFirstCehAutoclavTRM202 deviceToTableFirstCehAutoclavTRM202,
                                          final FirstCehAutoclavTRM202ServiceData firstCehAutoclavTRM202ServiceData){
        super(messageSendingOperations, deviceToTableFirstCehAutoclavTRM202, firstCehAutoclavTRM202ServiceData);
        super.setMessage(messageFirstCehAutoclavTRM202);
        this.messageSendingOperations = messageSendingOperations;
        this.firstCehAutoclavTRM202ServiceData = firstCehAutoclavTRM202ServiceData;
        this.deviceToTableFirstCehAutoclavTRM202 = deviceToTableFirstCehAutoclavTRM202;
    }
}
