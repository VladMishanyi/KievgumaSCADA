package com.vk.controller;

import com.vk.entity.json.DateFromChart;
import com.vk.entity.table.TableModelFirstCehSmesitel3KMSF1;
import com.vk.service.data.FirstCehSmesitel3KMSF1ServiceData;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@ComponentScan(basePackages = {"com.vk.service", "com.vk.service.data"})
public class JsonControllerFirstCehSmesitel3KMSF1 extends JsonController {

    private Logger LOGGER = Logger.getLogger(JsonControllerFirstCehSmesitel3KMSF1.class);

    private FirstCehSmesitel3KMSF1ServiceData firstCehSmesitel3KMSF1ServiceData;

    private SimpleDateFormat simpleDateFormat;

    @Autowired
    public JsonControllerFirstCehSmesitel3KMSF1(FirstCehSmesitel3KMSF1ServiceData firstCehSmesitel3KMSF1ServiceData,
                                                SimpleDateFormat simpleDateFormat){
        this.firstCehSmesitel3KMSF1ServiceData = firstCehSmesitel3KMSF1ServiceData;
        this.simpleDateFormat = simpleDateFormat;
    }
    @ResponseBody
    @RequestMapping(value = "//generateChartFirstCehSmesitel3KMSF1", method = RequestMethod.POST)
    public List<TableModelFirstCehSmesitel3KMSF1> generateChartFirstCehSmesitel3KMSF1(@RequestBody DateFromChart dateFromChart){
        return this.generateTimeObject(firstCehSmesitel3KMSF1ServiceData, dateFromChart, simpleDateFormat);
    }
}
