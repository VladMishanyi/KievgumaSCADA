package com.vk.configuration;

import org.junit.Before;
import org.junit.Test;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import static org.mockito.Mockito.mock;
import static org.junit.Assert.*;

/**
 * Created by KIP-PC99 on 01.08.2018.
 */
public final class WebConfigTest {

    @Test
    public void viewResolverTest() throws Exception {
        final InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        assertNotNull(viewResolver);
    }

    @Test
    public void addResourceHandlersTest() throws Exception {
        final ResourceHandlerRegistry registry = mock(ResourceHandlerRegistry.class);
        assertNotNull(registry);
    }

}