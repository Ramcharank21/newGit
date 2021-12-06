<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="u" class="com.jsptestng.User" scope="request"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
  
<h3>user name is:</h3>
<jsp:getProperty property="*" name="u"/> 
<%-- <h3>user id is:</h3>
<jsp:getProperty property="id" name="u"/> 
<h3>user password is:</h3>
<jsp:getProperty property="password" name="u"/> 
  --%>
</body>
</html>