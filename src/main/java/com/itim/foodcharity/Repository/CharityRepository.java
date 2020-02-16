package com.itim.foodcharity.Repository;

import com.itim.foodcharity.Model.Charity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface CharityRepository extends MongoRepository<Charity, String> {
    Optional<Charity> findByCharityId(ObjectId objectId);
}
