package com.vk.controller;

import com.vk.entity.device.DeviceModelKotelnyaParMikrolITM4;
import com.vk.entity.json.DateFromChart;
import com.vk.entity.json.JsonBodyDateFromChart;
import com.vk.entity.table.TableModelKotelnyaParMikrolITM4;
import com.vk.service.data.KotelnyaParMikrolITM4ServiceData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by KIP-PC99 on 08.08.2018.
 */
@RestController
@ComponentScan(basePackages = {"com.vk.service", "com.vk.service.data"})
public class JsonControllerKotelnyaParMikrolITM4 extends JsonController<DeviceModelKotelnyaParMikrolITM4, KotelnyaParMikrolITM4ServiceData, TableModelKotelnyaParMikrolITM4> {

    private final KotelnyaParMikrolITM4ServiceData kotelnyaParMikrolITM4ServiceData;

    private final SimpleDateFormat simpleDateFormat;

    @Autowired
    public JsonControllerKotelnyaParMikrolITM4(final KotelnyaParMikrolITM4ServiceData kotelnyaParMikrolITM4ServiceData,
                                               final SimpleDateFormat simpleDateFormat){
        this.kotelnyaParMikrolITM4ServiceData = kotelnyaParMikrolITM4ServiceData;
        this.simpleDateFormat = simpleDateFormat;
    }

    @MessageMapping(value="/generateChartKotelnyaParMikrolITM4")
    @SendTo("/topic/generateChartKotelnyaParMikrolITM4")
    public List<TableModelKotelnyaParMikrolITM4> generateChartKotelnyaParMikrolITM4(final JsonBodyDateFromChart dateFromChart){
        return this.generateTimeObject(kotelnyaParMikrolITM4ServiceData, dateFromChart, simpleDateFormat);
    }
}
