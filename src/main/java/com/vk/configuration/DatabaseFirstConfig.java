package com.vk.configuration;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

/**
 * Created by User on 2018-02-12.
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.vk.repository")
@ComponentScan(basePackages = "com.vk")
@PropertySource("classpath:databaseFirst.properties")
public class DatabaseFirstConfig {

    @Value("${jdbc.driver}")
    private String jdbcDriver;

    @Value("${jdbc.driverUrl}")
    private String jdbcDriverUrl;

    @Value("${jdbc.hostIp}")
    private String hostIp;

    @Value("${jdbc.hostPort}")
    private String hostPort;

    @Value("${jdbc.name}")
    private String databaseName;

    @Value("${jdbc.username}")
    private String databaseUsername;

    @Value("${jdbc.password}")
    private String databasePassword;

    @Value("${jdbc.useSsl}")
    private boolean useSsl;

    @Value("${jdbc.useUnicode}")
    private boolean useUnicode;

    @Value("${jdbc.characterEncoding}")
    private String characterEncoding;

    @Value("${jdbc.compliantTimezone}")
    private boolean useJdbcCompliantTimezoneShift;

    @Value("${jdbc.datetime}")
    private boolean useLegacyDatetimeCode;

    @Value("${jdbc.serverTimezone}")
    private String serverTimezone;

    @Value("${jdbc.initialSize}")
    private int initialSize;

    @Value("${jdbc.maxActive}")
    private int maxActive;

    @Value("${jdbc.testOnBorrow}")
    private boolean testOnBorrow;

    @Value("${jdbc.validationQuery}")
    private String validationQuery;

    @Value("${hibernate.dialect}")
    private String hibernateDialect;

    @Value("${hibernate.showSql}")
    private boolean isShowSql;

    @Value("${hibernate.generateDdl}")
    private boolean isGenerateDdl;

    @Value("${hibernate.entityPackages}")
    private String entityPackages;

    @Bean
    public DataSource dataSource() {
        final BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(this.jdbcDriver);
        dataSource.setUrl(this.jdbcDriverUrl + "://" + this.hostIp +
                ":" + this.hostPort + "/" + this.databaseName);
        dataSource.setConnectionProperties("useSSL=" + this.useSsl +
                ";useUnicode=" + this.useUnicode +
                ";characterEncoding=" + this.characterEncoding +
                ";useJDBCCompliantTimezoneShift=" + this.useJdbcCompliantTimezoneShift +
                ";useLegacyDatetimeCode=" + this.useLegacyDatetimeCode +
                ";serverTimezone=" + this.serverTimezone);
        dataSource.setUsername(this.databaseUsername);
        dataSource.setPassword(this.databasePassword);
        dataSource.setInitialSize(this.initialSize);
        dataSource.setMaxActive(this.maxActive);
        dataSource.setTestOnBorrow(this.testOnBorrow);
        dataSource.setValidationQuery(this.validationQuery);
        return dataSource;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        final HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setShowSql(this.isShowSql);
        adapter.setGenerateDdl(this.isGenerateDdl);
        adapter.setDatabasePlatform(this.hibernateDialect);
        return adapter;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(
            final DataSource dataSource,
            final JpaVendorAdapter jpaVendorAdapter
    ) {
        final LocalContainerEntityManagerFactoryBean factory =
                new LocalContainerEntityManagerFactoryBean();
        factory.setDataSource(dataSource);
        factory.setJpaVendorAdapter(jpaVendorAdapter);
        factory.setPackagesToScan(this.entityPackages);
        return factory;
    }

    @Bean
    public JpaTransactionManager transactionManager(final EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }
}
