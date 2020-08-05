<%--
  Created by IntelliJ IDEA.
  User: 14813
  Date: 2020/7/27
  Time: 13:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改页面</title>
</head>
<body>
<form style="text-align: center; margin-top: 100px;" action="${pageContext.request.contextPath}/updateServlet?id=${requestScope.emp.getId()}" method="post">
<label>
    姓名：
    <input type="text" name="name" value="${requestScope.emp.getName()}" placeholder="请输入姓名">
</label><br>

<label>
    年龄：
    <input type="text" name="age" value="${requestScope.emp.getAge()}" placeholder="请输入年龄">
</label><br>

<label>
    性别：
    <input type="text" name="sex" value="${requestScope.emp.getSex()}" placeholder="请输入性别">
</label><br>

<label>
    工资：
    <input type="number" name="salary" value="${requestScope.emp.getSalary()}" placeholder="请输入工资">
</label><br>

<label>
    部门编号：
    <input type="text" name="dept_id" value="${requestScope.emp.getDept_id()}" placeholder="请输入部门编号">
</label><br>

<input type="submit" value="提交">

</form>
</body>
</html>
