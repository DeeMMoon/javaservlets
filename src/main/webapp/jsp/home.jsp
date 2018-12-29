<%--
  Created by IntelliJ IDEA.
  User: dim22
  Date: 09.12.2018
  Time: 22:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<span style="color:${cookie.color.value}">Hello</span>
<form method="post" action="/home">
    <label for="color">
        <select name="color" id="color">
            <option value="red"> Красный </option>
            <option value="blue"> Синий </option>
        </select>
    </label>
    <input type="submit" value="Color Send">
</form>
</body>
</html>
