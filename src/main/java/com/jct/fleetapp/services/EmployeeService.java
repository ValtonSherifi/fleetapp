package com.jct.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jct.fleetapp.models.Employee;
import com.jct.fleetapp.models.User;
import com.jct.fleetapp.repositories.EmployeeRepository;
import com.jct.fleetapp.repositories.UserRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private UserRepository userRepository;
	

	//find all employees
	public List<Employee> getEmployees(){
		
		return  employeeRepository.findAll();
	}
	
	//add an employee
	public void save(Employee employee) {
		
		employeeRepository.save(employee);
	}
	
	//find employee by id
	public Optional<Employee> findById(int id) {
		
		return employeeRepository.findById(id);
	}
	
	//update a particular employee
	public void update(Employee employee) {
		
		employeeRepository.save(employee);
	}
	
	//delete employee
	public void delete(int id) {
		
		employeeRepository.deleteById(id);
	}

	public Employee findByUsername(String un) {

		return employeeRepository.findByUsername(un);
	}
	
	public void assignUsername(int id) {
		Employee employee = employeeRepository.findById(id).orElse(null);
		User user = userRepository.findByFirstnameAndLastname(
				employee.getFirstname(),
				employee.getLastname());
		
		employee.setUsername(user.getUsername());
		employeeRepository.save(employee);
	}

}
