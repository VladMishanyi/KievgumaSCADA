package com.vk.tasks;

import com.vk.entity.converter.DeviceToTableKotelnyaParMikrolITM4;
import com.vk.entity.device.DeviceModelKotelnyaParMikrolITM4;
import com.vk.entity.table.TableModelKotelnyaParMikrolITM4;
import com.vk.service.data.KotelnyaParMikrolITM4ServiceData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.core.MessageSendingOperations;
import org.springframework.stereotype.Component;

/**
 * Created by KIP-PC99 on 08.08.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.service.data", "com.vk.entity.converter"})
public class TaskImplKotelnyaParMikrolITM4
        extends TaskImplRoot<Float,
        Float,
        KotelnyaParMikrolITM4ServiceData,
        KotelnyaParMikrolITM4ServiceData,
        DeviceModelKotelnyaParMikrolITM4,
        DeviceModelKotelnyaParMikrolITM4,
        TableModelKotelnyaParMikrolITM4,
        DeviceToTableKotelnyaParMikrolITM4> implements TaskKotelnyaParMikrolITM4{

    private final MessageSendingOperations<String> messageSendingOperations;

    private final DeviceToTableKotelnyaParMikrolITM4 deviceToTableKotelnyaParMikrolITM4;

    private final KotelnyaParMikrolITM4ServiceData kotelnyaParMikrolITM4ServiceData;

    private final String messageKotelnyaParMikrolITM4 = "/topic/kotelnyaParMikrolITM4";

    @Autowired
    public TaskImplKotelnyaParMikrolITM4(final MessageSendingOperations<String> messageSendingOperations,
                                         final DeviceToTableKotelnyaParMikrolITM4 deviceToTableKotelnyaParMikrolITM4,
                                         final KotelnyaParMikrolITM4ServiceData kotelnyaParMikrolITM4ServiceData){
        super(messageSendingOperations, deviceToTableKotelnyaParMikrolITM4, kotelnyaParMikrolITM4ServiceData);
        super.setMessage(messageKotelnyaParMikrolITM4);
        this.messageSendingOperations = messageSendingOperations;
        this.kotelnyaParMikrolITM4ServiceData = kotelnyaParMikrolITM4ServiceData;
        this.deviceToTableKotelnyaParMikrolITM4 = deviceToTableKotelnyaParMikrolITM4;
    }
}
