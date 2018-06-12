package com.tea.leaves.healthApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tea.leaves.healthApp.documents.Organization;

public interface OrganizationRepository extends MongoRepository<Organization, Integer>{
	

}
