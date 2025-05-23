package com.bridgelabz.employeepayrollapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {
	
	@GetMapping("/")
	public String getEmployeePayrollData() {
		return "Welcome to Employee Payroll App";
	}
	
	@GetMapping("/get/{id}")
	public String getEmployeeById(@PathVariable("id") int id) {
		return "Getting employee data for ID: "+ id;
	}
	
	@PostMapping("/create")
	public String createEmployee(@RequestBody String employee) {
		return "Creating employee: "+ employee;
	}
	
	@PutMapping("/update")
	public String updateEmployee(@RequestBody String employee) {
		return "Updating employee: "+ employee;
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable("id") int id) {
		return "Deleting employee with ID: "+ id;
	}
}
