package com.example.webfluxdemo.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class TestService {

    public Mono<JsonNode> getTest() {
        return Mono.just(JsonNodeFactory.instance.objectNode().put("result", 123)
                .put("name", "jy")
                .put("title", "test"));
    }
}
