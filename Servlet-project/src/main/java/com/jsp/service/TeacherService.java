package com.jsp.service;

import java.util.List;

import com.jsp.dao.StudentDao;
import com.jsp.dao.TeacherDao;
import com.jsp.dto.Student;
import com.jsp.dto.Teacher;

public class TeacherService {

	public Teacher saveTeacher(Teacher teacher) {
		TeacherDao teacherDao = new TeacherDao();
		return teacherDao.saveTeacher(teacher);
	}
	public Teacher getTeacherById(int id) {
		TeacherDao teacherDao = new TeacherDao();
		return teacherDao.getTeacher(id);
	}
	public List<Teacher> getAllTeacher() {
		TeacherDao teacherDao = new TeacherDao();
		return teacherDao.getAllTeachers();
	}
	public Teacher deleteTeacher(int id) {
		TeacherDao teacherDao = new TeacherDao();
		return teacherDao.deleteTeacher(id);
	}
	public Teacher updateTeacher(int id,String cno) {
		TeacherDao teacherDao = new TeacherDao();
		return teacherDao.updateTeacherCno(id, cno);
	}
	
}
