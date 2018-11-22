package com.vk.tasks;

import com.vk.entity.converter.DeviceToTableFirstCehAutoclavTRM202;
import com.vk.entity.converter.DeviceToTableSecondCehKameraVulcan1MPR51;
import com.vk.entity.device.DeviceModelFirstCehAutoclavTRM202;
import com.vk.entity.device.DeviceModelSecondCehKameraVulcan1MPR51;
import com.vk.entity.table.TableModelFirstCehAutoclavTRM202;
import com.vk.entity.table.TableModelSecondCehKameraVulcan1MPR51;
import com.vk.service.data.FirstCehAutoclavTRM202ServiceData;
import com.vk.service.data.SecondCehKameraVulcan1MPR51ServiceData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.core.MessageSendingOperations;
import org.springframework.stereotype.Component;

/**
 * Created by KIP-PC99 on 21.11.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.service.data", "com.vk.entity.converter"})
public class TaskImplSecondCehKameraVulcan1MPR51
        extends TaskImplRoot<Float,
        Float,
        SecondCehKameraVulcan1MPR51ServiceData,
        SecondCehKameraVulcan1MPR51ServiceData,
        DeviceModelSecondCehKameraVulcan1MPR51,
        DeviceModelSecondCehKameraVulcan1MPR51,
        TableModelSecondCehKameraVulcan1MPR51,
        DeviceToTableSecondCehKameraVulcan1MPR51> implements TaskSecondCehKameraVulcan1MPR51{

    private final MessageSendingOperations<String> messageSendingOperations;

    private final DeviceToTableSecondCehKameraVulcan1MPR51 deviceToTableSecondCehKameraVulcan1MPR51;

    private final SecondCehKameraVulcan1MPR51ServiceData secondCehKameraVulcan1MPR51ServiceData;

    private final String messageSecondCehKameraVulcan1MPR51ServiceData = "/topic/secondCehKameraVulcan1MPR51";

    @Autowired
    public TaskImplSecondCehKameraVulcan1MPR51(final MessageSendingOperations<String> messageSendingOperations,
                                               final DeviceToTableSecondCehKameraVulcan1MPR51 deviceToTableSecondCehKameraVulcan1MPR51,
                                               final SecondCehKameraVulcan1MPR51ServiceData secondCehKameraVulcan1MPR51ServiceData){
        super(messageSendingOperations, deviceToTableSecondCehKameraVulcan1MPR51, secondCehKameraVulcan1MPR51ServiceData);
        super.setMessage(messageSecondCehKameraVulcan1MPR51ServiceData);
        this.messageSendingOperations = messageSendingOperations;
        this.secondCehKameraVulcan1MPR51ServiceData = secondCehKameraVulcan1MPR51ServiceData;
        this.deviceToTableSecondCehKameraVulcan1MPR51 = deviceToTableSecondCehKameraVulcan1MPR51;
    }
}