package org.example;

public enum BookingTestData {

    BASIC {
        @Override
        public Booking createBookingTestData() {
            return Booking.builder()
                    .bookingNumber(22222)
                    .name("John")
                    .items(3)
                    .build();
        }
    };

    public abstract Booking createBookingTestData();
}
