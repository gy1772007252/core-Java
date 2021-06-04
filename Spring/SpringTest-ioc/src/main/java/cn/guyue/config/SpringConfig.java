package cn.guyue.config;

import cn.guyue.ioc.Teacher;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration//用于指定当前类是一个spring配置类，当创建容器时会从该类上加载注解
@ComponentScan("cn.guyue")//用于指定spring在初始化容器时要扫描的包
@PropertySource("my-value.properties")//用于加载 .properties 文件中的值，加载后可以使用 @Value("${key}") 的形式来获取
public class SpringConfig {

    //用于给属性注入基本数据
    @Value("${teacher.id}")
    private int id;
    @Value("${teacher.name}")
    private String name;
    @Value("${teacher.age}")
    private int age;

    @Bean("teacher")//该注解只能写在方法上，表明使用此方法创建一个对象，并且放入spring容器
    public Teacher teacher() {
        Teacher teacher = new Teacher();
        teacher.setId(id);
        teacher.setName(name);
        teacher.setAge(age);
        return teacher;
    }

}
