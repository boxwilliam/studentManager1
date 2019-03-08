<%@ page import="com.entity.Student" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: div
  Date: 2019/2/14
  Time: 12:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <tr>
            <td>学号</td>
            <td>姓名</td>
            <td>性别</td>
            <td>班级</td>

        </tr>
        <%
//            Map map=new HashMap();
//            map.put("name","wg");
//            request.setAttribute("mp",map);

            for(Student student:(List<Student>)request.getAttribute("list")){

        %>
        <%--<c:set target="${mp[0]}" property="name" value="cc"/>--%>
        <%--${mp[0].name}--%>
       <tr>
            <td><%=student.getNumber()%></td>
            <td><%=student.getName()%></td>
            <td><%=student.getGender()%></td>
            <td><%=student.getClasss()%></td>

        </tr>

        <% } %>
    </table>
</body>
</html>
