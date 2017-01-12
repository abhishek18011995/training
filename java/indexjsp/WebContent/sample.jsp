<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sample</title>
</head>
<%! 
int count=0;
void incrementcount()
{
	count++;
}
%>
<body>
<h1>Sample Page</h1>
<h2>
<%
int localvariable=0;
out.print("this page is viewed"+count+"times+");
incrementcount();
%>

</h2>
the value of the local variable is 
<%=localvariable%>
<%localvariable++; %>
</body>
</html>