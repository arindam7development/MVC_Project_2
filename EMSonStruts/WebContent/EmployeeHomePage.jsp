<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<%@ taglib prefix="s" uri="/struts-tags" %> 
<html>     
<head>         
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">         
<title>:: Welcome ::</title>  
<script language="javascript">
	window.history.forward(1);
</script>
<link rel="stylesheet" type="text/css" href="css/style.css" />   
</head>     
<body bgcolor="#FFF8DC">   
      
 <center>
 <font color="#A80000"  face="AR BONNIE" size="55"> 
<b>This is AMYN!</b>
</font>
<br></br>
 <font color="#A80000"  face="Palace Script MT" size="75"> 
 <b> Successful login!  Welcome..<s:iterator value="action"><s:property  value="name" />...!</s:iterator></b>
</font>
<hr class="flare" /> 
<font color="Black"  face="Palace Script MT" size="200">
<s:iterator value="action"><s:property  value="name" />...!</s:iterator></font>
<h2>You can perform the following tasks !!!!!</h2>

<s:form method="post" action="View">
<s:submit value="Click to view details of all employees"></s:submit>
</s:form>
<br></br>
<s:form method="post" action="viewid">

<s:submit value="View employee details by ID"></s:submit>
 </s:form>
<br></br>
<s:form method="post" action="Redirect">
 <s:submit value="Click Here to Register"> 
</s:submit>
</s:form>
<br></br>
<br></br>
<br></br>
<s:form method="post" action="Logout">
<s:submit value="Logout"></s:submit>
</s:form>
<hr class="flare" /> 
</center>
</body> 
</html> 



