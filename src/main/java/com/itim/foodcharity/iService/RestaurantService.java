package com.itim.foodcharity.iService;

import com.itim.foodcharity.Dto.RestaurantDto;
import com.itim.foodcharity.Model.Restaurant;

import java.util.List;

public interface RestaurantService {
    public Restaurant Add(RestaurantDto data);
    public boolean Delete(String RestaurantId);
    public Restaurant Update(RestaurantDto data);
    public List<Restaurant> getAll(String RestaurantId);
}

