package com.suchiit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.suchiit.pojo.CourseEntity;

public class C_RetriveClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create Configuration object
		Configuration cfg=new Configuration();
		System.out.println(cfg.getProperty("hibernate.connection.driver_class"));
		cfg.configure("\\com\\suchiit\\config\\hibernate.cfg.xml");
		System.out.println(cfg.getProperty("hibernate.connection.driver_class"));
		
		//step 2:Build Srssionfactory
		SessionFactory factory=cfg.buildSessionFactory();
		
		//Step 3:Create Session Object
		Session ses=factory.openSession();
		
		Transaction tx=ses.beginTransaction();
		
		//Step 4:Persistence Operations
		CourseEntity cou=ses.get(CourseEntity.class,10);
		if(cou!=null)
			System.out.println(cou.getCid() +"\t"+ cou.getCname() +"\t"+ cou.getCduration() +"\t"+ cou.getCfee());
		
		

	}

}
