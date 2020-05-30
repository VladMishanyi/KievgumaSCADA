package com.vk.tasks;

import com.vk.entity.converter.DeviceToTableSecondCehKameraVulcan2MPR51;
import com.vk.entity.device.DeviceModelSecondCehKameraVulcan2MPR51;
import com.vk.entity.table.TableModelSecondCehKameraVulcan2MPR51;
import com.vk.service.data.SecondCehKameraVulcan2MPR51ServiceData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.core.MessageSendingOperations;
import org.springframework.stereotype.Component;

/**
 * Created by KIP-PC99 on 21.11.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.service.data", "com.vk.entity.converter"})
public class TaskImplSecondCehKameraVulcan2MPR51
        extends TaskImplRoot<Float,
        Float,
        SecondCehKameraVulcan2MPR51ServiceData,
        SecondCehKameraVulcan2MPR51ServiceData,
        DeviceModelSecondCehKameraVulcan2MPR51,
        DeviceModelSecondCehKameraVulcan2MPR51,
        TableModelSecondCehKameraVulcan2MPR51,
        DeviceToTableSecondCehKameraVulcan2MPR51> implements TaskSecondCehKameraVulcan2MPR51{

    private final MessageSendingOperations<String> messageSendingOperations;

    private final DeviceToTableSecondCehKameraVulcan2MPR51 deviceToTableSecondCehKameraVulcan2MPR51;

    private final SecondCehKameraVulcan2MPR51ServiceData secondCehKameraVulcan2MPR51ServiceData;

    private final String messageSecondCehKameraVulcan2MPR51ServiceDataTable = "/topic/secondCehKameraVulcan2MPR51_table";

    private final String messageSecondCehKameraVulcan2MPR51ServiceDataDevice1 = "/topic/secondCehKameraVulcan2MPR51_device1";

    @Autowired
    public TaskImplSecondCehKameraVulcan2MPR51(final MessageSendingOperations<String> messageSendingOperations,
                                               final DeviceToTableSecondCehKameraVulcan2MPR51 deviceToTableSecondCehKameraVulcan2MPR51,
                                               final SecondCehKameraVulcan2MPR51ServiceData secondCehKameraVulcan2MPR51ServiceData){
        super(messageSendingOperations, deviceToTableSecondCehKameraVulcan2MPR51, secondCehKameraVulcan2MPR51ServiceData);
        super.setMessage(messageSecondCehKameraVulcan2MPR51ServiceDataTable);
        super.setMessage1(messageSecondCehKameraVulcan2MPR51ServiceDataDevice1);
        this.messageSendingOperations = messageSendingOperations;
        this.secondCehKameraVulcan2MPR51ServiceData = secondCehKameraVulcan2MPR51ServiceData;
        this.deviceToTableSecondCehKameraVulcan2MPR51 = deviceToTableSecondCehKameraVulcan2MPR51;
    }
}
