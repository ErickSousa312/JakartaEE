<%--
  Created by IntelliJ IDEA.
  User: erik-pc
  Date: 18/07/2024
  Time: 01:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="user" class="org.challenger.register.User" scope="request" />
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Welcome! ${param.name} Serve para o redirect</h1>
<p>your password is: <jsp:getProperty name="user" property="email"/> serve para o foward</p>
</body>
</html>
