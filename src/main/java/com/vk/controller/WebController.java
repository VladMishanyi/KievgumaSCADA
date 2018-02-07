package com.vk.controller;

import com.vk.entity.*;
//import com.vk.repository.PLCRepository;
import com.vk.service.TRMRepositoryService;
import com.vk.threads.LoopFirstChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.core.MessageSendingOperations;
//import org.springframework.messaging.handler.annotation.MessageMapping;
//import org.springframework.messaging.handler.annotation.SendTo;
//import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import org.apache.log4j.Logger;

import java.util.Date;

//import javax.servlet.http.HttpSession;
//import java.text.DateFormat;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.*;


/**
 * Created by User on 2017-05-22.
 */
@Controller
@EnableScheduling
public class WebController {

    private final Logger LOGGER = Logger.getLogger(WebController.class);

//    @Autowired
//    private PLCRepository plcRepository;

    @Autowired
    private TRMRepositoryService trmRepositoryService = new TRMRepositoryService();

    @Autowired
    MessageSendingOperations<String> messageSendingOperations;

//    private final int ID_SLAVE_PLC100 = 1;
    private final int ID_SLAVE_TRM201 = 16;
    private final int ID_SLAVE_ThirdCehAutoklavTRM202 = 103;
    private final int ID_SLAVE_FirstCehAutoklavTRM202 = 22;
    private final int ID_SLAVE_FirstCehKameraDozrevanya = 13;
    private final int ID_SLAVE_FirstCehBuzulukTRM200 = 25;
    private final int ID_SLAVE_SevenCehAutoclav = 21;
    private final int ID_SLAVE_FirstCehSmesitel1KMSF1 = 24;
    private final int ID_SLAVE_FirstCehSmesitel2KMSF1 = 40;
    private final int ID_SLAVE_FirstCehSmesitel3KMSF1 = 72;
    private final int ID_SLAVE_FirstCehSmesitel4KMSF1 = 64;
    private final int ID_SLAVE_FirstCehSmesitel5KMSF1 = 48;
//    private boolean bol1 = false;
//    private boolean bol2 = false;
//    private boolean bol3 = false;
//    private boolean bol4 = false;
//    private boolean loop = false;
    private float trm201Temp = 0;
    private float thirdCehAutoclavTemperatura = 0;
    private float thirdCehAutoclavDavlenie = 0;
    private float firstCehAutoclavTemperatura = 0;
    private float firstCehAutoclavDavlenie = 0;
    private float firstCehKameraDozrevanyaTempProdukta = 0;
    private float firstCehKameraDozrevanyaTempSuhogo = 0;
    private float firstCehKameraDozrevanyaTempVlagnogo = 0;
    private float firstCehBuzulukTemperatura = 0;
    private float firstCehBuzulukDavlenie = 0;
    private float sevenCehAutoclavDavlenie = 0;
    private float sevenCehAutoclavTempAuto = 0;
    private float sevenCehAutoclavTempProdukta = 0;
    private int firstCehSmesitel1Tok = 0;
    private int firstCehSmesitel2Tok = 0;
    private int firstCehSmesitel3Tok = 0;
    private int firstCehSmesitel4Tok = 0;
    private int firstCehSmesitel5Tok = 0;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getIndex(Model model){
        return "index";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String getText(Model model){
        return "test";
    }

    @RequestMapping(value = "/energetics", method = RequestMethod.GET)
    public String getEnergetics(Model model){
        return "otdel_energetika";
    }

    @RequestMapping(value = "/autoclavThirdCeh", method = RequestMethod.GET)
    public String getAutoclavThirdCeh(Model model){
        return "autoclavThirdCeh";
    }

    @RequestMapping(value = "/firstCehAutoclav", method = RequestMethod.GET)
    public String getAutoclavFirstCeh(Model model){
        return "firstCehAutoclav";
    }

    @RequestMapping(value = "/firstCehKameraDozrevanya", method = RequestMethod.GET)
    public String getFirstCehKameraDozrevanya(Model model){
        return "firstCehKameraDozrevanya";
    }

    @RequestMapping(value = "/firstCehBuzuluk", method = RequestMethod.GET)
    public String getFirstCehBuzuluk(Model model){
        return "firstCehBuzuluk";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String getAdminPanel(Model model){
        return "admin";
    }

    @RequestMapping(value = "/sevenCehAutoclav", method = RequestMethod.GET)
    public String getSevenCehBuzuluk(Model model){
        return "sevenCehAutoclav";
    }

    @RequestMapping(value = "/firstCehSmesitel1", method = RequestMethod.GET)
    public String getFirstCehSmesitel1KMSF1(Model model){
        return "firstCehSmesitel1KMSF1";
    }

    @RequestMapping(value = "/firstCehSmesitel2", method = RequestMethod.GET)
    public String getFirstCehSmesitel2KMSF1(Model model){
        return "firstCehSmesitel2KMSF1";
    }

    @RequestMapping(value = "/firstCehSmesitel3", method = RequestMethod.GET)
    public String getFirstCehSmesitel3KMSF1(Model model){
        return "firstCehSmesitel3KMSF1";
    }

    @RequestMapping(value = "/firstCehSmesitel4", method = RequestMethod.GET)
    public String getFirstCehSmesitel4KMSF1(Model model){
        return "firstCehSmesitel4KMSF1";
    }

    @RequestMapping(value = "/firstCehSmesitel5", method = RequestMethod.GET)
    public String getFirstCehSmesitel5KMSF1(Model model){
        return "firstCehSmesitel5KMSF1";
    }
////    @RequestMapping(value = "/checkPin1", method = RequestMethod.POST)
////    @ResponseBody
//    @MessageMapping("/reg0bit0")
//    public void getPin1(){
//        loop = true;
//        long start = System.currentTimeMillis();
//        bol1 = !bol1;
//        String message = plcRepository.setRegBit(ID_SLAVE_PLC100, 0, (byte) 0, bol1);
////        System.out.println("------This time listening reg0bit0--------" + (System.currentTimeMillis() - start) + " ms");
//        loop = false;
//    }

//    @MessageMapping("/reg0bit1")
//    public void getPin2(){
//        loop = true;
//        long start = System.currentTimeMillis();
//        bol2 = !bol2;
//        String message = plcRepository.setRegBit(ID_SLAVE_PLC100, 0, (byte) 1, bol2);
////        System.out.println("------This time listening reg0bit1--------" + (System.currentTimeMillis() - start) + " ms");
//        loop = false;
//    }

//    @MessageMapping("/reg0bit2")
//    public void getPin3(){
//        loop = true;
//        long start = System.currentTimeMillis();
//        bol3 = !bol3;
//        String message = plcRepository.setRegBit(ID_SLAVE_PLC100, 0, (byte) 2, bol3);
////        System.out.println("------This time listening reg0bit2--------" + (System.currentTimeMillis() - start) + " ms");
//        loop = false;
//    }

//    @MessageMapping("/reg0bit3")
//    public void getPin4(){
//        loop = true;
//        long start = System.currentTimeMillis();
//        bol4 = !bol4;
//        String message = plcRepository.setRegBit(ID_SLAVE_PLC100, 0, (byte) 3, bol4);
////        System.out.println("------This time listening reg0bit3--------" + (System.currentTimeMillis() - start) + " ms");
//        loop = false;
//    }

//    @MessageMapping("/reg1")
////    @SendTo("/topic/greetings")
//    public void showRealData(FromSocketReg1 fromSocketReg1){
//        loop = true;
////        System.out.println("in :"+ fromSocketReg1.getVar());
//        plcRepository.setReg(ID_SLAVE_PLC100, 1, fromSocketReg1.getVar());
//        loop = false;
//    }

//    @Scheduled(fixedDelay = 1000)//time in milliseconds
//    private void autoListener(){
//        if (!loop){
////            long start = System.currentTimeMillis();
//            PLC loopPlc = plcRepository.getPlc(ID_SLAVE_PLC100);
//            bol1 = loopPlc.isReg0Bit0();
//            bol2 = loopPlc.isReg0Bit1();
//            bol3 = loopPlc.isReg0Bit2();
//            bol4 = loopPlc.isReg0Bit3();
//            messageSendingOperations.convertAndSend("/topic/greetings", loopPlc);
////            System.out.println("------This time listening--------" + (System.currentTimeMillis() - start) + " ms");
//        }
//    }
    @Scheduled(fixedDelay = 30000)//ms
    private void loopSerialLisener(){
        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
//        TRM201_Energrtic trm201_energrtic = trmRepositoryService.getTRM201(ID_SLAVE_TRM201);
//        messageSendingOperations.convertAndSend("/topic/trm201", trm201_energrtic);
//        if ((trm201Temp -1 >= trm201_energrtic.getValue3()) || (trm201Temp +1 <= trm201_energrtic.getValue3()) || (0 == trm201_energrtic.getValue3()) ){
//            trmRepositoryService.addTRMvalue(trm201_energrtic);
//            trm201Temp = trm201_energrtic.getValue3();
//        }

        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
        ThirdCehAutoclav thirdCehAutoclav = trmRepositoryService.getThirdCehAutoclavTRM202(ID_SLAVE_ThirdCehAutoklavTRM202);
        messageSendingOperations.convertAndSend("/topic/thirdCehAvtoclav", thirdCehAutoclav);
        if ((thirdCehAutoclavTemperatura -1 >= thirdCehAutoclav.getChannel1()) || (thirdCehAutoclavTemperatura +1 <= thirdCehAutoclav.getChannel1()) || (0 == thirdCehAutoclav.getChannel1()) ){
            trmRepositoryService.addThirdCehAutoclavTRM202(thirdCehAutoclav);
            thirdCehAutoclavTemperatura = thirdCehAutoclav.getChannel1();
        }
        if ((thirdCehAutoclavDavlenie -1 >= thirdCehAutoclav.getChannel2()) || (thirdCehAutoclavDavlenie +1 <= thirdCehAutoclav.getChannel2()) || (0 == thirdCehAutoclav.getChannel2()) ){
            trmRepositoryService.addThirdCehAutoclavTRM202(thirdCehAutoclav);
            thirdCehAutoclavDavlenie = thirdCehAutoclav.getChannel2();
        }

        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
        FirstCehAutoclav firstCehAutoclav = trmRepositoryService.getFirstCehAutoclavTRM202(ID_SLAVE_FirstCehAutoklavTRM202);
        messageSendingOperations.convertAndSend("/topic/firstCehAvtoclav", firstCehAutoclav);
        if ((firstCehAutoclavTemperatura -1 >= firstCehAutoclav.getChannel1()) || (firstCehAutoclavTemperatura +1 <= firstCehAutoclav.getChannel1()) || (0 == firstCehAutoclav.getChannel1()) ){
            trmRepositoryService.addFirstCehAutoclavTRM202(firstCehAutoclav);
            firstCehAutoclavTemperatura = firstCehAutoclav.getChannel1();
        }
        if ((firstCehAutoclavDavlenie -1 >= firstCehAutoclav.getChannel2()) || (firstCehAutoclavDavlenie +1 <= firstCehAutoclav.getChannel2()) || (0 == firstCehAutoclav.getChannel2()) ){
            trmRepositoryService.addFirstCehAutoclavTRM202(firstCehAutoclav);
            firstCehAutoclavDavlenie = firstCehAutoclav.getChannel2();
        }

        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
        FirstCehKameraDozrevanya firstCehKameraDozrevanya = trmRepositoryService.getFirstCehKameraDozrevanyaMPR51(ID_SLAVE_FirstCehKameraDozrevanya);
        messageSendingOperations.convertAndSend("/topic/firstCehKameraDozrevanya", firstCehKameraDozrevanya);
        if ((firstCehKameraDozrevanyaTempProdukta -1 >= firstCehKameraDozrevanya.getChannel1()) || (firstCehKameraDozrevanyaTempProdukta +1 <= firstCehKameraDozrevanya.getChannel1()) || (0 == firstCehKameraDozrevanya.getChannel1()) ){
            trmRepositoryService.addFirstCehKameraDozrevanyaMPR51(firstCehKameraDozrevanya);
            firstCehKameraDozrevanyaTempProdukta = firstCehKameraDozrevanya.getChannel1();
        }
        if ((firstCehKameraDozrevanyaTempSuhogo -1 >= firstCehKameraDozrevanya.getChannel2()) || (firstCehKameraDozrevanyaTempSuhogo +1 <= firstCehKameraDozrevanya.getChannel2()) || (0 == firstCehKameraDozrevanya.getChannel2()) ){
            trmRepositoryService.addFirstCehKameraDozrevanyaMPR51(firstCehKameraDozrevanya);
            firstCehKameraDozrevanyaTempSuhogo = firstCehKameraDozrevanya.getChannel2();
        }
        if ((firstCehKameraDozrevanyaTempVlagnogo -1 >= firstCehKameraDozrevanya.getChannel3()) || (firstCehKameraDozrevanyaTempVlagnogo +1 <= firstCehKameraDozrevanya.getChannel3()) || (0 == firstCehKameraDozrevanya.getChannel3()) ){
            trmRepositoryService.addFirstCehKameraDozrevanyaMPR51(firstCehKameraDozrevanya);
            firstCehKameraDozrevanyaTempVlagnogo = firstCehKameraDozrevanya.getChannel3();
        }

        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
        FirstCehBuzuluk firstCehBuzuluk = trmRepositoryService.getFirstCehBuzulukTRM200(ID_SLAVE_FirstCehBuzulukTRM200);
        messageSendingOperations.convertAndSend("/topic/firstCehBuzuluk", firstCehBuzuluk);
        if ((firstCehBuzulukTemperatura -1 >= firstCehBuzuluk.getChannel1()) || (firstCehBuzulukTemperatura +1 <= firstCehBuzuluk.getChannel1()) || (0 == firstCehBuzuluk.getChannel1()) ){
            trmRepositoryService.addFirstCehBuzulukTRM200(firstCehBuzuluk);
            firstCehBuzulukTemperatura = firstCehBuzuluk.getChannel1();
        }
        if ((firstCehBuzulukDavlenie -1 >= firstCehBuzuluk.getChannel2()) || (firstCehBuzulukDavlenie +1 <= firstCehBuzuluk.getChannel2()) || (0 == firstCehBuzuluk.getChannel2()) ){
            trmRepositoryService.addFirstCehBuzulukTRM200(firstCehBuzuluk);
            firstCehBuzulukDavlenie = firstCehBuzuluk.getChannel2();
        }

        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
        SevenCehAutoclav sevenCehAutoclav = trmRepositoryService.getSevenCehAutoclavSPK(ID_SLAVE_SevenCehAutoclav);
        messageSendingOperations.convertAndSend("/topic/sevenCehAutoclav", sevenCehAutoclav);
        if ((sevenCehAutoclavDavlenie -1 >= sevenCehAutoclav.getChannel1()) || (sevenCehAutoclavDavlenie +1 <= sevenCehAutoclav.getChannel1()) || (0 == sevenCehAutoclav.getChannel1()) ){
            trmRepositoryService.addSevenCehAutoclavSPK(sevenCehAutoclav);
            sevenCehAutoclavDavlenie = sevenCehAutoclav.getChannel1();
        }
        if ((sevenCehAutoclavTempAuto -1 >= sevenCehAutoclav.getChannel2()) || (sevenCehAutoclavTempAuto +1 <= sevenCehAutoclav.getChannel2()) || (0 == sevenCehAutoclav.getChannel2()) ){
            trmRepositoryService.addSevenCehAutoclavSPK(sevenCehAutoclav);
            sevenCehAutoclavTempAuto = sevenCehAutoclav.getChannel2();
        }
        if ((sevenCehAutoclavTempProdukta -1 >= sevenCehAutoclav.getChannel3()) || (sevenCehAutoclavTempProdukta +1 <= sevenCehAutoclav.getChannel3()) || (0 == sevenCehAutoclav.getChannel3()) ){
            trmRepositoryService.addSevenCehAutoclavSPK(sevenCehAutoclav);
            sevenCehAutoclavTempProdukta = sevenCehAutoclav.getChannel3();
        }

        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
        FirstCehSmesitel1KMSF1 firstCehSmesitel1KMSF1 = trmRepositoryService.getFirstCehSmesitel1KMSF1(ID_SLAVE_FirstCehSmesitel1KMSF1);
        messageSendingOperations.convertAndSend("/topic/firstCehSmesitel1KMSF1", firstCehSmesitel1KMSF1);
        if ((firstCehSmesitel1Tok -1 >= firstCehSmesitel1KMSF1.getChannel1()) || (firstCehSmesitel1Tok +1 <= firstCehSmesitel1KMSF1.getChannel1()) || (0 == firstCehSmesitel1KMSF1.getChannel1()) ){
            trmRepositoryService.addFirstCehSmesitel1KMSF1(firstCehSmesitel1KMSF1);
            firstCehSmesitel1Tok = firstCehSmesitel1KMSF1.getChannel1();
        }

        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
        FirstCehSmesitel2KMSF1 firstCehSmesitel2KMSF1 = trmRepositoryService.getFirstCehSmesitel2KMSF1(ID_SLAVE_FirstCehSmesitel2KMSF1);
        messageSendingOperations.convertAndSend("/topic/firstCehSmesitel2KMSF1", firstCehSmesitel2KMSF1);
        if ((firstCehSmesitel2Tok -1 >= firstCehSmesitel2KMSF1.getChannel1()) || (firstCehSmesitel2Tok +1 <= firstCehSmesitel2KMSF1.getChannel1()) || (0 == firstCehSmesitel2KMSF1.getChannel1()) ){
            trmRepositoryService.addFirstCehSmesitel2KMSF1(firstCehSmesitel2KMSF1);
            firstCehSmesitel2Tok = firstCehSmesitel2KMSF1.getChannel1();
        }

        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
        FirstCehSmesitel3KMSF1 firstCehSmesitel3KMSF1 = trmRepositoryService.getFirstCehSmesitel3KMSF1(ID_SLAVE_FirstCehSmesitel3KMSF1);
        messageSendingOperations.convertAndSend("/topic/firstCehSmesitel3KMSF1", firstCehSmesitel3KMSF1);
        if ((firstCehSmesitel3Tok -1 >= firstCehSmesitel3KMSF1.getChannel1()) || (firstCehSmesitel3Tok +1 <= firstCehSmesitel3KMSF1.getChannel1()) || (0 == firstCehSmesitel3KMSF1.getChannel1()) ){
            trmRepositoryService.addFirstCehSmesitel3KMSF1(firstCehSmesitel3KMSF1);
            firstCehSmesitel3Tok = firstCehSmesitel3KMSF1.getChannel1();
        }

        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
        FirstCehSmesitel4KMSF1 firstCehSmesitel4KMSF1 = trmRepositoryService.getFirstCehSmesitel4KMSF1(ID_SLAVE_FirstCehSmesitel4KMSF1);
        messageSendingOperations.convertAndSend("/topic/firstCehSmesitel4KMSF1", firstCehSmesitel4KMSF1);
        if ((firstCehSmesitel4Tok -1 >= firstCehSmesitel4KMSF1.getChannel1()) || (firstCehSmesitel4Tok +1 <= firstCehSmesitel4KMSF1.getChannel1()) || (0 == firstCehSmesitel4KMSF1.getChannel1()) ){
            trmRepositoryService.addFirstCehSmesitel4KMSF1(firstCehSmesitel4KMSF1);
            firstCehSmesitel4Tok = firstCehSmesitel4KMSF1.getChannel1();
        }

        /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
        FirstCehSmesitel5KMSF1 firstCehSmesitel5KMSF1 = trmRepositoryService.getFirstCehSmesitel5KMSF1(ID_SLAVE_FirstCehSmesitel5KMSF1);
        messageSendingOperations.convertAndSend("/topic/firstCehSmesitel5KMSF1", firstCehSmesitel5KMSF1);
        if ((firstCehSmesitel5Tok -1 >= firstCehSmesitel5KMSF1.getChannel1()) || (firstCehSmesitel5Tok +1 <= firstCehSmesitel5KMSF1.getChannel1()) || (0 == firstCehSmesitel5KMSF1.getChannel1()) ){
            trmRepositoryService.addFirstCehSmesitel5KMSF1(firstCehSmesitel5KMSF1);
            firstCehSmesitel5Tok = firstCehSmesitel5KMSF1.getChannel1();
        }
    }
}
