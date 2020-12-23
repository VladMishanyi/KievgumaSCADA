package com.vk.chain;

import com.vk.tasks.TaskEnergeticRoomTRM201;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = {"com.vk.tasks"})
public class ChainDatabaseRaspberrySecondDepartmentBalon extends Thread{

    private final Logger LOGGER = Logger.getLogger(this.getClass());

    private final TaskEnergeticRoomTRM201 taskEnergeticRoomTRM201;

    @Autowired
    public ChainDatabaseRaspberrySecondDepartmentBalon(final TaskEnergeticRoomTRM201 taskEnergeticRoomTRM201){
        this.taskEnergeticRoomTRM201 = taskEnergeticRoomTRM201;
        this.start();
    }

    @Override
    public void run(){
        while (!this.isInterrupted()){
            try {
                taskEnergeticRoomTRM201.syncDatabase();

                this.sleep(10000);
            }catch (InterruptedException e){
                String message = e.getMessage();
                LOGGER.error("Interrupted ChainDatabaseRaspberrySecondDepartmentBalon thread --"+message);
                System.out.println("Interrupted ChainDatabaseRaspberrySecondDepartmentBalon thread --"+message);
            }
        }
    }

}
