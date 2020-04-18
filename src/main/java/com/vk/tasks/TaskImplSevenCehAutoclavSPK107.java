package com.vk.tasks;

import com.vk.entity.converter.DeviceToTableSevenCehAutoclavSPK107;
import com.vk.entity.device.DeviceModelSevenCehAutoclavSPK107;
import com.vk.entity.table.TableModelSevenCehAutoclavSPK107;
import com.vk.service.data.SevenCehAutoclavSPK107ServiceData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.core.MessageSendingOperations;
import org.springframework.stereotype.Component;

/**
 * Created by KIP-PC99 on 06.08.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.service.data", "com.vk.entity.converter"})
public class TaskImplSevenCehAutoclavSPK107
        extends TaskImplRoot<Float,
        Float,
        SevenCehAutoclavSPK107ServiceData,
        SevenCehAutoclavSPK107ServiceData,
        DeviceModelSevenCehAutoclavSPK107,
        DeviceModelSevenCehAutoclavSPK107,
        TableModelSevenCehAutoclavSPK107,
        DeviceToTableSevenCehAutoclavSPK107> implements TaskSevenCehAutoclavSPK107{

    private final MessageSendingOperations<String> messageSendingOperations;

    private final DeviceToTableSevenCehAutoclavSPK107 deviceToTableSevenCehAutoclavSPK107;

    private final SevenCehAutoclavSPK107ServiceData sevenCehAutoclavSPK107ServiceData;

    private final String messageSevenCehAutoclavSPK107 = "/topic/sevenCehAutoclav";

    @Autowired
    public TaskImplSevenCehAutoclavSPK107(final MessageSendingOperations<String> messageSendingOperations,
                                          final DeviceToTableSevenCehAutoclavSPK107 deviceToTableSevenCehAutoclavSPK107,
                                          final SevenCehAutoclavSPK107ServiceData sevenCehAutoclavSPK107ServiceData){
        super(messageSendingOperations, deviceToTableSevenCehAutoclavSPK107, sevenCehAutoclavSPK107ServiceData);
        super.setMessage(messageSevenCehAutoclavSPK107);
        this.messageSendingOperations = messageSendingOperations;
        this.sevenCehAutoclavSPK107ServiceData = sevenCehAutoclavSPK107ServiceData;
        this.deviceToTableSevenCehAutoclavSPK107 = deviceToTableSevenCehAutoclavSPK107;
    }

}
