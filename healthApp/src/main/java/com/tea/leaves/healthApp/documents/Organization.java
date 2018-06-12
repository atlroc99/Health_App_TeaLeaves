package com.tea.leaves.healthApp.documents;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Organization {

	@Id
	private Integer id;
	private String orgnanizationName;


	public Organization() {
		
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrgnanizationName() {
		return orgnanizationName;
	}

	public void setOrgnanizationName(String orgnanizationName) {
		this.orgnanizationName = orgnanizationName;
	}

	
}
