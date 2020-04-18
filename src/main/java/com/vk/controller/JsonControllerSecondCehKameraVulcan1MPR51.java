package com.vk.controller;

import com.vk.entity.device.DeviceModelSecondCehKameraVulcan1MPR51;
import com.vk.entity.json.DateFromChart;
import com.vk.entity.table.TableModelSecondCehKameraVulcan1MPR51;
import com.vk.service.data.SecondCehKameraVulcan1MPR51ServiceData;
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
public class JsonControllerSecondCehKameraVulcan1MPR51 extends JsonController<DeviceModelSecondCehKameraVulcan1MPR51, SecondCehKameraVulcan1MPR51ServiceData, TableModelSecondCehKameraVulcan1MPR51> {

    private final SecondCehKameraVulcan1MPR51ServiceData secondCehKameraVulcan1MPR51ServiceData;

    private final SimpleDateFormat simpleDateFormat;

    @Autowired
    public JsonControllerSecondCehKameraVulcan1MPR51(final SecondCehKameraVulcan1MPR51ServiceData secondCehKameraVulcan1MPR51ServiceData,
                                                     final SimpleDateFormat simpleDateFormat){
        this.secondCehKameraVulcan1MPR51ServiceData = secondCehKameraVulcan1MPR51ServiceData;
        this.simpleDateFormat = simpleDateFormat;
    }

    @MessageMapping(value="/generateChartSecondCehKameraVulcan1MPR51")
    @SendTo("/topic/generateChartSecondCehKameraVulcan1MPR51")
    public List<TableModelSecondCehKameraVulcan1MPR51> generateChartSecondCehKameraVulcan1MPR51(final DateFromChart dateFromChart){
        return this.generateTimeObject(secondCehKameraVulcan1MPR51ServiceData, dateFromChart, simpleDateFormat);
    }
}
