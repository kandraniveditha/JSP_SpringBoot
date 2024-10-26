package com.suchiit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	Cookie[] ck=request.getCookies();
	
	PrintWriter pw=response.getWriter();
	for(int i=0;i<ck.length;++i) {
		pw.println(ck[i].getName()+"\t"+ck[i].getValue());
		//pw.println(ck[i].getValue());
	}
	String city=request.getParameter("city");
	String country=request.getParameter("country");

	pw.println(city+"\t"+country);
	
	}

}
