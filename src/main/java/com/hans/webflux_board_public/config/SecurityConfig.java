package com.hans.webflux_board_public.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.server.SecurityWebFilterChain;


@EnableWebFluxSecurity
public class SecurityConfig {

    // https://java.ihoney.pe.kr/498
    // https://www.baeldung.com/spring-security-5-password-storage
    @Bean
    public PasswordEncoder delegatingPasswordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

    @Bean
    public SecurityWebFilterChain springSecurityFilterChain (ServerHttpSecurity http){
        return http
            .authorizeExchange()
            .anyExchange().permitAll()
            .and()
            .httpBasic().disable()
            .csrf().disable()
            .formLogin().disable()
            .build();
    }

    // https://docs.spring.io/spring-security/site/docs/5.1.1.RELEASE/reference/html/jc-webflux.html

//    @Bean
//    public MapReactiveUserDetailsService userDetailsService () {
//        UserDetails user = User.withDefaultPasswordEncoder()
//                .username("user")
//                .password("user")
//                .roles("USER")
//                .build();
//        return new MapReactiveUserDetailsService(user);
//    }
}
