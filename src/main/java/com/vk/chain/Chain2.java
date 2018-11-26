package com.vk.chain;

import com.vk.controller.WebController;
import com.vk.tasks.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by KIP-PC99 on 05.11.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.service"})
public class Chain2 extends Thread {

    private final Logger LOGGER = Logger.getLogger(Chain2.class);

    private final TaskFirstCehSmesitel1KMSF1 taskFirstCehSmesitel1KMSF1;

    private final TaskFirstCehSmesitel2KMSF1 taskFirstCehSmesitel2KMSF1;

    private final TaskFirstCehSmesitel3KMSF1 taskFirstCehSmesitel3KMSF1;

    private final TaskFirstCehSmesitel4KMSF1 taskFirstCehSmesitel4KMSF1;

    private final TaskFirstCehSmesitel5KMSF1 taskFirstCehSmesitel5KMSF1;

    @Autowired
    public Chain2(final TaskFirstCehSmesitel1KMSF1 taskFirstCehSmesitel1KMSF1,
                  final TaskFirstCehSmesitel2KMSF1 taskFirstCehSmesitel2KMSF1,
                  final TaskFirstCehSmesitel3KMSF1 taskFirstCehSmesitel3KMSF1,
                  final TaskFirstCehSmesitel4KMSF1 taskFirstCehSmesitel4KMSF1,
                  final TaskFirstCehSmesitel5KMSF1 taskFirstCehSmesitel5KMSF1){
        this.taskFirstCehSmesitel1KMSF1 = taskFirstCehSmesitel1KMSF1;
        this.taskFirstCehSmesitel2KMSF1 = taskFirstCehSmesitel2KMSF1;
        this.taskFirstCehSmesitel3KMSF1 = taskFirstCehSmesitel3KMSF1;
        this.taskFirstCehSmesitel4KMSF1 = taskFirstCehSmesitel4KMSF1;
        this.taskFirstCehSmesitel5KMSF1 = taskFirstCehSmesitel5KMSF1;
        this.start();
    }

    @Override
    public void run(){
        while (!this.isInterrupted()){
            try {
                System.out.println("-----------------------------------------------------START SECOND CHAIN22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222");
                taskFirstCehSmesitel1KMSF1.work2();

                taskFirstCehSmesitel2KMSF1.work2();

                taskFirstCehSmesitel3KMSF1.work2();

                taskFirstCehSmesitel4KMSF1.work2();

                taskFirstCehSmesitel5KMSF1.work2();
                System.out.println("-----------------------------------------------------END SECOND CHAIN22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222");
                this.sleep(5000);
            }catch (InterruptedException e){
                String message = e.getMessage();
                LOGGER.error("Interrupted chain2 thread --"+message);
                System.out.println("Interrupted chain2 thread --"+message);
            }
        }
    }
}
