package com.itim.foodcharity.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Meal")
public class Meal {
    @Id
    private String mealId;
    private String type;
    private String Quantity;
    private String Address;
    private int NoOfPeopleCanServe;

    public String getMealId() {
        return mealId;
    }

    public void setMealId(String mealId) {
        this.mealId = mealId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String quantity) {
        Quantity = quantity;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getNoOfPeopleCanServe() {
        return NoOfPeopleCanServe;
    }

    public void setNoOfPeopleCanServe(int noOfPeopleCanServe) {
        NoOfPeopleCanServe = noOfPeopleCanServe;
    }
}
