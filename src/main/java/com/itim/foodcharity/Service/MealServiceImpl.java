package com.itim.foodcharity.Service;

import com.itim.foodcharity.Dto.MealDto;
import com.itim.foodcharity.Model.Meal;
import com.itim.foodcharity.iService.MealService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealServiceImpl implements MealService {
    @Override
    public Meal Add(MealDto data) {
        return null;
    }

    @Override
    public boolean Delete(String MealId) {
        return false;
    }

    @Override
    public Meal Update(MealDto data) {
        return null;
    }

    @Override
    public List<Meal> getAll() {
        return null;
    }

    @Override
    public List<Meal> getAllByResturent() {
        return null;
    }
}
