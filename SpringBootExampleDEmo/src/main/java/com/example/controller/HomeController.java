package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.service.StudentService;

@RestController
public class HomeController {
	
	@Autowired
	StudentService student_service;
	@GetMapping("/hello")
	public String sayHello() {
		return "hello";
	}
	
	@PostMapping("/student")
	public int saveStudent(@RequestBody Student student)
	{
		return student_service.saveStudent(student); 
	}
}



