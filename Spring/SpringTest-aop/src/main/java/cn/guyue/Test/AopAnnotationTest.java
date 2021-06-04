package cn.guyue.Test;

import cn.guyue.config.AopConfig;
import cn.guyue.service.ITeacherService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//获取Spring容器环境进行单元测试
@ContextConfiguration(classes = AopConfig.class)//引入配置文件
public class AopAnnotationTest {

    @Autowired//自动配置set()、get()方法
    private ITeacherService teacherService;

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
