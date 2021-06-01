package com.briup.Test;

import com.briup.bean.Teacher;
import com.briup.service.ITeacherService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class MybatisXMLTest {

    @Autowired
    private ITeacherService teacherService;

    @Test
    public void test_insert() {
        Teacher t = new Teacher();
        t.setName("tom");
        t.setAge(20);
        t.setSalary(2000);
        teacherService.save(t);
    }

}
