package com.itim.foodcharity.Repository;

import com.itim.foodcharity.Model.Request;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RequestRepository extends MongoRepository<Request, String> {
}
