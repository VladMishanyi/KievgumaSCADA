package com.vk.controller;

import com.vk.chain.Chain1;
import com.vk.chain.Chain2;
import com.vk.chain.Chain3;
import com.vk.chain.Chain4;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by KIP-PC99 on 26.11.2018.
 */
@Controller
@ComponentScan(basePackages = {"com.vk.chain"})
public class ModbusController {

    private final Logger LOGGER = Logger.getLogger(ModbusController.class);

    private Chain1 chain1;

    private Chain2 chain2;

    private Chain3 chain3;

    private Chain4 chain4;

    @Autowired
    public ModbusController(
            final Chain1 chain1,
            final Chain2 chain2,
            final Chain3 chain3,
            final Chain4 chain4
    ){
        this.chain1 = chain1;
        this.chain2 = chain2;
        this.chain3 = chain3;
        this.chain4 = chain4;
    }

    @RequestMapping(value = )
    public void setValue1EnergeticRoomTRM201(@RequestParam(name = "value", defaultValue = "0") int value){

    }
}
