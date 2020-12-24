package com.vk.controller;

import com.vk.entity.device.DeviceModelLaboratoryAutoclavMV110;
import com.vk.entity.json.DateFromChart;
import com.vk.entity.json.JsonBodyDateFromChart;
import com.vk.entity.table.TableModelLaboratoryAutoclavMV110;
import com.vk.service.data.LaboratoryAutoclavMV110ServiceData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by User on 2018-04-02.
 */
@RestController
@ComponentScan(basePackages = {"com.vk.service", "com.vk.service.data"})
public class JsonControllerLaboratoryAutoclavMV110 extends JsonController<DeviceModelLaboratoryAutoclavMV110, LaboratoryAutoclavMV110ServiceData, TableModelLaboratoryAutoclavMV110> {

    private final LaboratoryAutoclavMV110ServiceData laboratoryAutoclavMV110ServiceData;

    private final SimpleDateFormat simpleDateFormat;

    @Autowired
    public JsonControllerLaboratoryAutoclavMV110(final LaboratoryAutoclavMV110ServiceData laboratoryAutoclavMV110ServiceData,
                                                 final SimpleDateFormat simpleDateFormat){
        this.laboratoryAutoclavMV110ServiceData = laboratoryAutoclavMV110ServiceData;
        this.simpleDateFormat = simpleDateFormat;
    }

    @MessageMapping(value="/generateLaboratoryAutoklav")
    @SendTo("/topic/generateLaboratoryAutoklav")
    public List<TableModelLaboratoryAutoclavMV110> generateChartLaboratoryAutoclavMV110(final JsonBodyDateFromChart dateFromChart){
        return this.generateTimeObject(laboratoryAutoclavMV110ServiceData, dateFromChart, simpleDateFormat);
    }
}
