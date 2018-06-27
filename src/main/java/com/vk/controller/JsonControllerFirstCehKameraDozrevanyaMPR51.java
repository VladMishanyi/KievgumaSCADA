package com.vk.controller;

import com.vk.entity.json.DateFromChart;
import com.vk.entity.table.TableModelFirstCehKameraDozrevanyaMPR51;
import com.vk.service.data.KameraDozrevanyaMPR51ServiceData;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@ComponentScan(basePackages = {"com.vk.service", "com.vk.service.data"})
public class JsonControllerFirstCehKameraDozrevanyaMPR51 extends JsonController {

    private Logger LOGGER = Logger.getLogger(JsonControllerFirstCehKameraDozrevanyaMPR51.class);

    private KameraDozrevanyaMPR51ServiceData kameraDozrevanyaMPR51ServiceData;

    private SimpleDateFormat simpleDateFormat;

    @Autowired
    public JsonControllerFirstCehKameraDozrevanyaMPR51(KameraDozrevanyaMPR51ServiceData kameraDozrevanyaMPR51ServiceData,
                                               SimpleDateFormat simpleDateFormat){
        this.kameraDozrevanyaMPR51ServiceData = kameraDozrevanyaMPR51ServiceData;
        this.simpleDateFormat = simpleDateFormat;
    }
    @ResponseBody
    @RequestMapping(value = "/generateChartFirstCehKameraDozrevanya", method = RequestMethod.POST)
    public List<TableModelFirstCehKameraDozrevanyaMPR51> generateChartFirstCehKameraDozrevanyaMPR51(@RequestBody DateFromChart dateFromChart){
        return this.generateTimeObject(kameraDozrevanyaMPR51ServiceData, dateFromChart, simpleDateFormat);
    }
}
