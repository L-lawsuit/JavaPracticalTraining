<%@ page import="com.li.entity.Student" %>
<%@ page import="com.li.entity.Pet" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
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
    //案例一
    //实例化一个学生对象
    Student s = new Student(1, "张三");
    //实例化一个动物对象
    Pet pet = new Pet("小狗", "骨头");
    //学生和宠物关联起来
    s.setPet(pet);
    //学生存进域对象
    pageContext.setAttribute("s",s);

    //案例二
    ArrayList<Student> list = new ArrayList<>();
    list.add(s);

    pageContext.setAttribute("list",list);

    //案例三
    HashMap<String, Student> map = new HashMap<>();
    map.put("key1",s);

    pageContext.setAttribute("map",map);

%>
<h3>案例一</h3>
${pageScope.s}<br>
${pageScope.s.id}<br>
${pageScope.s.name}<br>
${pageScope.s.pet}<br>
${pageScope.s.pet.name}<br>
${pageScope.s.pet.eat}<br>

<h3>案例二</h3>
${pageScope.list}<br>

<h3>案例三</h3>
${pageScope.map}<br>
${pageScope.map['key1']}<br>
${pageScope.map['key1'].getPet()}<br>
${pageScope.map.key1.getPet()}<br>






</body>
</html>
