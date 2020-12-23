package com.vk.controller;

import com.vk.chain.Chain1;
import com.vk.chain.Chain2;
import com.vk.chain.Chain3;
import com.vk.chain.Chain4;
import com.vk.entity.modbus.ModbusBodyQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by KIP-PC99 on 26.11.2018.
 */
@Controller
@EnableScheduling
@ComponentScan(basePackages = {"com.vk.chain"})
public class ModbusController {

    private final Chain1 chain1;

    private final Chain2 chain2;

    private final Chain3 chain3;

    private final Chain4 chain4;

    @Autowired
    public ModbusController(final Chain1 chain1,
                            final Chain2 chain2,
                            final Chain3 chain3,
                            final Chain4 chain4){
        this.chain1 = chain1;
        this.chain2 = chain2;
        this.chain3 = chain3;
        this.chain4 = chain4;
    }

    @Scheduled(fixedRate = 5000)
    public void loop(){
        chain1.run();//native modbus v1.0.1 library can't work with multithreading! Maybe it will provide in future version.
        chain2.run();//native modbus v1.0.1 library can't work with multithreading! Maybe it will provide in future version.
        chain3.run();//native modbus v1.0.1 library can't work with multithreading! Maybe it will provide in future version.
        chain4.run();//native modbus v1.0.1 library can't work with multithreading! Maybe it will provide in future version.
    }

    @RequestMapping(value = "/energeticRoomTRM201", method = RequestMethod.GET)
    public String setValue1EnergeticRoomTRM201(@RequestParam(value = "query", defaultValue = "0") int query,
                                               @RequestParam(value = "value", defaultValue = "0") int value){
                Chain1.bodyQuery.add(new ModbusBodyQuery(query, value));
                return "index";
    }
}
