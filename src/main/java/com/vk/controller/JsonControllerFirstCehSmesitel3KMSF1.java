package com.vk.controller;

import com.vk.entity.device.DeviceModelFirstCehSmesitel3KMSF1;
import com.vk.entity.json.DateFromChart;
import com.vk.entity.json.JsonBodyDateFromChart;
import com.vk.entity.table.TableModelFirstCehSmesitel3KMSF1;
import com.vk.service.data.FirstCehSmesitel3KMSF1ServiceData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@ComponentScan(basePackages = {"com.vk.service", "com.vk.service.data"})
public class JsonControllerFirstCehSmesitel3KMSF1 extends JsonController<DeviceModelFirstCehSmesitel3KMSF1, FirstCehSmesitel3KMSF1ServiceData, TableModelFirstCehSmesitel3KMSF1> {

    private final FirstCehSmesitel3KMSF1ServiceData firstCehSmesitel3KMSF1ServiceData;

    private final SimpleDateFormat simpleDateFormat;

    @Autowired
    public JsonControllerFirstCehSmesitel3KMSF1(final FirstCehSmesitel3KMSF1ServiceData firstCehSmesitel3KMSF1ServiceData,
                                                final SimpleDateFormat simpleDateFormat){
        this.firstCehSmesitel3KMSF1ServiceData = firstCehSmesitel3KMSF1ServiceData;
        this.simpleDateFormat = simpleDateFormat;
    }

    @MessageMapping(value="/generateChartFirstCehSmesitel3KMSF1")
    @SendTo("/topic/generateChartFirstCehSmesitel3KMSF1")
    public List<TableModelFirstCehSmesitel3KMSF1> generateChartFirstCehSmesitel3KMSF1(final JsonBodyDateFromChart dateFromChart){
        return this.generateTimeObject(firstCehSmesitel3KMSF1ServiceData, dateFromChart, simpleDateFormat);
    }
}
