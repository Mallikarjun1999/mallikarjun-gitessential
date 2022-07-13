package com.XYRAM.Crud_Operation.ServiceImpl;
	import java.util.List;

	import javax.transaction.Transactional;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

	import org.springframework.stereotype.Service;


	import com.XYRAM.Crud_Operation.Repository.StudentRepository;
	import com.XYRAM.Crud_Operation.entity.Student;
	import com.XYRAM.Crud_Operation.service.StudentService;


	@Service
	@Transactional
	public  class StudentServiceImpl implements StudentService{		
			@Autowired
			private StudentRepository Studentrepo;

			@Override
			public Student createStudent(Student studnt) {
				if(studnt != null) {
					Studentrepo.save(studnt);
				}
				return studnt;
			}

		
			@Override
			public List<Student> getAllStudent() throws NotFoundException {
			List<Student> studnt = (List<Student>) Studentrepo.getAllStudent();
			if(studnt  != null)
			{
				return studnt;
			}
			else
			{
				throw new NotFoundException();
			}
			}
			
			
			@Override
			public String deleteStd(String Id) {
				// TODO Auto-generated method stub
				
				@SuppressWarnings("deprecation")
				Student stdObj =Studentrepo.getById(Id);
				if(stdObj != null) {
					Studentrepo.delete(stdObj);
				}
				return "Student deleted successfully";
			}

			@Override
			public Student updateStudent(String Id,Student student) {
				// TODO Auto-generated method stub
				Student stdObj = Studentrepo.getById(Id);
				if(stdObj != null) {
					stdObj.setAmount(student.getAmount());
					stdObj.setCatageory(student.getCatageory());
					Studentrepo.save(stdObj);
				}
				return student;
			}

		
			
			

	}



