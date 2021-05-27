package com.briup.service.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("*")
public class FirstFilter implements Filter {
    public void destroy() {
        System.out.println("destroy");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("doFilter");
        HttpServletRequest request = (HttpServletRequest) req;

        System.out.println("即将访问：" + request.getRequestURI());
        long start = System.currentTimeMillis();

        chain.doFilter(req, resp);

        long end = System.currentTimeMillis();
        System.out.println("本次访问耗时：" + (end - start));
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("init");
    }

}
