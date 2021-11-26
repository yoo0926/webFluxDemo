package com.example.webfluxdemo.router;

import com.example.webfluxdemo.handler.TestHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;

@Component
public class TestRouter {
    @Bean
    public RouterFunction<ServerResponse> testRoutes(TestHandler testHandler){
        String url = "";
        return RouterFunctions
                .route(GET(url+"/test"), testHandler::getTest);
    }
}
