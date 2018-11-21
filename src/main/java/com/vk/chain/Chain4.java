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
public class Chain4/* extends Thread*/ {

    private final Logger LOGGER = Logger.getLogger(WebController.class);

    private final TaskSecondCehKameraVulcan1MPR51 taskSecondCehKameraVulcan1MPR51;

    private final TaskSecondCehKameraVulcan2MPR51 taskSecondCehKameraVulcan2MPR51;

    private final TaskSecondCehKameraVulcan3MPR51 taskSecondCehKameraVulcan3MPR51;

    @Autowired
    public Chain4(final TaskSecondCehKameraVulcan1MPR51 taskSecondCehKameraVulcan1MPR51,
                  final TaskSecondCehKameraVulcan2MPR51 taskSecondCehKameraVulcan2MPR51,
                  final TaskSecondCehKameraVulcan3MPR51 taskSecondCehKameraVulcan3MPR51){
        this.taskSecondCehKameraVulcan1MPR51 = taskSecondCehKameraVulcan1MPR51;
        this.taskSecondCehKameraVulcan2MPR51 = taskSecondCehKameraVulcan2MPR51;
        this.taskSecondCehKameraVulcan3MPR51 = taskSecondCehKameraVulcan3MPR51;
    }

    //    @Override
    public void start() {
        taskSecondCehKameraVulcan1MPR51.work1();

        taskSecondCehKameraVulcan2MPR51.work1();

        taskSecondCehKameraVulcan3MPR51.work1();
    }
}
