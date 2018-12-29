<%@ page import="java.util.ArrayList" %>
<%@ page import="models.User" %><%--
  Created by IntelliJ IDEA.
  User: dim22
  Date: 08.12.2018
  Time: 22:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        ArrayList<User> users = (ArrayList) request.getAttribute("usersFromServer");
    %>
<table>
    <tr>
        <th>User name</th>
        <th>Data</th>
    </tr>
<%
    for(User user : users){
    %><tr>
<td> <%= user.getName()%></td>

    </tr>
    <%}%>
</table>
</body>
</html>
