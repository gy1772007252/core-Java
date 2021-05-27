package com.briup.service.form;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class autoFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;

        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            int num = 0;
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("nameAuto")) {
                    num += 1;
                }
                if (cookie.getName().equals("pwdAuto")) {
                    num += 1;
                }
            }
            if (num == 2) {
                System.out.println("auto");
                request.getSession().setAttribute("isLogin", true);
                response.sendRedirect("index.html");
            }
        }
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
