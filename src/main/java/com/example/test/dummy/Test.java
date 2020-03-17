package com.example.test.dummy;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.model.Student;
import com.example.test.model.StudentRegistration;

@RestController
public class Test {
	StudentRegistration s1; 
	
	@GetMapping("/list")
	public List<Student> getAll() {
		StudentRegistration si = new StudentRegistration();
		return si.StudentRegistration();
	}

}

