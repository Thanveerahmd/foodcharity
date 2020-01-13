package com.itim.foodcharity.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Restaurant")
public class Restaurant {

    @Id
    private String RestaurantId;
    private String Address;
    private String src;
    private String PhoneNo;
    private int rating;



}
