<html>
<body>
<h2>JSP Examples</h2>
<!-- Declarative tag -->>
<%!
int fno;
int sno;
int add(int fno,int sno)
{
	int result=fno+sno;
	return result;
	
}
%>

<!-- Scriplet Tag-->
<%
 fno=100;
 sno=200;
int result=add(fno,sno);
out.println("Addition of two numbers: "+result+"<br>");
%>

<!-- Expression tag -->
<%=add(400,200)

%>
</body>
</html>
