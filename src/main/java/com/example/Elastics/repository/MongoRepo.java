package com.example.Elastics.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Elastics.model.CustomerMongo;

public interface MongoRepo extends MongoRepository<CustomerMongo, String>{

}
