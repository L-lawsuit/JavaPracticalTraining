<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 14813
  Date: 2020/7/24
  Time: 12:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--普通for循环--%>
<h3>普通for循环</h3>
<%--会将i的值默认存入pageContext域对象中--%>
<c:forEach var="i" begin="1" end="10" step="1">
    <c:out value="${pageScope.i}"></c:out>
</c:forEach>
<br>
<%--增强for循环--%>
<h3>增强for循环</h3>
<%
    int[] arrs = {1, 2, 3, 4, 5, 6};
    request.setAttribute("arr",arrs);
%>
<c:forEach var="i" items="${requestScope.arr}">
    <c:out value="${i}"></c:out>
</c:forEach>


</body>
</html>
