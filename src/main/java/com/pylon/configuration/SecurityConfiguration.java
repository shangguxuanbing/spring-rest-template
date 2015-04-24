package com.pylon.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

/**
 * Created by simon on 4/19/15.
 */
@Configuration
@EnableWebMvcSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new StandardPasswordEncoder("x9ajDR$#Qkr91"); //TO-DO remove hardcoded value
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("user").password("pass").roles("USER");
    }

//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .addFilter()
//                .addFilter()
//                .exceptionHandling().accessDeniedHandler()
//                .authorizeRequests()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                    .usernameParameter("username")
//                    .passwordParameter("password")
//                .loginProcessingUrl("/api/v1/operators/session/create")
//                    .authenticationDetailsSource()
//                    .successHandler()
//                    .failureHandler()
//                .and()
//
//                .httpBasic();
//    }
}
