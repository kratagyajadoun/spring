package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;

@Service
public interface EmployeeService {

	List<Employee> getEmployees();
	
	Employee addEmployee(Employee employee);
	
	void deleteEmployee(int id);
}
