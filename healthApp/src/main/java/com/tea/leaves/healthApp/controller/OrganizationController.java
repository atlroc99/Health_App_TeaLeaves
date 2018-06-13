package com.tea.leaves.healthApp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/")
public class OrganizationController {

	@Value("${org.name}")
	private String orgName = "ABC Organization";
	
	
	@GetMapping("/")
	public String getHome(Model model) {
		model.addAttribute("orgName", this.orgName);
//		return "index";
		return "welcome";
	}
	
	@GetMapping("/aboutpage")
	public String getAboutPage() {
		return "aboutus";
	}
	
	
	
	
	
}
