<%--
  Created by IntelliJ IDEA.
  User: erik-pc
  Date: 18/07/2024
  Time: 00:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Registration</h1>
    <form action="Register" method="post">
    <label for="name">Name:</label><br>
    <input type="text" id="name" name="name" value="" required><br>
    <label for="email">Email: </label><br>
    <input type="email" id="email" value="" name="email"><br>
        <input type="submit" value="Login">
    </form>
</body>
</html>
