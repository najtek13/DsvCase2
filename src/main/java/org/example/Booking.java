package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Booking {

    @JsonProperty("bookingnumber")
    private int bookingNumber;
    private String name;
    private int items;
}
