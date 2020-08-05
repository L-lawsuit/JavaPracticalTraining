<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 14813
  Date: 2020/7/27
  Time: 12:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>登录界面</title>
  <link rel="stylesheet" href="<c:url value="./bt/css/login.css"/> ">
</head>
<body>
<p>Login</p>

<form action="<c:url value="/loginServlet"/>" method="post">
  <input type="text" class="user" placeholder="user" name="username">
  <input type="password" class="password" placeholder="password" name="password">
  <input type="submit" class="submit" value="登录">
  <input type="button" class="enroll" value="注册" onclick="enroll()">
  <!-- <button type="submit" class="submit">提交</button> -->
</form>




</body>
<script>
  function enroll() {
    location.href = "/enroll.jsp"
  }
</script>

</html>