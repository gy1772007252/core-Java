package cn.guyue.Test;

import cn.guyue.config.SpringConfig;
import cn.guyue.ioc.Teacher;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SuppressWarnings("resource")//给编译器一条指令，告诉它对被批注的代码元素内部的某些警告保持静默
public class SpringIocTest {

    @Test
    public void test() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Teacher teacher = (Teacher) applicationContext.getBean("teacher");
        System.out.println(teacher);
    }

}
