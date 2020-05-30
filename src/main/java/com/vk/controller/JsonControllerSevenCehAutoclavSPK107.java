package com.vk.controller;

import com.vk.entity.device.DeviceModelSevenCehAutoclavSPK107;
import com.vk.entity.json.DateFromChart;
import com.vk.entity.table.TableModelSevenCehAutoclavSPK107;
import com.vk.service.data.SevenCehAutoclavSPK107ServiceData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by User on 2018-03-06.
 */
@RestController
@ComponentScan(basePackages = {"com.vk.service", "com.vk.service.data"})
public class JsonControllerSevenCehAutoclavSPK107 extends JsonController<DeviceModelSevenCehAutoclavSPK107, SevenCehAutoclavSPK107ServiceData, TableModelSevenCehAutoclavSPK107> {

    private final SevenCehAutoclavSPK107ServiceData sevenCehAutoclavSPK107ServiceData;

    private final SimpleDateFormat simpleDateFormat;

    @Autowired
    public JsonControllerSevenCehAutoclavSPK107(final SevenCehAutoclavSPK107ServiceData sevenCehAutoclavSPK107ServiceData,
                                                final SimpleDateFormat simpleDateFormat){
        this.sevenCehAutoclavSPK107ServiceData = sevenCehAutoclavSPK107ServiceData;
        this.simpleDateFormat = simpleDateFormat;
    }

    @MessageMapping(value="/generateChartSevenCehAutoclav")
    @SendTo("/topic/generateChartSevenCehAutoclav")
    public List<TableModelSevenCehAutoclavSPK107> generateChartSevenCehAutoclavSPK107(final DateFromChart dateFromChart){
        return this.generateTimeObject(sevenCehAutoclavSPK107ServiceData, dateFromChart, simpleDateFormat);
    }
}
