package com.inder.configserver.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class SecurityConfiguration{
/*public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf()
                .ignoringAntMatchers("/encrypt/**")
                .ignoringAntMatchers("/decrypt/**");

        super.configure(http);
    }*/
}
