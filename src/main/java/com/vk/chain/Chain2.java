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
public class Chain2/* extends Thread */{

    private final Logger LOGGER = Logger.getLogger(Chain2.class);

    private final TaskImplFirstCehSmesitel1KMSF1 taskImplFirstCehSmesitel1KMSF1;

    private final TaskImplFirstCehSmesitel2KMSF1 taskImplFirstCehSmesitel2KMSF1;

    private final TaskImplFirstCehSmesitel3KMSF1 taskImplFirstCehSmesitel3KMSF1;

    private final TaskImplFirstCehSmesitel4KMSF1 taskImplFirstCehSmesitel4KMSF1;

    private final TaskImplFirstCehSmesitel5KMSF1 taskImplFirstCehSmesitel5KMSF1;

    @Autowired
    public Chain2(final TaskImplFirstCehSmesitel1KMSF1 taskImplFirstCehSmesitel1KMSF1,
                  final TaskImplFirstCehSmesitel2KMSF1 taskImplFirstCehSmesitel2KMSF1,
                  final TaskImplFirstCehSmesitel3KMSF1 taskImplFirstCehSmesitel3KMSF1,
                  final TaskImplFirstCehSmesitel4KMSF1 taskImplFirstCehSmesitel4KMSF1,
                  final TaskImplFirstCehSmesitel5KMSF1 taskImplFirstCehSmesitel5KMSF1){
        this.taskImplFirstCehSmesitel1KMSF1 = taskImplFirstCehSmesitel1KMSF1;
        this.taskImplFirstCehSmesitel2KMSF1 = taskImplFirstCehSmesitel2KMSF1;
        this.taskImplFirstCehSmesitel3KMSF1 = taskImplFirstCehSmesitel3KMSF1;
        this.taskImplFirstCehSmesitel4KMSF1 = taskImplFirstCehSmesitel4KMSF1;
        this.taskImplFirstCehSmesitel5KMSF1 = taskImplFirstCehSmesitel5KMSF1;
//        this.start();
    }

//    @Override
    public void run(){
//        while (!this.isInterrupted()){
//            try {
                System.out.println("-----------------------------------------------------START SECOND CHAIN22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222");
                taskImplFirstCehSmesitel1KMSF1.work2();

                taskImplFirstCehSmesitel2KMSF1.work2();

                taskImplFirstCehSmesitel3KMSF1.work2();

                taskImplFirstCehSmesitel4KMSF1.work2();

                taskImplFirstCehSmesitel5KMSF1.work2();
                System.out.println("-----------------------------------------------------END SECOND CHAIN22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222");
//                this.sleep(5000);
//            }catch (InterruptedException e){
//                String message = e.getMessage();
//                LOGGER.error("Interrupted chain2 thread --"+message);
//                System.out.println("Interrupted chain2 thread --"+message);
//            }
//        }
    }
}
