import org.luke.service.customerService;
import org.luke.service.customerServiceImpl;

public class Application {

	public static void main(String[] args) {
		
		customerService service = new customerServiceImpl();
		
		System.out.println(service.findAll().get(0).getfName());
	}

}
