package com.briup.service.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter("/WebContent/after/*")
public class isLoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        HttpSession session = request.getSession(false);
        Object isLogin = session.getAttribute("isLogin");
        if (session != null && isLogin != null) {
            if ((boolean) isLogin) {
                chain.doFilter(req, resp);
            } else {
                response.sendRedirect("../../form/login.jsp");
            }
        } else {
            response.sendRedirect("../../form/login.jsp");
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
