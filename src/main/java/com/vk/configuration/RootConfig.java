package com.vk.configuration;

import com.serotonin.modbus4j.BatchRead;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import java.text.SimpleDateFormat;

/**
 * Created by User on 2017-07-19.
 */
@Configuration
@ComponentScan(basePackages = "com.vk")
public class RootConfig {

    @Bean
    public CommonsMultipartResolver multipartResolver() {
        return new CommonsMultipartResolver();
    }

    @Bean
    public BatchRead batchRead(){
        return new BatchRead();
    }

    @Bean
    public SimpleDateFormat simpleDateFormat(){
        return new SimpleDateFormat("yyyy-MM-dd HH:mm");
    }
}
