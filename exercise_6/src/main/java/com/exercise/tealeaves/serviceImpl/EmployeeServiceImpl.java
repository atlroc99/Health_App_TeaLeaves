package com.exercise.tealeaves.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercise.tealeaves.dao.EmployeeRepository;
import com.exercise.tealeaves.entity.Employee;
import com.exercise.tealeaves.service.EmployeeService;

@Service("EmployeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee getEmployeeById(int empId) {
		
		return employeeRepository.findById(empId).get();
	}

	@Override
	public List<Employee> getEmployeeList() {
		
		return employeeRepository.findAll();
		
	}

	@Override
	public Employee getEmployeeByLastName(String lastName) {
		
		return employeeRepository.getEmployeeByLastName(lastName);
		
	}

	@Override
	public int addNewEmployee(Employee employee) {
		
		return employeeRepository.addNewEmployee(employee);
	}

	@Override
	public void deleteEmployee(Employee employee) {
		
		employeeRepository.delete(employee);
	}

	@Override
	public void updateEmployee(Employee employee) {
		
		employeeRepository.updateEmployee(employee);
	}

}
