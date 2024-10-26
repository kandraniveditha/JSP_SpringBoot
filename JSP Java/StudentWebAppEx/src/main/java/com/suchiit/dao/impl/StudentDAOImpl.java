package com.suchiit.dao.impl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.suchiit.config.ConnectionManager;
import com.suchiit.dao.StudentDAO;
import com.suchiit.model.Student;
import com.suchiit.query.QueryConstants;

public class StudentDAOImpl implements StudentDAO {

	public boolean registerStudent(Student student) {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement ps=null;
		boolean flag=false;
		
		try {
		con=	ConnectionManager.getConnection();
		ps=con.prepareStatement(QueryConstants.INSERT_QUERY);
		ps.setInt(1, student.getSno());
		ps.setString(2,student.getSname());
		ps.setString(3, student.getSadd());
		int count=ps.executeUpdate();
		if(count!=0)
		flag=true;
		
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				ConnectionManager.closeConnection(con, ps);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return flag;
	}

}
