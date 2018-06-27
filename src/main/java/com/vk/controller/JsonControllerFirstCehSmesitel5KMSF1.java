package com.vk.controller;

import com.vk.entity.json.DateFromChart;
import com.vk.entity.table.TableModelFirstCehSmesitel5KMSF1;
import com.vk.service.data.FirstCehSmesitel5KMSF1ServiceData;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@ComponentScan(basePackages = {"com.vk.service", "com.vk.service.data"})
public class JsonControllerFirstCehSmesitel5KMSF1 extends JsonController {

    private Logger LOGGER = Logger.getLogger(JsonControllerFirstCehSmesitel4KMSF1.class);

    private FirstCehSmesitel5KMSF1ServiceData firstCehSmesitel5KMSF1ServiceData;

    private SimpleDateFormat simpleDateFormat;

    @Autowired
    public JsonControllerFirstCehSmesitel5KMSF1(FirstCehSmesitel5KMSF1ServiceData firstCehSmesitel5KMSF1ServiceData,
                                                SimpleDateFormat simpleDateFormat){
        this.firstCehSmesitel5KMSF1ServiceData = firstCehSmesitel5KMSF1ServiceData;
        this.simpleDateFormat = simpleDateFormat;
    }
    @ResponseBody
    @RequestMapping(value = "/generateChartFirstCehSmesitel5KMSF1", method = RequestMethod.POST)
    public List<TableModelFirstCehSmesitel5KMSF1> generateChartFirstCehSmesitel5KMSF1(@RequestBody DateFromChart dateFromChart){
        return this.generateTimeObject(firstCehSmesitel5KMSF1ServiceData, dateFromChart, simpleDateFormat);
    }
}
