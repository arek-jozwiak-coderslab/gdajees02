<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ include file="../header.jsp" %>
<p>Godziny na złotówki:</p>
Ilość godzin = ${param.h} to  ${param.h * 3.5} złotowek

<c:out value="${role}" default="guest"/>

<%@ include file="../footer.jsp" %>
 </body>
</html>
