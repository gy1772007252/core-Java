package com.briup.Test;

import com.briup.config.TestConfig;
import com.briup.ioc.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(classes = TestConfig.class)
public class SpringJUnit5Test {

    @Autowired
    private Student student;

    @Test
    public void test1() {
        System.out.println(student);
    }

}
