package com.vk.chain;

import com.vk.controller.WebController;
import com.vk.entity.modbus.ModbusBodyQuery;
import com.vk.service.data.SecondCehKameraVulcan3MPR51ServiceData;
import com.vk.tasks.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by KIP-PC99 on 21.11.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.service"})
public class Chain4/* extends Thread */{

    private final Logger LOGGER = Logger.getLogger(Chain4.class);

    public static Queue<ModbusBodyQuery> modbusBodyQueryQueue = new LinkedList<>();

    private final TaskImplSecondCehKameraVulcan1MPR51 taskSecondCehKameraVulcan1MPR51;

    private final TaskImplSecondCehKameraVulcan2MPR51 taskSecondCehKameraVulcan2MPR51;

    private final TaskImplSecondCehKameraVulcan3MPR51 taskSecondCehKameraVulcan3MPR51;

    private final SecondCehKameraVulcan3MPR51ServiceData secondCehKameraVulcan3MPR51ServiceData;

    @Autowired
    public Chain4(final TaskImplSecondCehKameraVulcan1MPR51 taskSecondCehKameraVulcan1MPR51,
                  final TaskImplSecondCehKameraVulcan2MPR51 taskSecondCehKameraVulcan2MPR51,
                  final TaskImplSecondCehKameraVulcan3MPR51 taskSecondCehKameraVulcan3MPR51,
                  final SecondCehKameraVulcan3MPR51ServiceData secondCehKameraVulcan3MPR51ServiceData){
        this.taskSecondCehKameraVulcan1MPR51 = taskSecondCehKameraVulcan1MPR51;
        this.taskSecondCehKameraVulcan2MPR51 = taskSecondCehKameraVulcan2MPR51;
        this.taskSecondCehKameraVulcan3MPR51 = taskSecondCehKameraVulcan3MPR51;
        this.secondCehKameraVulcan3MPR51ServiceData = secondCehKameraVulcan3MPR51ServiceData;
//        this.start();
    }

//    @Override
    public void run() {
//        while (!this.isInterrupted()){
//            try {
                System.out.println("-----------------------------------------------------START FOURTH CHAIN444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
                taskSecondCehKameraVulcan1MPR51.work1();

                taskSecondCehKameraVulcan2MPR51.work1();

                taskSecondCehKameraVulcan3MPR51.work1();

                checkQueryQueue();
                System.out.println("-----------------------------------------------------END FOURTH CHAIN444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
//                this.sleep(5000);
//            }catch (InterruptedException e){
//                String message = e.getMessage();
//                LOGGER.error("Interrupted chain4 thread --"+message);
//                System.out.println("Interrupted chain4 thread --"+message);
//            }
//        }
    }


    public void checkQueryQueue(){
        if (modbusBodyQueryQueue.size() > 0) {
            while (!modbusBodyQueryQueue.isEmpty()) {
                ModbusBodyQuery body = modbusBodyQueryQueue.poll();
                switch (body.getQueryNumber()) {
                    case 0:
                        secondCehKameraVulcan3MPR51ServiceData.writeDataToRegister0(body.getValueFloat());
                        break;

                    default: {
                        LOGGER.error("Wrong command in Chain4 --" + body.getQueryNumber());
                        System.out.println("Wrong command in Chain4 --" + body.getQueryNumber());
                        break;
                    }
                }
            }
        }
    }
}
