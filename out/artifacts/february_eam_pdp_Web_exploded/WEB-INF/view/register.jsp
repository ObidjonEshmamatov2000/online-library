<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    <h1>Registration page</h1>
    <form:form action="registration-handle" modelAttribute="user">
        Your full name : <form:input path="name"/> <br>
        Your username: <form:input path="username"/> <br>
        Your password: <form:input path="password"/> <br>
        Your role:
        <form:select path="userRoleEnum">
            <form:option value="ADMIN" label="ADMIN" />
            <form:option value="READER" label="READER" />
        </form:select> <br>

        <input type="submit">
    </form:form>
</body>
</html>
