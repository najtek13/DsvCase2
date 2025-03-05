package org.example;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MongoService {


    private MongoTemplate mongoTemplate;
    public MongoService(MongoTemplate mongoTemplate){

        this.mongoTemplate = mongoTemplate;
    }

    public List<Booking> findByBookingNumber(int bookingNumber){

        Query query = new Query()
                .addCriteria(Criteria
                        .where("bookingNumber")
                        .is(bookingNumber));

        return mongoTemplate.find(query, Booking.class);
    }
}
