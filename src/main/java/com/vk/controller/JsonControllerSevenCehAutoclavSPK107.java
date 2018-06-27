package com.vk.controller;

import com.vk.entity.json.DateFromChart;
import com.vk.entity.table.TableModelSevenCehAutoclavSPK107;
import com.vk.service.data.SevenCehAutoclavSPK107ServiceData;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by User on 2018-03-06.
 */
@RestController
@ComponentScan(basePackages = {"com.vk.service", "com.vk.service.data"})
public class JsonControllerSevenCehAutoclavSPK107 extends JsonController {

    private Logger LOGGER = Logger.getLogger(JsonControllerSevenCehAutoclavSPK107.class);

    private SevenCehAutoclavSPK107ServiceData sevenCehAutoclavSPK107ServiceData;

    private SimpleDateFormat simpleDateFormat;

    @Autowired
    public JsonControllerSevenCehAutoclavSPK107(SevenCehAutoclavSPK107ServiceData sevenCehAutoclavSPK107ServiceData,
                                                 SimpleDateFormat simpleDateFormat){
        this.sevenCehAutoclavSPK107ServiceData = sevenCehAutoclavSPK107ServiceData;
        this.simpleDateFormat = simpleDateFormat;
    }
    @ResponseBody
    @RequestMapping(value = "/generateChartSevenCehAutoclav", method = RequestMethod.POST)
    public List<TableModelSevenCehAutoclavSPK107> generateChartSevenCehAutoclavSPK107(@RequestBody DateFromChart dateFromChart){
        return this.generateTimeObject(sevenCehAutoclavSPK107ServiceData, dateFromChart, simpleDateFormat);
    }
}
