package com.vk.controller;

import com.vk.chain.ChainDatabaseSecondCehBalonRaspberry;
import com.vk.chain.ChainModbusSecondCehBalonRaspberry;
import com.vk.entity.converter.DeviceToTableAirSensor;
import com.vk.entity.converter.DeviceToTableImplAirSensor;
import com.vk.entity.json.JsonBodyAirSensor;
import com.vk.entity.json.JsonBodyLocalDateTimeFromChart;
import com.vk.entity.table.TableModelAirSensor1;
import com.vk.entity.table.TableModelSecondCehBalonTRM138;
import com.vk.service.global.ServiceAirSensor1;
import com.vk.service.global.ServiceSecondCheBalonTRM138;
import com.vk.tasks.global.TaskSecondCehBalonTRM138;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@ComponentScan(basePackages = {"com.vk.service", "com.vk.service.data"})
public class JsonControllerAirSensor {

    private final ServiceAirSensor1 service;

    @Autowired
    public JsonControllerAirSensor(final ServiceAirSensor1 service){
        this.service = service;
    }

    @MessageMapping(value="/generate-chart-air-sensor1")
    @SendTo("/topic/generate-chart-air-sensor1")
    public List<TableModelAirSensor1> generateChart(JsonBodyLocalDateTimeFromChart jsonBodyLocalDateTimeFromChart){
        return service.databaseFindByDateBetween(jsonBodyLocalDateTimeFromChart.getStart(), jsonBodyLocalDateTimeFromChart.getEnd());
    }

    @RequestMapping(value = "/sensors/sensor1", consumes = "application/json", produces = "application/json", method = RequestMethod.POST)
    public void waitDataFromAirSensor(@RequestBody JsonBodyAirSensor json){
        DeviceToTableAirSensor deviceToTableAirSensor = new DeviceToTableImplAirSensor();
        TableModelAirSensor1 tableModelAirSensor1 = deviceToTableAirSensor.convert(json);
        service.messageSendDevice(tableModelAirSensor1);
        service.databaseAddTableDevice(tableModelAirSensor1);
    }
}
