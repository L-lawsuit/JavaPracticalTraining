<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 14813
  Date: 2020/7/24
  Time: 12:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:set var="score" value="60" scope="request"></c:set>
<c:choose>
    <c:when test="${requestScope.score >= 90}">
        A
    </c:when>
    <c:when test="${requestScope.score >=80 && requestScope.score < 90}">
        B
    </c:when>
    <c:when test="${requestScope.score >=70 && requestScope.score < 80}">
        C
    </c:when>
    <c:when test="${requestScope.score >=60 && requestScope.score < 70}">
        D
    </c:when>
    <c:otherwise>
        不及格
    </c:otherwise>
</c:choose>
</body>
</html>
