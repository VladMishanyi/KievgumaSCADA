package com.vk.controller;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Created by User on 2017-05-22.
 */
@Controller
@ComponentScan(basePackages = {"com.vk.service", "com.vk.chain"})
public class WebController {

    private final Logger LOGGER = Logger.getLogger(this.getClass());

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getIndex(){
        return "index";
    }

    @RequestMapping(value = "/service-desk")
    public void redirectToServiceDesk(final HttpServletResponse response){
        try {
            response.sendRedirect("http://192.168.10.7:3040");
        }
        catch (IOException ex){
            LOGGER.error("Can't parse redirect address -> "+ ex.getClass());
        }
    }

    @RequestMapping(value = "/contact-desk")
    public void redirectToContactDesk(final HttpServletResponse response){
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

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String getInfo(){
        return "info_page";
    }

    @RequestMapping(value = "/secondcehLineNapal", method = RequestMethod.GET)
    public String getTaskSecondCehLineNapal(){
        return "secondCehLineNapal";
    }

    @RequestMapping(value = "/sensor1", method = RequestMethod.GET)
    public String getTaskAirSensor1(){
        return "air_sensor1";
    }

    @RequestMapping(value = "/silicon-camera-vulcan", method = RequestMethod.GET)
    public String getTaskSiliconCameraVulcan(){
        return "siliconCameraVulcan";
    }

    @RequestMapping(value = "/sensor2", method = RequestMethod.GET)
    public String getTaskAirSensor2(){
        return "air_sensor2";
    }

    @RequestMapping(value = "/sensor3", method = RequestMethod.GET)
    public String getTaskAirSensor3(){
        return "air_sensor3";
    }

    @RequestMapping(value = "/sensor4", method = RequestMethod.GET)
    public String getTaskAirSensor4(){
        return "air_sensor4";
    }
}
