package com.hans.webflux_board_public.web;

import com.hans.dto.ResObj;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import reactor.core.publisher.Mono;

@RestControllerAdvice(annotations = RestController.class)
public class ExceptionHandlers {

    // https://docs.spring.io/spring-framework/docs/current/reference/html/web-reactive.html#webflux-exception-handler
    // https://ddcode.net/2019/06/21/spring-5-webflux-exception-handling/
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.OK)
    public Mono<?> handle(Exception e) {
        return Mono.just(e).flatMap(v -> ResObj.failure(9999, v.getCause().getClass().getName(), v.getMessage()));
    }
}
