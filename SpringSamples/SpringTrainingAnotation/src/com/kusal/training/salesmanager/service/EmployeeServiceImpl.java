package com.kusal.training.salesmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kusal.training.salesmanager.model.Employee;
import com.kusal.training.salesmanager.repository.EmployeeRepository;
import com.kusal.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	
	EmployeeRepository employeeRepository = new HibernateEmployeeRepositoryImpl();
	
	public EmployeeServiceImpl() {

	}
	
	@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
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
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.getAllEmployees();
	}

}
