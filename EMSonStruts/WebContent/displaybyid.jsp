<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Page</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body bgcolor="#FFF8DC">
<center>
<font color="#A80000"  face="AR BONNIE" size="25"> 
<b>Employee Details</b>
</font>
<table border = 2 bgColor ="cyan">
<tr>
	<td>Employee ID</td>
	<td>Name</td>
	<td>Gender</td>
	<td>Date of Birth</td>
	<td>Address</td>
	<td>Department</td>
	<td>Designation</td>
	<td>Date of Joining</td>
	<td></td>
<s:iterator value="action">
<tr>
	<td><s:property value="id"/></td>
	<td><s:property value="name"/></td>
	<td><s:property value="gender"/></td>
	<td><s:property value="dob"/></td>
	<td><s:property value="address"/></td>
	<td><s:property value="department"/></td>
	<td><s:property value="designation"/></td>
	<td><s:property value="doj"/></td>
</tr>
</s:iterator>
</tr>
</table>
<hr class="flare" />
<br></br>
<s:form method="post" action="gotohomepage">
<s:submit value="Go to the Homepage"></s:submit>
 </s:form>
 <br></br>
 <s:form method="post" action="Logout">
<s:submit value="Logout"></s:submit>
</s:form>
</center>
</body>
</html>