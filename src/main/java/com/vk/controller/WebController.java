package com.vk.controller;

import com.vk.entity.converter.*;
import com.vk.entity.device.*;
import com.vk.entity.table.*;
import com.vk.service.data.*;
import com.vk.tasks.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.core.MessageSendingOperations;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import org.apache.log4j.Logger;


/**
 * Created by User on 2017-05-22.
 */
@Controller
@EnableScheduling
@ComponentScan(basePackages = {"com.vk.service"})
public class WebController {

    private final Logger LOGGER = Logger.getLogger(WebController.class);

    private MessageSendingOperations<String> messageSendingOperations;
//
//    private EnergeticRoomTRM201ServiceData energeticRoomTRM201ServiceData;
//
//    private DeviceToTableEnergeticRoomTRM201 deviceToTableEnergeticRoomTRM201;
//
//    private FirstCehAutoclavTRM202ServiceData firstCehAutoclavTRM202ServiceData;
//
//    private DeviceToTableFirstCehAutoclavTRM202 deviceToTableFirstCehAutoclavTRM202;
//
//    private FirstCehBuzulukTRM200ServiceData firstCehBuzulukTRM200ServiceData;
//
//    private DeviceToTableFirstCehBuzulukTRM200 deviceToTableFirstCehBuzulukTRM200;
//
//    private KameraDozrevanyaMPR51ServiceData kameraDozrevanyaMPR51ServiceData;
//
//    private DeviceToTableFirstCehKameraDozrevanyaMPR51 deviceToTableFirstCehKameraDozrevanyaMPR51;
//
//    private FirstCehSmesitel1KMSF1ServiceData firstCehSmesitel1KMSF1ServiceData;
//
//    private FirstCehSmesitel1MB110ServiceData firstCehSmesitel1MB110ServiceData;
//
//    private DeviceToTableFirstCehSmesitel1KMSF1 deviceToTableFirstCehSmesitel1KMSF1;
//
//    private FirstCehSmesitel2KMSF1ServiceData firstCehSmesitel2KMSF1ServiceData;
//
//    private FirstCehSmesitel2MB110ServiceData firstCehSmesitel2MB110ServiceData;
//
//    private DeviceToTableFirstCehSmesitel2KMSF1 deviceToTableFirstCehSmesitel2KMSF1;
//
//    private FirstCehSmesitel3KMSF1ServiceData firstCehSmesitel3KMSF1ServiceData;
//
//    private FirstCehSmesitel3MB110ServiceData firstCehSmesitel3MB110ServiceData;
//
//    private DeviceToTableFirstCehSmesitel3KMSF1 deviceToTableFirstCehSmesitel3KMSF1;
//
//    private FirstCehSmesitel4KMSF1ServiceData firstCehSmesitel4KMSF1ServiceData;
//
//    private FirstCehSmesitel4MB110ServiceData firstCehSmesitel4MB110ServiceData;
//
//    private DeviceToTableFirstCehSmesitel4KMSF1 deviceToTableFirstCehSmesitel4KMSF1;
//
//    private FirstCehSmesitel5KMSF1ServiceData firstCehSmesitel5KMSF1ServiceData;
//
//    private FirstCehSmesitel5MB110ServiceData firstCehSmesitel5MB110ServiceData;
//
//    private DeviceToTableFirstCehSmesitel5KMSF1 deviceToTableFirstCehSmesitel5KMSF1;
//
//    private SevenCehAutoclavSPK107ServiceData sevenCehAutoclavSPK107ServiceData;
//
//    private DeviceToTableSevenCehAutoclavSPK107 deviceToTableSevenCehAutoclavSPK107;
//
//    private ThirdCehAutoclavTRM202ServiceData thirdCehAutoclavTRM202ServiceData;
//
//    private DeviceToTableThirdCehAutoclavTRM202 deviceToTableThirdCehAutoclavTRM202;
//
//    private LaboratoryAutoclavMV110ServiceData laboratoryAutoclavMV110ServiceData;
//
//    private DeviceToTableLaboratoryAutoclavMV110 deviceToTableLaboratoryAutoclavMV110;

    private TaskEnergeticRoomTRM201 taskEnergeticRoomTRM201;

    private TaskFirstCehAutoclavTRM202 taskFirstCehAutoclavTRM202;

    private TaskFirstCehBuzulukTRM200 taskFirstCehBuzulukTRM200;

    private TaskKameraDozrevanyaMPR51 taskKameraDozrevanyaMPR51;

    private TaskFirstCehSmesitel1KMSF1 taskFirstCehSmesitel1KMSF1;

    private TaskFirstCehSmesitel2KMSF1 taskFirstCehSmesitel2KMSF1;

    private TaskFirstCehSmesitel3KMSF1 taskFirstCehSmesitel3KMSF1;

    private TaskFirstCehSmesitel4KMSF1 taskFirstCehSmesitel4KMSF1;

    private TaskFirstCehSmesitel5KMSF1 taskFirstCehSmesitel5KMSF1;

    private TaskThirdCehAutoclavTRM202 taskThirdCehAutoclavTRM202;

    private TaskSevenCehAutoclavSPK107 taskSevenCehAutoclavSPK107;

    private TaskLaboratoryAutoclavMV110 taskLaboratoryAutoclavMV110;

    private TaskKotelnyaParMikrolITM4 taskKotelnyaParMikrolITM4;

    @Autowired
    public WebController(
            MessageSendingOperations<String> messageSendingOperations,
//            EnergeticRoomTRM201ServiceData energeticRoomTRM201ServiceData,
//            DeviceToTableImplEnergeticRoomTRM201 deviceToTableEnergeticRoomTRM201,
//            FirstCehAutoclavTRM202ServiceData firstCehAutoclavTRM202ServiceData,
//            DeviceToTableFirstCehAutoclavTRM202 deviceToTableFirstCehAutoclavTRM202,
//            FirstCehBuzulukTRM200ServiceData firstCehBuzulukTRM200ServiceData,
//            DeviceToTableFirstCehBuzulukTRM200 deviceToTableFirstCehBuzulukTRM200,
//            KameraDozrevanyaMPR51ServiceData kameraDozrevanyaMPR51ServiceData,
//            DeviceToTableFirstCehKameraDozrevanyaMPR51 deviceToTableFirstCehKameraDozrevanyaMPR51,
//            FirstCehSmesitel1KMSF1ServiceData firstCehSmesitel1KMSF1ServiceData,
//            FirstCehSmesitel1MB110ServiceData firstCehSmesitel1MB110ServiceData,
//            DeviceToTableFirstCehSmesitel1KMSF1 deviceToTableFirstCehSmesitel1KMSF1,
//            FirstCehSmesitel2KMSF1ServiceData firstCehSmesitel2KMSF1ServiceData,
//            FirstCehSmesitel2MB110ServiceData firstCehSmesitel2MB110ServiceData,
//            DeviceToTableFirstCehSmesitel2KMSF1 deviceToTableFirstCehSmesitel2KMSF1,
//            FirstCehSmesitel3KMSF1ServiceData firstCehSmesitel3KMSF1ServiceData,
//            FirstCehSmesitel3MB110ServiceData firstCehSmesitel3MB110ServiceData,
//            DeviceToTableFirstCehSmesitel3KMSF1 deviceToTableFirstCehSmesitel3KMSF1,
//            FirstCehSmesitel4KMSF1ServiceData firstCehSmesitel4KMSF1ServiceData,
//            FirstCehSmesitel4MB110ServiceData firstCehSmesitel4MB110ServiceData,
//            DeviceToTableFirstCehSmesitel4KMSF1 deviceToTableFirstCehSmesitel4KMSF1,
//            FirstCehSmesitel5KMSF1ServiceData firstCehSmesitel5KMSF1ServiceData,
//            FirstCehSmesitel5MB110ServiceData firstCehSmesitel5MB110ServiceData,
//            DeviceToTableFirstCehSmesitel5KMSF1 deviceToTableFirstCehSmesitel5KMSF1,
//            SevenCehAutoclavSPK107ServiceData sevenCehAutoclavSPK107ServiceData,
//            DeviceToTableSevenCehAutoclavSPK107 deviceToTableSevenCehAutoclavSPK107,
//            ThirdCehAutoclavTRM202ServiceData thirdCehAutoclavTRM202ServiceData,
//            DeviceToTableThirdCehAutoclavTRM202 deviceToTableThirdCehAutoclavTRM202,
//            LaboratoryAutoclavMV110ServiceData laboratoryAutoclavMV110ServiceData,
//            DeviceToTableLaboratoryAutoclavMV110 deviceToTableLaboratoryAutoclavMV110,
            TaskEnergeticRoomTRM201 taskEnergeticRoomTRM201,
            TaskFirstCehAutoclavTRM202 taskFirstCehAutoclavTRM202,
            TaskFirstCehBuzulukTRM200 taskFirstCehBuzulukTRM200,
            TaskKameraDozrevanyaMPR51 taskKameraDozrevanyaMPR51,
            TaskFirstCehSmesitel1KMSF1 taskFirstCehSmesitel1KMSF1,
            TaskFirstCehSmesitel2KMSF1 taskFirstCehSmesitel2KMSF1,
            TaskFirstCehSmesitel3KMSF1 taskFirstCehSmesitel3KMSF1,
            TaskFirstCehSmesitel4KMSF1 taskFirstCehSmesitel4KMSF1,
            TaskFirstCehSmesitel5KMSF1 taskFirstCehSmesitel5KMSF1,
            TaskSevenCehAutoclavSPK107 taskSevenCehAutoclavSPK107,
            TaskThirdCehAutoclavTRM202 taskThirdCehAutoclavTRM202,
            TaskLaboratoryAutoclavMV110 taskLaboratoryAutoclavMV110,
            TaskKotelnyaParMikrolITM4 taskKotelnyaParMikrolITM4
    ){
        this.messageSendingOperations = messageSendingOperations;
//        this.energeticRoomTRM201ServiceData = energeticRoomTRM201ServiceData;
//        this.deviceToTableEnergeticRoomTRM201 = deviceToTableEnergeticRoomTRM201;
//        this.firstCehAutoclavTRM202ServiceData = firstCehAutoclavTRM202ServiceData;
//        this.deviceToTableFirstCehAutoclavTRM202 = deviceToTableFirstCehAutoclavTRM202;
//        this.firstCehBuzulukTRM200ServiceData = firstCehBuzulukTRM200ServiceData;
//        this.deviceToTableFirstCehBuzulukTRM200 = deviceToTableFirstCehBuzulukTRM200;
//        this.kameraDozrevanyaMPR51ServiceData = kameraDozrevanyaMPR51ServiceData;
//        this.deviceToTableFirstCehKameraDozrevanyaMPR51 = deviceToTableFirstCehKameraDozrevanyaMPR51;
//        this.firstCehSmesitel1KMSF1ServiceData = firstCehSmesitel1KMSF1ServiceData;
//        this.firstCehSmesitel1MB110ServiceData = firstCehSmesitel1MB110ServiceData;
//        this.deviceToTableFirstCehSmesitel1KMSF1 = deviceToTableFirstCehSmesitel1KMSF1;
//        this.firstCehSmesitel2KMSF1ServiceData = firstCehSmesitel2KMSF1ServiceData;
//        this.firstCehSmesitel2MB110ServiceData = firstCehSmesitel2MB110ServiceData;
//        this.deviceToTableFirstCehSmesitel2KMSF1 = deviceToTableFirstCehSmesitel2KMSF1;
//        this.firstCehSmesitel3KMSF1ServiceData = firstCehSmesitel3KMSF1ServiceData;
//        this.firstCehSmesitel3MB110ServiceData = firstCehSmesitel3MB110ServiceData;
//        this.deviceToTableFirstCehSmesitel3KMSF1 = deviceToTableFirstCehSmesitel3KMSF1;
//        this.firstCehSmesitel4KMSF1ServiceData = firstCehSmesitel4KMSF1ServiceData;
//        this.firstCehSmesitel4MB110ServiceData = firstCehSmesitel4MB110ServiceData;
//        this.deviceToTableFirstCehSmesitel4KMSF1 = deviceToTableFirstCehSmesitel4KMSF1;
//        this.firstCehSmesitel5KMSF1ServiceData = firstCehSmesitel5KMSF1ServiceData;
//        this.firstCehSmesitel5MB110ServiceData = firstCehSmesitel5MB110ServiceData;
//        this.deviceToTableFirstCehSmesitel5KMSF1 = deviceToTableFirstCehSmesitel5KMSF1;
//        this.sevenCehAutoclavSPK107ServiceData = sevenCehAutoclavSPK107ServiceData;
//        this.deviceToTableSevenCehAutoclavSPK107 = deviceToTableSevenCehAutoclavSPK107;
//        this.thirdCehAutoclavTRM202ServiceData = thirdCehAutoclavTRM202ServiceData;
//        this.deviceToTableThirdCehAutoclavTRM202 = deviceToTableThirdCehAutoclavTRM202;
//        this.laboratoryAutoclavMV110ServiceData = laboratoryAutoclavMV110ServiceData;
//        this.deviceToTableLaboratoryAutoclavMV110 = deviceToTableLaboratoryAutoclavMV110;
        this.taskEnergeticRoomTRM201 = taskEnergeticRoomTRM201;
        this.taskFirstCehAutoclavTRM202 = taskFirstCehAutoclavTRM202;
        this.taskFirstCehBuzulukTRM200 = taskFirstCehBuzulukTRM200;
        this.taskKameraDozrevanyaMPR51 = taskKameraDozrevanyaMPR51;
        this.taskFirstCehSmesitel1KMSF1 = taskFirstCehSmesitel1KMSF1;
        this.taskFirstCehSmesitel2KMSF1 = taskFirstCehSmesitel2KMSF1;
        this.taskFirstCehSmesitel3KMSF1 = taskFirstCehSmesitel3KMSF1;
        this.taskFirstCehSmesitel4KMSF1 = taskFirstCehSmesitel4KMSF1;
        this.taskFirstCehSmesitel5KMSF1 = taskFirstCehSmesitel5KMSF1;
        this.taskSevenCehAutoclavSPK107 = taskSevenCehAutoclavSPK107;
        this.taskThirdCehAutoclavTRM202 = taskThirdCehAutoclavTRM202;
        this.taskLaboratoryAutoclavMV110 = taskLaboratoryAutoclavMV110;
        this.taskKotelnyaParMikrolITM4 = taskKotelnyaParMikrolITM4;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getIndex(){
        return "index";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String getText(){
        return "test";
    }

    @RequestMapping(value = "/energetics", method = RequestMethod.GET)
    public String getEnergetics(){
        return "otdel_energetika";
    }

    @RequestMapping(value = "/autoclavThirdCeh", method = RequestMethod.GET)
    public String getAutoclavThirdCeh(){
        return "autoclavThirdCeh";
    }

    @RequestMapping(value = "/firstCehAutoclav", method = RequestMethod.GET)
    public String getAutoclavFirstCeh(){
        return "firstCehAutoclav";
    }

    @RequestMapping(value = "/firstCehKameraDozrevanya", method = RequestMethod.GET)
    public String getFirstCehKameraDozrevanya(){
        return "firstCehKameraDozrevanya";
    }

    @RequestMapping(value = "/firstCehBuzuluk", method = RequestMethod.GET)
    public String getFirstCehBuzuluk(){
        return "firstCehBuzuluk";
    }

    @RequestMapping(value = "/sevenCehAutoclav", method = RequestMethod.GET)
    public String getSevenCehBuzuluk(){
        return "sevenCehAutoclav";
    }

    @RequestMapping(value = "/firstCehSmesitel1", method = RequestMethod.GET)
    public String getFirstCehSmesitel1KMSF1(){
        return "firstCehSmesitel1KMSF1";
    }

    @RequestMapping(value = "/firstCehSmesitel2", method = RequestMethod.GET)
    public String getFirstCehSmesitel2KMSF1(){
        return "firstCehSmesitel2KMSF1";
    }

    @RequestMapping(value = "/firstCehSmesitel3", method = RequestMethod.GET)
    public String getFirstCehSmesitel3KMSF1(){
        return "firstCehSmesitel3KMSF1";
    }

    @RequestMapping(value = "/firstCehSmesitel4", method = RequestMethod.GET)
    public String getFirstCehSmesitel4KMSF1(){
        return "firstCehSmesitel4KMSF1";
    }

    @RequestMapping(value = "/firstCehSmesitel5", method = RequestMethod.GET)
    public String getFirstCehSmesitel5KMSF1(){
        return "firstCehSmesitel5KMSF1";
    }

    @RequestMapping(value = "/laboratoryAutoclav", method = RequestMethod.GET)
    public String getLaboratoryAutoclavMV110(){
        return "laboratoryAutoclav";
    }

    @RequestMapping(value = "/taskKotelnyaParMikrolITM4", method = RequestMethod.GET)
    public String getTaskKotelnyaParMikrolITM4(){
        return "taskKotelnyaParMikrolITM4";
    }

    @Scheduled(fixedDelay = 30000)//30000ms
    private void loopSerialLisener(){
        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
//        DeviceModelEnergeticRoomTRM201 deviceModelEnergeticRoomTRM201 = energeticRoomTRM201ServiceData.getModbusDevice();
//        TableModelEnergeticRoomTRM201 tableModelEnergeticRoomTRM201 = deviceToTableEnergeticRoomTRM201.convert(deviceModelEnergeticRoomTRM201);
//        messageSendingOperations.convertAndSend("/topic/trm201", tableModelEnergeticRoomTRM201);
//        if (deviceModelEnergeticRoomTRM201.hysteresis()){
//            energeticRoomTRM201ServiceData.addTabeDevice(tableModelEnergeticRoomTRM201);
//        }
        taskEnergeticRoomTRM201.work1();

        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
//        DeviceModelFirstCehAutoclavTRM202 deviceModelFirstCehAutoclavTRM202 = firstCehAutoclavTRM202ServiceData.getModbusDevice();
//        TableModelFirstCehAutoclavTRM202 tableModelFirstCehAutoclavTRM202 = deviceToTableFirstCehAutoclavTRM202.convert(deviceModelFirstCehAutoclavTRM202);
//        messageSendingOperations.convertAndSend("/topic/firstCehAvtoclav", tableModelFirstCehAutoclavTRM202);
//        if (deviceModelFirstCehAutoclavTRM202.hysteresis()){
//            firstCehAutoclavTRM202ServiceData.addTabeDevice(tableModelFirstCehAutoclavTRM202);
//        }
        taskFirstCehAutoclavTRM202.work1();

        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
//        DeviceModelFirstCehBuzulukTRM200 deviceModelFirstCehBuzulukTRM200 = firstCehBuzulukTRM200ServiceData.getModbusDevice();
//        TableModelFirstCehBuzulukTRM200 tableModelFirstCehBuzulukTRM200 = deviceToTableFirstCehBuzulukTRM200.convert(deviceModelFirstCehBuzulukTRM200);
//        messageSendingOperations.convertAndSend("/topic/firstCehBuzuluk", tableModelFirstCehBuzulukTRM200);
//        if (deviceModelFirstCehBuzulukTRM200.hysteresis()){
//            firstCehBuzulukTRM200ServiceData.addTabeDevice(tableModelFirstCehBuzulukTRM200);
//        }
        taskFirstCehBuzulukTRM200.work1();

        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
//        DeviceModelFirstCehKameraDozrevanyaMPR51 deviceModelFirstCehKameraDozrevanyaMPR51 = kameraDozrevanyaMPR51ServiceData.getModbusDevice();
//        TableModelFirstCehKameraDozrevanyaMPR51 tableModelFirstCehKameraDozrevanyaMPR51 = deviceToTableFirstCehKameraDozrevanyaMPR51.convert(deviceModelFirstCehKameraDozrevanyaMPR51);
//        messageSendingOperations.convertAndSend("/topic/firstCehKameraDozrevanya", tableModelFirstCehKameraDozrevanyaMPR51);
//        if (deviceModelFirstCehKameraDozrevanyaMPR51.hysteresis()){
//            kameraDozrevanyaMPR51ServiceData.addTabeDevice(tableModelFirstCehKameraDozrevanyaMPR51);
//        }
        taskKameraDozrevanyaMPR51.work1();

        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
//        DeviceModelFirstCehSmesitel1KMSF1 deviceModelFirstCehSmesitel1KMSF1 = firstCehSmesitel1KMSF1ServiceData.getModbusDevice();
//        DeviceModelFirstCehSmesitel1MB110 deviceModelFirstCehSmesitel1MB110 = firstCehSmesitel1MB110ServiceData.getModbusDevice();
//        TableModelFirstCehSmesitel1KMSF1 tableModelFirstCehSmesitel1KMSF1 = deviceToTableFirstCehSmesitel1KMSF1.convert(deviceModelFirstCehSmesitel1KMSF1, deviceModelFirstCehSmesitel1MB110);
//        messageSendingOperations.convertAndSend("/topic/firstCehSmesitel1KMSF1", tableModelFirstCehSmesitel1KMSF1);
//        if (deviceModelFirstCehSmesitel1KMSF1.hysteresis() || deviceModelFirstCehSmesitel1MB110.hysteresis()){
//            firstCehSmesitel1KMSF1ServiceData.addTabeDevice(tableModelFirstCehSmesitel1KMSF1);
//        }
        taskFirstCehSmesitel1KMSF1.work2();

        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
//        DeviceModelFirstCehSmesitel2KMSF1 deviceModelFirstCehSmesitel2KMSF1 = firstCehSmesitel2KMSF1ServiceData.getModbusDevice();
//        DeviceModelFirstCehSmesitel2MB110 deviceModelFirstCehSmesitel2MB110 = firstCehSmesitel2MB110ServiceData.getModbusDevice();
//        TableModelFirstCehSmesitel2KMSF1 tableModelFirstCehSmesitel2KMSF1 = deviceToTableFirstCehSmesitel2KMSF1.convert(deviceModelFirstCehSmesitel2KMSF1, deviceModelFirstCehSmesitel2MB110);
//        messageSendingOperations.convertAndSend("/topic/firstCehSmesitel2KMSF1", tableModelFirstCehSmesitel2KMSF1);
//        if (deviceModelFirstCehSmesitel2KMSF1.hysteresis() || deviceModelFirstCehSmesitel2MB110.hysteresis()){
//            firstCehSmesitel2KMSF1ServiceData.addTabeDevice(tableModelFirstCehSmesitel2KMSF1);
//        }
        taskFirstCehSmesitel2KMSF1.work2();

        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
//        DeviceModelFirstCehSmesitel3KMSF1 deviceModelFirstCehSmesitel3KMSF1 = firstCehSmesitel3KMSF1ServiceData.getModbusDevice();
//        DeviceModelFirstCehSmesitel3MB110 deviceModelFirstCehSmesitel3MB110 = firstCehSmesitel3MB110ServiceData.getModbusDevice();
//        TableModelFirstCehSmesitel3KMSF1 tableModelFirstCehSmesitel3KMSF1 = deviceToTableFirstCehSmesitel3KMSF1.convert(deviceModelFirstCehSmesitel3KMSF1, deviceModelFirstCehSmesitel3MB110);
//        messageSendingOperations.convertAndSend("/topic/firstCehSmesitel3KMSF1", tableModelFirstCehSmesitel3KMSF1);
//        if (deviceModelFirstCehSmesitel3KMSF1.hysteresis() || deviceModelFirstCehSmesitel3MB110.hysteresis()){
//            firstCehSmesitel3KMSF1ServiceData.addTabeDevice(tableModelFirstCehSmesitel3KMSF1);
//        }
        taskFirstCehSmesitel3KMSF1.work2();

        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
//        DeviceModelFirstCehSmesitel4KMSF1 deviceModelFirstCehSmesitel4KMSF1 = firstCehSmesitel4KMSF1ServiceData.getModbusDevice();
//        DeviceModelFirstCehSmesitel4MB110 deviceModelFirstCehSmesitel4MB110 = firstCehSmesitel4MB110ServiceData.getModbusDevice();
//        TableModelFirstCehSmesitel4KMSF1 tableModelFirstCehSmesitel4KMSF1 = deviceToTableFirstCehSmesitel4KMSF1.convert(deviceModelFirstCehSmesitel4KMSF1, deviceModelFirstCehSmesitel4MB110);
//        messageSendingOperations.convertAndSend("/topic/firstCehSmesitel4KMSF1", tableModelFirstCehSmesitel4KMSF1);
//        if (deviceModelFirstCehSmesitel4KMSF1.hysteresis() || deviceModelFirstCehSmesitel4MB110.hysteresis()){
//            firstCehSmesitel4KMSF1ServiceData.addTabeDevice(tableModelFirstCehSmesitel4KMSF1);
//        }
        taskFirstCehSmesitel4KMSF1.work2();

        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
//        DeviceModelFirstCehSmesitel5KMSF1 deviceModelFirstCehSmesitel5KMSF1 = firstCehSmesitel5KMSF1ServiceData.getModbusDevice();
//        DeviceModelFirstCehSmesitel5MB110 deviceModelFirstCehSmesitel5MB110 = firstCehSmesitel5MB110ServiceData.getModbusDevice();
//        TableModelFirstCehSmesitel5KMSF1 tableModelFirstCehSmesitel5KMSF1 = deviceToTableFirstCehSmesitel5KMSF1.convert(deviceModelFirstCehSmesitel5KMSF1, deviceModelFirstCehSmesitel5MB110);
//        messageSendingOperations.convertAndSend("/topic/firstCehSmesitel5KMSF1", tableModelFirstCehSmesitel5KMSF1);
//        if (deviceModelFirstCehSmesitel5KMSF1.hysteresis() || deviceModelFirstCehSmesitel5MB110.hysteresis()){
//            firstCehSmesitel5KMSF1ServiceData.addTabeDevice(tableModelFirstCehSmesitel5KMSF1);
//        }
        taskFirstCehSmesitel5KMSF1.work2();

        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
//        DeviceModelSevenCehAutoclavSPK107 deviceModelSevenCehAutoclavSPK107 = sevenCehAutoclavSPK107ServiceData.getModbusDevice();
//        TableModelSevenCehAutoclavSPK107 tableModelSevenCehAutoclavSPK107 = deviceToTableSevenCehAutoclavSPK107.convert(deviceModelSevenCehAutoclavSPK107);
//        messageSendingOperations.convertAndSend("/topic/sevenCehAutoclav", tableModelSevenCehAutoclavSPK107);
//        if (deviceModelSevenCehAutoclavSPK107.hysteresis()){
//            sevenCehAutoclavSPK107ServiceData.addTabeDevice(tableModelSevenCehAutoclavSPK107);
//        }
        taskSevenCehAutoclavSPK107.work1();

        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
//        DeviceModelThirdCehAutoclavTRM202 deviceModelThirdCehAutoclavTRM202 = thirdCehAutoclavTRM202ServiceData.getModbusDevice();
//        TableModelThirdCehAutoclavTRM202 tableModelThirdCehAutoclavTRM202 = deviceToTableThirdCehAutoclavTRM202.convert(deviceModelThirdCehAutoclavTRM202);
//        messageSendingOperations.convertAndSend("/topic/thirdCehAvtoclav", tableModelThirdCehAutoclavTRM202);
//        if (deviceModelThirdCehAutoclavTRM202.hysteresis()){
//            thirdCehAutoclavTRM202ServiceData.addTabeDevice(tableModelThirdCehAutoclavTRM202);
//        }
        taskThirdCehAutoclavTRM202.work1();

        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
//        DeviceModelLaboratoryAutoclavMV110 deviceModelLaboratoryAutoclavMV110 = laboratoryAutoclavMV110ServiceData.getModbusDevice();
//        TableModelLaboratoryAutoclavMV110 tableModelLaboratoryAutoclavMV110 = deviceToTableLaboratoryAutoclavMV110.convert(deviceModelLaboratoryAutoclavMV110);
//        messageSendingOperations.convertAndSend("/topic/laboratoryAvtoclav", tableModelLaboratoryAutoclavMV110);
//        if (deviceModelLaboratoryAutoclavMV110.hysteresis()){
//            laboratoryAutoclavMV110ServiceData.addTabeDevice(tableModelLaboratoryAutoclavMV110);
//        }
        taskLaboratoryAutoclavMV110.work1();

        taskKotelnyaParMikrolITM4.work1();
    }
}
