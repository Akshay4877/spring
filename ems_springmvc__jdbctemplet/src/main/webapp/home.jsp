<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>

 
<style type="text/css">
.success {
	position: fixed;
	width: 50%;
	margin-left: 50px;
	margin-top: 20px;
	padding: 20px;
	background-color: #E8E1E1;
	border: 1px solid #ddd;
	border-radius: 4px;
}

.floatRight {
	float: right;
	margin-right: 18px;
}

.success{
text-align: center;
}

a{
list-style-type: none;
  margin: 0;
  padding: 0;
  width: 200px;
  background-color: #f1f1f1;
  
  display: block;
  color: #000;
  padding: 8px 40px;
  text-decoration: none;
}

</style>

</head>
<body>
	<div class="success">
	
		<h2>Crud opration</h2><br><br>
		<a href="save">Registration page</a><br>
		<br> <a href="list">Employee list page</a><br>
		<br> <a href="update">Update Employee page</a><br>
		<br> <a href="delete">Delete Employee page</a><br>
		<br> <a href="searchbyid">Search Employee by id page</a><br>
		<br> <a href="searchbyname">Search Employee by name page</a><br>
		<br>
	</div>
</body>
</html>