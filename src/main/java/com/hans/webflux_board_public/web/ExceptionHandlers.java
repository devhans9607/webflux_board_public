package com.hans.webflux_board_public.web;

import com.hans.dto.ResObj;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.core.codec.DecodingException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.support.WebExchangeBindException;
import reactor.core.publisher.Mono;

import java.util.stream.Collectors;

@RestControllerAdvice(annotations = RestController.class)
public class ExceptionHandlers {

    @ExceptionHandler(NullPointerException.class)
    public Mono<?> handleValidExceptions(DecodingException e) {
        return Mono.just(e).map(v -> v.getMessage()).flatMap(a -> ResObj.failure(2323, a.toString()));
    }

    @ExceptionHandler(Exception.class)
    public Mono<?> handle(Exception e) {
        return Mono.just(e).flatMap(v -> ResObj.failure(9999, v.getCause().getClass().getName(), v.getMessage()));
    }
}
