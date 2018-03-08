package com.vk.controller;

import com.vk.entity.*;
import com.vk.service.TRMRepositoryService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by User on 2017-07-20.
 */
@RestController
public class JsonController {

    @Autowired
    private TRMRepositoryService trmRepositoryService;

    private final Logger LOGGER = Logger.getLogger(JsonController.class);

//    @ResponseBody
//    @RequestMapping(value = "/generateChart", method = RequestMethod.POST)
//    public List<TRM201_Energrtic> generateChart(@RequestBody DateFromChart dateFromChart /*@RequestParam(value = "start") String start,
//                                @RequestParam(value = "end") String end*/){
//        List<TRM201_Energrtic> trm201_energrticList = null;
//        String start = dateFromChart.getStart();
//        String end = dateFromChart.getEnd();
//        String[] startTokens = start.split("T");
//        String[] endTokens = end.split("T");
//
//
////        Date date = new Date();
////        TRM201_Energrtic trm201_energrtic = new TRM201_Energrtic();
////        trm201_energrtic.setDate(date);
////        trm201_energrtic.setValue1(190);
////        trm201_energrtic.setValue2(195);
////        trmRepositoryService.addTRMvalue(trm201_energrtic);
//
//        try {
////            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
////            Date date1 = simpleDateFormat.parse("2017-07-19 15:16:02");
////            Date date2 = simpleDateFormat.parse("2017-07-20 09:26:46");
////            System.out.println("----------startPars---"+startTokens[0] +" "+ startTokens[1]+"-------endPars: "+endTokens[0] +" "+ endTokens[1]+"------");
//            Date date1 = simpleDateFormat.parse(startTokens[0] +" "+ startTokens[1]);
//            Date date2 = simpleDateFormat.parse(endTokens[0] +" "+ endTokens[1]);
////            System.out.println("------------------------start: "+date1+ "------------------------end: "+date2);
//            trm201_energrticList = trmRepositoryService.rangeTimestamp(date1, date2);
////            System.out.println("--lengs:---------"+trm201_energrticList.size());
////            for(TRM201_Energrtic x : trm201_energrticList){
////                System.out.println(x.toString());
////                System.out.println("-------------------------------------------------------------------------");
////            }
//        }catch (ParseException e){
////            System.out.println("--eror--------------------------"+e.getMessage()+"---------------------------------------------");
//            LOGGER.error("can't parse range of date: "+e.getClass());
//        }
//        return trm201_energrticList;
//    }

//    @ResponseBody
//    @RequestMapping(value = "/generateChartThirdCehAutoklav", method = RequestMethod.POST)
//    public List<ThirdCehAutoclav> generateChartThirdCehAutoklav(@RequestBody DateFromChart dateFromChart){
//        List<ThirdCehAutoclav> thirdCehAutoclavs = null;
//        String start = dateFromChart.getStart();
//        String end = dateFromChart.getEnd();
//        String[] startTokens = start.split("T");
//        String[] endTokens = end.split("T");
//        try {
//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
//            Date date1 = simpleDateFormat.parse(startTokens[0] +" "+ startTokens[1]);
//            Date date2 = simpleDateFormat.parse(endTokens[0] +" "+ endTokens[1]);
//            thirdCehAutoclavs = trmRepositoryService.rangeTimestampThirdCehAutoclav(date1, date2);
//        }catch (ParseException e){
//            LOGGER.error("can't parse range of date: "+e.getClass());
//        }
//        return thirdCehAutoclavs;
//    }

//    @ResponseBody
//    @RequestMapping(value = "/generateChartFirstCehAutoklav", method = RequestMethod.POST)
//    public List<FirstCehAutoclav> generateChartFirstCehAutoklav(@RequestBody DateFromChart dateFromChart){
//        List<FirstCehAutoclav> firstCehAutoclavs = null;
//        String start = dateFromChart.getStart();
//        String end = dateFromChart.getEnd();
//        String[] startTokens = start.split("T");
//        String[] endTokens = end.split("T");
//        try {
//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
//            Date date1 = simpleDateFormat.parse(startTokens[0] +" "+ startTokens[1]);
//            Date date2 = simpleDateFormat.parse(endTokens[0] +" "+ endTokens[1]);
//            firstCehAutoclavs = trmRepositoryService.rangeTimestampFirstCehAutoclav(date1, date2);
//        }catch (ParseException e){
//            LOGGER.error("can't parse range of date: "+e.getClass());
//        }
//        return firstCehAutoclavs;
//    }

//    @ResponseBody
//    @RequestMapping(value = "/generateChartFirstCehKameraDozrevanya", method = RequestMethod.POST)
//    public List<FirstCehKameraDozrevanya> generateChartFirstCehKameraDozrevanya(@RequestBody DateFromChart dateFromChart){
//        List<FirstCehKameraDozrevanya> firstCehKameraDozrevanyas = null;
//        String start = dateFromChart.getStart();
//        String end = dateFromChart.getEnd();
//        String[] startTokens = start.split("T");
//        String[] endTokens = end.split("T");
//        try {
//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
//            Date date1 = simpleDateFormat.parse(startTokens[0] +" "+ startTokens[1]);
//            Date date2 = simpleDateFormat.parse(endTokens[0] +" "+ endTokens[1]);
//            firstCehKameraDozrevanyas = trmRepositoryService.rangeTimestampFirstCehKameraDozrevanya(date1, date2);
//        }catch (ParseException e){
//            LOGGER.error("can't parse range of date: "+e.getClass());
//        }
//        return firstCehKameraDozrevanyas;
//    }

//    @ResponseBody
//    @RequestMapping(value = "/generateChartFirstCehBuzuluk", method = RequestMethod.POST)
//    public List<FirstCehBuzuluk> generateChartFirstCehBuzuluk(@RequestBody DateFromChart dateFromChart){
//        List<FirstCehBuzuluk> firstCehBuzuluks = null;
//        String start = dateFromChart.getStart();
//        String end = dateFromChart.getEnd();
//        String[] startTokens = start.split("T");
//        String[] endTokens = end.split("T");
//        try {
//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
//            Date date1 = simpleDateFormat.parse(startTokens[0] +" "+ startTokens[1]);
//            Date date2 = simpleDateFormat.parse(endTokens[0] +" "+ endTokens[1]);
//            firstCehBuzuluks = trmRepositoryService.rangeTimestampFirstCehBuzuluk(date1, date2);
//        }catch (ParseException e){
//            LOGGER.error("can't parse range of date: "+e.getClass());
//        }
//        return firstCehBuzuluks;
//    }

//    @ResponseBody
//    @RequestMapping(value = "/generateChartSevenCehAutoclav", method = RequestMethod.POST)
//    public List<SevenCehAutoclav> generateChartSevenCehAutoclav(@RequestBody DateFromChart dateFromChart){
//        List<SevenCehAutoclav> sevenCehAutoclavs = null;
//        String start = dateFromChart.getStart();
//        String end = dateFromChart.getEnd();
//        String[] startTokens = start.split("T");
//        String[] endTokens = end.split("T");
//        try {
//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
//            Date date1 = simpleDateFormat.parse(startTokens[0] +" "+ startTokens[1]);
//            Date date2 = simpleDateFormat.parse(endTokens[0] +" "+ endTokens[1]);
//            sevenCehAutoclavs = trmRepositoryService.rangeTimestampSevenCehAutoclav(date1, date2);
//        }catch (ParseException e){
//            LOGGER.error("can't parse range of date: "+e.getClass());
//        }
//        return sevenCehAutoclavs;
//    }

//    @ResponseBody
//    @RequestMapping(value = "/generateChartFirstCehSmesitel1KMSF1", method = RequestMethod.POST)
//    public List<FirstCehSmesitel1KMSF1> generateChartFirstCehSmesitel1KMSF1(@RequestBody DateFromChart dateFromChart){
//        List<FirstCehSmesitel1KMSF1> firstCehSmesitel1KMSF1s = null;
//        String start = dateFromChart.getStart();
//        String end = dateFromChart.getEnd();
//        String[] startTokens = start.split("T");
//        String[] endTokens = end.split("T");
//        try {
//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
//            Date date1 = simpleDateFormat.parse(startTokens[0] +" "+ startTokens[1]);
//            Date date2 = simpleDateFormat.parse(endTokens[0] +" "+ endTokens[1]);
//            firstCehSmesitel1KMSF1s = trmRepositoryService.rangeTimestampFirstCehSmesitel1KMSF1(date1, date2);
//        }catch (ParseException e){
//            LOGGER.error("can't parse range of date: "+e.getClass());
//        }
//        return firstCehSmesitel1KMSF1s;
//    }

//    @ResponseBody
//    @RequestMapping(value = "/generateChartFirstCehSmesitel2KMSF1", method = RequestMethod.POST)
//    public List<FirstCehSmesitel2KMSF1> generateChartFirstCehSmesitel2KMSF1(@RequestBody DateFromChart dateFromChart){
//        List<FirstCehSmesitel2KMSF1> firstCehSmesitel2KMSF1s = null;
//        String start = dateFromChart.getStart();
//        String end = dateFromChart.getEnd();
//        String[] startTokens = start.split("T");
//        String[] endTokens = end.split("T");
//        try {
//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
//            Date date1 = simpleDateFormat.parse(startTokens[0] +" "+ startTokens[1]);
//            Date date2 = simpleDateFormat.parse(endTokens[0] +" "+ endTokens[1]);
//            firstCehSmesitel2KMSF1s = trmRepositoryService.rangeTimestampFirstCehSmesitel2KMSF1(date1, date2);
//        }catch (ParseException e){
//            LOGGER.error("can't parse range of date: "+e.getClass());
//        }
//        return firstCehSmesitel2KMSF1s;
//    }

//    @ResponseBody
//    @RequestMapping(value = "/generateChartFirstCehSmesitel3KMSF1", method = RequestMethod.POST)
//    public List<FirstCehSmesitel3KMSF1> generateChartFirstCehSmesitel3KMSF1(@RequestBody DateFromChart dateFromChart){
//        List<FirstCehSmesitel3KMSF1> firstCehSmesitel3KMSF1s = null;
//        String start = dateFromChart.getStart();
//        String end = dateFromChart.getEnd();
//        String[] startTokens = start.split("T");
//        String[] endTokens = end.split("T");
//        try {
//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
//            Date date1 = simpleDateFormat.parse(startTokens[0] +" "+ startTokens[1]);
//            Date date2 = simpleDateFormat.parse(endTokens[0] +" "+ endTokens[1]);
//            firstCehSmesitel3KMSF1s = trmRepositoryService.rangeTimestampFirstCehSmesitel3KMSF1(date1, date2);
//        }catch (ParseException e){
//            LOGGER.error("can't parse range of date: "+e.getClass());
//        }
//        return firstCehSmesitel3KMSF1s;
//    }

//    @ResponseBody
//    @RequestMapping(value = "/generateChartFirstCehSmesitel4KMSF1", method = RequestMethod.POST)
//    public List<FirstCehSmesitel4KMSF1> generateChartFirstCehSmesitel4KMSF1(@RequestBody DateFromChart dateFromChart){
//        List<FirstCehSmesitel4KMSF1> firstCehSmesitel4KMSF1s = null;
//        String start = dateFromChart.getStart();
//        String end = dateFromChart.getEnd();
//        String[] startTokens = start.split("T");
//        String[] endTokens = end.split("T");
//        try {
//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
//            Date date1 = simpleDateFormat.parse(startTokens[0] +" "+ startTokens[1]);
//            Date date2 = simpleDateFormat.parse(endTokens[0] +" "+ endTokens[1]);
//            firstCehSmesitel4KMSF1s = trmRepositoryService.rangeTimestampFirstCehSmesitel4KMSF1(date1, date2);
//        }catch (ParseException e){
//            LOGGER.error("can't parse range of date: "+e.getClass());
//        }
//        return firstCehSmesitel4KMSF1s;
//    }

//    @ResponseBody
//    @RequestMapping(value = "/generateChartFirstCehSmesitel5KMSF1", method = RequestMethod.POST)
//    public List<FirstCehSmesitel5KMSF1> generateChartFirstCehSmesitel5KMSF1(@RequestBody DateFromChart dateFromChart){
//        List<FirstCehSmesitel5KMSF1> firstCehSmesitel5KMSF1s = null;
//        String start = dateFromChart.getStart();
//        String end = dateFromChart.getEnd();
//        String[] startTokens = start.split("T");
//        String[] endTokens = end.split("T");
//        try {
//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
//            Date date1 = simpleDateFormat.parse(startTokens[0] +" "+ startTokens[1]);
//            Date date2 = simpleDateFormat.parse(endTokens[0] +" "+ endTokens[1]);
//            firstCehSmesitel5KMSF1s = trmRepositoryService.rangeTimestampFirstCehSmesitel5KMSF1(date1, date2);
//        }catch (ParseException e){
//            LOGGER.error("can't parse range of date: "+e.getClass());
//        }
//        return firstCehSmesitel5KMSF1s;
//    }






    @ResponseBody
    @RequestMapping(value = "/generateSizeTableFirstCehBuzuluk", method = RequestMethod.POST)
    public long generateSizeTableFirstCehBuzuluk(){
        return trmRepositoryService.getSizeTableFirstChehBuzulukTRM200().longValue();
    }

    @ResponseBody
    @RequestMapping(value = "/generateSizeTableFirstCehKameraDozrevanya", method = RequestMethod.POST)
    public long generateSizeTableFirstCehKameraDozrevanya(){
        return trmRepositoryService.getSizeTableFirstCehKameraDozrevanyaMPR51().longValue();
    }

    @ResponseBody
    @RequestMapping(value = "/generateSizeTableFirstCehAutoclav", method = RequestMethod.POST)
    public long generateSizeTableFirstCehAutoclav(){
        return trmRepositoryService.getSizeTableFirstCehAutoclavTRM202().longValue();
    }

    @ResponseBody
    @RequestMapping(value = "/generateSizeTableThirdCehAutoclav", method = RequestMethod.POST)
    public long generateSizeTableThirdCehAutoclav(){
        return trmRepositoryService.getSizeTableThirdCehAutoclavTRM202().longValue();
    }

    @ResponseBody
    @RequestMapping(value = "/generateSizeTableOtdelEnergetika", method = RequestMethod.POST)
    public long generateSizeTableOtdelEnergetika(){
        return trmRepositoryService.getSizeTableOtdelEnergetikaTRM202().longValue();
    }
}
