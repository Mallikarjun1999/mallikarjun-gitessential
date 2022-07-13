package com.XYRAM.Crud_Operation.service;

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import com.XYRAM.Crud_Operation.entity.Student;



public interface StudentService {
	

	public Student createStudent(Student studnt) ;

	public List<Student> getAllStudent() throws NotFoundException;
	String deleteStd(String id);

	public Student updateStudent(String id, Student student);
}




