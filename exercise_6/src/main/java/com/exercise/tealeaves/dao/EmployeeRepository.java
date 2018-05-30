package com.exercise.tealeaves.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exercise.tealeaves.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	Employee getEmployeeById(int empId);
	
	//List<Employee> getEmployeeList();
	
	Employee getEmployeeByLastName(String lastName);
	
	//int addNewEmployee(Employee employee);
	
	//void deleteEmployee(int id);
	
	//void updateEmployee(Employee employee);
	
}
