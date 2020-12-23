package com.vk.controller;

import com.vk.chain.ChainDatabaseRaspberrySecondDepartmentBalon;
import com.vk.chain.ChainModbusRaspberrySecondDepartmentBalon;
import com.vk.entity.device.DeviceModelEnergeticRoomTRM202;
import com.vk.entity.json.DateFromChart;
import com.vk.entity.json.JsonBodyLocalDateTimeFromChart;
import com.vk.entity.table.TableModelEnergeticRoomTRM202;
import com.vk.service.data.EnergeticRoomTRM201ServiceData;
import com.vk.tasks.TaskEnergeticRoomTRM201;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * Created by User on 2018-03-02.
 */
@RestController
@EnableScheduling
@ComponentScan(basePackages = {"com.vk.service", "com.vk.service.data"})
public class JsonControllerEnergeticRoomTRM201 {

    private final EnergeticRoomTRM201ServiceData energeticRoomTRM201ServiceData;

    private ChainModbusRaspberrySecondDepartmentBalon chainModbusRaspberrySecondDepartmentBalon;

    private ChainDatabaseRaspberrySecondDepartmentBalon chainDatabaseRaspberrySecondDepartmentBalon;

    private final TaskEnergeticRoomTRM201 taskEnergeticRoomTRM201;

    @Autowired
    public JsonControllerEnergeticRoomTRM201(final EnergeticRoomTRM201ServiceData energeticRoomTRM201ServiceData,
                                             ChainModbusRaspberrySecondDepartmentBalon chainModbusRaspberrySecondDepartmentBalon,
                                             ChainDatabaseRaspberrySecondDepartmentBalon chainDatabaseRaspberrySecondDepartmentBalon,
                                             final TaskEnergeticRoomTRM201 taskEnergeticRoomTRM201,
                                             final SimpleDateFormat simpleDateFormat){
        this.energeticRoomTRM201ServiceData = energeticRoomTRM201ServiceData;
        this.chainModbusRaspberrySecondDepartmentBalon = chainModbusRaspberrySecondDepartmentBalon;
        this.chainDatabaseRaspberrySecondDepartmentBalon = chainDatabaseRaspberrySecondDepartmentBalon;
        this.taskEnergeticRoomTRM201 = taskEnergeticRoomTRM201;
    }

    @MessageMapping(value="/generateChart")
    @SendTo("/topic/generateChart")
    public List<TableModelEnergeticRoomTRM202> generateChartEnergeticRoomTRM201(JsonBodyLocalDateTimeFromChart jsonBodyLocalDateTimeFromChart
                                                                                /*@RequestParam("start") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime start,
                                                                                 @RequestParam("end") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime end*/){
        return energeticRoomTRM201ServiceData.databaseFindByDateBetween(jsonBodyLocalDateTimeFromChart.getStart(), jsonBodyLocalDateTimeFromChart.getEnd());
    }

    @Scheduled(fixedRate = 1000*60)
    private void loopModbus(){
        if (!chainModbusRaspberrySecondDepartmentBalon.isAlive()){
            chainModbusRaspberrySecondDepartmentBalon = new ChainModbusRaspberrySecondDepartmentBalon(taskEnergeticRoomTRM201);
        }
    }

    @Scheduled(fixedRate = 1000*60)
    private void loopDatabase(){
        if (!chainDatabaseRaspberrySecondDepartmentBalon.isAlive()){
            chainDatabaseRaspberrySecondDepartmentBalon = new ChainDatabaseRaspberrySecondDepartmentBalon(taskEnergeticRoomTRM201);
        }
    }
}
