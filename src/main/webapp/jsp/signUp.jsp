<%@ page import="java.util.ArrayList" %>
<%@ page import="models.User" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: dim22
  Date: 08.12.2018
  Time: 22:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="/css/style.css" rel="stylesheet" type="text/css">
    <title>Title</title>
</head>
<body>
<div class="form-style-8">
<form method="post" action="/signup">
    <label for="name">User name
    <input type="text" id="name" name="name" >
    </label>
    <label for="password"> Password
        <input type="password" id="password" name="password">
    </label>
    <input type="submit" name="SignUp">
</form>
</div>
    <div class="form-style-8">
 <table>
    <tr>
        <th>User name</th>
        <th>Data</th>
    </tr>
    <c:forEach items="${usersFromServer}" var="user">
        <tr>
            <td>${user.name}</td>

        </tr>
    </c:forEach>

</table>
</div>

</body>
</html>
