package com.tea.leaves.healthApp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Optional;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tea.leaves.healthApp.documents.Department;
import com.tea.leaves.healthApp.documents.Employee;
import com.tea.leaves.healthApp.repository.DepartmentRepository;
import com.tea.leaves.healthApp.repository.EmployeeRepository;
import com.tea.leaves.healthApp.services.EmployeeService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class HealthAppApplicationTests {

	@Autowired
	private DepartmentRepository deptRepo;
	
	@Autowired
	private EmployeeRepository empRepo;
	
	@Autowired
	private EmployeeService employeeService;
	
	
	@Test
	public void testInsert() {
		Department dept1 = new Department();
		dept1.setId(5);
		dept1.setDepartmentName("Finance");
		deptRepo.save(dept1);
		
		Employee emp1 = new Employee();
		emp1.setId(600);
		emp1.setFirstName("Jon");
		emp1.setLastName("Kabir");
		emp1.setSalary(65000);
		emp1.setDepartment(dept1);
		
		empRepo.save(emp1);
	}
	
	
	@Test
	public void testSelect() {
		assertEquals("Finance", deptRepo.findById(5).get().getDepartmentName());
		
		Employee emp = empRepo.findById(300).get();
		assertNotNull(emp);
		
		assertEquals("Ron", emp.getFirstName());
		assertEquals("Doe", emp.getLastName());
		assertEquals(new Integer(45000), emp.getSalary());
	}
	
	
	@Ignore
	@Test
	public void testUpdateDepartment() {
		//update Department
		
		Department dept = deptRepo.findById(4).get();
		assertEquals("Quality Control", dept.getDepartmentName());
		dept.setDepartmentName("QC");
		deptRepo.save(dept);
		
		assertEquals("QC", deptRepo.findById(4).get().getDepartmentName());
	}
	
	
	@Test
	public void testUpdateEmployee() {
		Employee emp1 = empRepo.findByLastName("smith");
		assertEquals("Jayden", emp1.getFirstName());
		System.out.println(">>>>>>>>>> " + emp1.getSalary() +" <<<<<<<<<<<");
		assertEquals(new Integer(12000), emp1.getSalary() );
	}
	
	
	@Test
	public void testDeleteDepartment() {
		deptRepo.deleteById(2);
	}
	

	@Test
	public void testDeleteEmployee() {
		empRepo.deleteById(200);
		assertEquals(Optional.empty(), empRepo.findById(200).empty());
	}

	
	@Test
	public void testCreateEmployeeWithoutID() {
		Employee emp = new Employee();
		Department dept = new Department();
		dept.setDepartmentName("finance");
		
		emp.setFirstName("Delta");
		emp.setLastName("Airwarys");
		emp.setSalary(100000);
		emp.setDepartment(dept);
		
		Employee addedEmp = employeeService.addEmployee(emp);
		System.out.println(">>>>>>>>>>>> " + addedEmp + " <<<<<<<<<<<<<");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
