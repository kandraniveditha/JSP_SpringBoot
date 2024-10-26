<%@ taglib prefix ="c"  uri ="http://java.sun.com/jsp/jstl/core"  %>
<%@ page isELIgnored="false" %>

<html>
<body>
<h2>Hello World!</h2>

<c:import var="test" url="http://www.gmail.com"/>
<c:out value="${'Welcome to JSTL' }" />

<c:forEach var="j" begin="1" end="3">
<c:out value="${j}"/>
</c:forEach>

<c:set var="s" scope="session" value=${2000*4 }"/>

<c:if test="${s>4000 }">
<h1> My Calculate value :<c:out value="${s }"></c:out></h1>
</c:if>
</body>
</html>
