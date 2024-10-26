package com.suchiit;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.suchiit.pojo.StudentEntity;

/**
 * Hello world!ion
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	//step 1: Create Configuration object
    	Configuration cfg=new Configuration();
        System.out.println( cfg.getProperty("hibernate.connection.driver_class") );
        cfg.configure("\\com\\suchiit\\config\\hibernate.cfg.xml");
        System.out.println(cfg.getProperty("hibernate.connection.driver_class"));
        
        //Step 2: Build SessionFactory
        SessionFactory factory=cfg.buildSessionFactory();
        
        //Step 3:Create Session object
        Session ses=factory.openSession();
        
        Transaction tx=ses.beginTransaction();
        
        //step 4:Presistence Operations
        StudentEntity stuEn=new StudentEntity();     //Transient state
        stuEn.setSno(25);
        stuEn.setSname("kandra");
        stuEn.setSadd("tmk");
        
       //Integer id=(Integer) ses.save(stuEn);      //presistence state
       //System.out.println("Generated Id:"+id);
        ses.persist(stuEn);
       tx.commit();
        System.out.println(ses.contains(stuEn)); //true
        ses.evict(stuEn);
        System.out.println(ses.contains(stuEn)); //false
        ses.close();
        factory.close();
        }
}
