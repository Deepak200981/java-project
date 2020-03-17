package com.example.test.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.connector.Response;

public class StudentRegistration {
	private List<Student> studentRecords;
	private static StudentRegistration stdregd = null;
	

	public List<Student> StudentRegistration() {
		Student st1 = new Student();
		Student st2 = new Student(); 
	List li = new ArrayList<Student>();

		st2.setReg_num("A123");
		st2.setName("John");
		st2.set_class_name("10th");
		st2.setAddress("Bangalore");
		st2.setAge(15);
		st2.setBoard("CBSE");
		st2.setDob("10-Feb-1998");
		st2.setGrade_score('A');
		st2.setMedium("English & Kannada");
		st2.setPh_num(1313521452);
		st2.setProfile(new Profile("gfhgh", "dtgfgtf"));
		
		st1.setReg_num("A324");
		st1.setName("Teresa");
		st1.set_class_name("11th");
		st1.setAddress("Chennai");
		st1.setAge(16);
		st1.setBoard("ICSE");
		st1.setDob("03-Apr-1999");
		st1.setGrade_score('B');
		st1.setMedium("English & Tamil");
		st1.setPh_num(2131111157);
		st1.setProfile(new Profile("gfhgh", "dtgfgtf"));
		li.add(st1);
//		return st1, st2;
		System.out.println(li.add(st1));
		return li;
	}
	
	
	public static StudentRegistration getInstance() {
		if(stdregd == null) {
			stdregd = new StudentRegistration();
			return stdregd;
		} else {
			return stdregd;
		}
	}
	
	public void add(Student std) {
		studentRecords.add(std);
	}
	
	public List<Student> getStudentRecord() {
		return studentRecords;
	}
}
