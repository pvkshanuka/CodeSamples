package com.kusal.training.salesmanager.repository;

import java.util.List;

import com.kusal.training.salesmanager.model.Employee;

public interface EmployeeRepository {

	List<Employee> getAllEmployees();

}