package com.exercise.tealeaves.serviceImpl;

import java.util.List;
import java.util.Optional;

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
		
		Optional<Employee> optionalEmployee =  employeeRepository.findById(empId);
		Employee employee = optionalEmployee.get();
		System.out.println("inside the Employee Service Impl : "+ employee);
		
		return employee;
	}

	@Override
	public List<Employee> getEmployeeList() {
		
		return employeeRepository.findAll();
		
	}

	@Override
	public Employee getEmployeeByLastName(String lastName) {
		
		return employeeRepository.getEmployeeByLastName(lastName);
		
	}

/*	@Override
	public int addNewEmployee(Employee employee) {
		
		return employeeRepository.addNewEmployee(employee);
	}*/

	@Override
	public void deleteEmployee(Employee employee) {
		
		employeeRepository.delete(employee);
	}

	@Override
	public void addOrUpdate(Employee employee) {
		
		if(employee !=null){
			employeeRepository.saveAndFlush(employee);
		}else
		{
			System.out.println("no emploeyee found to be updated");
		}
	}

}
