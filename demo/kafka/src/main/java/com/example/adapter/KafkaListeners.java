package com.example.adapter;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics ="code-topic", groupId = "groupId")
    void listener(ConsumerRecord<String, String> record) {
        System.out.println("Primljena poruka: " + record.value());
        System.out.println("Particija: " + record.partition());
        System.out.println("Offset: " + record.offset());
        if (record.value().equals("error")) {
            throw new RuntimeException("Greška prilikom obrade poruke!");
        }
    }
}
