package com.example.Elastics.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.example.Elastics.model.Customer;

@Repository
public interface UserRepository extends ElasticsearchRepository<Customer, String> {

	Page<Customer> findAll();

	void save(List<Customer> data);



}
