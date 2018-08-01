package com.vk.configuration;

import com.serotonin.modbus4j.BatchRead;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by KIP-PC99 on 01.08.2018.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextHierarchy({
        @ContextConfiguration(classes = RootConfig.class)
})
public final class RootConfigTest {

    @Autowired
    private CommonsMultipartResolver multipartResolver;

    @Autowired
    private BatchRead batchRead;

    @Autowired
    private SimpleDateFormat simpleDateFormat;

    @Autowired
    private Date date;

    @Autowired
    private SHA256PasswordEncoder sha256PasswordEncoder;

    @Test
    public void multipartResolverTest() throws Exception {
        assertNotNull(this.multipartResolver);
    }

    @Test
    public void batchReadTest() throws Exception {
        assertNotNull(this.batchRead);
    }

    @Test
    public void simpleDateFormatTest() throws Exception {
        assertNotNull(this.simpleDateFormat);
    }

    @Test
    public void dateTest() throws Exception {
        assertNotNull(this.date);
    }

    @Test
    public void sha256PasswordEncoderTest() throws Exception {
        assertNotNull(this.sha256PasswordEncoder);
    }

}