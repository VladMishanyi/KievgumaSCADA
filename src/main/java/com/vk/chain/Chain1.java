package com.vk.chain;

import com.vk.entity.modbus.ModbusBodyQuery;
import com.vk.tasks.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by KIP-PC99 on 05.11.2018.
 */
@Component
@ComponentScan(basePackages = {"com.vk.service"})
public class Chain1/* extends Thread */{

    private Logger LOGGER = Logger.getLogger(Chain1.class);

    public static Queue<ModbusBodyQuery> bodyQuery = new LinkedList<>();

    /*private final TaskEnergeticRoomTRM201 taskEnergeticRoomTRM201;*/

    private final TaskFirstCehAutoclavTRM202 taskFirstCehAutoclavTRM202;

    private final TaskFirstCehBuzulukTRM200 taskFirstCehBuzulukTRM200;

    private final TaskKameraDozrevanyaMPR51 taskKameraDozrevanyaMPR51;

    private final TaskThirdCehAutoclavTRM202 taskThirdCehAutoclavTRM202;

    private final TaskKotelnyaParMikrolITM4 taskKotelnyaParMikrolITM4;

    @Autowired
    public Chain1(/*final TaskEnergeticRoomTRM201 taskEnergeticRoomTRM201,*/
                  final TaskFirstCehAutoclavTRM202 taskFirstCehAutoclavTRM202,
                  final TaskFirstCehBuzulukTRM200 taskFirstCehBuzulukTRM200,
                  final TaskKameraDozrevanyaMPR51 taskKameraDozrevanyaMPR51,
                  final TaskThirdCehAutoclavTRM202 taskThirdCehAutoclavTRM202,
                  final TaskKotelnyaParMikrolITM4 taskKotelnyaParMikrolITM4){
        /*this.taskEnergeticRoomTRM201 = taskEnergeticRoomTRM201;*/
        this.taskFirstCehAutoclavTRM202 = taskFirstCehAutoclavTRM202;
        this.taskFirstCehBuzulukTRM200 = taskFirstCehBuzulukTRM200;
        this.taskKameraDozrevanyaMPR51 = taskKameraDozrevanyaMPR51;
        this.taskThirdCehAutoclavTRM202 = taskThirdCehAutoclavTRM202;
        this.taskKotelnyaParMikrolITM4 = taskKotelnyaParMikrolITM4;
//        this.start();
    }

//    @Override
    public void run(){
//        while (!this.isInterrupted()){
//            try {
                System.out.println("-----------------------------------------------------START FIRST CHAIN11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
//                taskEnergeticRoomTRM201.work1();

                taskFirstCehAutoclavTRM202.work1();

                taskFirstCehBuzulukTRM200.work1();

                taskKameraDozrevanyaMPR51.work2();

                taskThirdCehAutoclavTRM202.work1();

                taskKotelnyaParMikrolITM4.work1();

//                checkQueryQueue();
                System.out.println("-----------------------------------------------------END FIRS CHAIN11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
//                this.sleep(5000);
//            }catch (InterruptedException e){
//                String message = e.getMessage();
//                LOGGER.error("Interrupted chain1 thread --"+message);
//                System.out.println("Interrupted chain1 thread --"+message);
//            }
//        }
    }

//    public void checkQueryQueue(){
//        if (bodyQuery.size() > 0){
//            while (!bodyQuery.isEmpty()){
//                ModbusBodyQuery body = bodyQuery.poll();
//                switch (body.getQueryNumber()){
//                    case 1 : taskEnergeticRoomTRM201.getEnergeticRoomTRM201ServiceData().writeValueFirstChanel(body.getValueInt()); break;
//                    case 2 : taskEnergeticRoomTRM201.getEnergeticRoomTRM201ServiceData().writeValueFirstChane2(body.getValueInt()); break;
//                    default: {
//                        LOGGER.error("Wrong command in Chain1 --"+body.getQueryNumber());
//                        System.out.println("Wrong command in Chain1 --"+body.getQueryNumber());
//                        break;
//                    }
//                }
//            }
//        }
//    }
}
