package com.vk.controller;

import com.vk.entity.device.DeviceModelFirstCehSmesitel1KMSF1;
import com.vk.entity.json.DateFromChart;
import com.vk.entity.json.JsonBodyDateFromChart;
import com.vk.entity.json.JsonBodyLocalDateTimeFromChart;
import com.vk.entity.table.TableModelFirstCehSmesitel1KMSF1;
import com.vk.service.data.FirstCehSmesitel1KMSF1ServiceData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.*;


import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@ComponentScan(basePackages = {"com.vk.service", "com.vk.service.data"})
public class JsonControllerFirstCehSmesitel1KMSF1 extends JsonController<DeviceModelFirstCehSmesitel1KMSF1, FirstCehSmesitel1KMSF1ServiceData, TableModelFirstCehSmesitel1KMSF1> {

    private final FirstCehSmesitel1KMSF1ServiceData firstCehSmesitel1KMSF1ServiceData;

    private final SimpleDateFormat simpleDateFormat;

    @Autowired
    public JsonControllerFirstCehSmesitel1KMSF1(final FirstCehSmesitel1KMSF1ServiceData firstCehSmesitel1KMSF1ServiceData,
                                                final SimpleDateFormat simpleDateFormat){
        this.firstCehSmesitel1KMSF1ServiceData = firstCehSmesitel1KMSF1ServiceData;
        this.simpleDateFormat = simpleDateFormat;
    }

    @MessageMapping(value="/generateChartFirstCehSmesitel1KMSF1")
    @SendTo("/topic/generateChartFirstCehSmesitel1KMSF1")
    public List<TableModelFirstCehSmesitel1KMSF1> generateChartFirstCehSmesitel1KMSF1(final JsonBodyLocalDateTimeFromChart dateFromChart){
        return this.generateTimeObject(firstCehSmesitel1KMSF1ServiceData, dateFromChart, simpleDateFormat);
    }
}
