<%@page import="com.chain.cts.RegBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>reg</title>
</head>


<body>

<%if(request.getParameter("message")!=null){
	
	out.write(request.getParameter("message").toString());
} %>
<%  if(request.getParameter("sub")!=null){
	
	 String name=   request.getParameter("username");
     String pwd=request.getParameter("password");
	String sub=request.getParameter("subjects");
	String[] mobiles=	request.getParameterValues("mobiles");
	String gender=request.getParameter("gender");	
	String country1=	request.getParameter("india");
	String country2=	request.getParameter("china");
	String country3=	request.getParameter("bangladesh");
	
	if(name==null || name.isEmpty() ||pwd==null ||pwd.isEmpty()){
		response.sendRedirect("registration.jsp?message='username and password cannot b null'");
		
	}else{
		
	RegBean r=new RegBean();
	r.setName(name);
	r.setPwd(pwd);
	r.setGender(gender);
	r.setMobiles(mobiles);
	r.setCountry1(country1);
	r.setCountry1(country2);
	r.setCountry1(country3);
	r.setSub(sub);
	
	request.setAttribute("reg",r);
	
	request.setAttribute("name",name);
	request.setAttribute("pwd",pwd);
	request.setAttribute("sub",sub);
	request.setAttribute("mobiles",mobiles);
	request.setAttribute("gender",gender);
	request.setAttribute("country1",country1);
	request.setAttribute("country2",country2);
	request.setAttribute("country3",country3);%>
	<jsp:forward page="details.jsp"></jsp:forward>

	//request.getRequestDispatcher("details.jsp").forward(request,response);
	<%
	}
	
		
	
	
} 
	
	
	
	
%>











<form method="get" >
<table>


<tr><td>Entere Name</td><td><input type="text" name="username" ></td></tr>

<tr><td>Enter Password</td><td><input type="password" name="password" onfocus="validate();"></td></tr>

<tr><td>Select Subjects</td><td><select name="subjects" >
<option value="math">Math</option>
<option value="physics">Physics</option>
<option value="tamil">Tamil</option></select>
</td></tr>
<tr><td>Select Mobiles You want</td><td><select name="mobiles" multiple="multiple" >
<option value="nokia">Nokia</option>
<option value="china">china</option>
<option value="xiamio">Xiamio</option></select>
</td></tr>
<tr><td>Gender</td><td><input type="radio" name="gender" value="male" checked="checked">Male
<input type="radio" name="gender" value="female" >Female



</td></tr>

<tr><td>Select Country</td><td>
<input type="checkbox" name="india" value="india">India
<input type="checkbox" name="china" value="china">Ichina
<input type="checkbox" name="bangladesh" value="bangladesh">bagladesh


</td></tr>

<tr><td><input type="submit" name="sub" value="SaveData"  ></td></tr>

<tr><td></td><td></td></tr>
</table>
</form>





</body>
</html>