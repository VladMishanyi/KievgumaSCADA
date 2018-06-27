package com.vk.controller;

import com.vk.entity.json.DateFromChart;
import com.vk.entity.table.TableModelFirstCehSmesitel4KMSF1;
import com.vk.service.data.FirstCehSmesitel4KMSF1ServiceData;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@ComponentScan(basePackages = {"com.vk.service", "com.vk.service.data"})
public class JsonControllerFirstCehSmesitel4KMSF1 extends JsonController {

    private Logger LOGGER = Logger.getLogger(JsonControllerFirstCehSmesitel4KMSF1.class);

    private FirstCehSmesitel4KMSF1ServiceData firstCehSmesitel4KMSF1ServiceData;

    private SimpleDateFormat simpleDateFormat;

    @Autowired
    public JsonControllerFirstCehSmesitel4KMSF1(FirstCehSmesitel4KMSF1ServiceData firstCehSmesitel4KMSF1ServiceData,
                                                SimpleDateFormat simpleDateFormat){
        this.firstCehSmesitel4KMSF1ServiceData = firstCehSmesitel4KMSF1ServiceData;
        this.simpleDateFormat = simpleDateFormat;
    }
    @ResponseBody
    @RequestMapping(value = "/generateChartFirstCehSmesitel4KMSF1", method = RequestMethod.POST)
    public List<TableModelFirstCehSmesitel4KMSF1> generateChartFirstCehSmesitel4KMSF1(@RequestBody DateFromChart dateFromChart){
        return this.generateTimeObject(firstCehSmesitel4KMSF1ServiceData, dateFromChart, simpleDateFormat);
    }
}
