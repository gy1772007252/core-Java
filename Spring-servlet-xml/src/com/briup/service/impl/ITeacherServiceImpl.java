package com.briup.service.impl;

import com.briup.bean.Teacher;
import com.briup.dao.ITeacherDao;
import com.briup.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
@Service
public class ITeacherServiceImpl implements ITeacherService {

    @Autowired
    private ITeacherDao teacherDao;

    @Override
    public void save(Teacher t) {
        teacherDao.insertTeacher(t);
        throw new RuntimeException("异常测试");
    }

}
