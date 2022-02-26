<%--
  Created by IntelliJ IDEA.
  User: star mafia
  Date: 2/26/2022
  Time: 11:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>admin panel</title>
</head>
<body>
    <h1>hello admin</h1>
    <a href="${pageContext.request.contextPath}/add-book">add a new book</a> <br>

    <table>
        <tr>
            <th>Name</th>
            <th>author</th>
        </tr>
        <c:forEach items="${bookList}" var="book">
            <tr>
                <td>${book.name}</td>
                <td>${book.author}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
