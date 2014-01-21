<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>
<body bgcolor="#FFF8DC">
<center><font color="#A80000" face="arial" size="45"> <b>XYZ AirTravels Ltd.</b> </font> <br />
<table border=2 bordercolor="black">
	<tr>
		<td>Passenger Name</td>
		<td>Gender</td>
		<td>Seat No</td>
		<td>Age</td>

		<s:iterator value="passengers">
			<tr>
				<td><s:property value="fullName" /></td>
				<td><s:property value="gender" /></td>
				<td><s:property value="seatNo" /></td>
				<td><s:property value="age" /></td>
			</tr>
		</s:iterator>
	</tr>
</table>
</center>
<s:a href="AdminHome.jsp">Return to home page</s:a>
</body>
</html>