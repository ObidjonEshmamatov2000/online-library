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
    <h1>welcome admin to the system</h1>

    <form action="admin-login-handle" method="get">
        username: <input type="text" required="required" name="username" placeholder="username"> <br>
        password: <input type="text" required="required" name="password" placeholder="password">
        <input type="submit">
    </form>
</body>
</html>
