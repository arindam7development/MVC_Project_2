<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<s:head/>
<body bgcolor="#FFF8DC">
Change Password
<font color="#A80000" face="arial" size="45"> <b>XYZ Air Travels Ltd.</b> </font> <br/>
<body>
<s:form method="post" action="ChangePassword">
<s:textfield name="credential.id" label="Enter the USER ID"/>
<s:password name="credential.password" label="Enter the new password" />

<s:submit value="Change Password" label="Click here to submit"></s:submit>
</s:form>
</body>
</html>