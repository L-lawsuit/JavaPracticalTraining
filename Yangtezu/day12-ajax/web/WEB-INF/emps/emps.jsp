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
<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
<body>

<div style="text-align: center; margin: 50px">
    <label for="name">姓名：</label><input type="text" placeholder="请输入姓名" id="name">
    <input type="button" value="搜索" id="search">
</div>

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
    <tbody id="body">
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
    </tbody>

</table>
</body>
<script>

    $('#search').click(function () {
        $.post('${pageContext.request.contextPath}/empsServlet',{'name':$('#name').val()},function (data) {
           $('#body').html("");
            var s = "";
            $.each(data,function (i,e) {
                s += '<tr>\n' +
                    '                    <td>' + e.id + '</td>\n' +
                    '                    <td>' + e.name + '</td>\n' +
                    '                    <td>' + e.age + '</td>\n' +
                    '                    <td>' + e.sex + '</td>\n' +
                    '                    <td>' + e.salary + '</td>\n' +
                    '                    <td>' + e.dept_id + '</td>\n' +
                    '                    <td><a href="${pageContext.request.contextPath}/deleteServlet?id=' + e.id + '" onclick="return tip()">删除</a> | <a\n' +
                    '                            href="${pageContext.request.contextPath}/updateServlet?id=' + e.id + '">修改</a></td>\n' +
                    '                </tr>'

            });
            //将s添加到tbody中
            $('#body').html(s);

        },"json");

    });



    function tip() {
        return confirm('你确定要删除吗？')
    }
    function addEmp() {
        location.href = "/addEmpServlet"
    }


</script>
</html>
