package com.tea.leaves.healthApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tea.leaves.healthApp.documents.Department;
import com.tea.leaves.healthApp.documents.searchDeptEntity;
import com.tea.leaves.healthApp.services.DepartmentService;

//@RestController
@Controller
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@GetMapping("/allDepartments")
	public String getAllDeptPage(){
		return "departments";
	}
	
	
	@ResponseBody
	@GetMapping("/departmentList")
	public List<Department> getAllDepartments(){
		return departmentService.getAllDepartments();
	}
	
	
	@ResponseBody
	@PostMapping("/newDepartment")
	public Department addNewDepartment(@RequestBody Department department) {
		return departmentService.addNewDepartment(department);
	}

	@ResponseBody
	@PutMapping("/update")
	public Department updateDepartmen(@RequestBody Department department) {
		return this.departmentService.updateDepartment(department);
	}
	
	@GetMapping("/findDeptForm")
	public String getFindDeptForm(){
		return "findDeptForm";
	}
	
	@ResponseBody
	@GetMapping("/findDept")
	public Department findDepartById(@ModelAttribute searchDeptEntity searchDeptEntity) {
		
		//return departmentService.findDepartmentById(id);
		return null;
	}

	@GetMapping()
	public Department findByDepartmentName(@RequestParam(value="departmentName")String departmentName) {
		return this.departmentService.findByName(departmentName);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteDepartment(Integer id) {
		this.departmentService.deleteDepartment(id);
	}
	
	@GetMapping("/addNewDept")
	public String getNewDeptForm()
	{
		return "newDeptForm";
	}
	
	
	

}
