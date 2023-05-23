package com.Jspiders.CRUDAPI.repository;

import org.springframework.data.repository.CrudRepository;

import com.Jspiders.CRUDAPI.bean.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

	
}
