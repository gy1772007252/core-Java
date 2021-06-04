package cn.guyue.Test;

import cn.guyue.bean.Teacher;
import cn.guyue.config.MybatisConfig;
import cn.guyue.config.SpringConfig;
import cn.guyue.service.ITeacherService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class, MybatisConfig.class})//引入多个配置类
public class MybatisAnnotationTest {

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
