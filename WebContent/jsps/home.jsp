<%@page import="java.util.Date"%>
<%@ page import="com.app.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
        <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<pre>
	<h1><marquee>WELCOME TO SERVLET WEB MVC ModelAndView PROJECT</marquee>	</h1>
		<br>
EMP:: ${empData }<br>
List:: ${listData }<br>
		OR Use This
	<c:forEach items="${listData}" var="l">
	${l}.
		
	</c:forEach>
MAP:: ${mapData }<br>
		OR Use This
	<c:forEach items="${mapData}" var="m">
	${m.key}:${m.value},
		
	</c:forEach>
Array Length:: <c:out value="${fn:length(arrayData)}" /> <br>
<%-- 			<c:set var = "length" scope = "application" value= "${fn:length(arrayData)}"/>
	<c:forEach items="${arrayData}" begin="0" end="3" var="i">
		<c:out value="${arrayData[i]}"/>
	</c:forEach> --%>
New:::
${arrayData[0]}
${arrayData[1]}
${arrayData[2]}
<br>

</pre>
</body>
</html>
