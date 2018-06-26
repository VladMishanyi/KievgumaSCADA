package com.vk.controller;

import com.vk.entity.json.DateFromChart;
import com.vk.entity.table.TableModelEnergeticRoomTRM201;
import com.vk.service.data.FirstCehAutoclavTRM202ServiceData;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@ComponentScan(basePackages = {"com.vk.service", "com.vk.service.data"})
public class JsonControllerFirstCehAutoclavTRM202 extends JsonController {

    private final Logger LOGGER = Logger.getLogger(JsonControllerFirstCehAutoclavTRM202.class);

    private final FirstCehAutoclavTRM202ServiceData firstCehAutoclavTRM202ServiceData;

    private final SimpleDateFormat simpleDateFormat;

    @Autowired
    public JsonControllerFirstCehAutoclavTRM202(final FirstCehAutoclavTRM202ServiceData firstCehAutoclavTRM202ServiceData,
                                             final SimpleDateFormat simpleDateFormat){
        this.firstCehAutoclavTRM202ServiceData = firstCehAutoclavTRM202ServiceData;
        this.simpleDateFormat = simpleDateFormat;
    }
    @ResponseBody
    @RequestMapping(value = "/generateChart", method = RequestMethod.POST)
    public List<TableModelEnergeticRoomTRM201> generateChartEnergeticRoomTRM201(@RequestBody DateFromChart dateFromChart){
        return this.generateTimeObject(firstCehAutoclavTRM202ServiceData, dateFromChart, simpleDateFormat);
    }
}
