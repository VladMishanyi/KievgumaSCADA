package com.vk.chain;

import com.vk.entity.modbus.ModbusBodyQuery;
import com.vk.tasks.TaskEnergeticRoomTRM201;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.Queue;

@Component
@ComponentScan(basePackages = {"com.vk.tasks"})
public class ChainModbusRaspberrySecondDepartmentBalon extends Thread{

    private final Logger LOGGER = Logger.getLogger(this.getClass());

    public static Queue<ModbusBodyQuery> modbusBodyQueryQueue = new LinkedList<>();

    private final TaskEnergeticRoomTRM201 taskEnergeticRoomTRM201;

    @Autowired
    public ChainModbusRaspberrySecondDepartmentBalon(final TaskEnergeticRoomTRM201 taskEnergeticRoomTRM201){
        this.taskEnergeticRoomTRM201 = taskEnergeticRoomTRM201;
        this.start();
    }

    @Override
    public void run(){
        while (!this.isInterrupted()){
            try {

                taskEnergeticRoomTRM201.readModbusAndSendMessage();

                this.sleep(1000);
            }catch (InterruptedException e){
                String message = e.getMessage();
                LOGGER.error("Interrupted ChainModbusRaspberrySecondDepartmentBalon thread --"+message);
                System.out.println("Interrupted ChainModbusRaspberrySecondDepartmentBalon thread --"+message);
            }
        }
    }
}
