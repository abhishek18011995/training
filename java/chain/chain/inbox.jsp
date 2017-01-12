<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>inbox</title>
</head>
<body>
<%
if(session.getAttribute("user")!=null){
		String name=(String)session.getAttribute("user");
		out.println("Welcome "+name);
}else{
	
	response.sendRedirect("form.jsp");
}
		
		
		%>


<a href="logout.jsp" >logout</a>

</body>
</html>