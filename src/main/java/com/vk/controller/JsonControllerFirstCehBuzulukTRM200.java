package com.vk.controller;

import com.vk.entity.device.DeviceModelFirstCehBuzulukTRM200;
import com.vk.entity.json.DateFromChart;
import com.vk.entity.json.JsonBodyDateFromChart;
import com.vk.entity.json.JsonBodyLocalDateTimeFromChart;
import com.vk.entity.table.TableModelFirstCehBuzulukTRM200;
import com.vk.service.data.FirstCehBuzulukTRM200ServiceData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@ComponentScan(basePackages = {"com.vk.service", "com.vk.service.data"})
public class JsonControllerFirstCehBuzulukTRM200 extends JsonController<DeviceModelFirstCehBuzulukTRM200, FirstCehBuzulukTRM200ServiceData, TableModelFirstCehBuzulukTRM200> {

    private final FirstCehBuzulukTRM200ServiceData firstCehBuzulukTRM200ServiceData;

    private final SimpleDateFormat simpleDateFormat;

    @Autowired
    public JsonControllerFirstCehBuzulukTRM200(final FirstCehBuzulukTRM200ServiceData firstCehBuzulukTRM200ServiceData,
                                               final SimpleDateFormat simpleDateFormat){
        this.firstCehBuzulukTRM200ServiceData = firstCehBuzulukTRM200ServiceData;
        this.simpleDateFormat = simpleDateFormat;
    }

    @MessageMapping(value="/generateChartFirstCehBuzuluk")
    @SendTo("/topic/generateChartFirstCehBuzuluk")
    public List<TableModelFirstCehBuzulukTRM200> generateChartFirstCehBuzulukTRM200(final JsonBodyLocalDateTimeFromChart dateFromChart){
        return this.generateTimeObject(firstCehBuzulukTRM200ServiceData, dateFromChart, simpleDateFormat);
    }
}
