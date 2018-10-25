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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Created by User on 2017-05-22.
 */
@Controller
@EnableScheduling
@ComponentScan(basePackages = {"com.vk.service"})
public class WebController {

    private final Logger LOGGER = Logger.getLogger(WebController.class);

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

    @RequestMapping(value = "/service-desk")
    public void redirectToServiceDesk(HttpServletRequest request, HttpServletResponse response){
        try {
            response.sendRedirect("http://192.168.10.7:3040");
        }
        catch (IOException ex){
            LOGGER.error("Can't parse redirect address -> "+ ex.getClass());
        }
    }

    @RequestMapping(value = "/contact-desk")
    public void redirectToContactDesk(HttpServletRequest request, HttpServletResponse response){
        try {
            response.sendRedirect("http://192.168.10.20:3040");
        }
        catch (IOException ex){
            LOGGER.error("Can't parse redirect address -> "+ ex.getClass());
        }
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

    @RequestMapping(value = "/kotelnyaParMikrolITM4", method = RequestMethod.GET)
    public String getTaskKotelnyaParMikrolITM4(){
        return "taskKotelnyaParMikrolITM4";
    }

    @Scheduled(fixedDelay = 10000)//10000ms
    private void loopSerialLisener(){

        taskEnergeticRoomTRM201.work1();

        taskFirstCehAutoclavTRM202.work1();

        taskFirstCehBuzulukTRM200.work1();

        taskKameraDozrevanyaMPR51.work2();

        taskFirstCehSmesitel1KMSF1.work2();

        taskFirstCehSmesitel2KMSF1.work2();

        taskFirstCehSmesitel3KMSF1.work2();

        taskFirstCehSmesitel4KMSF1.work2();

        taskFirstCehSmesitel5KMSF1.work2();

        taskSevenCehAutoclavSPK107.work1();

        taskThirdCehAutoclavTRM202.work1();

        taskLaboratoryAutoclavMV110.work1();

        taskKotelnyaParMikrolITM4.work1();
    }
}
