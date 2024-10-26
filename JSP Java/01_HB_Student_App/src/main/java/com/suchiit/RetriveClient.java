package com.suchiit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.suchiit.pojo.StudentEntity;

public class RetriveClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Session ses=SessionUtil.getSession();
	Transaction tx=ses.beginTransaction();
		
		//step 1:Create Configuration object
//Configuration cfg=new Configuration();
//System.out.println(cfg.getProperty("hibernate.connection.driver_class"));
//cfg.configure("\\com\\suchiit\\config\\hibernate.cfg.xml");
//System.out.println(cfg.getProperty("hibernate.connection.driver_class"));

//step 2:Build SessionFactory
//SessionFactory factory=cfg.buildSessionFactory();

//step 3:Create Session object
//Session ses=factory.openSession();

//Transaction tx=ses.beginTransaction();

//step 4:Persistence operations
StudentEntity stu=ses.get(StudentEntity.class,10);
if(stu!=null)
	System.out.println(stu.getSno()+"\t"+stu.getSname()+"\t"+stu.getSadd());
try {
	Thread.sleep(10000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
stu.setSadd("pak");
tx.commit();
System.out.println(stu.getSno()+"\t"+stu.getSname()+"\t"+stu.getSadd());


//StudentEntity stu=ses.get(StudentEntity.class,10);
//if(stu!=null)
//	System.out.println(stu.getSno()+"\t"+stu.getSname()+"\t"+stu.getSadd());


//StudentEntity stuEnt=ses.load(StudentEntity.class, 22);
//System.out.println(stuEnt.getSno()+"\t"+stuEnt.getSname()+"\t"+stuEnt.getSadd());
	}

}
