<%--
  Created by IntelliJ IDEA.
  User: 14813
  Date: 2020/7/23
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //为每一个内置对象设置属性值
    pageContext.setAttribute("a","pageContext");
    request.setAttribute("b","request");
    session.setAttribute("c","session");
    application.setAttribute("d","application");
%>

<%--取出pageContext中的参数--%>
<%--指定域查找和全域查找--%>
${pageScope.a}
${a}


<%--取出request中的参数--%>
${requestScope.b}
${b}

<%--取出session中的参数--%>
${sessionScope.c}
${c}

<%--取出application中的参数--%>
${applicationScope.d}
${d}
</body>
</html>
