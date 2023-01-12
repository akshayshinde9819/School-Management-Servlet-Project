package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Teacher;

import com.jsp.service.TeacherService;

@WebServlet("/getTeacher")
public class TeacherGetController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));

		TeacherService teacherService = new TeacherService();
		Teacher teacher = teacherService.getTeacherById(id);

		PrintWriter printWriter = resp.getWriter();
		printWriter.print("<html><body><h1>" +"Id : "+ teacher.getId()+"</html></body></h1>");
		printWriter.print("<html><body><h1>" +"Name : "+ teacher.getName()+"</html></body></h1>");
		printWriter.print("<html><body><h1>" +"Email : "+ teacher.getCno()+"</html></body></h1>");
		printWriter.print("<html><body><h1>" +"Job : "+ teacher.getSubject()+"</html></body></h1>");
	}
}