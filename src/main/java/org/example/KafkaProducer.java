package org.example;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {

    private KafkaTemplate kafkaTemplate;
    private KafkaProperties kafkaProperties;

    public KafkaProducer(KafkaTemplate kafkaTemplate, KafkaProperties kafkaProperties){

        this.kafkaTemplate = kafkaTemplate;
        this.kafkaProperties = kafkaProperties;
    }

    public void sendMessage(Booking booking) {

        kafkaTemplate.send(kafkaProperties.getTopicName(), booking);
    }
}
