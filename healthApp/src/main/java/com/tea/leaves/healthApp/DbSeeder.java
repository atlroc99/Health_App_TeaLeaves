package com.tea.leaves.healthApp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.tea.leaves.healthApp.documents.Department;
import com.tea.leaves.healthApp.documents.Employee;
import com.tea.leaves.healthApp.services.DepartmentService;
//import com.tea.leaves.healthApp.repository.EmployeeRepository;
import com.tea.leaves.healthApp.services.EmployeeService;

@Component
public class DbSeeder implements CommandLineRunner{

	private EmployeeService employeeService;
	private DepartmentService departmentService;
	
	//private EmployeeRepository employeeRepository;
	
	public DbSeeder(EmployeeService employeeService, DepartmentService departmentService) {
		this.employeeService = employeeService;
		this.departmentService = departmentService;
	}
	
	
	@Override
	public void run(String... args) throws Exception {

		Department d1 = new Department();
		d1.setId(1);
		d1.setDepartmentName("IT");
//		Employee jayden = new Employee(100, "Jayden", "smith", 12000, d1);
//		employeeService.addEmployee(jayden);
		
//		Employee james = new Employee(200, "James", "comey", 3000, d1);
//		employeeService.addEmployee(james);

//		Employee ron = new Employee(300, "Ron", "Doe",45000, d1);
//		employeeService.addEmployee(ron);
		
		
		Department it = new Department();
		it.setId(1);
		it.setDepartmentName("IT");
		
		departmentService.addNewDepartment(it);
		
	}

}
