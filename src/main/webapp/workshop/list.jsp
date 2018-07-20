<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 20.07.18
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Books</h1>
<c:forEach var="book" items="${books}">
    ${book.title} - ${book.author} <br/>
</c:forEach>
</body>
</html>
