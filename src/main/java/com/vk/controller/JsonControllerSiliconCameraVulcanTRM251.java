package com.vk.controller;

import com.vk.chain.ChainDatabaseSecondCehBalonRaspberry;
import com.vk.chain.ChainDatabaseSiliconCameraVulcanRaspberry;
import com.vk.chain.ChainModbusSecondCehBalonRaspberry;
import com.vk.chain.ChainModbusSiliconCameraVulcanRaspberry;
import com.vk.entity.json.JsonBodyLocalDateTimeFromChart;
import com.vk.entity.table.TableModelSecondCehBalonTRM138;
import com.vk.entity.table.TableModelSiliconeCameraVulcanTRM251;
import com.vk.service.global.ServiceSecondCheBalonTRM138;
import com.vk.service.global.ServiceSiliconCameraVulcanTRM251;
import com.vk.tasks.global.TaskSecondCehBalonTRM138;
import com.vk.tasks.global.TaskSiliconCameraVulcanTRM251;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@EnableScheduling
@ComponentScan(basePackages = {"com.vk.service", "com.vk.service.data"})
public class JsonControllerSiliconCameraVulcanTRM251 {

    private final ServiceSiliconCameraVulcanTRM251 service;

    private ChainModbusSiliconCameraVulcanRaspberry chainModbus;

    private ChainDatabaseSiliconCameraVulcanRaspberry chainDatabase;

    private final TaskSiliconCameraVulcanTRM251 task;

    @Autowired
    public JsonControllerSiliconCameraVulcanTRM251(final ServiceSiliconCameraVulcanTRM251 service,
                                                   ChainModbusSiliconCameraVulcanRaspberry chainModbus,
                                                   ChainDatabaseSiliconCameraVulcanRaspberry chainDatabase,
                                                   final TaskSiliconCameraVulcanTRM251 task){
        this.service = service;
        this.chainModbus = chainModbus;
        this.chainDatabase = chainDatabase;
        this.task = task;
    }

    @MessageMapping(value="/generate-chart-silicon-camera-vulcan-raspberry")
    @SendTo("/topic/generate-chart-silicon-camera-vulcan-raspberry")
    public List<TableModelSiliconeCameraVulcanTRM251> generateChart(JsonBodyLocalDateTimeFromChart jsonBodyLocalDateTimeFromChart){
        return service.databaseFindByDateBetween(jsonBodyLocalDateTimeFromChart.getStart(), jsonBodyLocalDateTimeFromChart.getEnd());
    }

    @Scheduled(fixedRate = 1000*60)
    private void loopModbus(){
        if (!chainModbus.isAlive()){
            chainModbus = new ChainModbusSiliconCameraVulcanRaspberry(task);
        }
    }

    @Scheduled(fixedRate = 1000*60)
    private void loopDatabase(){
        if (!chainDatabase.isAlive()){
            chainDatabase = new ChainDatabaseSiliconCameraVulcanRaspberry(task);
        }
    }
}
