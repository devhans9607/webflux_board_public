package com.hans.webflux_board_public;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

// TODO
//  - Error handler
//  - Passcode Encoder
//  - valid / nonnull
//  - JWT Token
//  - Security?

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Webflux board Public", version = "0.0", description = "Created 2021/11/12"))
public class WebfluxBoardPublicApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebfluxBoardPublicApplication.class, args);
    }

}
