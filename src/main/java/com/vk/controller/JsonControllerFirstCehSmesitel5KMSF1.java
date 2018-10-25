package com.vk.controller;

import com.vk.entity.json.DateFromChart;
import com.vk.entity.table.TableModelFirstCehSmesitel5KMSF1;
import com.vk.service.data.FirstCehSmesitel5KMSF1ServiceData;
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
public class JsonControllerFirstCehSmesitel5KMSF1 extends JsonController {

    private Logger LOGGER = Logger.getLogger(JsonControllerFirstCehSmesitel4KMSF1.class);

    private final FirstCehSmesitel5KMSF1ServiceData firstCehSmesitel5KMSF1ServiceData;

    private final SimpleDateFormat simpleDateFormat;

    @Autowired
    public JsonControllerFirstCehSmesitel5KMSF1(final FirstCehSmesitel5KMSF1ServiceData firstCehSmesitel5KMSF1ServiceData,
                                                final SimpleDateFormat simpleDateFormat){
        this.firstCehSmesitel5KMSF1ServiceData = firstCehSmesitel5KMSF1ServiceData;
        this.simpleDateFormat = simpleDateFormat;
    }

    @MessageMapping(value="/generateChartFirstCehSmesitel5KMSF1")
    @SendTo("/topic/generateChartFirstCehSmesitel5KMSF1")
    public List<TableModelFirstCehSmesitel5KMSF1> generateChartFirstCehSmesitel5KMSF1(final DateFromChart dateFromChart){
        return this.generateTimeObject(firstCehSmesitel5KMSF1ServiceData, dateFromChart, simpleDateFormat);
    }
}
