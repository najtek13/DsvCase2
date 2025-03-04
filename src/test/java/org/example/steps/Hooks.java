package org.example.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import org.example.Booking;
import org.example.BookingTestData;

public class Hooks extends Step{

    public Hooks(){}

    @Before
    public void setUp(){

    }

    @After
    public void tearDown(){

    }

    @ParameterType("\\S+")
    public Booking booking(String bookingTestData){

        return BookingTestData
                .valueOf(bookingTestData)
                .createBookingTestData();
    }
}
