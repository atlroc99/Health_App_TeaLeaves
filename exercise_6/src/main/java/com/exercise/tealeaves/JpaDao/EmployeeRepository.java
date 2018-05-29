package com.exercise.tealeaves.JpaDao;

import org.springframework.data.repository.CrudRepository;

import com.exercise.tealeaves.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
