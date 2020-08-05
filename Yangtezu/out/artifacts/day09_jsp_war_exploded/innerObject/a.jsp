<%--
  Created by IntelliJ IDEA.
  User: 14813
  Date: 2020/7/23
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>a</title>
</head>
<body>
<%
    //域对象pageContext：范围最小，只限于当前页面
    pageContext.setAttribute("game","消消乐（pageContext对象）");
    //域对象request：使用范围仅限于转发之间的页面
    request.setAttribute("name","赵云（request对象）");
    //域对象session：范围是一次会话，浏览器或服务器不关闭称为一次会话。
    session.setAttribute("drink","可乐（session对象）");
    //域对象application：范围最大，只要服务器不关，浏览器随意。
    application.setAttribute("eat","鸡腿（application对象）");

%>
<%--输出pageContext对象中存储的数据--%>
<%
    Object game = pageContext.getAttribute("game");
    out.print(game);
%>

<%--转发到b.jsp--%>
<jsp:forward page="b.jsp">
    <jsp:param name="" value=""/>
</jsp:forward>

</body>
</html>
