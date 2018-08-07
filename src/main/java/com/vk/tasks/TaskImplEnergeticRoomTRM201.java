package com.vk.tasks;

import com.vk.entity.converter.DeviceToTableEnergeticRoomTRM201;
import com.vk.entity.converter.DeviceToTableImplEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelFirstCehSmesitel1MB110;
import com.vk.entity.table.TableModelEnergeticRoomTRM201;
import com.vk.service.data.EnergeticRoomTRM201ServiceData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.core.MessageSendingOperations;
import org.springframework.stereotype.Component;

/**
 * Created by KIP-PC99 on 03.08.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.service.data", "com.vk.entity.converter"})
public class TaskImplEnergeticRoomTRM201
        extends TaskImplRoot<Float,
        Float,
        EnergeticRoomTRM201ServiceData,
        EnergeticRoomTRM201ServiceData,
        DeviceModelEnergeticRoomTRM201,
        DeviceModelEnergeticRoomTRM201,
        TableModelEnergeticRoomTRM201,
        DeviceToTableEnergeticRoomTRM201> implements TaskEnergeticRoomTRM201{

    private MessageSendingOperations<String> messageSendingOperations;

    private DeviceToTableEnergeticRoomTRM201 deviceToTableEnergeticRoomTRM201;

    private EnergeticRoomTRM201ServiceData energeticRoomTRM201ServiceData;

    private final String messageThirdCehAutoclavTRM202 = "/topic/trm201";

    @Autowired
    public TaskImplEnergeticRoomTRM201(MessageSendingOperations<String> messageSendingOperations,
                                       DeviceToTableEnergeticRoomTRM201 deviceToTableEnergeticRoomTRM201,
                                       EnergeticRoomTRM201ServiceData energeticRoomTRM201ServiceData){
        super(messageSendingOperations, deviceToTableEnergeticRoomTRM201, energeticRoomTRM201ServiceData);
        super.setMessage(messageThirdCehAutoclavTRM202);
        this.messageSendingOperations = messageSendingOperations;
        this.energeticRoomTRM201ServiceData = energeticRoomTRM201ServiceData;
        this.deviceToTableEnergeticRoomTRM201 = deviceToTableEnergeticRoomTRM201;
    }
}
