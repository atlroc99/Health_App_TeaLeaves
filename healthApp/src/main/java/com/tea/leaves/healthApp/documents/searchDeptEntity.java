package com.tea.leaves.healthApp.documents;

public class searchDeptEntity {

	private Integer id;
	private String deptName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "searchDeptEntity [id=" + id + ", deptName=" + deptName + "]";
	}

}
