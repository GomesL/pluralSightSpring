package org.luke.service;

import java.util.List;

import org.luke.model.Customer;
import org.luke.repository.CustomerRepository;
import org.luke.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository cm = new HibernateCustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see org.luke.service.customerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return cm.findAll();
	}

}
