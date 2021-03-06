package com.vk.controller;

import com.vk.entity.converter.DeviceToTableAirSensor2;
import com.vk.entity.converter.DeviceToTableAirSensor3;
import com.vk.entity.converter.DeviceToTableImplAirSensor2;
import com.vk.entity.converter.DeviceToTableImplAirSensor3;
import com.vk.entity.json.JsonBodyAirSensor;
import com.vk.entity.json.JsonBodyLocalDateTimeFromChart;
import com.vk.entity.table.TableModelAirSensor2;
import com.vk.entity.table.TableModelAirSensor3;
import com.vk.service.global.ServiceAirSensor2;
import com.vk.service.global.ServiceAirSensor3;
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
public class JsonControllerAirSensor3 {

    private final ServiceAirSensor3 service;

    @Autowired
    public JsonControllerAirSensor3(final ServiceAirSensor3 service){
        this.service = service;
    }

    @MessageMapping(value="/generate-chart-air-sensor3")
    @SendTo("/topic/generate-chart-air-sensor3")
    public List<TableModelAirSensor3> generateChart(JsonBodyLocalDateTimeFromChart jsonBodyLocalDateTimeFromChart){
        return service.databaseFindByDateBetween(jsonBodyLocalDateTimeFromChart.getStart(), jsonBodyLocalDateTimeFromChart.getEnd());
    }

    @RequestMapping(value = "/sensors/sensor3", consumes = "application/json", produces = "application/json", method = RequestMethod.POST)
    public void waitDataFromAirSensor(@RequestBody JsonBodyAirSensor json){
        DeviceToTableAirSensor3 deviceToTableAirSensor = new DeviceToTableImplAirSensor3();
        TableModelAirSensor3 tableModelAirSensor = deviceToTableAirSensor.convert(json);
        service.messageSendDevice(tableModelAirSensor);
        service.databaseAddTableDevice(tableModelAirSensor);
    }
}
