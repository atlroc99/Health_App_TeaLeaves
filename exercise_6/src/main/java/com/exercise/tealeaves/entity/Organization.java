package com.exercise.tealeaves.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Organization implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int orgId;
	
	@Column
	private String organizationName;
	
	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}

	public Organization(){
		
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public int getOrgId() {
		return orgId;
	}

	@Override
	public String toString() {
		return "Organization [orgId=" + orgId + ", organizationName=" + organizationName + "]";
	}
	
}
