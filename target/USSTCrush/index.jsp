<%--
  Created by IntelliJ IDEA.
  User: cpb
  Date: 2021/11/11
  Time: 下午8:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>USSTCrush</title>
</head>
<body>
<form method="post" action="/submit">
    <input type="text" name="uname" placeholder="你的名字">
    <input type="text" name="tname" placeholder="ta的名字">
    <input type="email" name="email" placeholder="你的email">
    <input type="submit" value="确认">
</form>
<div style="color: red">${msg.message}</div>
</body>
</html>
