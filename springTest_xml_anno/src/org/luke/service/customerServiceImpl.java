package org.luke.service;

import java.util.List;

import org.luke.model.Customer;
import org.luke.repository.CustomerRepository;
import org.luke.repository.HibernateCustomerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	//@Autowired // 
	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	//@Autowired // constructor injection
	public CustomerServiceImpl(CustomerRepository customerRepository){
		System.out.println("Constructor Injection Begins....");
		this.customerRepository = customerRepository;
	}
	
	@Autowired //setter injection
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public List<Customer> findAll(){
		return customerRepository.findAll();
	}

}
