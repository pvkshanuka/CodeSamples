package com.kusal.training.salesmanager.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.kusal.training.salesmanager.model.Employee;

@Repository("AnyName")
public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {

	@Value("${name}")
	private String name;

	@Value("${city}")
	private String location;
	
	@Override
	public List<Employee> getAllEmployees() {
		
		List<Employee> employees = new ArrayList<>();
		
		Employee employee = new Employee();
		employee.setEmployeeName(name);
		employee.setEmployeeLocation(location);
		
		employees.add(employee);
		
		return employees;
		
	}
	
}
