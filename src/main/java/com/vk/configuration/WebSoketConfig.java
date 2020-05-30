package com.vk.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

/**
 * Created by User on 2017-05-29.
 */
@Configuration
@EnableScheduling
@EnableWebSocketMessageBroker
@ComponentScan(basePackages = "com.vk.controller")
@PropertySource("classpath:websoket.properties")
public class WebSoketConfig extends AbstractWebSocketMessageBrokerConfigurer{

    @Value("${websoket.simpleBroker}")
    private String simpleBroker;

    @Value("${websoket.destinationPrefixes}")
    private String destinationPrefixes;

    @Value("${websoket.endpoint}")
    private String endpoint;

    @Override
    public void configureMessageBroker(MessageBrokerRegistry config){
        config.enableSimpleBroker(simpleBroker);//massage to client
        config.setApplicationDestinationPrefixes(destinationPrefixes);//massage from client
    }

    public void registerStompEndpoints(StompEndpointRegistry registry){
        registry.addEndpoint(endpoint).withSockJS();//subscribe new client
    }
}
