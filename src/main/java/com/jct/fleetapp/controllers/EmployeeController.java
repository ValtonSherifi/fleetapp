package com.jct.fleetapp.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jct.fleetapp.models.Employee;
import com.jct.fleetapp.services.CountryService;
import com.jct.fleetapp.services.EmployeeService;
import com.jct.fleetapp.services.EmployeeTypeService;
import com.jct.fleetapp.services.JobTitleService;
import com.jct.fleetapp.services.StateService;

@Controller
public class EmployeeController {


	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private JobTitleService jobTitleService;
	
	@Autowired
	private EmployeeTypeService employeeTypeService;
	
	@Autowired
	private StateService stateService;
	
	@Autowired
	private CountryService countryService;
	
	
	@GetMapping("/employees")
	public String getAllEmployees(Model model) {
		
		model.addAttribute("employees", employeeService.getEmployees());
		
		model.addAttribute("jobTitles", jobTitleService.getJobTitles());
		
		model.addAttribute("employeeTypes", employeeTypeService.getEmployeeTypes());
		
		model.addAttribute("states",stateService.getStates());
		
		model.addAttribute("countries",countryService.getCountries());
		
		return "employee";
		
	}
	
	@PostMapping("/employees/addNew")
	public String addNew(Employee employee) {
		
		employeeService.save(employee);
		
		return "redirect:/employees";
	}
	
	@RequestMapping(value = "employees/findById")
	@ResponseBody
	public Optional<Employee> findById(int id) {
		
		return employeeService.findById(id);
	}
	
	@RequestMapping(value = "/employees/update", method = {RequestMethod.PUT,RequestMethod.GET})
	public String update(Employee employee) {
		
		employeeService.save(employee);
		
		return "redirect:/employees";
	}
	
	@RequestMapping(value = "/employees/delete",method = {RequestMethod.DELETE,RequestMethod.GET})
	public String delete(int id) {
		employeeService.delete(id);
		
		return "redirect:/employees";
	}
	
	@RequestMapping(value = "/employees/assignUsername")
	public String assignUsername(int id) {
		employeeService.assignUsername(id);
		
		return "redirect:/employees";
	}
	
	
}
