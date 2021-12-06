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
<jsp:setProperty property="*" name="userinfo"/> <br>
<jsp:forward page="getter.jsp"></jsp:forward>
</body>
</html>