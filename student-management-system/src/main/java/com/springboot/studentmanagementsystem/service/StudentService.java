package com.springboot.studentmanagementsystem.service;

import java.util.List;

import com.springboot.studentmanagementsystem.entity.Student;

import com.springboot.studentmanagementsystem.entity.*;
public interface StudentService {
	List<Student> getAllStudents();

	Student saveStudent(Student student);

	Student getStudentById(Long id);
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
	
	


	
	
}
