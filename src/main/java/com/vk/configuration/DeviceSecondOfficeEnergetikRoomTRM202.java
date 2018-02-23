package com.vk.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by User on 2018-02-23.
 */
@Configuration
@ComponentScan(basePackages = "com.vk")
@PropertySource("classpath:deviceSecondOfficeEnergetikRoomTRM202.properties")
public class DeviceSecondOfficeEnergetikRoomTRM202 {

}
