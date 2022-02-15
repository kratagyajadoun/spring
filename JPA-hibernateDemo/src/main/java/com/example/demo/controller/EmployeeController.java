package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@CrossOrigin(value = "http://localhost:3000")
public class EmployeeController {

	@Autowired
	EmployeeService employeeservice;
	
	@GetMapping("/getEmployees")
	public List<Employee> getEmployees()
	{
		return employeeservice.getEmployees();
	}
	
	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee)
	{
		return employeeservice.addEmployee(employee);
	}
	
	@PostMapping("/deleteEmployee")
	public String deleteEmployee(@Param("id") int id)
	{
		 employeeservice.deleteEmployee(id);
		 return "success";
	}
}






