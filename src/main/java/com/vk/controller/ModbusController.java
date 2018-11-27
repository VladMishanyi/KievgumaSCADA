package com.vk.controller;

import com.vk.chain.Chain1;
import com.vk.chain.Chain2;
import com.vk.chain.Chain3;
import com.vk.chain.Chain4;
import com.vk.entity.modbus.ModbusBodyQuery;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by KIP-PC99 on 26.11.2018.
 */
@Controller
@ComponentScan(basePackages = {"com.vk.chain"})
public class ModbusController {

    private final Logger LOGGER = Logger.getLogger(ModbusController.class);

    @RequestMapping(value = "/energeticRoomTRM201", method = RequestMethod.GET)
    public String setValue1EnergeticRoomTRM201(@RequestParam(value = "query", defaultValue = "0") int query,
                                               @RequestParam(value = "value", defaultValue = "0") int value){

                System.out.println("THIS IS A QUERY :"+query+" AND VALUE :"+value+" !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

                ModbusBodyQuery modbusBodyQuery = new ModbusBodyQuery(query, value);
                Chain1.bodyQuery.add(modbusBodyQuery);
                return "index";
    }
}
