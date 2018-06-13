package com.tea.leaves.healthApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tea.leaves.healthApp.documents.EmpSearchEntity;
import com.tea.leaves.healthApp.documents.Employee;
import com.tea.leaves.healthApp.services.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@ResponseBody
	@GetMapping("/employeeList")
	public List<Employee> findAllEmployee() {
		return employeeService.findAll();
	}
	
	@GetMapping("/allEmployees")
	public String findAllEmployee(Model model) {
		return "employees";
	}
	
	@ResponseBody
	@GetMapping("/findEmployee")	
	public Employee findById(@ModelAttribute EmpSearchEntity empSearchEntity) 
	{
		Integer id =  empSearchEntity.getId();
		String lastName = empSearchEntity.getLastName();
		
		System.out.println("id: " + id);
		System.out.println("Last name: " + lastName);
		
		Employee employee = null; 
		
		if(id !=null ) {
			employee = employeeService.findById(id);
		}else if (lastName != null || lastName != "") {
			employee = employeeService.findByLastName(lastName);
		}
		
		System.out.println(employee);
		return employee;
	}
	
	@GetMapping("/newEmployeeForm")
	public String addNewEmplloyee() {
		return "newEmployeeForm";
	}
	
	@ResponseBody
	@PostMapping("/processNewEmployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}

	@GetMapping("/updateEmpForm")
	public String getUpdateEmpForm() {
		return "updateEmpForm";
	}
	
	
	@ResponseBody
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee employee) {
		
		return employeeService.updateEmployee(employee);
	}

	
	@GetMapping("/deleteEmpForm")
	public String getDelEmpForm() {
		return "delEmpForm";
	}
	
	
	@ResponseBody
	@GetMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable(name = "id") Integer id) {
		employeeService.deleteEmployee(id);
		return "employee with id : " + id + " delete";
	}

	
	@GetMapping("/newEmployee")
	public String newEmployeeForm() {
		return "newEmployeeForm";
	}
	
	@GetMapping("/findEmpForm")
	public String getByIdOrLastNameForm()
	{
		return "findEmpForm";
	}
}
