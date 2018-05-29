package com.exercise.tealeaves.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DepartmentConroller {

	
	@GetMapping("/department")
	public String depatmentHome(){
		return "departmentHome";
	}
}
