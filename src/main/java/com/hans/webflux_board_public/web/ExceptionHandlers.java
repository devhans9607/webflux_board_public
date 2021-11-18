package com.hans.webflux_board_public.web;

import com.hans.dto.ResObj;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import reactor.core.publisher.Mono;

@RestControllerAdvice(annotations = RestController.class)
public class ExceptionHandlers {

    @ExceptionHandler(Exception.class)
    public Mono<?> handle(Exception e) {
        return Mono.just(e).flatMap(v -> ResObj.failure(9999, v.getCause().getClass().getName(), v.getMessage()));
    }
}
