package com.XYRAM.Crud_Operation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.XYRAM.Crud_Operation.entity.Student;
import com.XYRAM.Crud_Operation.service.StudentService;

@RequestMapping("/Student")
@RestController
public class StudentController {	
	 @Autowired
		private StudentService studentservice;
		
	 
	  /*Post mapping:
	    param :Student studnt
	    method name : createStudent
	    return : Student
	   */
		@PostMapping("/addStudent")
		Student addStudent(@RequestBody  Student studnt) {
			studentservice.createStudent(studnt);
			return studentservice.createStudent(studnt);
			
		}
		
		/*Get Mapping;
	    method name : getAllStudent
	    return : Student
	   */
		
		@GetMapping("/getAllStudent")
		List<Student> getAllStudent() throws NotFoundException{
			return studentservice.getAllStudent();
		}
		
		/*Delete mapping:
	    param :String Id
	    method name : deleteStudent	   
	   */
		@DeleteMapping("/deleteStd/{Id}")
		String deleteStudent(@PathVariable String Id) {
			return studentservice.deleteStd(Id);
		}
		
		/*Put mapping:
	    param :Student student
	    method name : updateStudent
	    return : Student
	   */
		@PutMapping("/updateStd/{Id}")
		Student updateStudent(@PathVariable String Id, @RequestBody Student student) {
			return studentservice.updateStudent(Id,student);
		}	
	

}
