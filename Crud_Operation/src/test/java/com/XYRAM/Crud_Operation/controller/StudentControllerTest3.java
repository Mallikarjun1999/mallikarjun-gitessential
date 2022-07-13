package com.XYRAM.Crud_Operation.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import com.XYRAM.Crud_Operation.entity.Student;
import com.XYRAM.Crud_Operation.service.StudentService;



@SpringBootTest
class StudentControllerTest3 {

		/**
	     * Create a mock implementation of the studentService
	     */
		@Mock
		StudentController studentController;
		
		/**
	     * Create a mock implementation of the StudentRepository
	     */
		@Mock
		private StudentService  studentService;
		@Test
		void TestaddStudent() {
	        Student studentObj = new Student();
			
			
			studentObj.setAmount(5345);
			 
			studentObj.setCatageory("jkjj");
			studentObj.setId("4006");
			
			
			
			
			Mockito.when(studentService.createStudent(studentObj)).thenReturn(studentObj);
			assertThat(studentController.addStudent(studentObj));
			
//			Mockito.when(studentController.addStudent(studentObj)).thenReturn(studentObj);
//			try {
//				assertThat(studentService.getAllStudent()).isNotNull();
//			} catch (NotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
			
			
			
		}
}
