package com.briup.Test;

import com.briup.bean.Teacher;
import com.briup.config.JdbcConfig;
import com.briup.dao.ITeacherDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JdbcConfig.class)
public class JdbcTest {

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
