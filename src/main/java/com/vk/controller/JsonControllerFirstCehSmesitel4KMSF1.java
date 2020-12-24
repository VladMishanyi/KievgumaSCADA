package com.vk.controller;

import com.vk.entity.device.DeviceModelFirstCehSmesitel4KMSF1;
import com.vk.entity.json.DateFromChart;
import com.vk.entity.json.JsonBodyDateFromChart;
import com.vk.entity.json.JsonBodyLocalDateTimeFromChart;
import com.vk.entity.table.TableModelFirstCehSmesitel4KMSF1;
import com.vk.service.data.FirstCehSmesitel4KMSF1ServiceData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@ComponentScan(basePackages = {"com.vk.service", "com.vk.service.data"})
public class JsonControllerFirstCehSmesitel4KMSF1 extends JsonController<DeviceModelFirstCehSmesitel4KMSF1, FirstCehSmesitel4KMSF1ServiceData, TableModelFirstCehSmesitel4KMSF1> {

    private final FirstCehSmesitel4KMSF1ServiceData firstCehSmesitel4KMSF1ServiceData;

    private final SimpleDateFormat simpleDateFormat;

    @Autowired
    public JsonControllerFirstCehSmesitel4KMSF1(final FirstCehSmesitel4KMSF1ServiceData firstCehSmesitel4KMSF1ServiceData,
                                                final SimpleDateFormat simpleDateFormat){
        this.firstCehSmesitel4KMSF1ServiceData = firstCehSmesitel4KMSF1ServiceData;
        this.simpleDateFormat = simpleDateFormat;
    }

    @MessageMapping(value="/generateChartFirstCehSmesitel4KMSF1")
    @SendTo("/topic/generateChartFirstCehSmesitel4KMSF1")
    public List<TableModelFirstCehSmesitel4KMSF1> generateChartFirstCehSmesitel4KMSF1(final JsonBodyLocalDateTimeFromChart dateFromChart){
        return this.generateTimeObject(firstCehSmesitel4KMSF1ServiceData, dateFromChart, simpleDateFormat);
    }
}
