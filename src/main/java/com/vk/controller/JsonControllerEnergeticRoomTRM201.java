package com.vk.controller;

import com.vk.entity.DateFromChart;
import com.vk.entity.table.TableModelEnergeticRoomTRM201;
//import com.vk.service.ServiceModelEnergeticRoomTRM201;
import com.vk.service.data.EnergeticRoomTRM201ServiceData;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by User on 2018-03-02.
 */
@RestController
@ComponentScan(basePackages = {"com.vk.service", "com.vk.service.data"})
public class JsonControllerEnergeticRoomTRM201 {

//    private final ServiceModelEnergeticRoomTRM201 serviceModelEnergeticRoomTRM201;

    private final EnergeticRoomTRM201ServiceData energeticRoomTRM201ServiceData;

    private final Logger LOGGER = Logger.getLogger(JsonControllerEnergeticRoomTRM201.class);

    @Autowired
    public JsonControllerEnergeticRoomTRM201(/*final ServiceModelEnergeticRoomTRM201 serviceModelEnergeticRoomTRM201,*/
                                             final EnergeticRoomTRM201ServiceData energeticRoomTRM201ServiceData){
//        this.serviceModelEnergeticRoomTRM201 = serviceModelEnergeticRoomTRM201;
        this.energeticRoomTRM201ServiceData = energeticRoomTRM201ServiceData;
    }
    @ResponseBody
    @RequestMapping(value = "/generateChart", method = RequestMethod.POST)
    public List<TableModelEnergeticRoomTRM201> generateChartEnergeticRoomTRM201(@RequestBody DateFromChart dateFromChart){
        List<TableModelEnergeticRoomTRM201> tableModelEnergeticRoomTRM201List = null;
        String start = dateFromChart.getStart();
        String end = dateFromChart.getEnd();
        String[] startTokens = start.split("T");
        String[] endTokens = end.split("T");
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            Date date1 = simpleDateFormat.parse(startTokens[0] +" "+ startTokens[1]);
            Date date2 = simpleDateFormat.parse(endTokens[0] +" "+ endTokens[1]);
//            tableModelEnergeticRoomTRM201List = serviceModelEnergeticRoomTRM201.rangeTimestamp(date1, date2);
            tableModelEnergeticRoomTRM201List = energeticRoomTRM201ServiceData.rangeTimestamp(date1, date2);
        }catch (ParseException e){
            LOGGER.error("can't parse range of date: "+e.getClass());
        }
        return tableModelEnergeticRoomTRM201List;
    }
}
