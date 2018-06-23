package com.vk.controller;

import com.vk.entity.json.DateFromChart;
import com.vk.entity.table.TableModelThirdCehAutoclavTRM202;
import com.vk.service.ServiceModelThirdCehAutoclavTRM202;
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
public class JsonControllerThirdCehAutoclavTRM202 {

    private final ServiceModelThirdCehAutoclavTRM202 serviceModelThirdCehAutoclavTRM202;

    private final Logger LOGGER = Logger.getLogger(JsonControllerThirdCehAutoclavTRM202.class);

    @Autowired
    public JsonControllerThirdCehAutoclavTRM202(final ServiceModelThirdCehAutoclavTRM202 serviceModelThirdCehAutoclavTRM202){
        this.serviceModelThirdCehAutoclavTRM202 = serviceModelThirdCehAutoclavTRM202;
    }
    @ResponseBody
    @RequestMapping(value = "/generateChartThirdCehAutoklav", method = RequestMethod.POST)
    public List<TableModelThirdCehAutoclavTRM202> generateChartThirdCehAutoklav(@RequestBody DateFromChart dateFromChart){
        List<TableModelThirdCehAutoclavTRM202> tableModelThirdCehAutoclavTRM202 = null;
        String start = dateFromChart.getStart();
        String end = dateFromChart.getEnd();
        String[] startTokens = start.split("T");
        String[] endTokens = end.split("T");
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            Date date1 = simpleDateFormat.parse(startTokens[0] +" "+ startTokens[1]);
            Date date2 = simpleDateFormat.parse(endTokens[0] +" "+ endTokens[1]);
            tableModelThirdCehAutoclavTRM202 = serviceModelThirdCehAutoclavTRM202.rangeTimestamp(date1, date2);
        }catch (ParseException e){
            LOGGER.error("can't parse range of date: "+e.getClass());
        }
        return tableModelThirdCehAutoclavTRM202;
    }
}
