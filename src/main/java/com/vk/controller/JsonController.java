package com.vk.controller;

import com.vk.service.ServiceModel;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;


/**
 * Created by User on 2017-07-20.
 */
@RestController
@ComponentScan(basePackages = {"com.vk.service"})
public class JsonController {

    private final ServiceModel serviceModel;

    private final Logger LOGGER = Logger.getLogger(JsonController.class);

    @Autowired
    public JsonController(final ServiceModel serviceModel){
        this.serviceModel = serviceModel;
    }

    @ResponseBody
    @RequestMapping(value = "/generateAmountSizeTableByte", method = RequestMethod.POST)
    public long generateAmountSizeTableByte(){
        long som = 0;
//        serviceModel.readBaseSize().forEach(big->{
//            som += big.longValue();
//        });
        for (BigInteger bigInteger : serviceModel.readBaseSize()){
            som += bigInteger.longValue();
        }
        return som;
    }
}
