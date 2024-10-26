package com.suchiit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.suchiit.pojo.CourseEntity;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      //Step 1:Create Configuration object
    	Configuration cfg=new Configuration();
    	System.out.println(cfg.getProperty("hibernate.connection.driver_class"));
        cfg.configure("\\com\\suchiit\\config\\hibernate.cfg.xml");
     System.out.println(cfg.getProperty("hibernate.connection.driver_class"));
     
     //step 2:Build Session factory
     SessionFactory factory=cfg.buildSessionFactory();
     
     //step 3: Create session object
     Session ses=factory.openSession();
     
     Transaction tx=ses.beginTransaction();
     
     //step 4:persistence operations
     CourseEntity couEn=new CourseEntity();//transient state
     couEn.setCid(11);
     couEn.setCname("Java");
     couEn.setCduration("4months");
     couEn.setCfee("20000");
     
     ses.save(couEn); //persistence state
    tx.commit();
    System.out.println(ses.contains(couEn));
    ses.evict(couEn);
    System.out.println(ses.contains(couEn));
    ses.close();
    factory.close();
    }
}
