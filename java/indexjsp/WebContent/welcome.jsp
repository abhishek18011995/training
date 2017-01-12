<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>welcome</title>
</head>
<%! 
int count=0;
void incrementcount()
{
	count++;
}
%>
<body>
<%

Calendar cal=Calendar.getInstance();
           Date date=cal.getTime();
           out.print("<br>"+date);
           SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
           String df=sdf.format(date);
           out.print("<br>"+df);
           int hour=cal.get(Calendar.HOUR_OF_DAY);
           if(hour<12){
        	   out.print("<br>good morning");
           }
           else{
        	   out.print("<br>good afternoon");
           }
           
        String s2=(String)session.getAttribute("abcd");
         out.print(s2);
%>
<h3>
<%
int localvariable=0;
out.print("<br>.this page is viewed "+count+" times");
incrementcount();
%>
</h3>
<%=localvariable%>
<%localvariable++; %>
</body>
</html>