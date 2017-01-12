<%@page errorPage="errorpage.jsp" import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<%@ include file="header.html" %>

<body>

<h1>Welcome to </h1>
<%=request.getParameter("uname") %>
<%if(request.getParameter("uname")==null || request.getParameter("uname").isEmpty()){
	
	throw new Exception("Please provide the name");
	
} %>

<%=new Date() %>





<%@ include file="footer.html" %>

</body>


</html>