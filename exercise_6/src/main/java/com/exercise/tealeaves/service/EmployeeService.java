package com.exercise.tealeaves.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.exercise.tealeaves.entity.Employee;

@Repository
public interface EmployeeService {
	
	Employee getEmployeeById(int empId);
	
	List<Employee> getEmployeeList();
	
	Employee getEmployeeByLastName(String lastName);
	
	void addOrUpdate(Employee employee);
	
	void deleteEmployee(Employee employee);
	
//	void updateEmployee(Employee employee);
	
}
