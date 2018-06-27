package com.vk.controller;

import com.vk.entity.json.DateFromChart;
import com.vk.entity.table.TableModelFirstCehAutoclavTRM202;
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

    private Logger LOGGER = Logger.getLogger(JsonControllerFirstCehAutoclavTRM202.class);

    private FirstCehAutoclavTRM202ServiceData firstCehAutoclavTRM202ServiceData;

    private SimpleDateFormat simpleDateFormat;

    @Autowired
    public JsonControllerFirstCehAutoclavTRM202(FirstCehAutoclavTRM202ServiceData firstCehAutoclavTRM202ServiceData,
                                             SimpleDateFormat simpleDateFormat){
        this.firstCehAutoclavTRM202ServiceData = firstCehAutoclavTRM202ServiceData;
        this.simpleDateFormat = simpleDateFormat;
    }
    @ResponseBody
    @RequestMapping(value = "/generateChartFirstCehAutoklav", method = RequestMethod.POST)
    public List<TableModelFirstCehAutoclavTRM202> generateChartFirstCehAutoclavTRM202(@RequestBody DateFromChart dateFromChart){
        return this.generateTimeObject(firstCehAutoclavTRM202ServiceData, dateFromChart, simpleDateFormat);
    }
}
