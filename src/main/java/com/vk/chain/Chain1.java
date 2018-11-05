package com.vk.chain;

import com.vk.controller.WebController;
import com.vk.tasks.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by KIP-PC99 on 05.11.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.service"})
public class Chain1/* extends Thread */{

    private Logger LOGGER = Logger.getLogger(WebController.class);

    private TaskEnergeticRoomTRM201 taskEnergeticRoomTRM201;

    private TaskFirstCehAutoclavTRM202 taskFirstCehAutoclavTRM202;

    private TaskFirstCehBuzulukTRM200 taskFirstCehBuzulukTRM200;

    private TaskKameraDozrevanyaMPR51 taskKameraDozrevanyaMPR51;

    private TaskThirdCehAutoclavTRM202 taskThirdCehAutoclavTRM202;

    private TaskKotelnyaParMikrolITM4 taskKotelnyaParMikrolITM4;

    @Autowired
    public Chain1(final TaskEnergeticRoomTRM201 taskEnergeticRoomTRM201,
                  final TaskFirstCehAutoclavTRM202 taskFirstCehAutoclavTRM202,
                  final TaskFirstCehBuzulukTRM200 taskFirstCehBuzulukTRM200,
                  final TaskKameraDozrevanyaMPR51 taskKameraDozrevanyaMPR51,
                  final TaskThirdCehAutoclavTRM202 taskThirdCehAutoclavTRM202,
                  final TaskKotelnyaParMikrolITM4 taskKotelnyaParMikrolITM4){
        this.taskEnergeticRoomTRM201 = taskEnergeticRoomTRM201;
        this.taskFirstCehAutoclavTRM202 = taskFirstCehAutoclavTRM202;
        this.taskFirstCehBuzulukTRM200 = taskFirstCehBuzulukTRM200;
        this.taskKameraDozrevanyaMPR51 = taskKameraDozrevanyaMPR51;
        this.taskThirdCehAutoclavTRM202 = taskThirdCehAutoclavTRM202;
        this.taskKotelnyaParMikrolITM4 = taskKotelnyaParMikrolITM4;
    }

//    @Override
    public void start() {
        taskEnergeticRoomTRM201.work1();

        taskFirstCehAutoclavTRM202.work1();

        taskFirstCehBuzulukTRM200.work1();

        taskKameraDozrevanyaMPR51.work2();

        taskThirdCehAutoclavTRM202.work1();

        taskKotelnyaParMikrolITM4.work1();
    }

    public TaskEnergeticRoomTRM201 getTaskEnergeticRoomTRM201() {
        return taskEnergeticRoomTRM201;
    }

    public TaskFirstCehAutoclavTRM202 getTaskFirstCehAutoclavTRM202() {
        return taskFirstCehAutoclavTRM202;
    }

    public TaskFirstCehBuzulukTRM200 getTaskFirstCehBuzulukTRM200() {
        return taskFirstCehBuzulukTRM200;
    }

    public TaskKameraDozrevanyaMPR51 getTaskKameraDozrevanyaMPR51() {
        return taskKameraDozrevanyaMPR51;
    }

    public TaskThirdCehAutoclavTRM202 getTaskThirdCehAutoclavTRM202() {
        return taskThirdCehAutoclavTRM202;
    }

    public TaskKotelnyaParMikrolITM4 getTaskKotelnyaParMikrolITM4() {
        return taskKotelnyaParMikrolITM4;
    }
}
