<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 19.07.18
  Time: 12:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ include file="header.jsp" %>
<p>Godziny na złotówki:</p>
Ilość godzin = ${param.h} to  ${param.h * 3.5} złotowek

<%@ include file="footer.jsp" %>
 </body>
</html>
