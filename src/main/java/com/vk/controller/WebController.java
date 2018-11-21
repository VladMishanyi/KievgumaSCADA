package com.vk.controller;

import com.vk.chain.Chain1;
import com.vk.chain.Chain2;
import com.vk.chain.Chain3;
import com.vk.chain.Chain4;
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
@ComponentScan(basePackages = {"com.vk.service", "com.vk.chain"})
public class WebController {

    private final Logger LOGGER = Logger.getLogger(WebController.class);

    private Chain1 chain1;

    private Chain2 chain2;

    private Chain3 chain3;

    private Chain4 chain4;

    @Autowired
    public WebController(
            final Chain1 chain1,
            final Chain2 chain2,
            final Chain3 chain3,
            final Chain4 chain4
    ){
        this.chain1 = chain1;
        this.chain2 = chain2;
        this.chain3 = chain3;
        this.chain4 = chain4;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getIndex(){
        return "index";
    }

    @RequestMapping(value = "/service-desk")
    public void redirectToServiceDesk(final HttpServletRequest request, final HttpServletResponse response){
        try {
            response.sendRedirect("http://192.168.10.7:3040");
        }
        catch (IOException ex){
            LOGGER.error("Can't parse redirect address -> "+ ex.getClass());
        }
    }

    @RequestMapping(value = "/contact-desk")
    public void redirectToContactDesk(final HttpServletRequest request, final HttpServletResponse response){
        try {
            response.sendRedirect("http://192.168.10.20:3040");
        }
        catch (IOException ex){
            LOGGER.error("Can't parse redirect address -> "+ ex.getClass());
        }
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

    @RequestMapping(value = "/secondcehDielKamVulcan1", method = RequestMethod.GET)
    public String getTaskSecondCehKameraVulcan1MPR51(){
        return "secondCehKameraVulcan1MPR51";
    }

    @RequestMapping(value = "/secondcehDielKamVulcan2", method = RequestMethod.GET)
    public String getTaskSecondCehKameraVulcan2MPR51(){
        return "secondCehKameraVulcan2MPR51";
    }

    @RequestMapping(value = "/secondcehDielKamVulcan3", method = RequestMethod.GET)
    public String getTaskSecondCehKameraVulcan3MPR51(){
        return "secondCehKameraVulcan3MPR51";
    }

    @Scheduled(fixedDelay = 10000)//10000ms
    private void loopSerialLisener(){

        chain1.start();

        chain2.start();

        chain3.start();

        chain4.start();
    }

//    @Scheduled(fixedDelay = 500)//500ms
//    private void secondLoop(){
//        taskEnergeticRoomTRM201.checkMaster();
//        taskFirstCehSmesitel1KMSF1.checkMaster();
//        taskSevenCehAutoclavSPK107.checkMaster();
//    }
}
