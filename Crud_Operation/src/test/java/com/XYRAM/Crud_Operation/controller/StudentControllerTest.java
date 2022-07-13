package com.XYRAM.Crud_Operation.controller;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.XYRAM.Crud_Operation.entity.Student;


@SpringBootTest
class StudentControllerTest {
	
	
	@Autowired
	private StudentController studentController;
	@Test
	void testCreateStudent() 
	{
		Student studentObj = new Student();
		
		
		studentObj.setAmount(5345);
		 
		studentObj.setCatageory("jkjj");
		studentObj.setId("65");
		  
		  //System.out.println(departmentObj.getName());
		Student studnt=null;
		  
		  try
		  {
			  
		
			  studnt = studentController.addStudent(studentObj);
			  
		  }
			catch(Exception e)
		     {
				e.printStackTrace();
		     }
		  
		  
		  
	}
	
	@Test 
	 void testgetAllStudent() {
		List<Student> studnt=null;
		 try {
			 
	  
			 studnt = studentController.getAllStudent();
	 assertThat( studentController.getAllStudent()).isNotNull();
	  } catch (Exception e)
	 {
		  e.printStackTrace();
	  
	  }
}
	
	@Test 
	 void testdeleteStd() {	
		
		studentController.deleteStudent("76");
		
	}
	@Test 
	 void updateStudent() {	
		
		Student studentObj = new Student();
		
		studentObj.setAmount(34);
		studentObj.setCatageory("Mallu");
		studentObj.setId("329");
		studentController.updateStudent("65", studentObj);
	}
	
	
	
	
	
}
