<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>form</title>
</head>
<%

%><body>









<% 
String sub=request.getParameter("sub");
String message=null;
if(sub!=null){
	String uname= request.getParameter("username");
	String pass=request.getParameter("password");
	if(uname.equals("admin")&&pass.equals("admin")){
	
	session.setAttribute("user", uname);
		//success
	request.getRequestDispatcher("/hhtml/success.jsp").forward(request, response);
	}else{
		message="<b style='color:red'>please enter correct details</b>";
		}}%>
	<% 	if(message!=null)
		out.write(message);
			%>
			<form  method="post" >
			
		Enter Username<input type="text" name="username" />
		Enter Password<input type="text" name="password" />
		<input type="submit" name="sub" value="save">
	</form>

	










</body>
</html>