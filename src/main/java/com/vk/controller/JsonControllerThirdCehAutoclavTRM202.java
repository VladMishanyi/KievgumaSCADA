package com.vk.controller;

import com.vk.entity.json.DateFromChart;
import com.vk.entity.table.TableModelThirdCehAutoclavTRM202;
import com.vk.service.data.ThirdCehAutoclavTRM202ServiceData;
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
public class JsonControllerThirdCehAutoclavTRM202 extends JsonController {

    private Logger LOGGER = Logger.getLogger(JsonControllerThirdCehAutoclavTRM202.class);

    private ThirdCehAutoclavTRM202ServiceData thirdCehAutoclavTRM202ServiceData;

    private SimpleDateFormat simpleDateFormat;

    @Autowired
    public JsonControllerThirdCehAutoclavTRM202(ThirdCehAutoclavTRM202ServiceData thirdCehAutoclavTRM202ServiceData,
                                                SimpleDateFormat simpleDateFormat){
        this.thirdCehAutoclavTRM202ServiceData = thirdCehAutoclavTRM202ServiceData;
        this.simpleDateFormat = simpleDateFormat;
    }

    @MessageMapping(value="/generateChartThirdCehAutoklav")
    @SendTo("/topic/generateChartThirdCehAutoklav")
    public List<TableModelThirdCehAutoclavTRM202> generateChartThirdCehAutoclavTRM202(final DateFromChart dateFromChart){
        return this.generateTimeObject(thirdCehAutoclavTRM202ServiceData, dateFromChart, simpleDateFormat);
    }
}
