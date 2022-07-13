package com.XYRAM.Crud_Operation.service;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import com.XYRAM.Crud_Operation.Repository.StudentRepository;
import com.XYRAM.Crud_Operation.entity.Student;
@SpringBootTest
class StudentServiceTest {	
	
	/**
     * Create a mock implementation of the studentService
     */
	@Mock
	StudentService studentService;
	
	/**
     * Create a mock implementation of the StudentRepository
     */
	@Mock
	private StudentRepository  Studentrepo;
	@Test
	void TestaddStudent() {
        Student studentObj = new Student();
		
		
		studentObj.setAmount(5345);
		 
		studentObj.setCatageory("jkjj");
		studentObj.setId("476");
		
		
		
		
		Mockito.when(Studentrepo.save(studentObj)).thenReturn(studentObj);
		assertThat(studentService.createStudent(studentObj));
		
		
	}
	@Test
	void TestgetAllStudent() {
        Student studentObj = new Student();
		
        Mockito.when(Studentrepo.save(studentObj)).thenReturn(studentObj);
		try {
			assertThat(studentService.getAllStudent());
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	}
	@Test
	void TestdeleteStudent() {
       
			 Mockito.when(studentService.deleteStd("65")).thenReturn("student");
		
	}
	
	@Test
	void TestupdateStudent() {
        Student studentObj = new Student();
        studentObj.setAmount(5345);
		 
		studentObj.setCatageory("jkjj");
		studentObj.setId("476");
		Mockito.when(studentService.updateStudent("56", studentObj)).thenReturn(studentObj);
        
	}
	
	
	
}
