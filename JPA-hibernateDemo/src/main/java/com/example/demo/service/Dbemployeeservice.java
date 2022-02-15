package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class Dbemployeeservice implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getEmployees()
	{
		return (List<Employee>)employeeRepository.findAll();
	}
	
	@Override
	public Employee addEmployee(Employee employee)
	{
		return employeeRepository.save(employee);
	}
	
	@Override
	public void deleteEmployee(int id)
	{
		 employeeRepository.deleteById(id);
	}
}
