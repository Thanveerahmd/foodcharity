package com.itim.foodcharity.Repository;

import com.itim.foodcharity.Model.Meal;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MealRepository extends MongoRepository<Meal, String> {
}
