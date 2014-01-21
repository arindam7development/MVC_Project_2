<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri= "/struts-tags" prefix="s" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head >
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>:: AMYN Corp. EMS ::</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>

<body  bgcolor="#FFF8DC" >

<br>


<center>
<font color="#A80000"  face="AR BONNIE" size="55"> 
<b>A M Y N    Corp.</b>
</font>
<br/>
<hr class="flare" />

<font color="#A80000"  face="AR BONNIE" size="25"> 
<b>Employee Management  System</b>
</font>
<h2><i>Login</i></h2> 
<s:form method="post" action="Authenticate">
<table>
<tr>
<td>User ID:</td>
<td><s:textfield theme="simple" name="id"/></td>
</tr>
<tr>
<td>PassWord:</td>
<td><s:password theme="simple" name="password"/></td>
</tr>
<tr>
<td><s:submit /></td>
</tr>
</table>
    
</s:form>
     
<s:div id="errormessage">
<s:property value="errormessage" />
</s:div>  

</center>



</body>
</html>