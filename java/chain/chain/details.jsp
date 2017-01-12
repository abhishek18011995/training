<%@page import="com.chain.cts.RegBean"%>
<%@ page isELIgnored="false" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<jsp:include page="header.html"></jsp:include>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr><td>Name </td><td><%=request.getAttribute("name") %></td><td>${requestScope.name }</td></tr>
<tr><td>password</td><td><%=request.getAttribute("pwd") %></td><td>${applicationscope.pwd} </td></tr>
<tr><td>sub</td><td><%=request.getAttribute("sub") %></td><td>${sub }</td></tr>
<tr><td>mobiles</td>
<%= request.getAttribute("mobiles").toString() %><td></td><td></td></tr>
<tr><td>gender</td><td><%=request.getAttribute("gender") %></td><td>${ gender}</td></tr>
<tr><td>country1</td><td><%=request.getAttribute("country1") %></td><td>${country1 }</td></tr>
<tr><td>country2</td><td><%=request.getAttribute("country2") %></td><td>${country2 }</td></tr>
<tr><td>country3</td><td><%=request.getAttribute("country3") %></td><td>${country3 }</td></tr>


</table>



<table border="1">
<tr><td>Name </td><td><% RegBean rreg=(RegBean) request.getAttribute("reg"); %><%=rreg.getName() %></td><td>${requestScope.name }</td></tr>
<tr><td>password</td><td><%=rreg.getPwd() %></td><td>${applicationscope.pwd} </td></tr>
<tr><td>sub</td><td><%=rreg.getSub() %></td><td>${sub }</td></tr>
<tr><td>mobiles</td>
<td></td><td><%=rreg.getMobiles() %></td></tr>
<tr><td>gender</td><td><%=rreg.getGender() %></td><td>${ gender}</td></tr>
<tr><td>country1</td><td><%=rreg.getCountry1() %></td><td>${country1 }</td></tr>
<tr><td>country2</td><td><%=rreg.getCountry2() %></td><td>${country2 }</td></tr>
<tr><td>country3</td><td><%=rreg.getCountry3() %></td><td>${country3 }</td></tr>


</table>

<jsp:useBean id="r" class=com.chain.cts.RegBean scope="request">
</jsp:useBean>









<jsp:include page="footer.html"></jsp:include>

</body>
</html>