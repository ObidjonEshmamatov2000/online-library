<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: star mafia
  Date: 2/26/2022
  Time: 11:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add book</title>
</head>
<body>
    <h1>add a new book</h1>

    <form:form action="add-book-handle" modelAttribute="book">
        Book name : <form:input path="name" /> <br>
        Book author : <form:input path="author" /> <br>

        <input type="submit">
    </form:form>
</body>
</html>
