package com.vk.chain;

import com.vk.tasks.global.TaskEnergeticRoomTRM201;
import com.vk.tasks.global.TaskSecondCehBalonTRM138;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = {"com.vk.tasks"})
public class ChainDatabaseSecondCehBalonRaspberry extends Thread{

    private final Logger LOGGER = Logger.getLogger(this.getClass());

    private final TaskSecondCehBalonTRM138 task;

    @Autowired
    public ChainDatabaseSecondCehBalonRaspberry(final TaskSecondCehBalonTRM138 task){
        this.task = task;
        this.start();
    }

    @Override
    public void run(){
        while (!this.isInterrupted()){
            try {
                task.syncDatabase();

                this.sleep(1000*10);
            }catch (InterruptedException e){
                String message = e.getMessage();
                LOGGER.error("Interrupted"+this.getClass()+"thread --"+message);
                System.out.println("Interrupted"+this.getClass()+"thread --"+message);
            }
        }
    }
}
