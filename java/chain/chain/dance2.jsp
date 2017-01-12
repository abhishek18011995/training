<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post"   action="print.jsp">
<table>


<tr><td>Entere Name</td><td><input type="text" name="name" ></td></tr>

<tr><td>Enter Password</td><td><input type="password" name="pwd" onfocus="validate();"></td></tr>

<tr><td>Select Subjects</td><td><select name="sub" >
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
<input type="checkbox" name="country1" value="india">India
<input type="checkbox" name="country2" value="china">Ichina
<input type="checkbox" name="country3" value="bangladesh">bagladesh


</td></tr>

<tr><td><input type="submit" name="sub" value="SaveData"  ></td></tr>

<tr><td></td><td></td></tr>
</table>
</form>



</body>
</html>