<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reserve</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>
<body bgcolor="#FFF8DC">
<center><font color="#A80000" face="arial" size="45"> <b>XYZ AirTravels Ltd.</b> </font> <br />
<s:form action="Deduct Money">
<table>

		<tr>
			<td>Enter Credit Card Number:</td>
		<td><s:textfield  name="cardNumber" /></td>
			</tr>
				<tr>
			<td>Valid from</td>
		<td><s:textfield  name="validFrom" /></td>
			</tr>
				<tr>
			<td>Valid to</td>
		<td><s:textfield  name="validTo" /></td>
			</tr>
			
</table>
<br></br>
<s:submit align="center" value="Click here to pay"> </s:submit>
</s:form>
<br></br><s:form  action="Logout">
<s:submit align="right" value="Logout"> 
</s:submit>
</s:form>
</center>
</body>
</html>