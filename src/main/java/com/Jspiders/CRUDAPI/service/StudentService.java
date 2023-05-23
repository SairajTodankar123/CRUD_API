package com.Jspiders.CRUDAPI.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Jspiders.CRUDAPI.bean.Student;
import com.Jspiders.CRUDAPI.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	public StudentRepository studentRepository;
	
	public List<Student> getAllStudents(){
		
		List<Student> students = new ArrayList<>();
		studentRepository.findAll().forEach(students::add);
		return students;
	}

	public void addStudent(Student student) {
		
		studentRepository.save(student);
		
	}

	public void updateStudent(int id, Student student) {
		
		studentRepository.save(student);
		
	}

	public void deleteStudent(int id) {
		
		studentRepository.deleteById(id);
		
	}
	
	
	
}
