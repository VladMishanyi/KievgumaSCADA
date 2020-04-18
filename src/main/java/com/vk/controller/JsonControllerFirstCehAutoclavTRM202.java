package com.vk.controller;

import com.vk.entity.device.DeviceModelFirstCehAutoclavTRM202;
import com.vk.entity.json.DateFromChart;
import com.vk.entity.table.TableModelFirstCehAutoclavTRM202;
import com.vk.service.data.FirstCehAutoclavTRM202ServiceData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@ComponentScan(basePackages = {"com.vk.service", "com.vk.service.data"})
public class JsonControllerFirstCehAutoclavTRM202 extends JsonController<DeviceModelFirstCehAutoclavTRM202, FirstCehAutoclavTRM202ServiceData, TableModelFirstCehAutoclavTRM202> {

    private final FirstCehAutoclavTRM202ServiceData firstCehAutoclavTRM202ServiceData;

    private final SimpleDateFormat simpleDateFormat;

    @Autowired
    public JsonControllerFirstCehAutoclavTRM202(final FirstCehAutoclavTRM202ServiceData firstCehAutoclavTRM202ServiceData,
                                                final SimpleDateFormat simpleDateFormat){
        this.firstCehAutoclavTRM202ServiceData = firstCehAutoclavTRM202ServiceData;
        this.simpleDateFormat = simpleDateFormat;
    }

    @MessageMapping(value="/generateChartFirstCehAutoklav")
    @SendTo("/topic/generateChartFirstCehAutoklav")
    public List<TableModelFirstCehAutoclavTRM202> generateChartFirstCehAutoclavTRM202(final DateFromChart dateFromChart){
        return this.generateTimeObject(firstCehAutoclavTRM202ServiceData, dateFromChart, simpleDateFormat);
    }
}
