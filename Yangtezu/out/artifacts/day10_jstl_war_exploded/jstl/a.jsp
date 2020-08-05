<%--
  Created by IntelliJ IDEA.
  User: 14813
  Date: 2020/7/24
  Time: 11:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setAttribute("score","50");
%>
<c:if test="${score <= 100}">
    ${score}
</c:if>
<c:if test="${score > 100}">
    <c:out value="你输入的值超过了100，请输入小于等于100的数。"></c:out>
</c:if>
</body>
</html>
