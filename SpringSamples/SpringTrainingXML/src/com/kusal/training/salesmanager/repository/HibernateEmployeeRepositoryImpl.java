package com.kusal.training.salesmanager.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.kusal.training.salesmanager.model.Employee;

public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {

	@Override
	public List<Employee> getAllEmployees() {
		
		List<Employee> employees = new ArrayList<>();
		
		Employee employee = new Employee();
		employee.setEmployeeName("Kusal");
		employee.setEmployeeLocation("Negombo");
		employees.add(employee);
		
		return employees;
		
	}
	
}
