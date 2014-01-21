<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>:: XYZ AIR TRAVELS LTD. ::</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body bgcolor="#FFF8DC">
<br>
<center><font color="#A80000" face="AR BONNIE" size="55">
<b>XYZ AIR TRAVELS LTD.</b> </font> <br />
<hr class="flare" />
<font color="#A80000" face="AR BONNIE" size="25"> <b>Flight Reservation System</b> </font>
<h2><i>Login</i></h2>
<s:head/>
<s:form  action="frsaction">
	<table>
		<tr>
			<td>User ID:</td>
			<td><s:textfield  name="cb.id" /></td>
		</tr>
		<tr>
			<td>PassWord:</td>
			<td><s:password  name="cb.password" /></td>
		</tr>
		<tr>
			<td><s:submit /></td>
		</tr>
	</table>
  <br></br>
<s:a href ="userRegistration.jsp">New User SignUp Here</s:a>


</s:form> 
 </center>
</body>
</html>





