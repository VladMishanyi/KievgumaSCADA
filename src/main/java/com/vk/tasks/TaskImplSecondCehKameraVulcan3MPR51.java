package com.vk.tasks;

import com.vk.entity.converter.DeviceToTableSecondCehKameraVulcan2MPR51;
import com.vk.entity.converter.DeviceToTableSecondCehKameraVulcan3MPR51;
import com.vk.entity.device.DeviceModelSecondCehKameraVulcan2MPR51;
import com.vk.entity.device.DeviceModelSecondCehKameraVulcan3MPR51;
import com.vk.entity.table.TableModelSecondCehKameraVulcan2MPR51;
import com.vk.entity.table.TableModelSecondCehKameraVulcan3MPR51;
import com.vk.service.data.SecondCehKameraVulcan2MPR51ServiceData;
import com.vk.service.data.SecondCehKameraVulcan3MPR51ServiceData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.messaging.core.MessageSendingOperations;
import org.springframework.stereotype.Component;

/**
 * Created by KIP-PC99 on 21.11.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.service.data", "com.vk.entity.converter"})
public class TaskImplSecondCehKameraVulcan3MPR51
        extends TaskImplRoot<Float,
        Float,
        SecondCehKameraVulcan3MPR51ServiceData,
        SecondCehKameraVulcan3MPR51ServiceData,
        DeviceModelSecondCehKameraVulcan3MPR51,
        DeviceModelSecondCehKameraVulcan3MPR51,
        TableModelSecondCehKameraVulcan3MPR51,
        DeviceToTableSecondCehKameraVulcan3MPR51> implements TaskSecondCehKameraVulcan3MPR51{

    private final MessageSendingOperations<String> messageSendingOperations;

    private final DeviceToTableSecondCehKameraVulcan3MPR51 deviceToTableSecondCehKameraVulcan3MPR51;

    private final SecondCehKameraVulcan3MPR51ServiceData secondCehKameraVulcan3MPR51ServiceData;

    private final String messageSecondCehKameraVulcan3MPR51ServiceDataTable = "/topic/secondCehKameraVulcan3MPR51_table";

    private final String messageSecondCehKameraVulcan3MPR51ServiceDataDevice1 = "/topic/secondCehKameraVulcan3MPR51_device1";

    @Autowired
    public TaskImplSecondCehKameraVulcan3MPR51(final MessageSendingOperations<String> messageSendingOperations,
                                               final DeviceToTableSecondCehKameraVulcan3MPR51 deviceToTableSecondCehKameraVulcan3MPR51,
                                               final SecondCehKameraVulcan3MPR51ServiceData secondCehKameraVulcan3MPR51ServiceData){
        super(messageSendingOperations, deviceToTableSecondCehKameraVulcan3MPR51, secondCehKameraVulcan3MPR51ServiceData);
        super.setMessage(messageSecondCehKameraVulcan3MPR51ServiceDataTable);
        super.setMessage1(messageSecondCehKameraVulcan3MPR51ServiceDataDevice1);
        this.messageSendingOperations = messageSendingOperations;
        this.secondCehKameraVulcan3MPR51ServiceData = secondCehKameraVulcan3MPR51ServiceData;
        this.deviceToTableSecondCehKameraVulcan3MPR51 = deviceToTableSecondCehKameraVulcan3MPR51;
    }
}
