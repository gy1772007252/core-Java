package com.briup.config;

import com.briup.ioc.Teacher;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

@PropertySource("my-value.properties")
public class SpringConfig {

    @Value("${teacher.id}")
    private int id;
    @Value("${teacher.name}")
    private String name;
    @Value("${teacher.age}")
    private int age;

    @Bean("t")
    public Teacher teacher() {
        Teacher t = new Teacher();
        t.setId(id);
        t.setName(name);
        t.setAge(age);
        return t;
    }

}
