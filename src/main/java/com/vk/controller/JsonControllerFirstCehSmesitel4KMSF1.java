package com.vk.controller;

import com.vk.entity.json.DateFromChart;
import com.vk.entity.table.TableModelFirstCehSmesitel4KMSF1;
import com.vk.service.ServiceModelFirstCehSmesitel4KMSF1;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@ComponentScan(basePackages = {"com.vk.service", "com.vk.service.data"})
public class JsonControllerFirstCehSmesitel4KMSF1 extends JsonController {

    private final ServiceModelFirstCehSmesitel4KMSF1 serviceModelFirstCehSmesitel4KMSF1;

    private final Logger LOGGER = Logger.getLogger(JsonControllerFirstCehSmesitel4KMSF1.class);

    @Autowired
    public JsonControllerFirstCehSmesitel4KMSF1(final ServiceModelFirstCehSmesitel4KMSF1 serviceModelFirstCehSmesitel4KMSF1){
        this.serviceModelFirstCehSmesitel4KMSF1 = serviceModelFirstCehSmesitel4KMSF1;

    }
    @ResponseBody
    @RequestMapping(value = "/generateChartFirstCehSmesitel4KMSF1", method = RequestMethod.POST)
    public List<TableModelFirstCehSmesitel4KMSF1> generateChartFirstCehSmesitel4KMSF1(@RequestBody DateFromChart dateFromChart){
        List<TableModelFirstCehSmesitel4KMSF1> tableModelFirstCehSmesitel4KMSF1 = null;
        String start = dateFromChart.getStart();
        String end = dateFromChart.getEnd();
        String[] startTokens = start.split("T");
        String[] endTokens = end.split("T");
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            Date date1 = simpleDateFormat.parse(startTokens[0] +" "+ startTokens[1]);
            Date date2 = simpleDateFormat.parse(endTokens[0] +" "+ endTokens[1]);
            tableModelFirstCehSmesitel4KMSF1 = serviceModelFirstCehSmesitel4KMSF1.rangeTimestamp(date1, date2);
        }catch (ParseException e){
            LOGGER.error("can't parse range of date: "+e.getClass());
        }
        return tableModelFirstCehSmesitel4KMSF1;
    }
}
