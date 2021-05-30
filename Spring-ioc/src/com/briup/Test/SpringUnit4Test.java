package com.briup.Test;

import com.briup.config.TestConfig;
import com.briup.ioc.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfig.class)
public class SpringUnit4Test {

    @Autowired
    private Student student;

    @Test
    public void test() {
        System.out.println(student);
    }

}
