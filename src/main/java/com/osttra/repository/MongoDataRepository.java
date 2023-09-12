package com.osttra.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.osttra.entity.MongoData;

@Repository
public interface MongoDataRepository extends MongoRepository<MongoData, String> {
}
