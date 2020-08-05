<%--
  Created by IntelliJ IDEA.
  User: 14813
  Date: 2020/7/23
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@include file="b.jsp"%>
<%
    //输出b.jsp中的变量值
    out.print(name);
%>

</body>
</html>
