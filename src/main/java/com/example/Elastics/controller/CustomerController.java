package com.example.Elastics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Elastics.model.Customer;
import com.example.Elastics.model.CustomerMongo;
import com.example.Elastics.repository.MongoRepo;
import com.example.Elastics.repository.UserRepository;

@RestController
@RequestMapping()
public class CustomerController {

	// @Autowired
	// private SearchQueryBuilder queryBuilder;
	@Autowired
	private UserRepository userReposiotry;
	@Autowired
	private MongoRepo mongoRepo;

	/*
	 * @GetMapping(value = "/{text}") public List<Customer> searchAll(@PathVariable
	 * String text) { List<Customer> list = queryBuilder.getAll(text); return list;
	 * }
	 */
	@GetMapping(value = "/api/all")
	public List<Customer> getAll() {
		Page<Customer> list = userReposiotry.findAll();
		return list.getContent();
	}

	@PostMapping("/api")
	public String saveCustomer(@RequestBody Customer customer) {
		userReposiotry.save(customer);
		return "Done";
	}

	@PostMapping("/add")
	public String savesCustomer(@RequestBody CustomerMongo customer) {
		mongoRepo.save(customer);
		return "Created";
	}

	@GetMapping("/add")
	public List<CustomerMongo> getCustomer() {
		return mongoRepo.findAll();
	}
}
