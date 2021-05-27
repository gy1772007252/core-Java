<%--
  Created by IntelliJ IDEA.
  User: Gu Yue
  Date: 2021/5/26
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%
    Cookie[] cookies = request.getCookies();
    String nameRem = "";
    String pwdRem = "";
    if (cookies != null) {
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("nameRem")) {
                nameRem = cookie.getValue();
            }
            if (cookie.getName().equals("pwdRem")) {
                pwdRem = cookie.getValue();
            }
        }
        if (!nameRem.equals("") && !pwdRem.equals("")) {
            System.out.println(nameRem);
            System.out.println(pwdRem);
        }
    }
%>
<html>
    <head>
        <base href="http://localhost:8899/FirstServlet_war_exploded/">
        <title>邮箱登录</title>
        <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    </head>
    <body>

    <center>
        <form action="login	" method="post">
            <table>
                <tr><td>用户名:</td>
                    <td><input type="text" name="name" value="<%=nameRem%>"></td>
                    <td>@163.com</td></tr>
                <tr><td>密&nbsp;&nbsp;码:</td>
                    <td><input type="password" name="pwd" value="<%=pwdRem%>"></td>
                    <td><a href="">忘记密码</a></td></tr>
            </table>
            <input type="checkbox" name="remember">记住密码
            <input type="checkbox" name="auto">三天自动登录<br>
            <input type="submit" value="登录">
            &nbsp;<a href="form/register.html">注册</a>
        </form>
    </center>

    </body>
</html>
