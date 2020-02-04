import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kusal.training.salesmanager.model.Employee;
import com.kusal.training.salesmanager.service.EmployeeService;
import com.kusal.training.salesmanager.service.EmployeeServiceImpl;

public class Application {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeService.class);

		List<Employee> employees = employeeService.getAllEmployees();

		employees.forEach(employee -> System.out.println(employee.getEmployeeName() + " at " + employee.getEmployeeLocation()));
	
		
//		EmployeeService employeeService = new EmployeeServiceImpl();
//		
//		List<Employee> employees = employeeService.getAllEmployees();
//		
//		employees.forEach(employee->System.out.println(employee.getEmployeeName()+" at "+employee.getEmployeeLocation()));
//		
	}

}
