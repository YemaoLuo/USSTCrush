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
<form style="text-align:center; width:100%; height:500px" method="post"
      action="${pageContext.request.contextPath}/submit">
    <input style="width:50%; height:20%" type="text" name="uname" placeholder="你的名字"><br><br>
    <input style="width:50%; height:20%" type="text" name="tname" placeholder="ta的名字"><br><br>
    <input style="width:50%; height:20%" type="email" name="email" placeholder="你的email"><br><br>
    <input style="width:50%; height:20%" type="submit" value="确认">
</form>
<div style="color: red">${msg.message}</div>
</body>
</html>
