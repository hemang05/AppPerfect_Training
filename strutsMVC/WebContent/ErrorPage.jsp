<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body style="background-color: lightblue" >
	<br>
	<h2 >
		<i>invalid data try again...</i>
	</h2>
	<br><h4 style="color:red">
		<s:property value="errorMsg" />
	</h4>

	<hr><br>


	<s:form action="go">
	<table style="background-color: #EBDFF7">
		<tr><td><s:textfield label="Enter Username" name="bean.username"
			value="%{bean.username}"></s:textfield>
		<tr><td><s:textfield label="Enter driver" name="bean.driver"
			value="%{bean.driver}"></s:textfield>
		<tr><td><s:textfield label="Enter url" name="bean.url" value="%{bean.url}"></s:textfield>
		<tr><td><s:textfield label="Enter query" name="bean.query"
			value="%{bean.query}"></s:textfield>
		<tr><td><s:password label="Password" name="bean.password"
			value="%{bean.password}"></s:password>
		<tr><td><s:submit value="save"></s:submit>
		</table>
	</s:form>
</body>
</html>