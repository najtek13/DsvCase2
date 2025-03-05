package org.example.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Booking;
import org.example.KafkaProducer;
import org.example.MongoService;
import org.example.ScenarioContext;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TestStep extends Step {

    private KafkaProducer kafkaProducer;
    private MongoService mongoService;
    private ScenarioContext scenarioContext;

    public TestStep(KafkaProducer kafkaProducer, MongoService mongoService, ScenarioContext scenarioContext){

        this.kafkaProducer = kafkaProducer;
        this.mongoService = mongoService;
        this.scenarioContext = scenarioContext;
    }

    @When("I sent {booking} message to the Kafka Topic")
    public void iSentMessageToKafkaTopic(Booking booking){

        kafkaProducer.sendMessage(booking);
        scenarioContext.getScenarioContextData().setBooking(booking);
    }

    @Then("the message is stored in mongoDB")
    public void theMessageIsStoredInMongoDB(){

        Booking expectedBooking = scenarioContext
                .getScenarioContextData()
                .getBooking();

        List bookings = mongoService.findByBookingNumber(expectedBooking.getBookingNumber());

        assertThat(bookings)
                .hasSize(1)
                .contains(expectedBooking);
    }
}
