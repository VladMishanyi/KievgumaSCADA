package com.vk.controller;

import com.vk.entity.json.DateFromChart;
import com.vk.entity.table.TableModelEnergeticRoomTRM201;
import com.vk.service.data.EnergeticRoomTRM201ServiceData;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by User on 2018-03-02.
 */
@RestController
@ComponentScan(basePackages = {"com.vk.service", "com.vk.service.data"})
public class JsonControllerEnergeticRoomTRM201 extends JsonController{

    private Logger LOGGER = Logger.getLogger(JsonControllerEnergeticRoomTRM201.class);

    private EnergeticRoomTRM201ServiceData energeticRoomTRM201ServiceData;

    private SimpleDateFormat simpleDateFormat;

    @Autowired
    public JsonControllerEnergeticRoomTRM201(EnergeticRoomTRM201ServiceData energeticRoomTRM201ServiceData,
                                             SimpleDateFormat simpleDateFormat){
        this.energeticRoomTRM201ServiceData = energeticRoomTRM201ServiceData;
        this.simpleDateFormat = simpleDateFormat;
    }
    @ResponseBody
    @RequestMapping(value = "/generateChart", method = RequestMethod.POST)
    public List<TableModelEnergeticRoomTRM201> generateChartEnergeticRoomTRM201(@RequestBody DateFromChart dateFromChart){
        return this.generateTimeObject(energeticRoomTRM201ServiceData, dateFromChart, simpleDateFormat);
    }

    @ResponseBody
    @RequestMapping(value = "/generateAmountSizeTableByte", method = RequestMethod.POST)
    public long generateAmountSizeTableByte(){
        long som = 0;
        for (BigInteger bigInteger : energeticRoomTRM201ServiceData.readBaseSize()){
            som += bigInteger.longValue();
        }
        return som;
    }
}
