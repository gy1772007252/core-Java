package cn.guyue.service.impl;

import cn.guyue.bean.Teacher;
import cn.guyue.dao.ITeacherDao;
import cn.guyue.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

//声明式事务管理
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
//propagation = Propagation.REQUIRED:如果当前没有事务，就新建一个事务，如果已经存在一个事务中，加入到这个事务中
// rollbackFor = Exception.class:表示抛出异常就会回滚

@Service//业务层 让spring容器来管理对象，相当于在xml中配置一个bean
public class TeacherServiceImpl implements ITeacherService {

    @Autowired//提供set()、get()方法
    private ITeacherDao teacherDao;

    public void save(Teacher t) {
        teacherDao.insert(t);
        throw new RuntimeException("回退");
    }

}
