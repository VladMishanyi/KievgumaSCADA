package com.vk.controller;

import com.vk.chain.Chain4;
import com.vk.entity.json.DateFromChart;
import com.vk.entity.json.JsonBodyFloat;
import com.vk.entity.modbus.ModbusBodyQuery;
import com.vk.entity.table.TableModelSecondCehKameraVulcan1MPR51;
import com.vk.entity.table.TableModelSecondCehKameraVulcan3MPR51;
import com.vk.service.data.SecondCehKameraVulcan1MPR51ServiceData;
import com.vk.service.data.SecondCehKameraVulcan3MPR51ServiceData;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by KIP-PC99 on 21.11.2018.
 */
@RestController
@ComponentScan(basePackages = {"com.vk.service", "com.vk.service.data"})
public class JsonControllerSecondCehKameraVulcan3MPR51 extends JsonController {

    private Logger LOGGER = Logger.getLogger(JsonControllerSecondCehKameraVulcan3MPR51.class);

    private final SecondCehKameraVulcan3MPR51ServiceData secondCehKameraVulcan3MPR51ServiceData;

    private final SimpleDateFormat simpleDateFormat;

    @Autowired
    public JsonControllerSecondCehKameraVulcan3MPR51(final SecondCehKameraVulcan3MPR51ServiceData secondCehKameraVulcan3MPR51ServiceData,
                                                     final SimpleDateFormat simpleDateFormat){
        this.secondCehKameraVulcan3MPR51ServiceData = secondCehKameraVulcan3MPR51ServiceData;
        this.simpleDateFormat = simpleDateFormat;
    }

    @MessageMapping(value="/generateChartSecondCehKameraVulcan3MPR51")
    @SendTo("/topic/generateChartSecondCehKameraVulcan3MPR51")
    public List<TableModelSecondCehKameraVulcan3MPR51> generateChartSecondCehKameraVulcan3MPR51(final DateFromChart dateFromChart){
        return this.generateTimeObject(secondCehKameraVulcan3MPR51ServiceData, dateFromChart, simpleDateFormat);
    }

    @MessageMapping(value = "/write_steam_pwm")
    public void writeSteamPwm(final JsonBodyFloat jsonBodyFloat){
        float val = jsonBodyFloat.getValue();

        if ( (val >= 0F) && (val <= 65000F) ){
            Chain4.modbusBodyQueryQueue.add(new ModbusBodyQuery(0, val));
        } else{
            LOGGER.error("/write_steam_pwm  - out of bound length :"+val);
            System.out.println("/write_steam_pwm - out of bound length :"+val);
        }
    }
}
