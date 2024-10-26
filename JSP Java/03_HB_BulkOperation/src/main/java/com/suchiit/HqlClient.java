package com.suchiit;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.suchiit.entity.EmployeeEntity;
import com.suchiit.utility.SessionUtility;


public class HqlClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session ses=SessionUtility.getSession();
	    Transaction tx=ses.beginTransaction();
		//Query query=ses.createQuery("from EmployeeEntity");
		//List<EmployeeEntity>addEmployees=query.getResultList();
		//addEmployees.stream()
//.forEach(emp->System.out.println(emp.getEno()+"\t" +emp.getFirstName()+"\t"+ emp.getLastNanme()+"\t" +emp.getEmail()));
	
		//Query query=ses.createQuery("from EmployeeEntity where eno<4");
		//List<EmployeeEntity>addEmployees=query.getResultList();
		//addEmployees.stream()
		//.forEach(emp->System.out.println(emp.getEno()+"\t" +emp.getFirstName()+"\t"+ emp.getLastNanme()+"\t" +emp.getEmail()));
	
	//	Query query=ses.createQuery("select firstname,lastNanme from EmployeeEntity");
	//	List <Object[]>addEmployees=query.getResultList();
//	for(Object obj[] :addEmployees) {
	//	System.out.println(obj[0]+" "+obj[1]);
		
	//	Query query=ses.createQuery("select firstname from EmployeeEntity");
		//List <String>addEmployees=query.getResultList();
	//for(String str :addEmployees) {
	//	System.out.println(str);	
		
	//	Query query=ses.createQuery("select firstname from EmployeeEntity where eno=:no");
		//query.setParameter("no", 4);
		//List <String>addEmployees=query.getResultList();
	//for(String str :addEmployees) {
		//System.out.println(str);
		
		
		//Query query=ses.createQuery("update EmployeeEntity set firstName=:name,lastNanme=:name");
		//query.setParameter(1,"nive");
		//query.setParameter(2,"kandra");
		//int count=query.executeUpdate();
		//if(count!=0)
			//System.out.println("Data is Updated");
		//else
		//	System.out.println("Data is not updated");
		//tx.commit();
	    
	   // Query query=ses.createQuery("delete from EmployeeEntity where eno=:no");
		//query.setParameter("no",4);
		
	//	int count=query.executeUpdate();
		//if(count!=0)
			//System.out.println("deleted data is Updated");
		//else
			//System.out.println("deleted Data is not updated");
		//tx.commit();
	    
	    Query query=ses.getNamedQuery("find.all");
	    List<EmployeeEntity>addEmployees=query.getResultList();
	    for(EmployeeEntity emp:addEmployees) {
	    	System.out.println(emp.getEno()+"\t"+ emp.getFirstName()+"\t"+ emp.getLastNanme()+"\t"+ emp.getEmail());
	    }
	}
	
}
