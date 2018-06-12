package com.tea.leaves.healthApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tea.leaves.healthApp.documents.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Integer>
{
	public Employee findByLastName(String lastname);
	
}
