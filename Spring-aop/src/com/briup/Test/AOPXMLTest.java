package com.briup.Test;

import com.briup.service.ITeacherService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class AOPXMLTest {

    @Autowired
    private ITeacherService teacherService;

    @Test
    public void test() {
        System.out.println(teacherService);
        System.out.println(teacherService.getClass());
    }

    @Test
    public void test_saveOrUpdate() {
        teacherService.saveOrUpdate();
    }

    @Test
    public void test_delete() {
        teacherService.delete();
    }

    @Test
    public void test_daleteBath() {
        teacherService.deleteBatch();
    }

}
