package com.vk.controller;

import com.vk.entity.json.DateFromChart;
import com.vk.entity.table.TableModelFirstCehSmesitel1KMSF1;
import com.vk.service.data.FirstCehSmesitel1KMSF1ServiceData;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.*;


import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@ComponentScan(basePackages = {"com.vk.service", "com.vk.service.data"})
public class JsonControllerFirstCehSmesitel1KMSF1 extends JsonController {

    private Logger LOGGER = Logger.getLogger(JsonControllerFirstCehSmesitel1KMSF1.class);

    private FirstCehSmesitel1KMSF1ServiceData firstCehSmesitel1KMSF1ServiceData;

    private SimpleDateFormat simpleDateFormat;

    @Autowired
    public JsonControllerFirstCehSmesitel1KMSF1(FirstCehSmesitel1KMSF1ServiceData firstCehSmesitel1KMSF1ServiceData,
                                               SimpleDateFormat simpleDateFormat){
        this.firstCehSmesitel1KMSF1ServiceData = firstCehSmesitel1KMSF1ServiceData;
        this.simpleDateFormat = simpleDateFormat;
    }

    @MessageMapping(value="/generateChartFirstCehSmesitel1KMSF1")
    @SendTo("/topic/generateChartFirstCehSmesitel1KMSF1")
    public List<TableModelFirstCehSmesitel1KMSF1> generateChartFirstCehSmesitel1KMSF1(final DateFromChart dateFromChart){
        return this.generateTimeObject(firstCehSmesitel1KMSF1ServiceData, dateFromChart, simpleDateFormat);
    }
}
