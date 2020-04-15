package com.vk.chain;

import com.vk.controller.WebController;
import com.vk.tasks.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Created by KIP-PC99 on 21.11.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.service"})
public class Chain4/* extends Thread */{

    private final Logger LOGGER = Logger.getLogger(Chain4.class);

    private final TaskImplSecondCehKameraVulcan1MPR51 taskSecondCehKameraVulcan1MPR51;

    private final TaskImplSecondCehKameraVulcan2MPR51 taskSecondCehKameraVulcan2MPR51;

    private final TaskImplSecondCehKameraVulcan3MPR51 taskSecondCehKameraVulcan3MPR51;

    @Autowired
    public Chain4(final TaskImplSecondCehKameraVulcan1MPR51 taskSecondCehKameraVulcan1MPR51,
                  final TaskImplSecondCehKameraVulcan2MPR51 taskSecondCehKameraVulcan2MPR51,
                  final TaskImplSecondCehKameraVulcan3MPR51 taskSecondCehKameraVulcan3MPR51){
        this.taskSecondCehKameraVulcan1MPR51 = taskSecondCehKameraVulcan1MPR51;
        this.taskSecondCehKameraVulcan2MPR51 = taskSecondCehKameraVulcan2MPR51;
        this.taskSecondCehKameraVulcan3MPR51 = taskSecondCehKameraVulcan3MPR51;
//        this.start();
    }

//    @Override
    public void run() {
//        while (!this.isInterrupted()){
//            try {
                System.out.println("-----------------------------------------------------START FOURTH CHAIN444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
//                taskSecondCehKameraVulcan1MPR51.work1();

//                taskSecondCehKameraVulcan2MPR51.work1();

                taskSecondCehKameraVulcan3MPR51.work1();
                System.out.println("-----------------------------------------------------END FOURTH CHAIN444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
//                this.sleep(5000);
//            }catch (InterruptedException e){
//                String message = e.getMessage();
//                LOGGER.error("Interrupted chain4 thread --"+message);
//                System.out.println("Interrupted chain4 thread --"+message);
//            }
//        }
    }
}
