package com.vk.chain;

import com.vk.tasks.global.TaskSiliconCameraVulcanTRM251;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = {"com.vk.tasks"})
public class ChainDatabaseSiliconCameraVulcanRaspberry extends Thread{

    private final Logger LOGGER = Logger.getLogger(this.getClass());

    private final TaskSiliconCameraVulcanTRM251 task;

    @Autowired
    public ChainDatabaseSiliconCameraVulcanRaspberry(final TaskSiliconCameraVulcanTRM251 task){
        this.task = task;
        this.start();
    }

    @Override
    public void run(){
        while (!this.isInterrupted()){
            try {
                task.syncDatabase();

                this.sleep(1000*14);
            }catch (InterruptedException e){
                String message = e.getMessage();
                LOGGER.error("Interrupted"+this.getClass()+"thread --"+message);
                System.out.println("Interrupted"+this.getClass()+"thread --"+message);
            }
        }
    }
}
