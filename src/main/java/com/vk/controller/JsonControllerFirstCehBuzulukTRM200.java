package com.vk.controller;

import com.vk.entity.json.DateFromChart;
import com.vk.entity.table.TableModelEnergeticRoomTRM201;
import com.vk.service.data.FirstCehBuzulukTRM200ServiceData;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@ComponentScan(basePackages = {"com.vk.service", "com.vk.service.data"})
public class JsonControllerFirstCehBuzulukTRM200 extends JsonController {

    private final Logger LOGGER = Logger.getLogger(JsonControllerFirstCehAutoclavTRM202.class);

    private final FirstCehBuzulukTRM200ServiceData firstCehBuzulukTRM200ServiceData;

    private final SimpleDateFormat simpleDateFormat;

    @Autowired
    public JsonControllerFirstCehBuzulukTRM200(final FirstCehBuzulukTRM200ServiceData firstCehBuzulukTRM200ServiceData,
                                                final SimpleDateFormat simpleDateFormat){
        this.firstCehBuzulukTRM200ServiceData = firstCehBuzulukTRM200ServiceData;
        this.simpleDateFormat = simpleDateFormat;
    }
    @ResponseBody
    @RequestMapping(value = "/generateChart", method = RequestMethod.POST)
    public List<TableModelEnergeticRoomTRM201> generateChartEnergeticRoomTRM201(@RequestBody DateFromChart dateFromChart){
        return this.generateTimeObject(firstCehBuzulukTRM200ServiceData, dateFromChart, simpleDateFormat);
    }
}
