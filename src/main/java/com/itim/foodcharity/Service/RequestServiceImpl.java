package com.itim.foodcharity.Service;

import com.itim.foodcharity.Model.Request;
import com.itim.foodcharity.iService.RequestService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestServiceImpl implements RequestService {
    @Override
    public Request Add(Request data) {
        return null;
    }

    @Override
    public void Delete(String RequestId) {

    }

    @Override
    public Request Update(Request data) {
        return null;
    }

    @Override
    public List<Request> getAllRequest(String RestaurantId) {
        return null;
    }
}
