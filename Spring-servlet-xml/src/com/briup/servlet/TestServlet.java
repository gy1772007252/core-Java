package com.briup.servlet;

import com.briup.bean.Teacher;
import com.briup.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;

@WebServlet(value = "/test", loadOnStartup = 1)
public class TestServlet extends HttpServlet implements Serializable {

    private static final long serialVersionUID = 1l;

    @Autowired
    private ITeacherService teacherService;

    @Override
    public void init() throws ServletException {
        WebApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
        AutowireCapableBeanFactory autowireCapableBeanFactory = ac.getAutowireCapableBeanFactory();
        autowireCapableBeanFactory.autowireBean(this);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = resp.getWriter();

        Teacher teacher = new Teacher();
        teacher.setName("tom");
        teacher.setAge(20);
        teacher.setSalary(5000);

        teacherService.save(teacher);

        out.println("操作成功！");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

}
