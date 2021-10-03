<%--
  Created by IntelliJ IDEA.
  User: dangv
  Date: 10/2/2021
  Time: 12:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Đây là giao diện đăng ký</h1>
    <form action="" method="post">
        UserName
        <label>
            <input type="text" name="user_name">
        </label>
        <br> <br>
        Password
        <label>
            <input type="text" name="password">
        </label>
        <br> <br>

        Retype Password
        <label>
            <input type="text" name="password_retype">
        </label>
        <br> <br>
        <input type="submit" value="Register">
    </form>
</body>
</html>
