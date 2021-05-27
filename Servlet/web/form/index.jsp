<%--
  Created by IntelliJ IDEA.
  User: Gu Yue
  Date: 2021/5/26
  Time: 16:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    int sum = (int) request.getSession().getServletContext().getAttribute("sum");
    System.out.println("index=" + sum);
%>
<html>
    <head>
        <title>欢迎来到主界面</title>
        <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    </head>
    <body style="text-align: center;">

    <h1>欢迎来到主界面</h1>
    当前在线人数：<input type="text" disabled="disabled" value="<%=sum%>">

    </body>
</html>
