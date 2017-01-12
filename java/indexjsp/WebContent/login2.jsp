<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<%
String name=request.getParameter("username");
String password=request.getParameter("password");

String submit=request.getParameter("sub");
if(submit!=null)
{
	if(name.equals("abhi") && password.equals("abhi123"))
	{session.setAttribute("abcd",name);
	
response.sendRedirect("welcome.jsp");		
	}
	else{
		out.print("password or username is incorrect");
	}
}

%>
<body>
<form method="post">
Username:
<input type="text" name="username" value="enter username">
<br>
Password:
<input type="text" name="password" value="enter password">
<br>
<input type="submit" name="sub" value="login">
</form>
</body>
</html>