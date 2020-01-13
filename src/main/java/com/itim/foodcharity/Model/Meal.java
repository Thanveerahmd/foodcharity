package com.itim.foodcharity.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Meal")
public class Meal {
    @Id
    private String MealId;
    private String type;
    private String Quantity;
    private String Address;
    private int NoOfPeopleCanServe;

}
