package com.kusal.training.salesmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.kusal.training.salesmanager.model.Employee;
import com.kusal.training.salesmanager.repository.EmployeeRepository;
import com.kusal.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl() {
		System.out.println("Default constructor executed");
	}
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		System.out.println("Overload constructor executed");
		this.employeeRepository = employeeRepository;
	}



	/**
	 * @return the employeeRepository
	 */
	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}



	/**
	 * @param employeeRepository the employeeRepository to set
	 */
	@Autowired
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		System.out.println("Setter executed");
		this.employeeRepository = employeeRepository;
	}



	public List<Employee> getAllEmployees() {
		
		return employeeRepository.getAllEmployees();
		
	}
	
}
