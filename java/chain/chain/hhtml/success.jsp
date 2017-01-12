<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<link rel="stylesheet" href="/chain/css/layout.css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div id="header">
<b>Welcome to the portal safe Document sharing<b>
		
</div>
<div id="content">
<%
if(session.getAttribute("user")!=null){
		String name=(String)session.getAttribute("user");
		out.println("Welcome "+name);
}else{
	
	response.sendRedirect("form.jsp");
}
		
		
		%>

<a href="inbox.jsp" >Inbox</a>
<a href="outbox.jsp" >outbox</a>
<a href="logout.jsp" >logout</a>

</div>




<div id="footer">
@copyright 2015 Documetn sharing Pvt LTD.
		

</div>
</body>
</html>