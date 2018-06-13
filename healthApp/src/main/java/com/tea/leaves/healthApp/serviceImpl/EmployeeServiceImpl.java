package com.tea.leaves.healthApp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tea.leaves.healthApp.documents.Employee;
import com.tea.leaves.healthApp.repository.EmployeeRepository;
import com.tea.leaves.healthApp.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@Override
	public Employee findById(Integer id) {
		return employeeRepository.findById(id).get();
	}
	
	@Override
	public Employee findByLastName(String lastName) {
		return employeeRepository.findByLastName(lastName);
	}

	@Override
	public List<Employee> findAll() {
		
		return employeeRepository.findAll();
	}

	@Override
	public Employee updateEmployee(Employee currentInfo) {
		
		System.out.println("inside employee serviceImpl");
		
		Employee newInfo = null;
		
		if(currentInfo!=null && currentInfo.getId()!=null) {
			
			newInfo = employeeRepository.findById(currentInfo.getId()).get();
			System.out.println(newInfo);
			
			if(currentInfo.getFirstName() != "") {
				newInfo.setFirstName(currentInfo.getFirstName());
			}
			if(currentInfo.getLastName() != "") {
				newInfo.setLastName(currentInfo.getLastName());
			}
			
			if(currentInfo.getSalary() != null && currentInfo.getSalary() > 0) {
				System.out.println("Salary is again null");
				newInfo.setSalary(currentInfo.getSalary());
			}
//			if(currentInfo.getSalary()!=null || currentInfo.getSalary() != 0) {
//				newInfo.setSalary(currentInfo.getSalary());
//			}
			
			if(currentInfo.getDepartment() != null && currentInfo.getDepartment().getDepartmentName() != "") {
				newInfo.getDepartment().setDepartmentName(currentInfo.getDepartment().getDepartmentName());
			}
		}
		
		System.out.println("new udpate Info: ");
		System.out.println(newInfo);
		
		return employeeRepository.save(newInfo);
	}

	@Override
	public void deleteEmployee(Integer id) {
		employeeRepository.deleteById(id);
	}

	@Override
	public Employee addEmployee(Employee employee) {

		System.out.println(">>>>>> Form submitted first name: " + employee.getFirstName() + " \n>>>>>> dept :" + employee.getDepartment().getDepartmentName());
		
		List<Employee> employees = employeeRepository.findAll();
		
		Integer lastId = employees.get(employees.size()-1).getId();
		
		System.out.println("\n>>>>>>> Last employee ID: " + lastId);
		employee.setId(lastId+100);

		String deptName = employee.getDepartment().getDepartmentName().toUpperCase(); 
		switch (deptName) 
		{
			case "IT":
				employee.getDepartment().setId(1);
			break;
			case "CUSTOMER & SERVICE":
				employee.getDepartment().setId(3);
			break;
			case "QC":
				employee.getDepartment().setId(4);
			break;
			case "HR":
				employee.getDepartment().setId(5);
			break;
			case "FINANCE":
				employee.getDepartment().setId(6);
			break;
			case "LOGISTIC":
				employee.getDepartment().setId(7);
			break;
		}
		
		return employeeRepository.save(employee);
	}
}
