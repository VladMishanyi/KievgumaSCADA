package com.vk.controller;

import com.vk.entity.json.DateFromChart;
import com.vk.entity.table.TableModelFirstCehKameraDozrevanyaMPR51;
import com.vk.entity.table.TableModelKotelnyaParMikrolITM4;
import com.vk.service.data.KameraDozrevanyaMPR51ServiceData;
import com.vk.service.data.KotelnyaParMikrolITM4ServiceData;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by KIP-PC99 on 08.08.2018.
 */
@RestController
@ComponentScan(basePackages = {"com.vk.service", "com.vk.service.data"})
public class JsonControllerKotelnyaParMikrolITM4 extends JsonController {

    private Logger LOGGER = Logger.getLogger(JsonControllerFirstCehKameraDozrevanyaMPR51.class);

    private KotelnyaParMikrolITM4ServiceData kotelnyaParMikrolITM4ServiceData;

    private SimpleDateFormat simpleDateFormat;

    @Autowired
    public JsonControllerKotelnyaParMikrolITM4(KotelnyaParMikrolITM4ServiceData kotelnyaParMikrolITM4ServiceData,
                                                       SimpleDateFormat simpleDateFormat){
        this.kotelnyaParMikrolITM4ServiceData = kotelnyaParMikrolITM4ServiceData;
        this.simpleDateFormat = simpleDateFormat;
    }
    @ResponseBody
    @RequestMapping(value = "/generateChartKotelnyaParMikrolITM4", method = RequestMethod.POST)
    public List<TableModelKotelnyaParMikrolITM4> generateChartKotelnyaParMikrolITM4(@RequestBody DateFromChart dateFromChart){
        return this.generateTimeObject(kotelnyaParMikrolITM4ServiceData, dateFromChart, simpleDateFormat);
    }
}
