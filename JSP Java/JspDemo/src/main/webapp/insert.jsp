<%@page import="com.suchiit.config.*" %>
<%@page import="java.sql.*" %>

<%!
Connection con=null;
PreparedStatement ps=null;
%>

<%
con=ConnectionManager.getConnection();
ps=con.prepareStatement("insert into student values(?,?,?)");
%>
<%
int sno=Integer.parseInt(request.getParameter("sno"));
String sname=request.getParameter("sname");
String sadd=request.getParameter("sadd");

ps.setInt(1, sno);
ps.setString(2, sname);
ps.setString(3, sadd);
int count=ps.executeUpdate();
if(count!=0){
	out.println("Data Inserted Success Fully");
}
else{
	out.println("Data Inserted Not Success Fully");	
}
%>