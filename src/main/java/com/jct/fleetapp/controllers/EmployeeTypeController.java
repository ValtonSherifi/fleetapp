package com.jct.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeTypeController {

	@GetMapping("/employeestype")
	public String getEmployeesType() {
		return "employeetype";
	}
}
