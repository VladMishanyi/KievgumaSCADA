package com.vk.controller;

import com.vk.entity.json.DateFromChart;
import com.vk.entity.table.TableModelLaboratoryAutoclavMV110;
import com.vk.service.data.LaboratoryAutoclavMV110ServiceData;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by User on 2018-04-02.
 */
@RestController
@ComponentScan(basePackages = {"com.vk.service", "com.vk.service.data"})
public class JsonControllerLaboratoryAutoclavMV110 extends JsonController {

    private Logger LOGGER = Logger.getLogger(JsonControllerLaboratoryAutoclavMV110.class);

    private LaboratoryAutoclavMV110ServiceData laboratoryAutoclavMV110ServiceData;

    private SimpleDateFormat simpleDateFormat;

    @Autowired
    public JsonControllerLaboratoryAutoclavMV110(LaboratoryAutoclavMV110ServiceData laboratoryAutoclavMV110ServiceData,
                                                SimpleDateFormat simpleDateFormat){
        this.laboratoryAutoclavMV110ServiceData = laboratoryAutoclavMV110ServiceData;
        this.simpleDateFormat = simpleDateFormat;
    }
    @ResponseBody
    @RequestMapping(value = "/generateLaboratoryAutoklav", method = RequestMethod.POST)
    public List<TableModelLaboratoryAutoclavMV110> generateChartLaboratoryAutoclavMV110(@RequestBody DateFromChart dateFromChart){
        return this.generateTimeObject(laboratoryAutoclavMV110ServiceData, dateFromChart, simpleDateFormat);
    }
}
