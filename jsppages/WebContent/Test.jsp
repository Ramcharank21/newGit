<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="userinfo" class="com.jsptestng.TestBean"></jsp:useBean> 
<jsp:setProperty property="*" name="userinfo"/> 
 <p>UserName is:
<jsp:getProperty property="username" name="userinfo"/><br>
</p>
<p>Password is: 
<jsp:getProperty property="password" name="userinfo"/><br>
</p>
<p>Age is: 
<jsp:getProperty property="age" name="userinfo" /><br>
</p>
</body>
</html>