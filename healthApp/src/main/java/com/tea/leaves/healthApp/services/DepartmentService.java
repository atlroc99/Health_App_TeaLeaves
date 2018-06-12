package com.tea.leaves.healthApp.services;

import java.util.List;

import com.tea.leaves.healthApp.documents.Department;

public interface DepartmentService {

	List<Department> getAllDepartments();
	
	Department findDepartmentById(Integer id);

	Department findByName(String name);

	Department addNewDepartment(Department department);

	Department updateDepartment(Department department);

	void deleteDepartment(Integer id);
}
