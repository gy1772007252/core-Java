package com.briup.Test;

import com.briup.config.AppConfig;
import com.briup.config.SpringConfig;
import com.briup.ioc.Entity;
import com.briup.ioc.Husband;
import com.briup.ioc.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("resource")
public class SpringIocTest {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        Husband husband = (Husband) ac.getBean("husband");
        System.out.println(husband);

        Entity entity = (Entity) ac.getBean("entity");
        System.out.println(entity);

        ApplicationContext acAnn = new AnnotationConfigApplicationContext(AppConfig.class);
        Teacher teacher = (Teacher) acAnn.getBean("t");
        System.out.println(teacher);

    }

}
