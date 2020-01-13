package com.itim.foodcharity.Service;

import com.itim.foodcharity.Dto.RestaurantDto;
import com.itim.foodcharity.Model.Restaurant;
import com.itim.foodcharity.iService.RestaurantService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurantService {
    @Override
    public Restaurant Add(RestaurantDto data) {
        return null;
    }

    @Override
    public boolean Delete(String RestaurantId) {
        return false;
    }

    @Override
    public Restaurant Update(RestaurantDto data) {
        return null;
    }

    @Override
    public List<Restaurant> getAll(String RestaurantId) {
        return null;
    }
}
