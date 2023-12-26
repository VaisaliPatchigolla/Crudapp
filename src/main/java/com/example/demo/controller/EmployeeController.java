package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	
	private EmployeeService employeeservice;
	@GetMapping("/get/employee")
	public List<Employee> getEmployees()
	{
		return employeeservice.getEmployees();
	}
	@GetMapping("/get/employee/{employeeId}")
	public Employee getEmployees(@PathVariable Integer employeeId)
	{
		return employeeservice.getEmployees(employeeId); 
	}
	@PostMapping("/save/employee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeservice.saveEmployee(employee);
	}
	@DeleteMapping("/delete/employee/{employeeId}")
	public void deleteEmployee(@PathVariable Integer employeeId)
	{
		employeeservice.deleteEmployee(employeeId);
	}
	@PutMapping("/update/employee")
	public Employee updateEmployee(@RequestBody Employee employee)
	{
		return employeeservice.updateEmployee(employee);
	}
}
