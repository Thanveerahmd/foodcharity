package com.itim.foodcharity.iService;

import com.itim.foodcharity.Dto.MealDto;
import com.itim.foodcharity.Model.Meal;

import java.util.List;

public interface MealService {
    public Meal Add(MealDto data);
    public boolean Delete(String MealId);
    public Meal Update(MealDto data);
    public List<Meal> getAll();
    public List<Meal> getAllByResturent();
}
