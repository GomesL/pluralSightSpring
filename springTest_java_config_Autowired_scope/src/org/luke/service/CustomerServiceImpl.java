package org.luke.service;

import java.util.List;

import org.luke.model.Customer;
import org.luke.repository.CustomerRepository;
import org.luke.repository.HibernateCustomerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServiceImpl implements CustomerService {
	
	//autowire member injection
	
	private CustomerRepository customerRepository;
	
	
	/*
	 * Constructor Injection need both default and param constructors
	 */
	public CustomerServiceImpl(){
		
	}
	
	public CustomerServiceImpl(CustomerRepository customerRepository){
		System.out.println("Constructor Injection used");
		this.customerRepository = customerRepository;
	}
	
	/*
	 * Setter Injection
	 */
	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("Setter Injection used");
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}

}
