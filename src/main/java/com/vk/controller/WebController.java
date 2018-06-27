package com.vk.controller;

import com.vk.entity.converter.*;
import com.vk.entity.device.*;
import com.vk.entity.table.*;
import com.vk.service.data.EnergeticRoomTRM201ServiceData;
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

    private final MessageSendingOperations<String> messageSendingOperations;

//    private final ServiceModelEnergeticRoomTRM201 serviceModelEnergeticRoomTRM201;
//
//    private final ServiceModelFirstCehAutoclavTRM202 serviceModelFirstCehAutoclavTRM202;
//
//    private final ServiceModelFirstCehBuzulukTRM200 serviceModelFirstCehBuzulukTRM200;
//
//    private final ServiceModelFirstCehKameraDozrevanyaMPR51 serviceModelFirstCehKameraDozrevanyaMPR51;
//
//    private final ServiceModelFirstCehSmesitel1KMSF1 serviceModelFirstCehSmesitel1KMSF1;
//
//    private final ServiceModelFirstCehSmesitel2KMSF1 serviceModelFirstCehSmesitel2KMSF1;
//
//    private final ServiceModelFirstCehSmesitel3KMSF1 serviceModelFirstCehSmesitel3KMSF1;
//
//    private final ServiceModelFirstCehSmesitel4KMSF1 serviceModelFirstCehSmesitel4KMSF1;
//
//    private final ServiceModelFirstCehSmesitel5KMSF1 serviceModelFirstCehSmesitel5KMSF1;
//
//    private final ServiceModelSevenCehAutoclavSPK107 serviceModelSevenCehAutoclavSPK107;
//
//    private final ServiceModelThirdCehAutoclavTRM202 serviceModelThirdCehAutoclavTRM202;
//
//    private final ServiceModelLaboratoryAutoclavMV110 serviceModelLaboratoryAutoclavMV110;

    private final EnergeticRoomTRM201ServiceData energeticRoomTRM201ServiceData;

    private final DeviceToTableImplEnergeticRoomTRM201 deviceToTableEnergeticRoomTRM201;

    @Autowired
    public WebController(
            final MessageSendingOperations<String> messageSendingOperations,
            /*final ServiceModelEnergeticRoomTRM201 serviceModelEnergeticRoomTRM201,*/
//            final ServiceModelFirstCehAutoclavTRM202 serviceModelFirstCehAutoclavTRM202,
//            final ServiceModelFirstCehBuzulukTRM200 serviceModelFirstCehBuzulukTRM200,
//            final ServiceModelFirstCehKameraDozrevanyaMPR51 serviceModelFirstCehKameraDozrevanyaMPR51,
//            final ServiceModelFirstCehSmesitel1KMSF1 serviceModelFirstCehSmesitel1KMSF1,
//            final ServiceModelFirstCehSmesitel2KMSF1 serviceModelFirstCehSmesitel2KMSF1,
//            final ServiceModelFirstCehSmesitel3KMSF1 serviceModelFirstCehSmesitel3KMSF1,
//            final ServiceModelFirstCehSmesitel4KMSF1 serviceModelFirstCehSmesitel4KMSF1,
//            final ServiceModelFirstCehSmesitel5KMSF1 serviceModelFirstCehSmesitel5KMSF1,
//            final ServiceModelSevenCehAutoclavSPK107 serviceModelSevenCehAutoclavSPK107,
//            final ServiceModelThirdCehAutoclavTRM202 serviceModelThirdCehAutoclavTRM202,
//            final ServiceModelLaboratoryAutoclavMV110 serviceModelLaboratoryAutoclavMV110,
            final EnergeticRoomTRM201ServiceData energeticRoomTRM201ServiceData,
            final DeviceToTableImplEnergeticRoomTRM201 deviceToTableEnergeticRoomTRM201
    ){
        this.messageSendingOperations = messageSendingOperations;
        /*this.serviceModelEnergeticRoomTRM201 = serviceModelEnergeticRoomTRM201;*/
//        this.serviceModelFirstCehAutoclavTRM202 = serviceModelFirstCehAutoclavTRM202;
//        this.serviceModelFirstCehBuzulukTRM200 = serviceModelFirstCehBuzulukTRM200;
//        this.serviceModelFirstCehKameraDozrevanyaMPR51 = serviceModelFirstCehKameraDozrevanyaMPR51;
//        this.serviceModelFirstCehSmesitel1KMSF1 = serviceModelFirstCehSmesitel1KMSF1;
//        this.serviceModelFirstCehSmesitel2KMSF1 = serviceModelFirstCehSmesitel2KMSF1;
//        this.serviceModelFirstCehSmesitel3KMSF1 = serviceModelFirstCehSmesitel3KMSF1;
//        this.serviceModelFirstCehSmesitel4KMSF1 = serviceModelFirstCehSmesitel4KMSF1;
//        this.serviceModelFirstCehSmesitel5KMSF1 = serviceModelFirstCehSmesitel5KMSF1;
//        this.serviceModelSevenCehAutoclavSPK107 = serviceModelSevenCehAutoclavSPK107;
//        this.serviceModelThirdCehAutoclavTRM202 = serviceModelThirdCehAutoclavTRM202;
//        this.serviceModelLaboratoryAutoclavMV110 = serviceModelLaboratoryAutoclavMV110;
        this.energeticRoomTRM201ServiceData = energeticRoomTRM201ServiceData;
        this.deviceToTableEnergeticRoomTRM201 = deviceToTableEnergeticRoomTRM201;
    }

//    private final int ID_SLAVE_PLC100 = 1;
//    private final int ID_SLAVE_TRM201 = 16;
//    private final int ID_SLAVE_ThirdCehAutoklavTRM202 = 103;
//    private final int ID_SLAVE_FirstCehAutoklavTRM202 = 22;
//    private final int ID_SLAVE_FirstCehKameraDozrevanya = 13;
//    private final int ID_SLAVE_FirstCehBuzulukTRM200 = 25;
//    private final int ID_SLAVE_SevenCehAutoclav = 21;
//    private final int ID_SLAVE_FirstCehSmesitel1KMSF1 = 24;
//    private final int ID_SLAVE_FirstCehSmesitel2KMSF1 = 40;
//    private final int ID_SLAVE_FirstCehSmesitel3KMSF1 = 72;
//    private final int ID_SLAVE_FirstCehSmesitel4KMSF1 = 64;
//    private final int ID_SLAVE_FirstCehSmesitel5KMSF1 = 48;

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

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String getAdminPanel(){
        return "admin";
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

    @Scheduled(fixedDelay = 1000)//30000ms
    private void loopSerialLisener(){
        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
        DeviceModelEnergeticRoomTRM201 deviceModelEnergeticRoomTRM201 = energeticRoomTRM201ServiceData.getModbusDevice();
        TableModelEnergeticRoomTRM201 tableModelEnergeticRoomTRM201 = deviceToTableEnergeticRoomTRM201.convert(deviceModelEnergeticRoomTRM201);
        messageSendingOperations.convertAndSend("/topic/trm201", tableModelEnergeticRoomTRM201);
        if (deviceModelEnergeticRoomTRM201.hysteresis()){
            energeticRoomTRM201ServiceData.addTabeDevice(tableModelEnergeticRoomTRM201);
        }

//        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
//        DeviceModelFirstCehAutoclavTRM202 deviceModelFirstCehAutoclavTRM202 = serviceModelFirstCehAutoclavTRM202.getModbusDevice();
//        DeviceToTableImplFirstCehAutoclavTRM202 deviceToTableFirstCehAutoclavTRM202 = new DeviceToTableImplFirstCehAutoclavTRM202();
//        TableModelFirstCehAutoclavTRM202 tableModelFirstCehAutoclavTRM202 = deviceToTableFirstCehAutoclavTRM202.convert(deviceModelFirstCehAutoclavTRM202);
//        messageSendingOperations.convertAndSend("/topic/firstCehAvtoclav", tableModelFirstCehAutoclavTRM202);
//        if (deviceModelFirstCehAutoclavTRM202.hysteresis()){
//            serviceModelFirstCehAutoclavTRM202.addTabeDevice(tableModelFirstCehAutoclavTRM202);
//        }
//
//        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
//        DeviceModelFirstCehBuzulukTRM200 deviceModelFirstCehBuzulukTRM200 = serviceModelFirstCehBuzulukTRM200.getModbusDevice();
//        DeviceToTableImplFirstCehBuzulukTRM200 deviceToTableFirstCehBuzulukTRM200 = new DeviceToTableImplFirstCehBuzulukTRM200();
//        TableModelFirstCehBuzulukTRM200 tableModelFirstCehBuzulukTRM200 = deviceToTableFirstCehBuzulukTRM200.convert(deviceModelFirstCehBuzulukTRM200);
//        messageSendingOperations.convertAndSend("/topic/firstCehBuzuluk", tableModelFirstCehBuzulukTRM200);
//        if (deviceModelFirstCehBuzulukTRM200.hysteresis()){
//            serviceModelFirstCehBuzulukTRM200.addTabeDevice(tableModelFirstCehBuzulukTRM200);
//        }
//
//        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
//        DeviceModelFirstCehKameraDozrevanyaMPR51 deviceModelFirstCehKameraDozrevanyaMPR51 = serviceModelFirstCehKameraDozrevanyaMPR51.getModbusDevice();
//        DeviceToTableImplFirstCehKameraDozrevanyaMPR51 deviceToTableFirstCehKameraDozrevanyaMPR51 = new DeviceToTableImplFirstCehKameraDozrevanyaMPR51();
//        TableModelFirstCehKameraDozrevanyaMPR51 tableModelFirstCehKameraDozrevanyaMPR51 = deviceToTableFirstCehKameraDozrevanyaMPR51.convert(deviceModelFirstCehKameraDozrevanyaMPR51);
//        messageSendingOperations.convertAndSend("/topic/firstCehKameraDozrevanya", tableModelFirstCehKameraDozrevanyaMPR51);
//        if (deviceModelFirstCehKameraDozrevanyaMPR51.hysteresis()){
//            serviceModelFirstCehKameraDozrevanyaMPR51.addTabeDevice(tableModelFirstCehKameraDozrevanyaMPR51);
//        }
//
//        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
//        DeviceModelFirstCehSmesitel1KMSF1 deviceModelFirstCehSmesitel1KMSF1 = serviceModelFirstCehSmesitel1KMSF1.getModbusDevice();
//        DeviceModelFirstCehSmesitel1MB110 deviceModelFirstCehSmesitel1MB110 = serviceModelFirstCehSmesitel1KMSF1.getModbusDevice2();
//        DeviceToTableImplFirstCehSmesitel1KMSF1 deviceToTableFirstCehSmesitel1KMSF1 = new DeviceToTableImplFirstCehSmesitel1KMSF1();
//        TableModelFirstCehSmesitel1KMSF1 tableModelFirstCehSmesitel1KMSF1 = deviceToTableFirstCehSmesitel1KMSF1.convert(deviceModelFirstCehSmesitel1KMSF1, deviceModelFirstCehSmesitel1MB110);
//        messageSendingOperations.convertAndSend("/topic/firstCehSmesitel1KMSF1", tableModelFirstCehSmesitel1KMSF1);
//        if (deviceModelFirstCehSmesitel1KMSF1.hysteresis() || deviceModelFirstCehSmesitel1MB110.hysteresis()){
//            serviceModelFirstCehSmesitel1KMSF1.addTabeDevice(tableModelFirstCehSmesitel1KMSF1);
//        }
//
//        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
//        DeviceModelFirstCehSmesitel2KMSF1 deviceModelFirstCehSmesitel2KMSF1 = serviceModelFirstCehSmesitel2KMSF1.getModbusDevice();
//        DeviceModelFirstCehSmesitel2MB110 deviceModelFirstCehSmesitel2MB110 = serviceModelFirstCehSmesitel2KMSF1.getModbusDevice2();
//        DeviceToTableImplFirstCehSmesitel2KMSF1 deviceToTableFirstCehSmesitel2KMSF1 = new DeviceToTableImplFirstCehSmesitel2KMSF1();
//        TableModelFirstCehSmesitel2KMSF1 tableModelFirstCehSmesitel2KMSF1 = deviceToTableFirstCehSmesitel2KMSF1.convert(deviceModelFirstCehSmesitel2KMSF1, deviceModelFirstCehSmesitel2MB110);
//        messageSendingOperations.convertAndSend("/topic/firstCehSmesitel2KMSF1", tableModelFirstCehSmesitel2KMSF1);
//        if (deviceModelFirstCehSmesitel2KMSF1.hysteresis() || deviceModelFirstCehSmesitel2MB110.hysteresis()){
//            serviceModelFirstCehSmesitel2KMSF1.addTabeDevice(tableModelFirstCehSmesitel2KMSF1);
//        }
//
//        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
//        DeviceModelFirstCehSmesitel3KMSF1 deviceModelFirstCehSmesitel3KMSF1 = serviceModelFirstCehSmesitel3KMSF1.getModbusDevice();
//        DeviceModelFirstCehSmesitel3MB110 deviceModelFirstCehSmesitel3MB110 = serviceModelFirstCehSmesitel3KMSF1.getModbusDevice2();
//        DeviceToTableImplFirstCehSmesitel3KMSF1 deviceToTableFirstCehSmesitel3KMSF1 = new DeviceToTableImplFirstCehSmesitel3KMSF1();
//        TableModelFirstCehSmesitel3KMSF1 tableModelFirstCehSmesitel3KMSF1 = deviceToTableFirstCehSmesitel3KMSF1.convert(deviceModelFirstCehSmesitel3KMSF1, deviceModelFirstCehSmesitel3MB110);
//        messageSendingOperations.convertAndSend("/topic/firstCehSmesitel3KMSF1", tableModelFirstCehSmesitel3KMSF1);
//        if (deviceModelFirstCehSmesitel3KMSF1.hysteresis() || deviceModelFirstCehSmesitel3MB110.hysteresis()){
//            serviceModelFirstCehSmesitel3KMSF1.addTabeDevice(tableModelFirstCehSmesitel3KMSF1);
//        }
//
//        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
//        DeviceModelFirstCehSmesitel4KMSF1 deviceModelFirstCehSmesitel4KMSF1 = serviceModelFirstCehSmesitel4KMSF1.getModbusDevice();
//        DeviceModelFirstCehSmesitel4MB110 deviceModelFirstCehSmesitel4MB110 = serviceModelFirstCehSmesitel4KMSF1.getModbusDevice2();
//        DeviceToTableImplFirstCehSmesitel4KMSF1 deviceToTableFirstCehSmesitel4KMSF1 = new DeviceToTableImplFirstCehSmesitel4KMSF1();
//        TableModelFirstCehSmesitel4KMSF1 tableModelFirstCehSmesitel4KMSF1 = deviceToTableFirstCehSmesitel4KMSF1.convert(deviceModelFirstCehSmesitel4KMSF1, deviceModelFirstCehSmesitel4MB110);
//        messageSendingOperations.convertAndSend("/topic/firstCehSmesitel4KMSF1", tableModelFirstCehSmesitel4KMSF1);
//        if (deviceModelFirstCehSmesitel4KMSF1.hysteresis() || deviceModelFirstCehSmesitel4MB110.hysteresis()){
//            serviceModelFirstCehSmesitel4KMSF1.addTabeDevice(tableModelFirstCehSmesitel4KMSF1);
//        }
//
//        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
//        DeviceModelFirstCehSmesitel5KMSF1 deviceModelFirstCehSmesitel5KMSF1 = serviceModelFirstCehSmesitel5KMSF1.getModbusDevice();
//        DeviceModelFirstCehSmesitel5MB110 deviceModelFirstCehSmesitel5MB110 = serviceModelFirstCehSmesitel5KMSF1.getModbusDevice2();
//        DeviceToTableImplFirstCehSmesitel5KMSF1 deviceToTableFirstCehSmesitel5KMSF1 = new DeviceToTableImplFirstCehSmesitel5KMSF1();
//        TableModelFirstCehSmesitel5KMSF1 tableModelFirstCehSmesitel5KMSF1 = deviceToTableFirstCehSmesitel5KMSF1.convert(deviceModelFirstCehSmesitel5KMSF1, deviceModelFirstCehSmesitel5MB110);
//        messageSendingOperations.convertAndSend("/topic/firstCehSmesitel5KMSF1", tableModelFirstCehSmesitel5KMSF1);
//        if (deviceModelFirstCehSmesitel5KMSF1.hysteresis() || deviceModelFirstCehSmesitel5MB110.hysteresis()){
//            serviceModelFirstCehSmesitel5KMSF1.addTabeDevice(tableModelFirstCehSmesitel5KMSF1);
//        }
//
//        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
//        DeviceModelSevenCehAutoclavSPK107 deviceModelSevenCehAutoclavSPK107 = serviceModelSevenCehAutoclavSPK107.getModbusDevice();
//        DeviceToTableImplSevenCehAutoclavSPK107 deviceToTableSevenCehAutoclavSPK107 = new DeviceToTableImplSevenCehAutoclavSPK107();
//        TableModelSevenCehAutoclavSPK107 tableModelSevenCehAutoclavSPK107 = deviceToTableSevenCehAutoclavSPK107.convert(deviceModelSevenCehAutoclavSPK107);
//        messageSendingOperations.convertAndSend("/topic/sevenCehAutoclav", tableModelSevenCehAutoclavSPK107);
//        if (deviceModelSevenCehAutoclavSPK107.hysteresis()){
//            serviceModelSevenCehAutoclavSPK107.addTabeDevice(tableModelSevenCehAutoclavSPK107);
//        }
//
//        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
//        DeviceModelThirdCehAutoclavTRM202 deviceModelThirdCehAutoclavTRM202 = serviceModelThirdCehAutoclavTRM202.getModbusDevice();
//        DeviceToTableImplThirdCehAutoclavTRM202 deviceToTableThirdCehAutoclavTRM202 = new DeviceToTableImplThirdCehAutoclavTRM202();
//        TableModelThirdCehAutoclavTRM202 tableModelThirdCehAutoclavTRM202 = deviceToTableThirdCehAutoclavTRM202.convert(deviceModelThirdCehAutoclavTRM202);
//        messageSendingOperations.convertAndSend("/topic/thirdCehAvtoclav", tableModelThirdCehAutoclavTRM202);
//        if (deviceModelThirdCehAutoclavTRM202.hysteresis()){
//            serviceModelThirdCehAutoclavTRM202.addTabeDevice(tableModelThirdCehAutoclavTRM202);
//        }
//
//        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
//        DeviceModelLaboratoryAutoclavMV110 deviceModelLaboratoryAutoclavMV110 = serviceModelLaboratoryAutoclavMV110.getModbusDevice();
//        DeviceToTableImplLaboratoryAutoclavMV110 deviceToTableLaboratoryAutoclavMV110 = new DeviceToTableImplLaboratoryAutoclavMV110();
//        TableModelLaboratoryAutoclavMV110 tableModelLaboratoryAutoclavMV110 = deviceToTableLaboratoryAutoclavMV110.convert(deviceModelLaboratoryAutoclavMV110);
//        messageSendingOperations.convertAndSend("/topic/laboratoryAvtoclav", tableModelLaboratoryAutoclavMV110);
//        if (deviceModelLaboratoryAutoclavMV110.hysteresis()){
//            serviceModelLaboratoryAutoclavMV110.addTabeDevice(tableModelLaboratoryAutoclavMV110);
//        }
    }
}
