<%--
  Created by IntelliJ IDEA.
  User: 14813
  Date: 2020/7/23
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>b</title>
</head>
<body>
<%
    out.print("b页面输出a页面传来的name参数值：");
    Object name = request.getAttribute("name");
    out.print(name);
%>
</body>
</html>
