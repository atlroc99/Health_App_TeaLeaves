package com.exercise.tealeaves.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.exercise.tealeaves.entity.Employee;
import com.exercise.tealeaves.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employee")
	public String employeePage(){
		return "employeeHome";
	}


	@GetMapping("/allEmployees")
	public List<Employee> getAllEmployees(){
		
		return employeeService.getEmployeeList();
	}
	
	
	@GetMapping(value="/employee/{employeeId}", produces="application/json")
	public @ResponseBody ResponseEntity<Employee> getEmployeeById(@PathVariable(name="employeeId") int employeeId){
		System.out.println("**** get employee by Id: "+ employeeId);
		Employee employee =  employeeService.getEmployeeById(employeeId);
		
		System.out.println(employee);
		return employee;
	}
	
	@PostMapping(name="/newEmployee", consumes="application/json")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
		
		ResponseEntity<Employee> responseEntity = null;
		if(employee != null)
		{
			System.out.println(employee);
			employeeService.addOrUpdate(employee);
			responseEntity = new ResponseEntity<Employee>(employee, HttpStatus.OK);
		}
		else
		{
			System.out.println("no employee empty!");
		}
		
		return responseEntity;
	}
	
	
	@PutMapping(name="/updateEmployee", consumes="application/JSON")
	public void updateEmployee(@RequestBody Employee employee){
		System.out.println("employee" + employee);
		employeeService.addOrUpdate(employee);
	}
	
	@DeleteMapping(value="/removeEmployee", consumes="application/json")
	public void deleteEmployee(Employee employee){
		employeeService.deleteEmployee(employee);
	}
}
