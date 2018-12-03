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
public class Chain3/* extends Thread*/{

    private final Logger LOGGER = Logger.getLogger(Chain3.class);

    private final TaskImplSevenCehAutoclavSPK107 taskSevenCehAutoclavSPK107;

    private final TaskImplLaboratoryAutoclavMV110 taskLaboratoryAutoclavMV110;

    @Autowired
    public Chain3(final TaskImplSevenCehAutoclavSPK107 taskSevenCehAutoclavSPK107,
                  final TaskImplLaboratoryAutoclavMV110 taskLaboratoryAutoclavMV110){
        this.taskSevenCehAutoclavSPK107 = taskSevenCehAutoclavSPK107;
        this.taskLaboratoryAutoclavMV110 = taskLaboratoryAutoclavMV110;
//        this.start();
    }

//    @Override
    public void run() {
//        while (!this.isInterrupted()){
//            try {
                System.out.println("-----------------------------------------------------START THIRD CHAIN3333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333");
                taskSevenCehAutoclavSPK107.work1();

                taskLaboratoryAutoclavMV110.work1();
                System.out.println("-----------------------------------------------------END THIRD CHAIN3333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333");
//                this.sleep(5000);
//            }catch (InterruptedException e){
//                String message = e.getMessage();
//                LOGGER.error("Interrupted chain3 thread --"+message);
//                System.out.println("Interrupted chain3 thread --"+message);
//            }
//        }
    }
}
