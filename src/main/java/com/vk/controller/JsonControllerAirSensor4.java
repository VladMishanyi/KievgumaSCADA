package com.vk.controller;

import com.vk.entity.converter.DeviceToTableAirSensor4;
import com.vk.entity.converter.DeviceToTableImplAirSensor4;
import com.vk.entity.json.JsonBodyAirSensor;
import com.vk.entity.json.JsonBodyLocalDateTimeFromChart;
import com.vk.entity.table.TableModelAirSensor4;
import com.vk.service.global.ServiceAirSensor4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@ComponentScan(basePackages = {"com.vk.service", "com.vk.service.data"})
public class JsonControllerAirSensor4 {

    private final ServiceAirSensor4 service;

    @Autowired
    public JsonControllerAirSensor4(final ServiceAirSensor4 service){
        this.service = service;
    }

    @MessageMapping(value="/generate-chart-air-sensor4")
    @SendTo("/topic/generate-chart-air-sensor4")
    public List<TableModelAirSensor4> generateChart(JsonBodyLocalDateTimeFromChart jsonBodyLocalDateTimeFromChart){
        return service.databaseFindByDateBetween(jsonBodyLocalDateTimeFromChart.getStart(), jsonBodyLocalDateTimeFromChart.getEnd());
    }

    @RequestMapping(value = "/sensors/sensor4", consumes = "application/json", produces = "application/json", method = RequestMethod.POST)
    public void waitDataFromAirSensor(@RequestBody JsonBodyAirSensor json){
        DeviceToTableAirSensor4 deviceToTableAirSensor = new DeviceToTableImplAirSensor4();
        TableModelAirSensor4 tableModelAirSensor = deviceToTableAirSensor.convert(json);
        service.messageSendDevice(tableModelAirSensor);
        service.databaseAddTableDevice(tableModelAirSensor);
    }
}
