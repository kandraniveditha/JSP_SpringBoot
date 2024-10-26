package com.suchiit;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.suchiit.pojo.StudentEntity;

public class DeleteEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Session ses=SessionUtil.getSession();
Transaction tx=ses.beginTransaction();

StudentEntity st=new StudentEntity();
st.setSno(1);
st.setSname("kalp");
st.setSadd("Pvg");
//StudentEntity stu=(StudentEntity )ses.merge(st);
//System.out.println(st.getSno()+"\t"+ st.getSname()+"\t"+ st.getSadd());
//stu.setSadd("Pvg");
//tx.commit();

//ses.saveOrUpdate(st);
//tx.commit();

//ses.update(st);
//tx.commit();
	}

}
