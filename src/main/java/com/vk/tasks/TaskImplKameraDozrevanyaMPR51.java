package com.vk.tasks;

import com.vk.entity.converter.DeviceToTableFirstCehBuzulukTRM200;
import com.vk.entity.converter.DeviceToTableFirstCehKameraDozrevanyaMPR51;
import com.vk.entity.device.DeviceModelFirstCehBuzulukTRM200;
import com.vk.entity.device.DeviceModelFirstCehKameraDozrevanyaMPR51;
import com.vk.entity.device.DeviceModelFirstCehKameraDozrevanyaTRM138;
import com.vk.entity.table.TableModelFirstCehBuzulukTRM200;
import com.vk.entity.table.TableModelFirstCehKameraDozrevanyaMPR51;
import com.vk.service.data.FirstCehBuzulukTRM200ServiceData;
import com.vk.service.data.KameraDozrevanyaMPR51ServiceData;
import com.vk.service.data.KameraDozrevanyaTRM138ServiceData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.core.MessageSendingOperations;
import org.springframework.stereotype.Component;

/**
 * Created by KIP-PC99 on 06.08.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.service.data", "com.vk.entity.converter"})
public class TaskImplKameraDozrevanyaMPR51
        extends TaskImplRoot<Float,
        Float,
        KameraDozrevanyaMPR51ServiceData,
        KameraDozrevanyaTRM138ServiceData,
        DeviceModelFirstCehKameraDozrevanyaMPR51,
        DeviceModelFirstCehKameraDozrevanyaTRM138,
        TableModelFirstCehKameraDozrevanyaMPR51,
        DeviceToTableFirstCehKameraDozrevanyaMPR51> implements TaskKameraDozrevanyaMPR51{

    private MessageSendingOperations<String> messageSendingOperations;

    private DeviceToTableFirstCehKameraDozrevanyaMPR51 deviceToTableFirstCehKameraDozrevanyaMPR51;

    private KameraDozrevanyaMPR51ServiceData kameraDozrevanyaMPR51ServiceData;

    private KameraDozrevanyaTRM138ServiceData kameraDozrevanyaTRM138ServiceData;

    private final String messageKameraDozrevanyaMPR51 = "/topic/firstCehKameraDozrevanya";

    @Autowired
    public TaskImplKameraDozrevanyaMPR51(MessageSendingOperations<String> messageSendingOperations,
                                         DeviceToTableFirstCehKameraDozrevanyaMPR51 deviceToTableFirstCehKameraDozrevanyaMPR51,
                                         KameraDozrevanyaMPR51ServiceData kameraDozrevanyaMPR51ServiceData,
                                         KameraDozrevanyaTRM138ServiceData kameraDozrevanyaTRM138ServiceData){
        super(messageSendingOperations, deviceToTableFirstCehKameraDozrevanyaMPR51, kameraDozrevanyaMPR51ServiceData, kameraDozrevanyaTRM138ServiceData);
        super.setMessage(messageKameraDozrevanyaMPR51);
        this.messageSendingOperations = messageSendingOperations;
        this.kameraDozrevanyaMPR51ServiceData = kameraDozrevanyaMPR51ServiceData;
        this.kameraDozrevanyaTRM138ServiceData = kameraDozrevanyaTRM138ServiceData;
        this.deviceToTableFirstCehKameraDozrevanyaMPR51 = deviceToTableFirstCehKameraDozrevanyaMPR51;
    }
}
