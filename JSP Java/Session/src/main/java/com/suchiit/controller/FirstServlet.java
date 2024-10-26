package com.suchiit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
	HttpSession ses=request.getSession();
	ses.setAttribute("fname", fname);
    ses.setAttribute("lname", lname);


	PrintWriter pw=response.getWriter();
	pw.println("<form action=SecondServlet>");
	pw.println("<input type=text name='city' placeholder='Enter City Name'>");
	pw.println("<input type=text name='country' placeholder='Enter Country Name'>");
	pw.println("<input type=submit value'Clickeme'>");
	pw.println("</form>");
	}

}
