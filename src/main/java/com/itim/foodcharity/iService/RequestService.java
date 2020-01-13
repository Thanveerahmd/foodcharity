package com.itim.foodcharity.iService;

import com.itim.foodcharity.Model.Request;

import java.util.List;

public interface RequestService {
    public Request Add(Request data);
    public void Delete(String RequestId);
    public Request Update(Request data);
    public List<Request> getAllRequest(String RestaurantId);
}
