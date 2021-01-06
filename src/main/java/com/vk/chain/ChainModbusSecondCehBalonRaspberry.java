package com.vk.chain;

import com.vk.entity.modbus.ModbusBodyQuery;
import com.vk.tasks.global.TaskEnergeticRoomTRM201;
import com.vk.tasks.global.TaskSecondCehBalonTRM138;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.Queue;

@Component
@ComponentScan(basePackages = {"com.vk.tasks"})
public class ChainModbusSecondCehBalonRaspberry  extends Thread{

    private final Logger LOGGER = Logger.getLogger(this.getClass());

    public static Queue<ModbusBodyQuery> modbusBodyQueryQueue = new LinkedList<>();

    private TaskSecondCehBalonTRM138 task;

    @Autowired
    public ChainModbusSecondCehBalonRaspberry(final TaskSecondCehBalonTRM138 task){
        this.task = task;
        this.start();
    }

    @Override
    public void run(){
        while (!this.isInterrupted()){
            try {

                task.readModbusAndSendMessage();

                this.sleep(1000);
            }catch (InterruptedException e){
                String message = e.getMessage();
                LOGGER.error("Interrupted"+this.getClass()+"thread --"+message);
                System.out.println("Interrupted"+this.getClass()+"thread --"+message);
            }
        }
    }
}
