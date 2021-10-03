<%--
  Created by IntelliJ IDEA.
  User: dangv
  Date: 10/2/2021
  Time: 11:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>User list</h1>

<form action="/user" method="get">
    <input type="text" placeholder="search" name="q">
    <button>Search</button>
</form>

<table>
    <thead>
    <tr>
        <td>#</td>
        <td>name</td>
        <td>email</td>
        <td>create Date</td>
        <td>role</td>
        <td>avatar</td>
        <td>gender</td>
        <td>phone</td>
        <td>about</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${users}" var="user">
        <tr>
            <th scope="row">${user.user_id}</th>
            <td>${user.user_name}</td>
            <td>${user.email}</td>
            <td>${user.create_date}</td>
            <td>${user.role}</td>
            <td>${user.gender}</td>
            <td>${user.phone}</td>
            <td><img src="${user.avatar}" alt="ava" height="100" width="100"></td>
            <td>${user.about}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
