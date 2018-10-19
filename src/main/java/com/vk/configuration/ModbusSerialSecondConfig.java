package com.vk.configuration;

import com.serotonin.modbus4j.ModbusMaster;
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
@ComponentScan(basePackages = {"com.vk.configuration"})
@PropertySource("classpath:modbusSerialSecond.properties")
public class ModbusSerialSecondConfig {

    @Value("${modbusSecond.commPortId}")
    private String commPortId;

    @Value("${modbusSecond.baduRate}")
    private int baduRate;

    @Value("${modbusSecond.dataBits}")
    private int dataBits;

    @Value("${modbusSecond.stopBits}")
    private int stopBits;

    @Value("${modbusSecond.parity}")
    private int parity;

    @Value("${modbusSecond.timeout}")
    private int timeout;

    @Value("${modbusSecond.retries}")
    private int retries;

    @Bean(name = "modbusMasterSerialSecond")
    public ModbusMaster modbusMasterSerialSecond() {
        ModbusMasterSerialModel modbusMasterSerialModel = new ModbusMasterSerialModel(commPortId,
                baduRate, dataBits, stopBits, parity, timeout, retries);
        return modbusMasterSerialModel.getMaster();
    }
}