package com.XYRAM.Crud_Operation.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.XYRAM.Crud_Operation.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String>{

	
	//Entity Class Name:Student
	
	@Query("select s from Student s")
	List<Student> getAllStudent();

}
