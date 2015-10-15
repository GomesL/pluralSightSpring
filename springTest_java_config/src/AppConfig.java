import org.luke.repository.CustomerRepository;
import org.luke.repository.HibernateCustomerRepositoryImpl;
import org.luke.service.CustomerService;
import org.luke.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {
	
	@Bean(name="customerService")
	public CustomerService getCustomerService(){
		
		/*
		 * This is setter injection by using java config
		 */
//		CustomerServiceImpl customerService = new CustomerServiceImpl();
//		customerService.setCustomerRepository(getCustomerRepository());
		
		
		/*
		 * This is for constructor injection by using java config
		 */
		CustomerServiceImpl customerService = new CustomerServiceImpl(getCustomerRepository());
		
		return customerService;
	}
	
	@Bean(name="customerRepository")
	public CustomerRepository getCustomerRepository(){
		return new HibernateCustomerRepositoryImpl();
	}
}
