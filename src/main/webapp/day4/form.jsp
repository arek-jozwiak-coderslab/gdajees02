<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 19.07.18
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<c:out value="${hello}" default="Witaj"/>

<form method="post" action="/Servlet_01_2">
    <select name="selectedLang">
        <c:forEach var="type" items="${langs}">
            <option value="${type.key}" ${cookie.lang.value ==type.key ? "selected":"" }>
                    ${type.key}
            </option>
        </c:forEach>
    </select>
    <input type="submit" value="SET LANG"/>
</form>
</body>
</html>
