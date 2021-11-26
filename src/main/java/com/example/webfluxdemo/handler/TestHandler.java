package com.example.webfluxdemo.handler;

import com.example.webfluxdemo.service.TestService;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class TestHandler {

    private final TestService testService;

    public Mono<ServerResponse> getTest(ServerRequest request) {
        return ServerResponse.ok()
                .body(testService.getTest(), JsonNode.class);
    }

}
