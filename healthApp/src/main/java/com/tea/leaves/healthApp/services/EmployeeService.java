package com.tea.leaves.healthApp.services;

import java.util.List;

import com.tea.leaves.healthApp.documents.Employee;

public interface EmployeeService {
	
	Employee addEmployee(Employee employee);

	Employee findById(Integer id);

	List<Employee> findAll();

	Employee updateEmployee(Employee employee);

	void deleteEmployee(Integer id);
	
	Employee findByLastName(String lastName);
}
