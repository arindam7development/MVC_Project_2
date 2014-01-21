<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri= "/struts-tags" prefix="s" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.DateFormat" %>
<%@ page import="java.text.SimpleDateFormat" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head >
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body  bgcolor="#FFF8DC" >

<center>
<font color="#A80000"  face="arial" size="45"> 
<b>AMYN Corp.</b>
</font>
<br/>
<hr class='flare'>

<font color="#A80000"  face="arial" size="15"> 
<b> Please Register here  </b>
</font>
<h2><i>Your details</i></h2> 
<hr class="flare" />
<s:form method="post" action="Login">
<table>

<tr>
<td>Enter the Emp ID:</td>
<td><s:textfield theme="simple" name="id"/></td>
</tr>
<tr>
<td>Enter the password</td>
<td><s:password theme="simple" name="password"/></td>
</tr>
<tr>
<td>Enter the Name</td>
<td><s:textfield  theme="simple" name="name"/></td>
</tr>
<tr>
<td>Enter the Gender</td>
<td><s:textfield  theme="simple" name="gender"/></td>
</tr>
<tr>
<td>Enter the Date of Birth</td>
<td><s:textfield  theme="simple" name="dob"/></td>
</tr>
<tr>
<td>Enter your Address</td>
<td><s:textfield  theme="simple" name="address"/></td>
</tr>
<tr>
<td>Enter the Department</td>
<td><s:textfield  theme="simple" name="department"/></td>
</tr>
<tr>
<td>Enter the Designation</td>
<td><s:textfield  theme="simple" name="designation"/></td>
</tr>
<tr>
<td>Enter your Salary</td>
<td><s:textfield  theme="simple" name="salary"/></td>
</tr>
<tr>
<td>Enter your Date of Joining</td>
<td><s:textfield  theme="simple" name="doj" /></td>
</tr>
<tr>
<td>Click here to submit</td>
<td> <s:submit value="Register"></s:submit></td> 

</tr>
</table>
   
</s:form> 
</center>

</body>
</html>