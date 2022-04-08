<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>yahoo from jsp</title>
</head>
<body>
<p><font color = "red">${errormessage}</font></p>
 <form action="/login.do" method="post">
name:<input type="text" name="name"/>
password:<input type="password" name="password"/ >

 <input type="submit" value="login"/>
 </form>

</body>
</html>