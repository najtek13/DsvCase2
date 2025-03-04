package org.example;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "kafka")
@Data
public class KafkaProperties {

    private String topicName;
}
