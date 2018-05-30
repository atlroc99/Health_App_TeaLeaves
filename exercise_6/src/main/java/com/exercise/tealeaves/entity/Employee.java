package com.exercise.tealeaves.entity;

//import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee  {

	//private static final long serialVersionUID = -6258217592970452118L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable=false, updatable=true)
	private String firstName;
	
	@Column(nullable=false, updatable=true)
	private String lastName;
	

	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="orgId", nullable=false)
	private Organization organization;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch= FetchType.EAGER)
	@JoinColumn(name="dept_id", nullable=false)
	private Department department;


	public Employee(){}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

/*	public void setId(Integer id) {
		this.id = id;
	}
*/
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + id + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", organization=" + organization + ", department=" + department + "]";
	}

	
}
