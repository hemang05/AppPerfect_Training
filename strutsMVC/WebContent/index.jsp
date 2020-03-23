<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<STYLE type="text/css">
.errorMessage {
	color: red;
}
</STYLE>
</head>
<body style="background-color: lightblue">
	<h3>
		<i>welcome to struts</i>
	</h3>
	<br>
	<hr>
	<br>
	<center>
		<s:form action="go">
			<table style="background-color: #EBDFF7">
				<tr>
					<td><s:textfield label="Enter Username" name="bean.username"
							value="root"></s:textfield>
				<tr>
					<td><s:textfield label="Enter driver" name="bean.driver"
							value="com.mysql.jdbc.Driver"></s:textfield>
				<tr>
					<td><s:textfield label="Enter url" name="bean.url"
							value="jdbc:mysql://localhost:3306/Northwind"></s:textfield>
				<tr>
					<td><s:textfield label="Enter query" name="bean.query"></s:textfield>
				<tr>
					<td><s:password label="Password" name="bean.password"></s:password>
				<tr>
					<td><s:submit value="save"></s:submit>
			</table>
		</s:form>
	</center>
</body>
</html>