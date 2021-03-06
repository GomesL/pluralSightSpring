package org.luke.service;

import java.util.List;

import org.luke.model.Customer;
import org.luke.repository.CustomerRepository;
import org.luke.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
//	private CustomerRepository cm = new HibernateCustomerRepositoryImpl();
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
	 * Constructor Injection
	 */
	
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}

}
