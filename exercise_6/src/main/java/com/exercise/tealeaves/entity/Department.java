package com.exercise.tealeaves.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Department implements Serializable  {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int deptId;
	
	@Column(name="DEPATMETN_NAME")
	private String name;
	
	@Column(name="NUMBER_OF_EMPOYEE")
	private int noOfEmployee;

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public Department() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfEmployee() {
		return noOfEmployee;
	}

	public void setNoOfEmployee(int noOfEmployee) {
		this.noOfEmployee = noOfEmployee;
	}

	public int getDeptId() {
		return deptId;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", name=" + name + ", noOfEmployee=" + noOfEmployee + "]";
	}
}

