package com.vk.controller;

import com.vk.entity.DateFromChart;
//import com.vk.entity.FirstCehAutoclav;
import com.vk.entity.table.TableModelEnergeticRoomTRM201;
import com.vk.entity.table.TableModelFirstCehAutoclavTRM202;
import com.vk.service.ServiceModelEnergeticRoomTRM201;
import com.vk.service.ServiceModelFirstCehAutoclavTRM202;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@ComponentScan(basePackages = {"com.vk.service"})
public class JsonControllerFirstCehAutoclavTRM202 {

    @Autowired
    private ServiceModelFirstCehAutoclavTRM202 serviceModelFirstCehAutoclavTRM202;

    private final Logger LOGGER = Logger.getLogger(JsonControllerFirstCehAutoclavTRM202.class);

    @ResponseBody
    @RequestMapping(value = "/generateChartFirstCehAutoklav", method = RequestMethod.POST)
    public List<TableModelFirstCehAutoclavTRM202> generateChartFirstCehAutoklav(@RequestBody DateFromChart dateFromChart){
        List<TableModelFirstCehAutoclavTRM202> tableModelFirstCehAutoclavTRM202 = null;
        String start = dateFromChart.getStart();
        String end = dateFromChart.getEnd();
        String[] startTokens = start.split("T");
        String[] endTokens = end.split("T");
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            Date date1 = simpleDateFormat.parse(startTokens[0] +" "+ startTokens[1]);
            Date date2 = simpleDateFormat.parse(endTokens[0] +" "+ endTokens[1]);
            tableModelFirstCehAutoclavTRM202 = serviceModelFirstCehAutoclavTRM202.rangeTimestamp(date1, date2);
        }catch (ParseException e){
            LOGGER.error("can't parse range of date: "+e.getClass());
        }
        return tableModelFirstCehAutoclavTRM202;
    }
}