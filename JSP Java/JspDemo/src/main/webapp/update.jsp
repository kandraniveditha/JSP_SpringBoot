<%@page import="com.suchiit.config.*" %>
<%@page import="java.sql.*" %>

<%!
Connection con=null;
PreparedStatement ps=null;
ResultSet rs=null;

%>

<%
con=ConnectionManager.getConnection();
ps=con.prepareStatement("Select *from Student where sno=?");
ps.setInt(1, sno);
ResultSet rs=ps.executeQuery();
while(rs.next())
	
	sno=rs.getInt(1);
	sname=rs.getString(2);
	sadd=rs.getString(3);


%>
