package com.vk.controller;

import com.vk.entity.json.DateFromChart;
import com.vk.entity.table.TableModelLaboratoryAutoclavMV110;
import com.vk.service.ServiceModelFirstCehAutoclavTRM202;
import com.vk.service.ServiceModelLaboratoryAutoclavMV110;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by User on 2018-04-02.
 */
@RestController
@ComponentScan(basePackages = {"com.vk.service"})
public class JsonControllerLaboratoryAutoclavMV110 {

    private final ServiceModelLaboratoryAutoclavMV110 serviceModelLaboratoryAutoclavMV110;

    private final Logger LOGGER = Logger.getLogger(JsonControllerLaboratoryAutoclavMV110.class);

    @Autowired
    public JsonControllerLaboratoryAutoclavMV110(final ServiceModelLaboratoryAutoclavMV110 serviceModelLaboratoryAutoclavMV110){
        this.serviceModelLaboratoryAutoclavMV110 = serviceModelLaboratoryAutoclavMV110;
    }

    @ResponseBody
    @RequestMapping(value = "/generateLaboratoryAutoklav", method = RequestMethod.POST)
    public List<TableModelLaboratoryAutoclavMV110> generateChartLaboratoryAutoklav(@RequestBody DateFromChart dateFromChart){
        List<TableModelLaboratoryAutoclavMV110> tableModelLaboratoryAutoclavMV110s = null;
        String start = dateFromChart.getStart();
        String end = dateFromChart.getEnd();
        String[] startTokens = start.split("T");
        String[] endTokens = end.split("T");
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            Date date1 = simpleDateFormat.parse(startTokens[0] +" "+ startTokens[1]);
            Date date2 = simpleDateFormat.parse(endTokens[0] +" "+ endTokens[1]);
            tableModelLaboratoryAutoclavMV110s = serviceModelLaboratoryAutoclavMV110.rangeTimestamp(date1, date2);
        }catch (ParseException e){
            LOGGER.error("can't parse range of date: "+e.getClass());
        }
        return tableModelLaboratoryAutoclavMV110s;
    }
}
