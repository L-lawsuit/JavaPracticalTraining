<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 14813
  Date: 2020/7/24
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工表</title>
</head>
<body>

<table border="1px" cellspacing="0" cellpadding="20px" align="center" style="text-align: center; background: antiquewhite;">
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>性别</td>
        <td>薪水</td>
        <td>部门编号</td>
        <td>操作 | <input type="button" value="添加" onclick="addEmp()"></td>
    </tr>
    <c:forEach var="emp" items="${requestScope.empsList}">
        <tr>
            <td>${emp.getId()}</td>
            <td>${emp.getName()}</td>
            <td>${emp.getAge()}</td>
            <td>${emp.getSex()}</td>
            <td>${emp.getSalary()}</td>
            <td>${emp.getDept_id()}</td>
            <td><a href="${pageContext.request.contextPath}/deleteServlet?id=${emp.getId()}" onclick="return tip()">删除</a> | <a
                    href="${pageContext.request.contextPath}/updateServlet?id=${emp.getId()}">修改</a></td>
        </tr>
    </c:forEach>
</table>
</body>
<script>
    function tip() {
        return confirm('你确定要删除吗？')
    }
    function addEmp() {
        location.href = "/addEmpServlet"
    }
</script>
</html>
