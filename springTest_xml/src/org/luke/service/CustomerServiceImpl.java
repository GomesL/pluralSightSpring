package org.luke.service;

import java.util.List;

import org.luke.model.Customer;
import org.luke.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {
	
	//private customerRepository cm = new hibernateCustomerRepositoryImpl();
	private CustomerRepository customerRepository;
	
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	/* (non-Javadoc)
	 * @see org.luke.service.customerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}

}
