package com.itim.foodcharity.Dto;

import org.springframework.data.annotation.Id;

public class CharityDto {
    @Id
    private String CharityId;
    private String Address;
    private String PhoneNo;
    private int rating;
    private String Name;

    public String getCharityId() {
        return CharityId;
    }

    public String getAddress() {
        return Address;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public int getRating() {
        return rating;
    }

    public String getName() {
        return Name;
    }

    public void setCharityId(String charityId) {
        CharityId = charityId;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setName(String name) {
        Name = name;
    }
}
