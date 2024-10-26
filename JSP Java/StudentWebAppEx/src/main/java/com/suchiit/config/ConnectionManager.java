package com.suchiit.config;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.xdevapi.PreparableStatement;

public class ConnectionManager {
public static Connection getConnection()throws SQLException, FileNotFoundException, IOException, ClassNotFoundException{
		Properties pro=new Properties();
		pro.load(new FileInputStream("C://Users//kandr//eclipse-workspace//StudentWebAppEx//src//main//java//com//suchiit//props//app.properties"));
		//step 1:Register driver
		//DriverManager.registerDriver(pro.get("driverClass"));
		String dclass=(String)pro.get("driverClass");
Class.forName(dclass);
	
//step 2:Establish Connection with database software
		Connection con=DriverManager.getConnection(pro.getProperty("driverUrl"),"root","N#4369@qlph");
		return con;
	}
	public static void closeConnection(Connection con,Statement st)throws SQLException{
		if(st!=null)
			st.close();
		if(con!=null)
			con.close();
	}
	public static void closeConnection(Connection con,PreparedStatement ps)throws SQLException
	{
		if(ps!=null)
			ps.close();
		if(con!=null)
			con.close();
	}
	public static void closeConnection1(Connection con,Statement st,ResultSet rs)throws SQLException{
		if(rs!=null)
			rs.close();
		if(st!=null)
			st.close();
		if(con!=null)
			con.close();
	}
	public static void closeConnection(Connection con,Statement st,ResultSet rs)throws SQLException{
		if(rs!=null)
			rs.close();
		if(st!=null)
			st.close();
		if(con!=null)
			con.close();
	}
	
}
