package com.vk.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import com.vk.enumeration.UserRole;

@Configuration
@EnableWebSecurity
@ComponentScan(basePackages = "com.vk.service.data")
@PropertySource("classpath:security.properties")
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Value("${request.admin}")
    private String requestAdmin;

    @Value("${request.superadmin}")
    private String requestSuperAdmin;

    @Value("${request.login}")
    private String requestLogin;

    @Value("${request.access-denied-page}")
    private String requestAccessDeniedPage;

    @Value("${request.default-success}")
    private String requestDefaultSuccess;

    @Value("${request.default-success.always}")
    private boolean alwaysUseDefaultSuccess;

    @Value("${parameter.username}")
    private String parameterUsername;

    @Value("${parameter.password}")
    private String parameterPassword;

    private UserDetailsService userDetailsService;

    private SHA256PasswordEncoder sha256PasswordEncoder;

    @Autowired
    public SecurityConfig(UserDetailsService userDetailsService,
                          SHA256PasswordEncoder sha256PasswordEncoder){
        this.userDetailsService = userDetailsService;
        this.sha256PasswordEncoder = sha256PasswordEncoder;
    }

    @Override
    protected void configure(final HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .logout()
                    .invalidateHttpSession(false)
                    .and()
                .authorizeRequests()
                    .antMatchers(this.requestSuperAdmin).hasRole(UserRole.SUPERADMIN.name())
                    .antMatchers(this.requestAdmin).hasAnyRole(UserRole.ADMIN.name(), UserRole.SUPERADMIN.name())
                    .anyRequest().permitAll()
                    .and()
                .formLogin()
                    .loginPage(this.requestLogin)
                    .usernameParameter(this.parameterUsername)
                    .passwordParameter(this.parameterPassword)
                    .defaultSuccessUrl(this.requestDefaultSuccess, this.alwaysUseDefaultSuccess)
                    .and()
                .exceptionHandling()
                    .accessDeniedPage(this.requestAccessDeniedPage)
                    .and()
                .csrf().disable();
    }

    @Override
    protected void configure(final AuthenticationManagerBuilder builder) throws Exception {
        builder.userDetailsService(this.userDetailsService).passwordEncoder(sha256PasswordEncoder);
    }
}
