package com.vk.configuration;

import com.vk.entity.modbus.ModbusMasterSerialModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by User on 2018-02-12.
 */
@Configuration
@ComponentScan(basePackages = {"com.vk"})
@PropertySource("classpath:modbusSerialThird.properties")
public class ModbusSerialThirdConfig {

    @Value("${modbusThird.commPortId}")
    private String commPortId;

    @Value("${modbusThird.baduRate}")
    private int baduRate;

    @Value("${modbusThird.dataBits}")
    private int dataBits;

    @Value("${modbusThird.stopBits}")
    private int stopBits;

    @Value("${modbusThird.parity}")
    private int parity;

    @Value("${modbusThird.timeout}")
    private int timeout;

    @Value("${modbusThird.retries}")
    private int retries;

    @Bean(name = "modbusMasterSerialThird")
    public ModbusMasterSerialModel modbusMasterSerialThird() {
        return new ModbusMasterSerialModel(commPortId, baduRate, dataBits, stopBits, parity, timeout, retries);
    }
}
