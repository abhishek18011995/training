<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>dance</title>
</head>
<body>
<jsp:useBean id="r" class="com.chain.cts.RegBean" scope="session">
</jsp:useBean>
<jsp:setProperty property="name" name="r"  value="aziz"/>
<jsp:setProperty property="pwd" name="r"  value="aziz1234"/>
<jsp:setProperty property="gender" name="r"  value="male"/>
<jsp:setProperty property="country1" name="r"  value="india"/>
<jsp:setProperty property="country2" name="r"  value="US"/>
<jsp:setProperty property="country3" name="r"  value="BG"/>

<%=r%>

</body>
</html>