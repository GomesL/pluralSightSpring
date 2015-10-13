package org.luke.service;

import java.util.List;

import org.luke.model.Customer;
import org.luke.repository.customerRepository;
import org.luke.repository.hibernateCustomerRepositoryImpl;

public class customerServiceImpl implements customerService {
	
	private customerRepository cm = new hibernateCustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see org.luke.service.customerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return cm.findAll();
	}

}
