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