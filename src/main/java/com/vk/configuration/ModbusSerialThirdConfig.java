package com.vk.configuration;

import com.serotonin.io.serial.SerialParameters;
import com.serotonin.modbus4j.ModbusFactory;
import com.serotonin.modbus4j.ModbusMaster;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by User on 2018-02-12.
 */
@Configuration
@ComponentScan(basePackages = "com.vk")
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
    public ModbusMaster modbusMasterSerialThird() {
        ModbusFactory factory = new ModbusFactory();

        SerialParameters params = new SerialParameters();
        params.setCommPortId(commPortId);
        //for windows use COM0
        //for ubuntu use /dev/ttyUSB0
        params.setBaudRate(baduRate);
        params.setDataBits(dataBits);
        params.setStopBits(stopBits);
        params.setParity(parity);

        ModbusMaster master = factory.createRtuMaster(params);
        master.setTimeout(timeout);//1000ms timeout
        master.setRetries(retries);//3 repeats
        return master;
    }
}
