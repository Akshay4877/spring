<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee form</title>
</head>
<body>
<spring:url value="/save" var="saveURL"></spring:url>


<form:form modelAttribute="employee_form" method="POST" action="${saveURL}"></form:form>
<form:hidden path="emp_id"/>

<table>
	<tr>
		<td>emp_name:</td>
		<td><form:input path="emp_name"/></td> 
	</tr>
	<tr>
		<td>emp_id:</td>
		<td><form:input path="emp_id"/></td> 
	</tr>
	<tr>
		<td>emp_desg:</td>
		<td><form:input path="emp_desg"/></td> 
	</tr>
	<tr>
		<td>salary:</td>
		<td><form:input path="salary"/></td> 
	</tr>
	<tr>
		<td></td>	
		<td><button type="submit">Save</button></td>
	
	</tr>

</table>



</body>
</html>