package com.vk.configuration;

//import com.serotonin.io.serial.SerialParameters;
//import com.serotonin.modbus4j.ModbusFactory;
//import com.serotonin.modbus4j.ModbusMaster;
//import com.serotonin.modbus4j.exception.ModbusInitException;
//import com.serotonin.modbus4j.ip.IpParameters;
//import com.vk.repository.PLCRepository;
//import com.vk.repository.PLCRepositoryImpl;
//import com.vk.configuration.WebSoketConfig;
//import org.apache.tomcat.dbcp.dbcp.BasicDataSource;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Import;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.JpaVendorAdapter;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.*;
//import org.springframework.web.servlet.mvc.WebContentInterceptor;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

//import javax.persistence.EntityManagerFactory;
//import javax.sql.DataSource;

/**
 * Created by User on 2017-05-22.
 */
@Configuration
//@EnableTransactionManagement
@EnableWebMvc
@ComponentScan(basePackages = {"com.vk.controller", "com.vk.configuration"})
//@Import({WebSoketConfig.class})
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

//    @Override
//    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
//        configurer.enable();
//    }

}

