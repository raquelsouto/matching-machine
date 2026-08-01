package com.rwinkeler.matchingengine.adapter.out.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaOrderProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    private KafkaOrderProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void publish(String orderJson) {
        kafkaTemplate.send("orders", orderJson);
    }

}
