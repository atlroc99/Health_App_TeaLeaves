package com.tea.leaves.healthApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tea.leaves.healthApp.documents.Department;

@Repository
public interface DepartmentRepository extends MongoRepository<Department, Integer> {
	
	public Department findByDepartmentName(String name);
}
