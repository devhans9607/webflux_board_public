package com.hans.webflux_board_public.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Aspect
@Component
public class TestAnnotation {

    @Around("@annotation(Test)")
    public Object testMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        final long start = System.currentTimeMillis();
        Mono<?> proceed = null;
        try {
            proceed = (Mono<?>) joinPoint.proceed();

            return proceed
                    .map(v -> {
                        System.out.println("in map : " + v.toString());
                        return v;
                    })
                    .doOnNext(response -> {
                        final long executionTime = System.currentTimeMillis() - start;
                        System.out.println("in doOnNext");
                        System.out.println(response);
                        System.out.println(joinPoint.getSignature() + " executed in " + executionTime + "ms");
                    });
        } catch (Exception e) {
            e.printStackTrace();
        }
        return proceed;
    }

//    @Around("@annotation(Test)")
//    public Object testMethod2(ProceedingJoinPoint joinPoint) throws Throwable {
//        final long start = System.currentTimeMillis();
//        return Mono.just(joinPoint).map(v -> {
//            System.out.println(v.getSignature());
//            return v;
//        }).map(ProceedingJoinPoint::proceed)
//    }
}
