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
<font color="white"  face="arial" size="45"> 

</font>      
  <center>
      
  
<h2>Welcome......!</h2>

<hr class="flare" /> 
<br></br>
<br></br>
<s:form method="post" action="view1">
<s:textfield theme="simple" name="id"/>
<s:submit value="View employee details by ID"></s:submit>
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



