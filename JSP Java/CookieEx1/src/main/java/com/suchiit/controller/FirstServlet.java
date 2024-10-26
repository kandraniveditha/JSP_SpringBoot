package com.suchiit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	String fname=request.getParameter("fname");
	String lname=request.getParameter("lname");
	response.setContentType("text/html");
	Cookie ck=new Cookie("fname",fname);
	Cookie ck1=new Cookie("lname",lname);
	response.addCookie(ck);
	response.addCookie(ck1);
	ck1.setMaxAge(3000);
	//ck.setMaxAge(0);
	PrintWriter pw=response.getWriter();
	pw.println("<form action=SecondServlet>");
	pw.println("<input type=text name='city' placeholder='EnterCityName'>");
	pw.println("<input type=text name='country' placeholder='EnterCountryName'>");
	pw.println("<input type=submit value='ClickME'>");
	pw.println("</form>");
	
	}

}
