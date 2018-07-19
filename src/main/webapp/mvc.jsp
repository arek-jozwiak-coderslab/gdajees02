<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>Wiadomość z servletu: </p>

${superName}

<c:out value="${superName}"/>

<table>
    <thead>
    <tr><td>Name</td><td>Price</td></tr>
    </thead>
    <tbody>
    <c:forEach var="prod" items="${products}">
        <tr>
            <td>${prod.name}</td>
            <td>${prod.price}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
