<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>
<%@page  import="java.io.IOException,java.util.Date"%>

<%@ page session="true" buffer="12kb" errorPage="/chain/hhtml/error.html" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- html commets -->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%application.setAttribute("admin","Admin@gmail.com"); %>

<%String s=application.getAttribute("admin").toString(); %>
<%=s %>
<%out.write("welcome to JSp"); %>

<%
Calendar c=Calendar.getInstance();
Date d= c.getTime();
SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
String dateformat=sdf.format(d);
int hour=c.get(Calendar.HOUR_OF_DAY);
if(hour<12){
	out.write("Good morning");
	
}else{
	
	out.write("Good Evening");
}

 %>

<%= dateformat%>
<% int a=10; %>
<%! int a=10; 
int addition(int x,int y,JspWriter out)throws IOException{
	return x+y;
	
}

%>

<%--JSP comments cZlling a addition () created in JSp --%>

<%a++; %>
<%=addition(10,20,out) %>

<%=a %>



<h1>Successfully login to jsps</h1>
</body>
</html>