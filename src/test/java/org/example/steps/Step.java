package org.example.steps;

import io.cucumber.spring.CucumberContextConfiguration;
import org.example.Config;
import org.example.KafkaProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Config.class)
@CucumberContextConfiguration
@EnableConfigurationProperties(KafkaProperties.class)
public class Step {

}
