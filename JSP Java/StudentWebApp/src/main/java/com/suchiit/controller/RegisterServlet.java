package com.suchiit.controller;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	
public void doGet(HttpServletRequest req,HttpServletResponse res) {
	int sno=Integer.parseInt(req.getParameter("sno"));
	String sname=req.getParameter("sname");
	String sadd=req.getParameter("sadd");
	res.setContentType("text/html");
	
	PrintWriter pw=null;
	try {
		pw=res.getWriter();
		pw.println("<table>");
		pw.println("<tr><th>SNO</th> <th>SNAME</th> <th>SADD</th></tr>");
		
		pw.println("<tr><td>"+sno+"</td><td>"+sname+"</td><td>"+sadd+"</td></tr></table>");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
