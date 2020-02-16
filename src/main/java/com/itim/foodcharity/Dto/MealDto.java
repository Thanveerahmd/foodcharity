package com.itim.foodcharity.Dto;

import org.springframework.data.annotation.Id;

public class MealDto {

    @Id
    private String MealId;
    private String type;
    private String Quantity;
    private String Address;

    public String getMealId() {
        return MealId;
    }

    public void setMealId(String mealId) {
        MealId = mealId;
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

    private int NoOfPeopleCanServe;

}
