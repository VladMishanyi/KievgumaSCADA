package com.vk.tasks;

import com.vk.entity.converter.DeviceToTableFirstCehKameraDozrevanyaMPR51;
import com.vk.entity.converter.DeviceToTableLaboratoryAutoclavMV110;
import com.vk.entity.device.DeviceModelFirstCehKameraDozrevanyaMPR51;
import com.vk.entity.device.DeviceModelLaboratoryAutoclavMV110;
import com.vk.entity.table.TableModelFirstCehKameraDozrevanyaMPR51;
import com.vk.entity.table.TableModelLaboratoryAutoclavMV110;
import com.vk.service.data.KameraDozrevanyaMPR51ServiceData;
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

    private MessageSendingOperations<String> messageSendingOperations;

    private DeviceToTableLaboratoryAutoclavMV110 deviceToTableLaboratoryAutoclavMV110;

    private LaboratoryAutoclavMV110ServiceData laboratoryAutoclavMV110ServiceData;

    private final String messageLaboratoryAutoclavMV110 = "/topic/laboratoryAvtoclav";

    @Autowired
    public TaskImplLaboratoryAutoclavMV110(MessageSendingOperations<String> messageSendingOperations,
                                         DeviceToTableLaboratoryAutoclavMV110 deviceToTableLaboratoryAutoclavMV110,
                                         LaboratoryAutoclavMV110ServiceData laboratoryAutoclavMV110ServiceData){
        super(messageSendingOperations, deviceToTableLaboratoryAutoclavMV110, laboratoryAutoclavMV110ServiceData);
        super.setMessage(messageLaboratoryAutoclavMV110);
        this.messageSendingOperations = messageSendingOperations;
        this.laboratoryAutoclavMV110ServiceData = laboratoryAutoclavMV110ServiceData;
        this.deviceToTableLaboratoryAutoclavMV110 = deviceToTableLaboratoryAutoclavMV110;
    }

}
