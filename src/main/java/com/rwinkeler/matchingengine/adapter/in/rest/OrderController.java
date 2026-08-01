package com.rwinkeler.matchingengine.adapter.in.rest;

import com.rwinkeler.matchingengine.adapter.out.kafka.KafkaOrderProducer;
import com.rwinkeler.matchingengine.application.dto.OrderRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tools.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final KafkaOrderProducer kafkaOrderProducer;
    private ObjectMapper mapper;

    public OrderController(KafkaOrderProducer kafkaOrderProducer, ObjectMapper mapper) {
        this.kafkaOrderProducer = kafkaOrderProducer;
    }

    @PostMapping
    public String createOrder(@RequestBody OrderRequest orderRequest) throws Exception {
        String json = mapper.writeValueAsString(orderRequest);
        kafkaOrderProducer.publish(json);
        return "Order sent to kafka!";
    }
}
