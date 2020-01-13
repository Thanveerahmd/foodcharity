package com.itim.foodcharity.Repository;

import com.itim.foodcharity.Model.Charity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CharityRepository extends MongoRepository<Charity, String> {
}
