<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/6/19
  Time: 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<form action="LoginServlet" method="post">
    账号：<input type="text" name="username">
    <br>
    密码：<input type="password" name="password">
    <br>
    <input type="submit" value="登录">
    <input type="reset" value="重置">
</form>
</body>
</html>
