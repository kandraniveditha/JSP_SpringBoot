package com.suchiit;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.suchiit.entity.EmployeeEntity;
import com.suchiit.utility.SessionUtility;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    Session ses=SessionUtility.getSession();
    EmployeeEntity emp=new EmployeeEntity();
   
    emp.setFirstName("chowdary");
    emp.setLastNanme("niveditha");
    emp.setEmail("kandraniveditha@gmail.com");
    ses.save(emp);
    Transaction tx=ses.beginTransaction();
    tx.commit();
    }
}
