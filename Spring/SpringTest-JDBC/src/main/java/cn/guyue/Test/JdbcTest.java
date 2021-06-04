package cn.guyue.Test;

import cn.guyue.bean.Teacher;
import cn.guyue.config.JdbcConfig;
import cn.guyue.dao.ITeacherDao;
import cn.guyue.service.ITeacherService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)//单元测试
@ContextConfiguration(classes = JdbcConfig.class)//设置配置文件
public class JdbcTest {

    @Autowired
    private ITeacherService teacherService;

    @Test
    public void test_insertHT() {
        Teacher t = new Teacher(2, "tom", 21, 2000);
        teacherService.save(t);
    }

    @Autowired
    private ITeacherDao teacherDao;

    @Test
    public void test_insert() {
        Teacher t = new Teacher(1, "tom", 21, 2000);
        teacherDao.insert(t);
    }

    @Test
    public void test_selectById() {
        Teacher t = teacherDao.selectById(1);
        System.out.println(t);
    }

    @Test
    public void test_selectAll() {
        List<Teacher> list = teacherDao.selectAll();
        System.out.println(list);
    }

    @Test
    public void test_selectCount() {
        int count = teacherDao.selectCount();
        System.out.println(count);
    }

    @Test
    public void test_update() {
        Teacher t = new Teacher(1, "mary", 22, 3000);
        teacherDao.update(t);
    }

    @Test
    public void test_delete() {
        teacherDao.deleteById(1);
    }

    @Test
    public void test_deleteAll() {
        teacherDao.deleteAll();
    }

}
