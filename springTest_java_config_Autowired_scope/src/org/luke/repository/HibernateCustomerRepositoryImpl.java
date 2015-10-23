package org.luke.repository;

import java.util.ArrayList;
import java.util.List;

import org.luke.model.Customer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

// This is selected when component scan
@Repository("customerRepository")
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
