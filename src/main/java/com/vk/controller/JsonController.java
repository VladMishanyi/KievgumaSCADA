package com.vk.controller;

import com.vk.entity.device.DeviceModel;
import com.vk.entity.json.DateFromChart;
import com.vk.entity.json.JsonBodyDateFromChart;
import com.vk.entity.table.TableModel;
import com.vk.service.data.RootServiceData;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


/**
 * Created by User on 2017-07-20.
 */
@RestController
public class JsonController<D extends DeviceModel, E extends RootServiceData<T, D>, T extends TableModel> {

    private final Logger LOGGER = Logger.getLogger(this.getClass());

    public List<T> generateTimeObject(final E serviceData,
                                      final JsonBodyDateFromChart jsonBodyDateFromChart,
                                      final SimpleDateFormat simpleDateFormat){
        List<T> tableModel = null;
//        final String start = dateFromChart.getStart();
//        final String end = dateFromChart.getEnd();
//        final String[] startTokens = start.split("T");
//        final String[] endTokens = end.split("T");
        try {
//            final Date date1 = simpleDateFormat.parse(startTokens[0] +" "+ startTokens[1]);
//            final Date date2 = simpleDateFormat.parse(endTokens[0] +" "+ endTokens[1]);
            tableModel = serviceData.rangeTimestamp(jsonBodyDateFromChart.getStart(), jsonBodyDateFromChart.getEnd());
        }catch (Exception e){
            LOGGER.error("can't parse range of date: "+e.getClass());
        }
        return tableModel;
    }
}
