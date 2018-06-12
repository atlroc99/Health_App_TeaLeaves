package com.tea.leaves.healthApp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tea.leaves.healthApp.documents.Organization;
import com.tea.leaves.healthApp.repository.OrganizationRepository;
import com.tea.leaves.healthApp.services.OrganizationService;

public class OrganizationServiceImpl implements OrganizationService {

	@Autowired
	private OrganizationRepository organizationRepository;
	
	@Override
	public Organization addNewOrganization(Organization organization) {
		return organizationRepository.save(organization);
	}

	@Override
	public Organization updateOrganization(Organization organization) {
	
		return organizationRepository.save(organization);
	}

	@Override
	public List<Organization> getAllOrganization() {
		return organizationRepository.findAll();
	}
	

	@Override
	public Organization getOrganizationById(Integer id) {
		return organizationRepository.findById(id).get();
	}

	@Override
	public void deleteOrganization(Integer id) {
		organizationRepository.deleteById(id);
		
	}

}
