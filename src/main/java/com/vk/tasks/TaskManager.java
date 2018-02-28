package com.vk.tasks;

import com.vk.entity.ThirdCehAutoclav;
import com.vk.entity.table.TableModelEnergeticRoomTRM201;
import com.vk.service.ServiceModelEnergeticRoomTRM201;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.core.MessageSendingOperations;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

/**
 * Created by User on 2018-02-28.
 */
@Component
//@EnableScheduling
public class TaskManager {

    @Autowired
    MessageSendingOperations<String> messageSendingOperations;

    @Autowired
    ServiceModelEnergeticRoomTRM201 serviceModelEnergeticRoomTRM201;

    /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
    TableModelEnergeticRoomTRM201 tableModelEnergeticRoomTRM201 = serviceModelEnergeticRoomTRM201.getModbusDevice();
        messageSendingOperations.convertAndSend("/topic/thirdCehAvtoclav", thirdCehAutoclav);
        if ((thirdCehAutoclavTemperatura -1 >= thirdCehAutoclav.getChannel1()) || (thirdCehAutoclavTemperatura +1 <= thirdCehAutoclav.getChannel1()) || (0 == thirdCehAutoclav.getChannel1()) ){
        trmRepositoryService.addThirdCehAutoclavTRM202(thirdCehAutoclav);
        thirdCehAutoclavTemperatura = thirdCehAutoclav.getChannel1();
    }
        if ((thirdCehAutoclavDavlenie -1 >= thirdCehAutoclav.getChannel2()) || (thirdCehAutoclavDavlenie +1 <= thirdCehAutoclav.getChannel2()) || (0 == thirdCehAutoclav.getChannel2()) ){
        trmRepositoryService.addThirdCehAutoclavTRM202(thirdCehAutoclav);
        thirdCehAutoclavDavlenie = thirdCehAutoclav.getChannel2();
    }
}
