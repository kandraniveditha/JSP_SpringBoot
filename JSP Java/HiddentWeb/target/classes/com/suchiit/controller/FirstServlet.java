package com.suchiit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
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
		String fanme=request.getParameter("fname");
		String lname=request.getParameter("lname");
		ctx.setAttribute("fname",fname);
		ctx.setAttribute("lname",lname);
		//request.setAttribute("fname",fname);
		//request.setAttribute("lname",lname);
		PrintWriter pw=response.getWriter();
		RequestDispatcher rd=request.getRequestDispatcher("/secondServlet");
		rd.forward(request, response);
	
	}


}
