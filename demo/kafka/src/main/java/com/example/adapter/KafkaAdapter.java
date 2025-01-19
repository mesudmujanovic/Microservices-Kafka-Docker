package com.example.adapter;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class KafkaAdapter {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @PostConstruct
    public void getKafkaTemplate() {
        kafkaTemplate.send("code-topic", "hello kafka :)");
        kafkaTemplate.send("code-topic", "hello kafka 2 :)");
        kafkaTemplate.send("code-topic", "hello kafka 3:)");
    };
}
