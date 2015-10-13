package org.luke.repository;

import java.util.List;

import org.luke.model.Customer;

public interface customerRepository {

	List<Customer> findAll();

}