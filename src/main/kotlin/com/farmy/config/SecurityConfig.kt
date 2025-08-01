package com.farmy.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.web.SecurityFilterChain

@Configuration
@EnableWebSecurity
class SecurityConfig {
    @Bean
    fun configure(http: HttpSecurity): SecurityFilterChain {
        http
            .authorizeHttpRequests{ authorizeRequests -> authorizeRequests
                .requestMatchers("/api/**").permitAll()
                .anyRequest().permitAll()
            }
            .cors { }
            .csrf { it.disable() }



        return http.build()
    }

}