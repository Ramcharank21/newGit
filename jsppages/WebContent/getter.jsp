<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="userinfo" class="com.jsptestng.User2" scope="request"></jsp:useBean>
<h3>UserInfo is:</h3>
UserName is:<jsp:getProperty property="name" name="userinfo"/><br>
Password is:<jsp:getProperty property="password" name="userinfo"/>
</body>
</html>