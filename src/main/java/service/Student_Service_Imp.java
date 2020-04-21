package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dao.Student_DAO;
import model.Student;

public class Student_Service_Imp implements Student_Service{

	
	@Autowired  
    private Student_DAO studentdao;  
	
	@Override
	public boolean saveStudent(Student student) {
		return studentdao.saveStudent(student);
	}

	@Override
	public List<Student> getStudents() {
		 return studentdao.getStudents();  
	}

	@Override
	public boolean deleteStudent(Student student) {
		return studentdao.deleteStudent(student);  
	}

	@Override
	public List<Student> getStudentByID(Student student) {
		return studentdao.getStudentByID(student);
	}

	@Override
	public boolean updateStudent(Student student) {
		 return studentdao.updateStudent(student); 
	}

}
