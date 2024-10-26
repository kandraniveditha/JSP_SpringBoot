package com.suchiit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.suchiit.dao.impl.StudentDAOImpl;
import com.suchiit.model.Student;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	
public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
	int sno=Integer.parseInt(req.getParameter("sno"));
	String sname=req.getParameter("sname");
	String sadd=req.getParameter("sadd");
	Student stu=new Student(sno,sname,sadd);
	StudentDAOImpl daoImpl=new StudentDAOImpl();
	boolean flag=daoImpl.registerStudent(stu);
	res.setContentType("text/html");
	
	PrintWriter pw=res.getWriter();
	if(flag) {
		pw.println("Student Registeration Sucessfully");
		pw.println("a href=student.html>Home</a>");
	}
	else
	{
		pw.println("Student Registeration Not Sucessfully");
		pw.println("a href=student.html>Home</a>");
	}
}
}
