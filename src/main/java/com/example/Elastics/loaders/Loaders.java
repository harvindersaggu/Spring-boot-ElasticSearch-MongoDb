package com.example.Elastics.loaders;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.example.Elastics.model.Customer;
import com.example.Elastics.repository.MongoRepo;
import com.example.Elastics.repository.UserRepository;

@Component
public class Loaders {
	@Autowired
	ElasticsearchOperations operations;

	@Autowired
	UserRepository userRepository;
	@Autowired
	MongoRepo mongoRepo;

	@PostConstruct
	@Transactional
	public void loadAll() {
		// List<Customer> list =new ArrayList<Customer>();
		operations.putMapping(Customer.class);
		System.out.println("Loading Data");
		mongoRepo.findAll().forEach(customer->{
			userRepository.save(new Customer(customer.getFirstName(),customer.getLastName(),customer.getAge()));
		});
		//System.out.println(getData().toString());
		/*
		 * if (getData().size() != 0) userRepository.save(getData());
		 */
		System.out.printf("Loading Completed");
	}
}
