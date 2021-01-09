package com.vk.controller;

import com.vk.chain.ChainDatabaseRaspberrySecondDepartmentBalon;
import com.vk.chain.ChainDatabaseSecondCehBalonRaspberry;
import com.vk.chain.ChainModbusRaspberrySecondDepartmentBalon;
import com.vk.chain.ChainModbusSecondCehBalonRaspberry;
import com.vk.entity.json.JsonBodyLocalDateTimeFromChart;
import com.vk.entity.table.TableModelEnergeticRoomTRM202;
import com.vk.entity.table.TableModelSecondCehBalonTRM138;
import com.vk.service.global.ServiceEnergeticRoomTRM201;
import com.vk.service.global.ServiceSecondCheBalonTRM138;
import com.vk.tasks.global.TaskEnergeticRoomTRM201;
import com.vk.tasks.global.TaskSecondCehBalonTRM138;
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
public class JsonControllerSecondCehBalonTRM138 {

    private final ServiceSecondCheBalonTRM138 service;

    private ChainModbusSecondCehBalonRaspberry chainModbus;

    private ChainDatabaseSecondCehBalonRaspberry chainDatabase;

    private final TaskSecondCehBalonTRM138 task;

    @Autowired
    public JsonControllerSecondCehBalonTRM138(final ServiceSecondCheBalonTRM138 service,
                                              ChainModbusSecondCehBalonRaspberry chainModbus,
                                              ChainDatabaseSecondCehBalonRaspberry chainDatabase,
                                              final TaskSecondCehBalonTRM138 task,
                                              final SimpleDateFormat simpleDateFormat){
        this.service = service;
        this.chainModbus = chainModbus;
        this.chainDatabase = chainDatabase;
        this.task = task;
    }

    @MessageMapping(value="/generate-chart-second-ceh-balon-raspberry")
    @SendTo("/topic/generate-chart-second-ceh-balon-raspberry")
    public List<TableModelSecondCehBalonTRM138> generateChart(JsonBodyLocalDateTimeFromChart jsonBodyLocalDateTimeFromChart){
        return service.databaseFindByDateBetween(jsonBodyLocalDateTimeFromChart.getStart(), jsonBodyLocalDateTimeFromChart.getEnd());
    }

    @Scheduled(fixedRate = 1000*60)
    private void loopModbus(){
        if (!chainModbus.isAlive()){
            chainModbus = new ChainModbusSecondCehBalonRaspberry(task);
        }
    }

    @Scheduled(fixedRate = 1000*60)
    private void loopDatabase(){
        if (!chainDatabase.isAlive()){
            chainDatabase = new ChainDatabaseSecondCehBalonRaspberry(task);
        }
    }
}
