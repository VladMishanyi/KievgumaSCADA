package com.vk.controller;

import com.vk.entity.json.DateFromChart;
import com.vk.entity.table.TableModelFirstCehKameraDozrevanyaMPR51;
import com.vk.service.data.KameraDozrevanyaMPR51ServiceData;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@ComponentScan(basePackages = {"com.vk.service", "com.vk.service.data"})
public class JsonControllerFirstCehKameraDozrevanyaMPR51 extends JsonController {

    private Logger LOGGER = Logger.getLogger(JsonControllerFirstCehKameraDozrevanyaMPR51.class);

    private final KameraDozrevanyaMPR51ServiceData kameraDozrevanyaMPR51ServiceData;

    private final SimpleDateFormat simpleDateFormat;

    @Autowired
    public JsonControllerFirstCehKameraDozrevanyaMPR51(final KameraDozrevanyaMPR51ServiceData kameraDozrevanyaMPR51ServiceData,
                                                       final SimpleDateFormat simpleDateFormat){
        this.kameraDozrevanyaMPR51ServiceData = kameraDozrevanyaMPR51ServiceData;
        this.simpleDateFormat = simpleDateFormat;
    }

    @MessageMapping(value="/generateChartFirstCehKameraDozrevanya")
    @SendTo("/topic/generateChartFirstCehKameraDozrevanya")
    public List<TableModelFirstCehKameraDozrevanyaMPR51> generateChartFirstCehKameraDozrevanyaMPR51(final DateFromChart dateFromChart){
        return this.generateTimeObject(kameraDozrevanyaMPR51ServiceData, dateFromChart, simpleDateFormat);
    }
}
