package com.vk.controller;

import com.vk.entity.converter.*;
import com.vk.entity.device.*;
import com.vk.entity.table.*;
import com.vk.service.data.*;
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

    private final EnergeticRoomTRM201ServiceData energeticRoomTRM201ServiceData;

    private final DeviceToTableEnergeticRoomTRM201 deviceToTableEnergeticRoomTRM201;

    private final FirstCehAutoclavTRM202ServiceData firstCehAutoclavTRM202ServiceData;

    private final DeviceToTableFirstCehAutoclavTRM202 deviceToTableFirstCehAutoclavTRM202;

    private final FirstCehBuzulukTRM200ServiceData firstCehBuzulukTRM200ServiceData;

    private final DeviceToTableFirstCehBuzulukTRM200 deviceToTableFirstCehBuzulukTRM200;

    private final KameraDozrevanyaMPR51ServiceData kameraDozrevanyaMPR51ServiceData;

    private final DeviceToTableFirstCehKameraDozrevanyaMPR51 deviceToTableFirstCehKameraDozrevanyaMPR51;

    private final FirstCehSmesitel1KMSF1ServiceData firstCehSmesitel1KMSF1ServiceData;

    private final FirstCehSmesitel1MB110ServiceData firstCehSmesitel1MB110ServiceData;

    private final DeviceToTableFirstCehSmesitel1KMSF1 deviceToTableFirstCehSmesitel1KMSF1;

    private final FirstCehSmesitel2KMSF1ServiceData firstCehSmesitel2KMSF1ServiceData;

    private final FirstCehSmesitel2MB110ServiceData firstCehSmesitel2MB110ServiceData;

    private final DeviceToTableFirstCehSmesitel2KMSF1 deviceToTableFirstCehSmesitel2KMSF1;

    private final FirstCehSmesitel3KMSF1ServiceData firstCehSmesitel3KMSF1ServiceData;

    private final FirstCehSmesitel3MB110ServiceData firstCehSmesitel3MB110ServiceData;

    private final DeviceToTableFirstCehSmesitel3KMSF1 deviceToTableFirstCehSmesitel3KMSF1;

    private final FirstCehSmesitel4KMSF1ServiceData firstCehSmesitel4KMSF1ServiceData;

    private final FirstCehSmesitel4MB110ServiceData firstCehSmesitel4MB110ServiceData;

    private final DeviceToTableFirstCehSmesitel4KMSF1 deviceToTableFirstCehSmesitel4KMSF1;

    private final FirstCehSmesitel5KMSF1ServiceData firstCehSmesitel5KMSF1ServiceData;

    private final FirstCehSmesitel5MB110ServiceData firstCehSmesitel5MB110ServiceData;

    private final DeviceToTableFirstCehSmesitel5KMSF1 deviceToTableFirstCehSmesitel5KMSF1;

    private final SevenCehAutoclavSPK107ServiceData sevenCehAutoclavSPK107ServiceData;

    private final DeviceToTableSevenCehAutoclavSPK107 deviceToTableSevenCehAutoclavSPK107;

    private final ThirdCehAutoclavTRM202ServiceData thirdCehAutoclavTRM202ServiceData;

    private final DeviceToTableThirdCehAutoclavTRM202 deviceToTableThirdCehAutoclavTRM202;

    private final LaboratoryAutoclavMV110ServiceData laboratoryAutoclavMV110ServiceData;

    private final DeviceToTableLaboratoryAutoclavMV110 deviceToTableLaboratoryAutoclavMV110;

    @Autowired
    public WebController(
            final MessageSendingOperations<String> messageSendingOperations,
            final EnergeticRoomTRM201ServiceData energeticRoomTRM201ServiceData,
            final DeviceToTableImplEnergeticRoomTRM201 deviceToTableEnergeticRoomTRM201,
            final FirstCehAutoclavTRM202ServiceData firstCehAutoclavTRM202ServiceData,
            final DeviceToTableFirstCehAutoclavTRM202 deviceToTableFirstCehAutoclavTRM202,
            final FirstCehBuzulukTRM200ServiceData firstCehBuzulukTRM200ServiceData,
            final DeviceToTableFirstCehBuzulukTRM200 deviceToTableFirstCehBuzulukTRM200,
            final KameraDozrevanyaMPR51ServiceData kameraDozrevanyaMPR51ServiceData,
            final DeviceToTableFirstCehKameraDozrevanyaMPR51 deviceToTableFirstCehKameraDozrevanyaMPR51,
            final FirstCehSmesitel1KMSF1ServiceData firstCehSmesitel1KMSF1ServiceData,
            final FirstCehSmesitel1MB110ServiceData firstCehSmesitel1MB110ServiceData,
            final DeviceToTableFirstCehSmesitel1KMSF1 deviceToTableFirstCehSmesitel1KMSF1,
            final FirstCehSmesitel2KMSF1ServiceData firstCehSmesitel2KMSF1ServiceData,
            final FirstCehSmesitel2MB110ServiceData firstCehSmesitel2MB110ServiceData,
            final DeviceToTableFirstCehSmesitel2KMSF1 deviceToTableFirstCehSmesitel2KMSF1,
            final FirstCehSmesitel3KMSF1ServiceData firstCehSmesitel3KMSF1ServiceData,
            final FirstCehSmesitel3MB110ServiceData firstCehSmesitel3MB110ServiceData,
            final DeviceToTableFirstCehSmesitel3KMSF1 deviceToTableFirstCehSmesitel3KMSF1,
            final FirstCehSmesitel4KMSF1ServiceData firstCehSmesitel4KMSF1ServiceData,
            final FirstCehSmesitel4MB110ServiceData firstCehSmesitel4MB110ServiceData,
            final DeviceToTableFirstCehSmesitel4KMSF1 deviceToTableFirstCehSmesitel4KMSF1,
            final FirstCehSmesitel5KMSF1ServiceData firstCehSmesitel5KMSF1ServiceData,
            final FirstCehSmesitel5MB110ServiceData firstCehSmesitel5MB110ServiceData,
            final DeviceToTableFirstCehSmesitel5KMSF1 deviceToTableFirstCehSmesitel5KMSF1,
            final SevenCehAutoclavSPK107ServiceData sevenCehAutoclavSPK107ServiceData,
            final DeviceToTableSevenCehAutoclavSPK107 deviceToTableSevenCehAutoclavSPK107,
            final ThirdCehAutoclavTRM202ServiceData thirdCehAutoclavTRM202ServiceData,
            final DeviceToTableThirdCehAutoclavTRM202 deviceToTableThirdCehAutoclavTRM202,
            final LaboratoryAutoclavMV110ServiceData laboratoryAutoclavMV110ServiceData,
            final DeviceToTableLaboratoryAutoclavMV110 deviceToTableLaboratoryAutoclavMV110
    ){
        this.messageSendingOperations = messageSendingOperations;
        this.energeticRoomTRM201ServiceData = energeticRoomTRM201ServiceData;
        this.deviceToTableEnergeticRoomTRM201 = deviceToTableEnergeticRoomTRM201;
        this.firstCehAutoclavTRM202ServiceData = firstCehAutoclavTRM202ServiceData;
        this.deviceToTableFirstCehAutoclavTRM202 = deviceToTableFirstCehAutoclavTRM202;
        this.firstCehBuzulukTRM200ServiceData = firstCehBuzulukTRM200ServiceData;
        this.deviceToTableFirstCehBuzulukTRM200 = deviceToTableFirstCehBuzulukTRM200;
        this.kameraDozrevanyaMPR51ServiceData = kameraDozrevanyaMPR51ServiceData;
        this.deviceToTableFirstCehKameraDozrevanyaMPR51 = deviceToTableFirstCehKameraDozrevanyaMPR51;
        this.firstCehSmesitel1KMSF1ServiceData = firstCehSmesitel1KMSF1ServiceData;
        this.firstCehSmesitel1MB110ServiceData = firstCehSmesitel1MB110ServiceData;
        this.deviceToTableFirstCehSmesitel1KMSF1 = deviceToTableFirstCehSmesitel1KMSF1;
        this.firstCehSmesitel2KMSF1ServiceData = firstCehSmesitel2KMSF1ServiceData;
        this.firstCehSmesitel2MB110ServiceData = firstCehSmesitel2MB110ServiceData;
        this.deviceToTableFirstCehSmesitel2KMSF1 = deviceToTableFirstCehSmesitel2KMSF1;
        this.firstCehSmesitel3KMSF1ServiceData = firstCehSmesitel3KMSF1ServiceData;
        this.firstCehSmesitel3MB110ServiceData = firstCehSmesitel3MB110ServiceData;
        this.deviceToTableFirstCehSmesitel3KMSF1 = deviceToTableFirstCehSmesitel3KMSF1;
        this.firstCehSmesitel4KMSF1ServiceData = firstCehSmesitel4KMSF1ServiceData;
        this.firstCehSmesitel4MB110ServiceData = firstCehSmesitel4MB110ServiceData;
        this.deviceToTableFirstCehSmesitel4KMSF1 = deviceToTableFirstCehSmesitel4KMSF1;
        this.firstCehSmesitel5KMSF1ServiceData = firstCehSmesitel5KMSF1ServiceData;
        this.firstCehSmesitel5MB110ServiceData = firstCehSmesitel5MB110ServiceData;
        this.deviceToTableFirstCehSmesitel5KMSF1 = deviceToTableFirstCehSmesitel5KMSF1;
        this.sevenCehAutoclavSPK107ServiceData = sevenCehAutoclavSPK107ServiceData;
        this.deviceToTableSevenCehAutoclavSPK107 = deviceToTableSevenCehAutoclavSPK107;
        this.thirdCehAutoclavTRM202ServiceData = thirdCehAutoclavTRM202ServiceData;
        this.deviceToTableThirdCehAutoclavTRM202 = deviceToTableThirdCehAutoclavTRM202;
        this.laboratoryAutoclavMV110ServiceData = laboratoryAutoclavMV110ServiceData;
        this.deviceToTableLaboratoryAutoclavMV110 = deviceToTableLaboratoryAutoclavMV110;
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

    @Scheduled(fixedDelay = 500)//30000ms
    private void loopSerialLisener(){
        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
        DeviceModelEnergeticRoomTRM201 deviceModelEnergeticRoomTRM201 = energeticRoomTRM201ServiceData.getModbusDevice();
        TableModelEnergeticRoomTRM201 tableModelEnergeticRoomTRM201 = deviceToTableEnergeticRoomTRM201.convert(deviceModelEnergeticRoomTRM201);
        messageSendingOperations.convertAndSend("/topic/trm201", tableModelEnergeticRoomTRM201);
        if (deviceModelEnergeticRoomTRM201.hysteresis()){
            energeticRoomTRM201ServiceData.addTabeDevice(tableModelEnergeticRoomTRM201);
        }

        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
        DeviceModelFirstCehAutoclavTRM202 deviceModelFirstCehAutoclavTRM202 = firstCehAutoclavTRM202ServiceData.getModbusDevice();
        TableModelFirstCehAutoclavTRM202 tableModelFirstCehAutoclavTRM202 = deviceToTableFirstCehAutoclavTRM202.convert(deviceModelFirstCehAutoclavTRM202);
        messageSendingOperations.convertAndSend("/topic/firstCehAvtoclav", tableModelFirstCehAutoclavTRM202);
        if (deviceModelFirstCehAutoclavTRM202.hysteresis()){
            firstCehAutoclavTRM202ServiceData.addTabeDevice(tableModelFirstCehAutoclavTRM202);
        }

        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
        DeviceModelFirstCehBuzulukTRM200 deviceModelFirstCehBuzulukTRM200 = firstCehBuzulukTRM200ServiceData.getModbusDevice();
        TableModelFirstCehBuzulukTRM200 tableModelFirstCehBuzulukTRM200 = deviceToTableFirstCehBuzulukTRM200.convert(deviceModelFirstCehBuzulukTRM200);
        messageSendingOperations.convertAndSend("/topic/firstCehBuzuluk", tableModelFirstCehBuzulukTRM200);
        if (deviceModelFirstCehBuzulukTRM200.hysteresis()){
            firstCehBuzulukTRM200ServiceData.addTabeDevice(tableModelFirstCehBuzulukTRM200);
        }

        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
        DeviceModelFirstCehKameraDozrevanyaMPR51 deviceModelFirstCehKameraDozrevanyaMPR51 = kameraDozrevanyaMPR51ServiceData.getModbusDevice();
        TableModelFirstCehKameraDozrevanyaMPR51 tableModelFirstCehKameraDozrevanyaMPR51 = deviceToTableFirstCehKameraDozrevanyaMPR51.convert(deviceModelFirstCehKameraDozrevanyaMPR51);
        messageSendingOperations.convertAndSend("/topic/firstCehKameraDozrevanya", tableModelFirstCehKameraDozrevanyaMPR51);
        if (deviceModelFirstCehKameraDozrevanyaMPR51.hysteresis()){
            kameraDozrevanyaMPR51ServiceData.addTabeDevice(tableModelFirstCehKameraDozrevanyaMPR51);
        }

        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
        DeviceModelFirstCehSmesitel1KMSF1 deviceModelFirstCehSmesitel1KMSF1 = firstCehSmesitel1KMSF1ServiceData.getModbusDevice();
        DeviceModelFirstCehSmesitel1MB110 deviceModelFirstCehSmesitel1MB110 = firstCehSmesitel1MB110ServiceData.getModbusDevice();
        TableModelFirstCehSmesitel1KMSF1 tableModelFirstCehSmesitel1KMSF1 = deviceToTableFirstCehSmesitel1KMSF1.convert(deviceModelFirstCehSmesitel1KMSF1, deviceModelFirstCehSmesitel1MB110);
        messageSendingOperations.convertAndSend("/topic/firstCehSmesitel1KMSF1", tableModelFirstCehSmesitel1KMSF1);
        if (deviceModelFirstCehSmesitel1KMSF1.hysteresis() || deviceModelFirstCehSmesitel1MB110.hysteresis()){
            firstCehSmesitel1KMSF1ServiceData.addTabeDevice(tableModelFirstCehSmesitel1KMSF1);
        }

        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
        DeviceModelFirstCehSmesitel2KMSF1 deviceModelFirstCehSmesitel2KMSF1 = firstCehSmesitel2KMSF1ServiceData.getModbusDevice();
        DeviceModelFirstCehSmesitel2MB110 deviceModelFirstCehSmesitel2MB110 = firstCehSmesitel2MB110ServiceData.getModbusDevice();
        TableModelFirstCehSmesitel2KMSF1 tableModelFirstCehSmesitel2KMSF1 = deviceToTableFirstCehSmesitel2KMSF1.convert(deviceModelFirstCehSmesitel2KMSF1, deviceModelFirstCehSmesitel2MB110);
        messageSendingOperations.convertAndSend("/topic/firstCehSmesitel2KMSF1", tableModelFirstCehSmesitel2KMSF1);
        if (deviceModelFirstCehSmesitel2KMSF1.hysteresis() || deviceModelFirstCehSmesitel2MB110.hysteresis()){
            firstCehSmesitel2KMSF1ServiceData.addTabeDevice(tableModelFirstCehSmesitel2KMSF1);
        }

        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
        DeviceModelFirstCehSmesitel3KMSF1 deviceModelFirstCehSmesitel3KMSF1 = firstCehSmesitel3KMSF1ServiceData.getModbusDevice();
        DeviceModelFirstCehSmesitel3MB110 deviceModelFirstCehSmesitel3MB110 = firstCehSmesitel3MB110ServiceData.getModbusDevice();
        TableModelFirstCehSmesitel3KMSF1 tableModelFirstCehSmesitel3KMSF1 = deviceToTableFirstCehSmesitel3KMSF1.convert(deviceModelFirstCehSmesitel3KMSF1, deviceModelFirstCehSmesitel3MB110);
        messageSendingOperations.convertAndSend("/topic/firstCehSmesitel3KMSF1", tableModelFirstCehSmesitel3KMSF1);
        if (deviceModelFirstCehSmesitel3KMSF1.hysteresis() || deviceModelFirstCehSmesitel3MB110.hysteresis()){
            firstCehSmesitel3KMSF1ServiceData.addTabeDevice(tableModelFirstCehSmesitel3KMSF1);
        }

        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
        DeviceModelFirstCehSmesitel4KMSF1 deviceModelFirstCehSmesitel4KMSF1 = firstCehSmesitel4KMSF1ServiceData.getModbusDevice();
        DeviceModelFirstCehSmesitel4MB110 deviceModelFirstCehSmesitel4MB110 = firstCehSmesitel4MB110ServiceData.getModbusDevice();
        TableModelFirstCehSmesitel4KMSF1 tableModelFirstCehSmesitel4KMSF1 = deviceToTableFirstCehSmesitel4KMSF1.convert(deviceModelFirstCehSmesitel4KMSF1, deviceModelFirstCehSmesitel4MB110);
        messageSendingOperations.convertAndSend("/topic/firstCehSmesitel4KMSF1", tableModelFirstCehSmesitel4KMSF1);
        if (deviceModelFirstCehSmesitel4KMSF1.hysteresis() || deviceModelFirstCehSmesitel4MB110.hysteresis()){
            firstCehSmesitel4KMSF1ServiceData.addTabeDevice(tableModelFirstCehSmesitel4KMSF1);
        }

        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
        DeviceModelFirstCehSmesitel5KMSF1 deviceModelFirstCehSmesitel5KMSF1 = firstCehSmesitel5KMSF1ServiceData.getModbusDevice();
        DeviceModelFirstCehSmesitel5MB110 deviceModelFirstCehSmesitel5MB110 = firstCehSmesitel5MB110ServiceData.getModbusDevice();
        TableModelFirstCehSmesitel5KMSF1 tableModelFirstCehSmesitel5KMSF1 = deviceToTableFirstCehSmesitel5KMSF1.convert(deviceModelFirstCehSmesitel5KMSF1, deviceModelFirstCehSmesitel5MB110);
        messageSendingOperations.convertAndSend("/topic/firstCehSmesitel5KMSF1", tableModelFirstCehSmesitel5KMSF1);
        if (deviceModelFirstCehSmesitel5KMSF1.hysteresis() || deviceModelFirstCehSmesitel5MB110.hysteresis()){
            firstCehSmesitel5KMSF1ServiceData.addTabeDevice(tableModelFirstCehSmesitel5KMSF1);
        }

        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
        DeviceModelSevenCehAutoclavSPK107 deviceModelSevenCehAutoclavSPK107 = sevenCehAutoclavSPK107ServiceData.getModbusDevice();
        TableModelSevenCehAutoclavSPK107 tableModelSevenCehAutoclavSPK107 = deviceToTableSevenCehAutoclavSPK107.convert(deviceModelSevenCehAutoclavSPK107);
        messageSendingOperations.convertAndSend("/topic/sevenCehAutoclav", tableModelSevenCehAutoclavSPK107);
        if (deviceModelSevenCehAutoclavSPK107.hysteresis()){
            sevenCehAutoclavSPK107ServiceData.addTabeDevice(tableModelSevenCehAutoclavSPK107);
        }

        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
        DeviceModelThirdCehAutoclavTRM202 deviceModelThirdCehAutoclavTRM202 = thirdCehAutoclavTRM202ServiceData.getModbusDevice();
        TableModelThirdCehAutoclavTRM202 tableModelThirdCehAutoclavTRM202 = deviceToTableThirdCehAutoclavTRM202.convert(deviceModelThirdCehAutoclavTRM202);
        messageSendingOperations.convertAndSend("/topic/thirdCehAvtoclav", tableModelThirdCehAutoclavTRM202);
        if (deviceModelThirdCehAutoclavTRM202.hysteresis()){
            thirdCehAutoclavTRM202ServiceData.addTabeDevice(tableModelThirdCehAutoclavTRM202);
        }

        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
        DeviceModelLaboratoryAutoclavMV110 deviceModelLaboratoryAutoclavMV110 = laboratoryAutoclavMV110ServiceData.getModbusDevice();
        TableModelLaboratoryAutoclavMV110 tableModelLaboratoryAutoclavMV110 = deviceToTableLaboratoryAutoclavMV110.convert(deviceModelLaboratoryAutoclavMV110);
        messageSendingOperations.convertAndSend("/topic/laboratoryAvtoclav", tableModelLaboratoryAutoclavMV110);
        if (deviceModelLaboratoryAutoclavMV110.hysteresis()){
            laboratoryAutoclavMV110ServiceData.addTabeDevice(tableModelLaboratoryAutoclavMV110);
        }
    }
}
