package com.itim.foodcharity.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "Request")
public class Request {
    @Id
    private String requestId;
    private Date date;
    private String MealId;
    private String RestaurantId;
    private int amountRequest;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMealId() {
        return MealId;
    }

    public void setMealId(String mealId) {
        MealId = mealId;
    }

    public String getRestaurantId() {
        return RestaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        RestaurantId = restaurantId;
    }

    public int getAmountRequest() {
        return amountRequest;
    }

    public void setAmountRequest(int amountRequest) {
        this.amountRequest = amountRequest;
    }
}

