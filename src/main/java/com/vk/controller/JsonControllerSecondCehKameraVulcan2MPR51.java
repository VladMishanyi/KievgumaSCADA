package com.vk.controller;

import com.vk.entity.device.DeviceModelSecondCehKameraVulcan2MPR51;
import com.vk.entity.json.DateFromChart;
import com.vk.entity.table.TableModelSecondCehKameraVulcan2MPR51;
import com.vk.service.data.SecondCehKameraVulcan2MPR51ServiceData;
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
public class JsonControllerSecondCehKameraVulcan2MPR51 extends JsonController<DeviceModelSecondCehKameraVulcan2MPR51, SecondCehKameraVulcan2MPR51ServiceData, TableModelSecondCehKameraVulcan2MPR51> {

    private final SecondCehKameraVulcan2MPR51ServiceData secondCehKameraVulcan2MPR51ServiceData;

    private final SimpleDateFormat simpleDateFormat;

    @Autowired
    public JsonControllerSecondCehKameraVulcan2MPR51(final SecondCehKameraVulcan2MPR51ServiceData secondCehKameraVulcan2MPR51ServiceData,
                                                     final SimpleDateFormat simpleDateFormat){
        this.secondCehKameraVulcan2MPR51ServiceData = secondCehKameraVulcan2MPR51ServiceData;
        this.simpleDateFormat = simpleDateFormat;
    }

    @MessageMapping(value="/generateChartSecondCehKameraVulcan2MPR51")
    @SendTo("/topic/generateChartSecondCehKameraVulcan2MPR51")
    public List<TableModelSecondCehKameraVulcan2MPR51> generateChartSecondCehKameraVulcan2MPR51(final DateFromChart dateFromChart){
        return this.generateTimeObject(secondCehKameraVulcan2MPR51ServiceData, dateFromChart, simpleDateFormat);
    }
}
