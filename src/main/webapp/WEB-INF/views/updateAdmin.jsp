<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Administrator Details</title>
</head>
<body>

<form action="registerAdmin" method="post">
	<pre>
		Id: <input type="text" name="id" value="${admin.id}"/>
		Name: <input type="text" name="name" value="${admin.name}"/>
		Mobile: <input type="text" name="mobile" value="${admin.mobile}"/>
		<input type="submit" name="register"/>
	</pre>
</form>

	<table border="1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Mobile</th>
		</tr>
		<tr>
			<td>${admin.id}</td>
			<td>${admin.name}</td>
			<td>${admin.mobile}</td>
		</tr>
	</table>

</body>
</html>