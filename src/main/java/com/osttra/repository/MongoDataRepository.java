package com.osttra.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.osttra.entity.MongoEntity;


@Repository
public interface MongoDataRepository extends MongoRepository<MongoEntity, String> {

}
