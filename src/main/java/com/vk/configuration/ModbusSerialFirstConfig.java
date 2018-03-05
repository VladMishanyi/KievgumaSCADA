package com.vk.configuration;

import com.serotonin.io.serial.SerialParameters;
import com.serotonin.modbus4j.ModbusFactory;
import com.serotonin.modbus4j.ModbusMaster;
import com.vk.modbus.ModbusMasterSerialModel;
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
@PropertySource("classpath:modbusSerialFirst.properties")
public class ModbusSerialFirstConfig {

    @Value("${modbusFirst.commPortId}")
    private String commPortId;

    @Value("${modbusFirst.baduRate}")
    private int baduRate;

    @Value("${modbusFirst.dataBits}")
    private int dataBits;

    @Value("${modbusFirst.stopBits}")
    private int stopBits;

    @Value("${modbusFirst.parity}")
    private int parity;

    @Value("${modbusFirst.timeout}")
    private int timeout;

    @Value("${modbusFirst.retries}")
    private int retries;

    @Bean(name = "modbusMasterSerialFirst")
    public ModbusMaster modbusMasterSerialFirst(){
        ModbusMasterSerialModel modbusMasterSerialModel = new ModbusMasterSerialModel(commPortId,
                baduRate, dataBits, stopBits, parity, timeout, retries);
        return modbusMasterSerialModel.getMaster();
    }
}
