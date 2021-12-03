package com.springboot.studentmanagementsystem.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.studentmanagementsystem.entity.Student;
import com.springboot.studentmanagementsystem.repository.StudentRepository;
import com.springboot.studentmanagementsystem.service.StudentService;



@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository StudentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.StudentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return StudentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return StudentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub
		return StudentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return StudentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		// TODO Auto-generated method stub
		StudentRepository.deleteById(id);
		
	}
	

	



	
}
