package org.luke.repository;

import java.util.ArrayList;
import java.util.List;

import org.luke.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	/* (non-Javadoc)
	 * @see org.luke.repository.customerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		customer.setfName("Luke");
		customer.setlName("Gomes");
		customers.add(customer);
		
		return customers;
		
	}

}
