import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.kusal.training.salesmanager.repository.EmployeeRepository;
import com.kusal.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;
import com.kusal.training.salesmanager.service.EmployeeService;
import com.kusal.training.salesmanager.service.EmployeeServiceImpl;

@Configuration
@ComponentScan("com.kusal")
@PropertySource("application.properties")
public class ApplicationConfiguration {

	@Bean(name = "employeeService")
	@Scope("singleton")
	public EmployeeService getEmployeeService() {
		
		EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
		
		return employeeService;
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
//	
//	@Bean(name = "employeeRepository")
//	public EmployeeRepository getEmployeeRepository() {
//		return new HibernateEmployeeRepositoryImpl();
//	}
//	
}
