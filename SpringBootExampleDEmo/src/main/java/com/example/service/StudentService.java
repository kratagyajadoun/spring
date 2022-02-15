package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.StudentDao;
import com.example.model.Student;

@Service
public class StudentService {
	
	@Autowired
	StudentDao student_dao;
	public int saveStudent(Student student)
	{
		return student_dao.saveStudent(student);
	}
}
