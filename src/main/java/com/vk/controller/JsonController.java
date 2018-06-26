package com.vk.controller;

import com.vk.entity.json.DateFromChart;
import com.vk.entity.table.TableModel;
import com.vk.service.data.RootServiceData;
import org.apache.log4j.Logger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


/**
 * Created by User on 2017-07-20.
 */

public class JsonController<E extends RootServiceData, T extends TableModel> {

    private final Logger LOGGER = Logger.getLogger(JsonController.class);

    public List<E> generateTimeObject(E serviceData, DateFromChart dateFromChart, SimpleDateFormat simpleDateFormat){

        List<E> tableModel = null;
        String start = dateFromChart.getStart();
        String end = dateFromChart.getEnd();
        String[] startTokens = start.split("T");
        String[] endTokens = end.split("T");
        try {
            Date date1 = simpleDateFormat.parse(startTokens[0] +" "+ startTokens[1]);
            Date date2 = simpleDateFormat.parse(endTokens[0] +" "+ endTokens[1]);
            tableModel = serviceData.rangeTimestamp(date1, date2);
        }catch (ParseException e){
            LOGGER.error("can't parse range of date: "+e.getClass());
        }
        return tableModel;
    }
}
