package com.suciit.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LifeCycleServlet extends GenericServlet {
public void init(ServletConfig config) {
	System.out.println("Init Method");
}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
System.out.println("Service Methods");

	}
	public void destroy() {
		System.out.println("Destroy Method");
		
	}

}
