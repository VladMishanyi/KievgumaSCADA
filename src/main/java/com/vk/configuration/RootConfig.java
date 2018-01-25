package com.vk.configuration;

import com.serotonin.io.serial.SerialParameters;
import com.serotonin.modbus4j.ModbusFactory;
import com.serotonin.modbus4j.ModbusMaster;
//import com.serotonin.modbus4j.ip.IpParameters;
//import com.vk.repository.PLCRepository;
//import com.vk.repository.PLCRepositoryImpl;
import com.vk.repository.TRMRepositiryImpl;
import com.vk.repository.TRMRepository;
import com.vk.service.TRMRepositoryService;
import org.apache.tomcat.dbcp.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

/**
 * Created by User on 2017-07-19.
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.vk.repository")
@ComponentScan(basePackages = "com.vk")
public class RootConfig {

    @Bean
    public DataSource dataSource() {
        final BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/KievgumaBase"
                +"?autoReconnect=true"
                +"&useSSL=false"
                +"&useUnicode=true"
                + "&useJDBCCompliantTimezoneShift=true"
                + "&useLegacyDatetimeCode=false"
                + "&serverTimezone=GMT");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("1991");
        dataSource.setInitialSize(100);
        dataSource.setMaxActive(100);
        dataSource.setTestOnBorrow(true);
//        dataSource.setValidationQuery("SELECT 1");
        dataSource.setMaxWait(1000);
        return dataSource;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        final HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setShowSql(true);
        adapter.setGenerateDdl(true);
        adapter.setDatabasePlatform("org.hibernate.dialect.MySQLDialect");
        return adapter;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(
            final DataSource dataSource,
            final JpaVendorAdapter jpaVendorAdapter
    ) {
        final LocalContainerEntityManagerFactoryBean entityManagerFactory =
                new LocalContainerEntityManagerFactoryBean();
        entityManagerFactory.setDataSource(dataSource);
        entityManagerFactory.setJpaVendorAdapter(jpaVendorAdapter);
        entityManagerFactory.setPackagesToScan("com.vk.entity");
        return entityManagerFactory;
    }

    @Bean
    public JpaTransactionManager transactionManager(final EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }

    @Bean
    public CommonsMultipartResolver multipartResolver() {
        return new CommonsMultipartResolver();
    }

//    @Bean
//    public ModbusMaster modbusMasterTCP(){
//        ModbusFactory factory = new ModbusFactory();
//
//        IpParameters params = new IpParameters();
//        params.setHost("192.168.9.9");
//        params.setPort(1991);
//
//        ModbusMaster master = factory.createTcpMaster(params, true);
//        master.setTimeout(1000);
//        master.setRetries(1);
////        try {
////            master.init();
////        }
////        catch (ModbusInitException e){
////            System.out.println("Modbus init problem :"+e.getMessage());
////        }
//        return master;
//    }

    @Bean(name = "modbusMasterSerial")
    public ModbusMaster modbusMasterSerial(){
        ModbusFactory factory = new ModbusFactory();

        SerialParameters params = new SerialParameters();
        params.setCommPortId("COM3");
        //for windows use COM0
        //for ubuntu use /dev/ttyUSB0
        params.setBaudRate(115200);
        params.setDataBits(8);
        params.setStopBits(1);
        params.setParity(0);

        ModbusMaster master = factory.createRtuMaster(params);
        master.setTimeout(1000);//1000ms timeout
        master.setRetries(3);//3 repeats
        return master;
    }

    @Bean(name = "modbusMasterSerialSecond")
    public ModbusMaster modbusMasterSerialSecond(){
        ModbusFactory factory = new ModbusFactory();

        SerialParameters params = new SerialParameters();
        params.setCommPortId("COM4");
        //for windows use COM0
        //for ubuntu use /dev/ttyUSB0
        params.setBaudRate(115200);
        params.setDataBits(8);
        params.setStopBits(1);
        params.setParity(0);

        ModbusMaster master = factory.createRtuMaster(params);
        master.setTimeout(1000);//1000ms timeout
        master.setRetries(3);//3 repeats
        return master;
    }

//    @Bean
//    public ModbusMaster modbusMasterSerialSecond(){
//        ModbusFactory factory = new ModbusFactory();
//
//        SerialParameters params = new SerialParameters();
//        params.setCommPortId("COM4");
//        //for windows use COM1
//        //for ubuntu use /dev/ttyUSB1
//        params.setBaudRate(115200);
//        params.setDataBits(8);
//        params.setStopBits(1);
//        params.setParity(0);
//
//        ModbusMaster master = factory.createRtuMaster(params);
//        master.setTimeout(1000);
//        master.setRetries(1);
//        return master;
//    }

//    @Bean
//    public PLCRepository plcRepository(){
//        PLCRepository plcRepository = new PLCRepositoryImpl();
//        return plcRepository;
//    }

    @Bean
    public TRMRepository trmRepository(){
        TRMRepository trmRepository = new TRMRepositiryImpl();
        return trmRepository;
    }

    @Bean
    public TRMRepositoryService trmRepositoryService(){
        TRMRepositoryService trmRepositoryService = new TRMRepositoryService();
        return trmRepositoryService;
    }
}
