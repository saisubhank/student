package com.springboot.studentmanagementsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.springboot.studentmanagementsystem.entity.Student;
import com.springboot.studentmanagementsystem.repository.StudentRepository;

@SpringBootApplication
//@ComponentScan(basePackages="com.springboot.studentmanagementsystem.controller")
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	@Autowired
    private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		/*Student student1 = new Student("sai","subhank","subhank@gmail.com");
		studentRepository.save(student1);
		
		Student student2 = new Student("ramesh","khan","ramesh@gmail.com");
		studentRepository.save(student2);
		
		Student student3 = new Student("suresh","yadav","suresh@gmail.com");
		studentRepository.save(student3);
		*/
		
	}

}
