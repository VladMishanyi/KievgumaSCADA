package com.vk.tasks;

import com.vk.entity.converter.DeviceToTableEnergeticRoomTRM201;
import com.vk.entity.converter.DeviceToTableImplEnergeticRoomTRM201;
import com.vk.entity.converter.DeviceToTableImplThirdCehAutoclavTRM202;
import com.vk.entity.converter.DeviceToTableThirdCehAutoclavTRM202;
import com.vk.entity.device.DeviceModelEnergeticRoomTRM201;
import com.vk.entity.device.DeviceModelFirstCehSmesitel1MB110;
import com.vk.entity.device.DeviceModelThirdCehAutoclavTRM202;
import com.vk.entity.table.TableModelEnergeticRoomTRM201;
import com.vk.entity.table.TableModelThirdCehAutoclavTRM202;
import com.vk.service.data.EnergeticRoomTRM201ServiceData;
import com.vk.service.data.ThirdCehAutoclavTRM202ServiceData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.core.MessageSendingOperations;
import org.springframework.stereotype.Component;

/**
 * Created by KIP-PC99 on 06.08.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.service.data", "com.vk.entity.converter"})
public class TaskImplThirdCehAutoclavTRM202
        extends TaskImplRoot<Float,
        Float,
        ThirdCehAutoclavTRM202ServiceData,
        ThirdCehAutoclavTRM202ServiceData,
        DeviceModelThirdCehAutoclavTRM202,
        DeviceModelThirdCehAutoclavTRM202,
        TableModelThirdCehAutoclavTRM202,
        DeviceToTableThirdCehAutoclavTRM202> implements TaskThirdCehAutoclavTRM202{

    private MessageSendingOperations<String> messageSendingOperations;

    private DeviceToTableThirdCehAutoclavTRM202 deviceToTableThirdCehAutoclavTRM202;

    private ThirdCehAutoclavTRM202ServiceData thirdCehAutoclavTRM202ServiceData;

    private final String messageThirdCehAutoclavTRM202 = "/topic/thirdCehAvtoclav";

    @Autowired
    public TaskImplThirdCehAutoclavTRM202(MessageSendingOperations<String> messageSendingOperations,
                                          DeviceToTableThirdCehAutoclavTRM202 deviceToTableThirdCehAutoclavTRM202,
                                          ThirdCehAutoclavTRM202ServiceData thirdCehAutoclavTRM202ServiceData){
        super(messageSendingOperations, deviceToTableThirdCehAutoclavTRM202, thirdCehAutoclavTRM202ServiceData);
        super.setMessage(messageThirdCehAutoclavTRM202);
        this.messageSendingOperations = messageSendingOperations;
        this.thirdCehAutoclavTRM202ServiceData = thirdCehAutoclavTRM202ServiceData;
        this.deviceToTableThirdCehAutoclavTRM202 = deviceToTableThirdCehAutoclavTRM202;
    }
}
