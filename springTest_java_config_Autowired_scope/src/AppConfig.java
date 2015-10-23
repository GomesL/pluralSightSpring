import org.luke.repository.CustomerRepository;
import org.luke.repository.HibernateCustomerRepositoryImpl;
import org.luke.service.CustomerService;
import org.luke.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
//autowire
@ComponentScan({"org.luke"})
public class AppConfig {
	
	@Bean(name="customerService")
//	@Scope("singleton")
	@Scope("prototype")
	public CustomerService getCustomerService(){
		
		/*
		 * This is setter injection by using java config
		 */
//		CustomerServiceImpl customerService = new CustomerServiceImpl();
//		customerService.setCustomerRepository(getCustomerRepository());
		
		
		/*
		 * This is for constructor injection by using java config
		 */
//		CustomerServiceImpl customerService = new CustomerServiceImpl(getCustomerRepository());
		
		CustomerServiceImpl customerService = new CustomerServiceImpl();
		
		return customerService;
	}
	
//	@Bean(name="customerRepository")
//	public CustomerRepository getCustomerRepository(){
//		return new HibernateCustomerRepositoryImpl();
//	}
}
