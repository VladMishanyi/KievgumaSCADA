package com.vk.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
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
public class WebSoketConfig extends AbstractWebSocketMessageBrokerConfigurer{

    @Override
    public void configureMessageBroker(MessageBrokerRegistry config){
        config.enableSimpleBroker("/topic");//massage to client
        config.setApplicationDestinationPrefixes("/app");//massage from client
    }

    public void registerStompEndpoints(StompEndpointRegistry registry){
        registry.addEndpoint("/guide-websocket").withSockJS();//subscribe new client
    }
}
