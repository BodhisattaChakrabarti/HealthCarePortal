<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin User Registration</title>
</head>
<body>
<form action="registerAdmin" method="post">
	<pre>
		Id: <input type="text" name="id"/>
		Name: <input type="text" name="name"/>
		Mobile: <input type="text" name="mobile"/>
		<input type="submit" name="register"/>
	</pre>
</form>

	<br/>${result}

</body>
</html>