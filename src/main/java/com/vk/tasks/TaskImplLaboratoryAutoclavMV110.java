package com.vk.tasks;

import com.vk.entity.converter.DeviceToTableLaboratoryAutoclavMV110;
import com.vk.entity.device.DeviceModelLaboratoryAutoclavMV110;
import com.vk.entity.table.TableModelLaboratoryAutoclavMV110;
import com.vk.service.data.LaboratoryAutoclavMV110ServiceData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.core.MessageSendingOperations;
import org.springframework.stereotype.Component;

/**
 * Created by KIP-PC99 on 06.08.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.service.data", "com.vk.entity.converter"})
public class TaskImplLaboratoryAutoclavMV110
        extends TaskImplRoot<Float,
        Float,
        LaboratoryAutoclavMV110ServiceData,
        LaboratoryAutoclavMV110ServiceData,
        DeviceModelLaboratoryAutoclavMV110,
        DeviceModelLaboratoryAutoclavMV110,
        TableModelLaboratoryAutoclavMV110,
        DeviceToTableLaboratoryAutoclavMV110> implements TaskLaboratoryAutoclavMV110{

    private final MessageSendingOperations<String> messageSendingOperations;

    private final DeviceToTableLaboratoryAutoclavMV110 deviceToTableLaboratoryAutoclavMV110;

    private final LaboratoryAutoclavMV110ServiceData laboratoryAutoclavMV110ServiceData;

    private final String messageLaboratoryAutoclavMV110 = "/topic/laboratoryAvtoclav";

    @Autowired
    public TaskImplLaboratoryAutoclavMV110(final MessageSendingOperations<String> messageSendingOperations,
                                           final DeviceToTableLaboratoryAutoclavMV110 deviceToTableLaboratoryAutoclavMV110,
                                           final LaboratoryAutoclavMV110ServiceData laboratoryAutoclavMV110ServiceData){
        super(messageSendingOperations, deviceToTableLaboratoryAutoclavMV110, laboratoryAutoclavMV110ServiceData);
        super.setMessage(messageLaboratoryAutoclavMV110);
        this.messageSendingOperations = messageSendingOperations;
        this.laboratoryAutoclavMV110ServiceData = laboratoryAutoclavMV110ServiceData;
        this.deviceToTableLaboratoryAutoclavMV110 = deviceToTableLaboratoryAutoclavMV110;
    }

}
