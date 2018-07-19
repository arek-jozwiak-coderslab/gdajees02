<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<p>Start: ${start}</p>
<p>End: ${end}</p>

<c:forEach begin="${start}" end="${end}" var="co">
    ${co} <br/>
</c:forEach>
</body>
</html>
