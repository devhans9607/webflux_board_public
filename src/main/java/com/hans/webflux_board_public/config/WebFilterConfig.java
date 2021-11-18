package com.hans.webflux_board_public.config;

import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;
import reactor.core.publisher.Mono;


//https://www.baeldung.com/spring-webflux-filters
@Component
public class WebFilterConfig implements WebFilter {

    @Override
    public Mono<Void> filter(ServerWebExchange serverWebExchange, WebFilterChain webFilterChain) {
        serverWebExchange.getResponse().getHeaders().add("test_filter", "test_filter");
        return webFilterChain.filter(serverWebExchange);
    }
}
