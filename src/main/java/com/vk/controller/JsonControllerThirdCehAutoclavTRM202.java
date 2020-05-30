package com.vk.controller;

import com.vk.entity.device.DeviceModelThirdCehAutoclavTRM202;
import com.vk.entity.json.DateFromChart;
import com.vk.entity.table.TableModelThirdCehAutoclavTRM202;
import com.vk.service.data.ThirdCehAutoclavTRM202ServiceData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@ComponentScan(basePackages = {"com.vk.service", "com.vk.service.data"})
public class JsonControllerThirdCehAutoclavTRM202 extends JsonController<DeviceModelThirdCehAutoclavTRM202, ThirdCehAutoclavTRM202ServiceData, TableModelThirdCehAutoclavTRM202> {

    private final ThirdCehAutoclavTRM202ServiceData thirdCehAutoclavTRM202ServiceData;

    private final SimpleDateFormat simpleDateFormat;

    @Autowired
    public JsonControllerThirdCehAutoclavTRM202(final ThirdCehAutoclavTRM202ServiceData thirdCehAutoclavTRM202ServiceData,
                                                final SimpleDateFormat simpleDateFormat){
        this.thirdCehAutoclavTRM202ServiceData = thirdCehAutoclavTRM202ServiceData;
        this.simpleDateFormat = simpleDateFormat;
    }

    @MessageMapping(value="/generateChartThirdCehAutoklav")
    @SendTo("/topic/generateChartThirdCehAutoklav")
    public List<TableModelThirdCehAutoclavTRM202> generateChartThirdCehAutoclavTRM202(final DateFromChart dateFromChart){
        return this.generateTimeObject(thirdCehAutoclavTRM202ServiceData, dateFromChart, simpleDateFormat);
    }
}
