package com.suchiit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionUtil {

	public static Session getSession() { 
	//step 1: Create Configuration object
	Configuration cfg=new Configuration();
    System.out.println( cfg.getProperty("hibernate.connection.driver_class") );
    cfg.configure("\\com\\suchiit\\config\\hibernate.cfg.xml");
    System.out.println(cfg.getProperty("hibernate.connection.driver_class"));
    
    //Step 2: Build SessionFactory
    SessionFactory factory=cfg.buildSessionFactory();
    
    //Step 3:Create Session object
    Session ses=factory.openSession();
    return ses;
	
	}
	}

