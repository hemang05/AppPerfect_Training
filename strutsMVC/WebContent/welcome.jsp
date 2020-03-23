<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body style="background-color:lightblue"> 
	<s:set name="data" value="result" />

	<h2>required data</h2>
	<br><h3>records --> <s:property value="recordCount"/></h3>
	<hr>
	<br><br>
	
	<table  style="background-color: #EBDFF7" border="1">
		<s:iterator value="result"  >	
		<tr>
			<s:iterator>				
					<td><s:property /></td>
			</s:iterator>				
		</s:iterator>
	</table>
	
</body>
</html>