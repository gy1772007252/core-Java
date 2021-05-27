package com.briup.service.life;

import javax.servlet.*;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(value = "/life1", initParams = {@WebInitParam(name = "age", value = "20")})
public class life1Servlet implements Servlet {

    private ServletConfig servletConfig;

    public life1Servlet() {
        //System.out.println("life1Servlet 构造器");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig = servletConfig;
        /*System.out.println("life1Servlet init");
        System.out.println(servletConfig.getServletName());

        System.out.println(servletConfig.getInitParameter("name"));
        System.out.println(servletConfig.getInitParameter("age"));

        System.out.println(servletConfig.getServletContext().getInitParameter("encoding"));*/
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        //System.out.println("life1Servlet service");
    }

    @Override
    public void destroy() {
        //System.out.println("life1Servlet destroy");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }
}
