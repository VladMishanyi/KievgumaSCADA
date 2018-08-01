package com.vk.configuration;

import com.vk.service.data.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

/**
 * Created by KIP-PC99 on 01.08.2018.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextHierarchy({
        @ContextConfiguration(classes = RootConfig.class)
})
public final class SecurityConfigTest {

    @Autowired
    private UserService userService;

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private SHA256PasswordEncoder sha256PasswordEncoder;

    @Test
    public void configureTest() throws Exception {
        final AuthenticationManagerBuilder builder = mock(AuthenticationManagerBuilder.class);
//        builder.userDetailsService(userDetailsService).passwordEncoder(sha256PasswordEncoder);
        assertNotNull(builder);
    }

    @Test
    public void constructorTest(){
//        assertNotNull(new SecurityConfig(this.userDetailsService, this.sha256PasswordEncoder));
    }

    @Test
    public void seviceTest(){
//        assertNotNull(this.userService);
    }
}