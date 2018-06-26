package com.vk.controller;

import com.vk.entity.json.DateFromChart;
import com.vk.entity.table.TableModelFirstCehSmesitel3KMSF1;
import com.vk.service.ServiceModelFirstCehSmesitel3KMSF1;
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
public class JsonControllerFirstCehSmesitel3KMSF1 extends JsonController {

    private final ServiceModelFirstCehSmesitel3KMSF1 serviceModelFirstCehSmesitel3KMSF1;

    private final Logger LOGGER = Logger.getLogger(JsonControllerFirstCehSmesitel3KMSF1.class);

    @Autowired
    public JsonControllerFirstCehSmesitel3KMSF1(final ServiceModelFirstCehSmesitel3KMSF1 serviceModelFirstCehSmesitel3KMSF1){
        this.serviceModelFirstCehSmesitel3KMSF1 = serviceModelFirstCehSmesitel3KMSF1;
    }

    @ResponseBody
    @RequestMapping(value = "/generateChartFirstCehSmesitel3KMSF1", method = RequestMethod.POST)
    public List<TableModelFirstCehSmesitel3KMSF1> generateChartFirstCehSmesitel3KMSF1(@RequestBody DateFromChart dateFromChart){
        List<TableModelFirstCehSmesitel3KMSF1> tableModelFirstCehSmesitel3KMSF1 = null;
        String start = dateFromChart.getStart();
        String end = dateFromChart.getEnd();
        String[] startTokens = start.split("T");
        String[] endTokens = end.split("T");
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            Date date1 = simpleDateFormat.parse(startTokens[0] +" "+ startTokens[1]);
            Date date2 = simpleDateFormat.parse(endTokens[0] +" "+ endTokens[1]);
            tableModelFirstCehSmesitel3KMSF1 = serviceModelFirstCehSmesitel3KMSF1.rangeTimestamp(date1, date2);
        }catch (ParseException e){
            LOGGER.error("can't parse range of date: "+e.getClass());
        }
        return tableModelFirstCehSmesitel3KMSF1;
    }
}
