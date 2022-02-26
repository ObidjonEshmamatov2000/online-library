<%--
  Created by IntelliJ IDEA.
  User: star mafia
  Date: 2/15/2022
  Time: 8:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>spring mvc jsp</title>

</head>
<body>
    <h1>star mafia is the best</h1>
    <p>${response}</p>
    <a href="${pageContext.request.contextPath}/main-menu">main page</a> <br>
    <a href="${pageContext.request.contextPath}/admin-login">login as a admin</a> <br>
    <a href="${pageContext.request.contextPath}/user-login">login as a user</a> <br>
</body>
</html>
