package com.vk.chain;

import com.vk.controller.WebController;
import com.vk.tasks.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by KIP-PC99 on 05.11.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.service"})
public class Chain3/* extends Thread*/ {

    private final Logger LOGGER = Logger.getLogger(WebController.class);

    private final TaskSevenCehAutoclavSPK107 taskSevenCehAutoclavSPK107;

    private final TaskLaboratoryAutoclavMV110 taskLaboratoryAutoclavMV110;

    @Autowired
    public Chain3(final TaskSevenCehAutoclavSPK107 taskSevenCehAutoclavSPK107,
                 final TaskLaboratoryAutoclavMV110 taskLaboratoryAutoclavMV110){
        this.taskSevenCehAutoclavSPK107 = taskSevenCehAutoclavSPK107;
        this.taskLaboratoryAutoclavMV110 = taskLaboratoryAutoclavMV110;
    }

//    @Override
    public void start() {
        taskSevenCehAutoclavSPK107.work1();

        taskLaboratoryAutoclavMV110.work1();
    }

    public TaskSevenCehAutoclavSPK107 getTaskSevenCehAutoclavSPK107() {
        return taskSevenCehAutoclavSPK107;
    }

    public TaskLaboratoryAutoclavMV110 getTaskLaboratoryAutoclavMV110() {
        return taskLaboratoryAutoclavMV110;
    }
}
