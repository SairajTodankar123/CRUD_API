package com.Jspiders.CRUDAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Jspiders.CRUDAPI.bean.Student;
import com.Jspiders.CRUDAPI.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/students")
	public List<Student> getAllStudents(){
	
		return studentService.getAllStudents();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/students")
	public void addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/students/{id}")
	public void updateStudent(@PathVariable int id, @RequestBody Student student) {
		studentService.updateStudent(id, student);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/students/{id}")
	public void deleteStudent(@PathVariable int id) {
		
		studentService.deleteStudent(id);
	}
	
	
}

