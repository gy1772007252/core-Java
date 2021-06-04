package cn.guyue.service.impl;

import cn.guyue.bean.Teacher;
import cn.guyue.dao.ITeacherDao;
import cn.guyue.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)//若出现异常就回退
@Service//业务层 让spring容器来管理对象，相当于在xml中配置一个bean
public class TeacherServiceImpl implements ITeacherService {

    @Autowired
    private ITeacherDao teacherDao;

    public void save(Teacher t) {
        teacherDao.insertTeacher(t);
        throw new RuntimeException("异常测试");
    }
}
