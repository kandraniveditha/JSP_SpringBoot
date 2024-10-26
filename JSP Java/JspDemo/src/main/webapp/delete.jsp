<%@page import="com.suchiit.config.*" %>
<%@page import="java.sql.*"; %>

<%!
Connection con=null;
PreparedStatement ps=null;
%>

<% 
	
	ps=con.prepareStatement("delete from student where is=?");
	ps.setInt(1, sno);
	ps.executeUpdate();

	con.close();
%>

