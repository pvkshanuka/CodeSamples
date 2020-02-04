import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kusal.training.salesmanager.model.Employee;
import com.kusal.training.salesmanager.service.EmployeeService;

public class Application {

	public static void main(String[] args) {
		
		
//		EmployeeService employeeService = new EmployeeServiceImpl();
//		
//		List<Employee> employees = employeeService.getAllEmployees();
//
//		employees.forEach(employee->System.out.println(employee.getEmployeeName()+" at "+employee.getEmployeeLocation()));
//		
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeService employeeService = (EmployeeService) applicationContext.getBean("employeeService");
		
		List<Employee> employees = employeeService.getAllEmployees();
		
		employees.forEach(employee->System.out.println(employee.getEmployeeName()+" at "+employee.getEmployeeLocation()));
		
	}

}
