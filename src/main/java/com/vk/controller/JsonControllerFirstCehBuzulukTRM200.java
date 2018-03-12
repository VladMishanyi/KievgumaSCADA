package com.vk.controller;

import com.vk.entity.DateFromChart;
import com.vk.entity.table.TableModelFirstCehBuzulukTRM200;
import com.vk.service.ServiceModelFirstCehBuzulukTRM200;
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
public class JsonControllerFirstCehBuzulukTRM200 {

    private final ServiceModelFirstCehBuzulukTRM200 serviceModelFirstCehBuzulukTRM200;

    private final Logger LOGGER = Logger.getLogger(JsonControllerFirstCehBuzulukTRM200.class);

    @Autowired
    public JsonControllerFirstCehBuzulukTRM200(final ServiceModelFirstCehBuzulukTRM200 serviceModelFirstCehBuzulukTRM200){
        this.serviceModelFirstCehBuzulukTRM200 = serviceModelFirstCehBuzulukTRM200;
    }

    @ResponseBody
    @RequestMapping(value = "/generateChartFirstCehBuzuluk", method = RequestMethod.POST)
    public List<TableModelFirstCehBuzulukTRM200> generateChartFirstCehBuzuluk(@RequestBody DateFromChart dateFromChart){
        List<TableModelFirstCehBuzulukTRM200> tableModelFirstCehBuzulukTRM200 = null;
        String start = dateFromChart.getStart();
        String end = dateFromChart.getEnd();
        String[] startTokens = start.split("T");
        String[] endTokens = end.split("T");
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            Date date1 = simpleDateFormat.parse(startTokens[0] +" "+ startTokens[1]);
            Date date2 = simpleDateFormat.parse(endTokens[0] +" "+ endTokens[1]);
            tableModelFirstCehBuzulukTRM200 = serviceModelFirstCehBuzulukTRM200.rangeTimestamp(date1, date2);
        }catch (ParseException e){
            LOGGER.error("can't parse range of date: "+e.getClass());
        }
        return tableModelFirstCehBuzulukTRM200;
    }
}
