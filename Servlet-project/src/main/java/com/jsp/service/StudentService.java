package com.jsp.service;

import java.util.List;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;


public class StudentService {

	public Student saveStudent(Student student) {
		StudentDao studentDao = new StudentDao();
		return studentDao.saveStudent(student);
	}
	public Student getStudentById(int id) {
		StudentDao studentDao = new StudentDao();
		return studentDao.getStudentById(id);
	}
	public List<Student> getAllStudent() {
		StudentDao studentDao = new StudentDao();
		return studentDao.getAllStudent();
	}
	public Student deleteStudent(int id) {
		StudentDao studentDao = new StudentDao();
		return studentDao.deleteStudentById(id);
	}
	public Student updateStudent(int id,String dob) {
		StudentDao studentDao = new StudentDao();
		return studentDao.updateStudentDobById(id, dob);
	}
	
}
