package com.vk.controller;

import com.vk.entity.device.DeviceModelFirstCehSmesitel2KMSF1;
import com.vk.entity.json.DateFromChart;
import com.vk.entity.table.TableModelFirstCehSmesitel2KMSF1;
import com.vk.service.data.FirstCehSmesitel2KMSF1ServiceData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@ComponentScan(basePackages = {"com.vk.service", "com.vk.service.data"})
public class JsonControllerFirstCehSmesitel2KMSF1 extends JsonController<DeviceModelFirstCehSmesitel2KMSF1, FirstCehSmesitel2KMSF1ServiceData, TableModelFirstCehSmesitel2KMSF1> {

    private final FirstCehSmesitel2KMSF1ServiceData firstCehSmesitel2KMSF1ServiceData;

    private final SimpleDateFormat simpleDateFormat;

    @Autowired
    public JsonControllerFirstCehSmesitel2KMSF1(final FirstCehSmesitel2KMSF1ServiceData firstCehSmesitel2KMSF1ServiceData,
                                                final SimpleDateFormat simpleDateFormat){
        this.firstCehSmesitel2KMSF1ServiceData = firstCehSmesitel2KMSF1ServiceData;
        this.simpleDateFormat = simpleDateFormat;
    }

    @MessageMapping(value="/generateChartFirstCehSmesitel2KMSF1")
    @SendTo("/topic/generateChartFirstCehSmesitel2KMSF1")
    public List<TableModelFirstCehSmesitel2KMSF1> generateChartFirstCehSmesitel2KMSF1(final DateFromChart dateFromChart){
        return this.generateTimeObject(firstCehSmesitel2KMSF1ServiceData, dateFromChart, simpleDateFormat);
    }
}
