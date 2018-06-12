package com.tea.leaves.healthApp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tea.leaves.healthApp.documents.Department;
import com.tea.leaves.healthApp.repository.DepartmentRepository;
import com.tea.leaves.healthApp.services.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
	public Department findDepartmentById(Integer id) {
		return departmentRepository.findById(id).get();
	}

	@Override
	public Department findByName(String name) {
		return departmentRepository.findByDepartmentName(name);
	}

	@Override
	public Department addNewDepartment(Department department) {
		
		return departmentRepository.save(department);
	}

	@Override
	public Department updateDepartment(Department department) {
		return departmentRepository.save(department);
	}

	@Override
	public void deleteDepartment(Integer id) {
		
		departmentRepository.deleteById(id);
	}

	@Override
	public List<Department> getAllDepartments() {
		return this.departmentRepository.findAll();
	}

}
