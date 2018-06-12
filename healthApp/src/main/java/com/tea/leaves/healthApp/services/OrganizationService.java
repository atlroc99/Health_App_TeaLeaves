package com.tea.leaves.healthApp.services;

import java.util.List;

import com.tea.leaves.healthApp.documents.Organization;

public interface OrganizationService {

	Organization addNewOrganization(Organization organization);

	Organization updateOrganization(Organization organization);

	List<Organization> getAllOrganization();

	Organization getOrganizationById(Integer id);

	void deleteOrganization(Integer id);
}
