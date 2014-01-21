<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LOGGED OUT</title>
</head>
<body>
<script language="JavaScript">
var x=window.history.length;
 if (window.history[x]!=window.location)
{
window.history.forward();
 }
</script>

<s:form method="post" action="Logout">
</s:form>
<p>Successfully Logged out</p>
<a href="test.jsp">login as new user</a>
</body>
</html>