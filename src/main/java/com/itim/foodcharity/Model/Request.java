package com.itim.foodcharity.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "Request")
public class Request {
    @Id
    private String RequestId;
    private Date date;
    private String MealId;
    private String RestaurantId;
    private int amountRequest;
}

