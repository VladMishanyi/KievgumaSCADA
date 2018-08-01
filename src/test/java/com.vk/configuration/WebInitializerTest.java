package com.vk.configuration;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import static org.mockito.Mockito.mock;

/**
 * Created by KIP-PC99 on 31.07.2018.
 */
public final class WebInitializerTest {

    private static WebInitializer webInitializer;

    @BeforeClass
    public static void beforeClass(){
        webInitializer = new WebInitializer();
        webInitializer.getServletMappings();
    }

    @Test
    public void getServletConfigClassesTest(){
        final Class<?>[] servletClasses = webInitializer.getServletConfigClasses();
        assertTrue(servletClasses.length > 0);
    }

    @Test
    public void getRootConfigClassesTest(){
        final Class<?>[] rootClasses = webInitializer.getRootConfigClasses();
        assertTrue(rootClasses.length == 0);
    }

    @Test
    public void getServletMappingsTest(){
        final String[] servletMappings = webInitializer.getServletMappings();
        assertTrue(servletMappings.length > 0);
    }

    @Test
    public void createDispatcherServletTest() {
        final WebApplicationContext webApplicationContext = mock(WebApplicationContext.class);
        final DispatcherServlet dispatcherServlet = webInitializer.createDispatcherServlet(webApplicationContext);
        assertNotNull(dispatcherServlet);


    }
}
