<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
</head>
<%
String name=request.getParameter("name");
String password=request.getParameter("password");
String sub=request.getParameter("subjects");
String[] mob=request.getParameter("password");
String password=request.getParameter("password");
String password=request.getParameter("password");
String password=request.getParameter("password");
%>


<body>
<form method="post" action="/loginform2/Registration">
<table>


<tr><td>Enter Name</td><td><input type="text" name="username" ></td></tr>

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

<tr><td><input type="submit" value="SaveData"  ></td></tr>

<tr><td></td><td></td></tr>

</table>

</form>


</body>
</html>