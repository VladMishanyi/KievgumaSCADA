package com.vk.configuration;

import com.vk.entity.modbus.ModbusMasterSerialModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by KIP-PC99 on 20.11.2018.
 */
@Configuration
@ComponentScan(basePackages = {"com.vk.configuration"})
@PropertySource("classpath:modbusSerialFourth.properties")
public class ModbusSerialFourthConfig {

    @Value("${modbusFourth.commPortId}")
    private String commPortId;

    @Value("${modbusFourth.baduRate}")
    private int baduRate;

    @Value("${modbusFourth.dataBits}")
    private int dataBits;

    @Value("${modbusFourth.stopBits}")
    private int stopBits;

    @Value("${modbusFourth.parity}")
    private int parity;

    @Value("${modbusFourth.timeout}")
    private int timeout;

    @Value("${modbusFourth.retries}")
    private int retries;

    @Bean(name = "modbusMasterSerialFourth")
    public ModbusMasterSerialModel modbusMasterSerialFourth() {
        ModbusMasterSerialModel modbusMasterSerialModel = new ModbusMasterSerialModel(commPortId,
                baduRate, dataBits, stopBits, parity, timeout, retries);
        return modbusMasterSerialModel;
    }
}
