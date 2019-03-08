<%--
  Created by IntelliJ IDEA.
  User: div
  Date: 2019/2/11
  Time: 8:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  $END$欢迎<%=request.getParameter("name")%>
  <br>
  欢迎<%=(String) request.getSession().getAttribute("name")%>
  </body>
</html>
