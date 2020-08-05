<%--
  Created by IntelliJ IDEA.
  User: 14813
  Date: 2020/7/25
  Time: 13:14
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>

    <link rel="stylesheet" href="./bt/css/bootstrap.min.css">
    <link rel="stylesheet" href="./bt/css/bootstrap-theme.min.css">
    <script type="text/javascript" src="./bt/js/jquery.js"></script>
    <script type="text/javascript" src="./bt/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="./bt/css/insert.css">
</head>

<body>
<h3 style="position: absolute;left: 45%;top: 16%;" class="text-center">添加用户页面</h3>

<form action="/enrollServlet" method="POST">
    <input type="text" class="user" placeholder="user" name="username">
    <input type="password" class="password" placeholder="password" name="password">
    <input type="submit" class="submit" value="确定">
    <!-- <button type="submit" class="submit">提交</button> -->
</form>


</body>
</html>
