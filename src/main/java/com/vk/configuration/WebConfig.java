package com.vk.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * Created by User on 2017-05-22.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.vk.controller", "com.vk.configuration"})
public class WebConfig extends WebMvcConfigurerAdapter {

    private static final String CONTENT_TYPE = "text/html;charset=UTF-8";

    private static final String PREFIX = "/WEB-INF/views/";

    private static final String SUFFIX = ".jsp";

    private static final boolean CONTEXT_BEANS = true;

    private static final String RESOURCE_HANDLERS = "/resources/**";

    private static final String RESOURCE_LOCATIONS = "/resources/";

    @Bean
    public ViewResolver viewResolver() {
        final InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setContentType(CONTENT_TYPE);
        viewResolver.setPrefix(PREFIX);
        viewResolver.setSuffix(SUFFIX);
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setExposeContextBeansAsAttributes(CONTEXT_BEANS);
        return viewResolver;
    }

    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler(RESOURCE_HANDLERS)
                .addResourceLocations(RESOURCE_LOCATIONS);
    }

}

