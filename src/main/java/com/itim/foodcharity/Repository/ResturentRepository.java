package com.itim.foodcharity.Repository;

import com.itim.foodcharity.Model.Restaurant;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ResturentRepository extends MongoRepository<Restaurant, String> {
}
