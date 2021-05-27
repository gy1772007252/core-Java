<%--
  Created by IntelliJ IDEA.
  User: Gu Yue
  Date: 2021/5/21
  Time: 13:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%
  String basepath = request.getScheme() + "://" + request.getServerName() + ":8899" + request.getContextPath() + "/";
%>
<html>
  <head>
    <base href="<%=basepath%>">
    <meta charset="UTF-8">
    <title>index</title>
  </head>
  <body style="text-align: center;margin-top: 5%;">

  <h1>index</h1>
  <a href="form/login.jsp">登录</a>
  </body>
</html>
