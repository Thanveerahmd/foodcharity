package com.itim.foodcharity.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Charity")
public class Charity {
    @Id
    private String charityId;
    private String Address;
    private String PhoneNo;
    private int rating;


    public String getCharityId() {
        return charityId;
    }

    public void setCharityId(String charityId) {
        this.charityId = charityId;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    private String Name;
}
