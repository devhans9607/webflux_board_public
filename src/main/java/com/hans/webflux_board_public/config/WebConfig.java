package com.hans.webflux_board_public.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.http.codec.ServerCodecConfigurer;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.PathMatchConfigurer;
import org.springframework.web.reactive.config.ResourceHandlerRegistry;
import org.springframework.web.reactive.config.WebFluxConfigurer;

import java.util.concurrent.TimeUnit;

@Configuration
@EnableWebFlux
public class WebConfig implements WebFluxConfigurer {

    // https://docs.spring.io/spring-framework/docs/current/reference/html/web-reactive.html#webflux-config-enable

    @Override
    public void configureHttpMessageCodecs(ServerCodecConfigurer configurer) {
        configurer.defaultCodecs().maxInMemorySize(512 * 1024);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**")
                .addResourceLocations("/public", "classpath:/static/")
                .setCacheControl(CacheControl.maxAge(365, TimeUnit.DAYS));
    }

    @Override
    public void configurePathMatching(PathMatchConfigurer configurer) {
        configurer
                .setUseCaseSensitiveMatch(true)
                .setUseTrailingSlashMatch(false)

        // path prefix breaks swagger..
//                .addPathPrefix("/api",
//                        HandlerTypePredicate.forAnnotation(RestController.class))
        ;
    }
}
