package org.luke.repository;

import java.util.List;

import org.luke.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}