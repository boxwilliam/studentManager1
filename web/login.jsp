<%--
  Created by IntelliJ IDEA.
  User: div
  Date: 2019/2/13
  Time: 9:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <form action="/studentManager/LoginServlet" method="get">
        用户名:<input type="text" name="name"><br>
        密码：<input type="password" name="pwd"><br>
        <input type="submit" value="登陆">
    </form>
</body>
</html>
